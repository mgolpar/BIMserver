package org.bimserver.database.actions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bimserver.BimServer;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.conditions.IsOfTypeCondition;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.Deserializer;
import org.bimserver.models.store.StorePackage;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.utils.CollectionUtils;

public class GetAllDeserializersDatabaseAction extends GetAllDatabaseAction<Deserializer> {

	private final boolean onlyEnabled;
	private final BimServer bimServer;

	public GetAllDeserializersDatabaseAction(BimDatabaseSession bimDatabaseSession, AccessMethod accessMethod, BimServer bimServer, boolean onlyEnabled) {
		super(bimDatabaseSession, accessMethod, Deserializer.class, StorePackage.eINSTANCE.getSerializer());
		this.bimServer = bimServer;
		this.onlyEnabled = onlyEnabled;
	}

	@Override
	public List<Deserializer> execute() throws UserException, BimDeadlockException, BimDatabaseException {
		Condition condition = new IsOfTypeCondition(StorePackage.eINSTANCE.getDeserializer());
		Map<Long, Deserializer> result = getDatabaseSession().query(condition, Deserializer.class, false, null);
		List<Deserializer> mapToList = CollectionUtils.mapToList(result);
		if (onlyEnabled) {
			Iterator<Deserializer> iterator = mapToList.iterator();
			while (iterator.hasNext()) {
				Deserializer deserializer = iterator.next();
				if (!bimServer.getPluginManager().isEnabled(deserializer.getClassName())) {
					iterator.remove();
				}
			}
		}
		return mapToList;
	}
}