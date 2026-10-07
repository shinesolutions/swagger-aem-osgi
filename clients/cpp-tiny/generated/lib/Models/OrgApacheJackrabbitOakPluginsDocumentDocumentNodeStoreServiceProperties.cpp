

#include "OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties()
{
	mongouri = ConfigNodePropertyString();
	db = ConfigNodePropertyString();
	socketKeepAlive = ConfigNodePropertyBoolean();
	cache = ConfigNodePropertyInteger();
	nodeCachePercentage = ConfigNodePropertyInteger();
	prevDocCachePercentage = ConfigNodePropertyInteger();
	childrenCachePercentage = ConfigNodePropertyInteger();
	diffCachePercentage = ConfigNodePropertyInteger();
	cacheSegmentCount = ConfigNodePropertyInteger();
	cacheStackMoveDistance = ConfigNodePropertyInteger();
	blobCacheSize = ConfigNodePropertyInteger();
	persistentCache = ConfigNodePropertyString();
	journalCache = ConfigNodePropertyString();
	customBlobStore = ConfigNodePropertyBoolean();
	journalGCInterval = ConfigNodePropertyInteger();
	journalGCMaxAge = ConfigNodePropertyInteger();
	prefetchExternalChanges = ConfigNodePropertyBoolean();
	role = ConfigNodePropertyString();
	versionGcMaxAgeInSecs = ConfigNodePropertyInteger();
	versionGCExpression = ConfigNodePropertyString();
	versionGCTimeLimitInSecs = ConfigNodePropertyInteger();
	blobGcMaxAgeInSecs = ConfigNodePropertyInteger();
	blobTrackSnapshotIntervalInSecs = ConfigNodePropertyInteger();
	repositoryhome = ConfigNodePropertyString();
	maxReplicationLagInSecs = ConfigNodePropertyInteger();
	documentStoreType = ConfigNodePropertyDropDown();
	bundlingDisabled = ConfigNodePropertyBoolean();
	updateLimit = ConfigNodePropertyInteger();
	persistentCacheIncludes = ConfigNodePropertyArray();
	leaseCheckMode = ConfigNodePropertyDropDown();
}

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::~OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties()
{

}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mongouriKey = "mongouri";

    if(object.has_key(mongouriKey))
    {
        bourne::json value = object[mongouriKey];




        ConfigNodePropertyString* obj = &mongouri;
		obj->fromJson(value.dump());

    }

    const char *dbKey = "db";

    if(object.has_key(dbKey))
    {
        bourne::json value = object[dbKey];




        ConfigNodePropertyString* obj = &db;
		obj->fromJson(value.dump());

    }

    const char *socketKeepAliveKey = "socketKeepAlive";

    if(object.has_key(socketKeepAliveKey))
    {
        bourne::json value = object[socketKeepAliveKey];




        ConfigNodePropertyBoolean* obj = &socketKeepAlive;
		obj->fromJson(value.dump());

    }

    const char *cacheKey = "cache";

    if(object.has_key(cacheKey))
    {
        bourne::json value = object[cacheKey];




        ConfigNodePropertyInteger* obj = &cache;
		obj->fromJson(value.dump());

    }

    const char *nodeCachePercentageKey = "nodeCachePercentage";

    if(object.has_key(nodeCachePercentageKey))
    {
        bourne::json value = object[nodeCachePercentageKey];




        ConfigNodePropertyInteger* obj = &nodeCachePercentage;
		obj->fromJson(value.dump());

    }

    const char *prevDocCachePercentageKey = "prevDocCachePercentage";

    if(object.has_key(prevDocCachePercentageKey))
    {
        bourne::json value = object[prevDocCachePercentageKey];




        ConfigNodePropertyInteger* obj = &prevDocCachePercentage;
		obj->fromJson(value.dump());

    }

    const char *childrenCachePercentageKey = "childrenCachePercentage";

    if(object.has_key(childrenCachePercentageKey))
    {
        bourne::json value = object[childrenCachePercentageKey];




        ConfigNodePropertyInteger* obj = &childrenCachePercentage;
		obj->fromJson(value.dump());

    }

    const char *diffCachePercentageKey = "diffCachePercentage";

    if(object.has_key(diffCachePercentageKey))
    {
        bourne::json value = object[diffCachePercentageKey];




        ConfigNodePropertyInteger* obj = &diffCachePercentage;
		obj->fromJson(value.dump());

    }

    const char *cacheSegmentCountKey = "cacheSegmentCount";

    if(object.has_key(cacheSegmentCountKey))
    {
        bourne::json value = object[cacheSegmentCountKey];




        ConfigNodePropertyInteger* obj = &cacheSegmentCount;
		obj->fromJson(value.dump());

    }

    const char *cacheStackMoveDistanceKey = "cacheStackMoveDistance";

    if(object.has_key(cacheStackMoveDistanceKey))
    {
        bourne::json value = object[cacheStackMoveDistanceKey];




        ConfigNodePropertyInteger* obj = &cacheStackMoveDistance;
		obj->fromJson(value.dump());

    }

    const char *blobCacheSizeKey = "blobCacheSize";

    if(object.has_key(blobCacheSizeKey))
    {
        bourne::json value = object[blobCacheSizeKey];




        ConfigNodePropertyInteger* obj = &blobCacheSize;
		obj->fromJson(value.dump());

    }

    const char *persistentCacheKey = "persistentCache";

    if(object.has_key(persistentCacheKey))
    {
        bourne::json value = object[persistentCacheKey];




        ConfigNodePropertyString* obj = &persistentCache;
		obj->fromJson(value.dump());

    }

    const char *journalCacheKey = "journalCache";

    if(object.has_key(journalCacheKey))
    {
        bourne::json value = object[journalCacheKey];




        ConfigNodePropertyString* obj = &journalCache;
		obj->fromJson(value.dump());

    }

    const char *customBlobStoreKey = "customBlobStore";

    if(object.has_key(customBlobStoreKey))
    {
        bourne::json value = object[customBlobStoreKey];




        ConfigNodePropertyBoolean* obj = &customBlobStore;
		obj->fromJson(value.dump());

    }

    const char *journalGCIntervalKey = "journalGCInterval";

    if(object.has_key(journalGCIntervalKey))
    {
        bourne::json value = object[journalGCIntervalKey];




        ConfigNodePropertyInteger* obj = &journalGCInterval;
		obj->fromJson(value.dump());

    }

    const char *journalGCMaxAgeKey = "journalGCMaxAge";

    if(object.has_key(journalGCMaxAgeKey))
    {
        bourne::json value = object[journalGCMaxAgeKey];




        ConfigNodePropertyInteger* obj = &journalGCMaxAge;
		obj->fromJson(value.dump());

    }

    const char *prefetchExternalChangesKey = "prefetchExternalChanges";

    if(object.has_key(prefetchExternalChangesKey))
    {
        bourne::json value = object[prefetchExternalChangesKey];




        ConfigNodePropertyBoolean* obj = &prefetchExternalChanges;
		obj->fromJson(value.dump());

    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];




        ConfigNodePropertyString* obj = &role;
		obj->fromJson(value.dump());

    }

    const char *versionGcMaxAgeInSecsKey = "versionGcMaxAgeInSecs";

    if(object.has_key(versionGcMaxAgeInSecsKey))
    {
        bourne::json value = object[versionGcMaxAgeInSecsKey];




        ConfigNodePropertyInteger* obj = &versionGcMaxAgeInSecs;
		obj->fromJson(value.dump());

    }

    const char *versionGCExpressionKey = "versionGCExpression";

    if(object.has_key(versionGCExpressionKey))
    {
        bourne::json value = object[versionGCExpressionKey];




        ConfigNodePropertyString* obj = &versionGCExpression;
		obj->fromJson(value.dump());

    }

    const char *versionGCTimeLimitInSecsKey = "versionGCTimeLimitInSecs";

    if(object.has_key(versionGCTimeLimitInSecsKey))
    {
        bourne::json value = object[versionGCTimeLimitInSecsKey];




        ConfigNodePropertyInteger* obj = &versionGCTimeLimitInSecs;
		obj->fromJson(value.dump());

    }

    const char *blobGcMaxAgeInSecsKey = "blobGcMaxAgeInSecs";

    if(object.has_key(blobGcMaxAgeInSecsKey))
    {
        bourne::json value = object[blobGcMaxAgeInSecsKey];




        ConfigNodePropertyInteger* obj = &blobGcMaxAgeInSecs;
		obj->fromJson(value.dump());

    }

    const char *blobTrackSnapshotIntervalInSecsKey = "blobTrackSnapshotIntervalInSecs";

    if(object.has_key(blobTrackSnapshotIntervalInSecsKey))
    {
        bourne::json value = object[blobTrackSnapshotIntervalInSecsKey];




        ConfigNodePropertyInteger* obj = &blobTrackSnapshotIntervalInSecs;
		obj->fromJson(value.dump());

    }

    const char *repositoryhomeKey = "repository.home";

    if(object.has_key(repositoryhomeKey))
    {
        bourne::json value = object[repositoryhomeKey];




        ConfigNodePropertyString* obj = &repositoryhome;
		obj->fromJson(value.dump());

    }

    const char *maxReplicationLagInSecsKey = "maxReplicationLagInSecs";

    if(object.has_key(maxReplicationLagInSecsKey))
    {
        bourne::json value = object[maxReplicationLagInSecsKey];




        ConfigNodePropertyInteger* obj = &maxReplicationLagInSecs;
		obj->fromJson(value.dump());

    }

    const char *documentStoreTypeKey = "documentStoreType";

    if(object.has_key(documentStoreTypeKey))
    {
        bourne::json value = object[documentStoreTypeKey];




        ConfigNodePropertyDropDown* obj = &documentStoreType;
		obj->fromJson(value.dump());

    }

    const char *bundlingDisabledKey = "bundlingDisabled";

    if(object.has_key(bundlingDisabledKey))
    {
        bourne::json value = object[bundlingDisabledKey];




        ConfigNodePropertyBoolean* obj = &bundlingDisabled;
		obj->fromJson(value.dump());

    }

    const char *updateLimitKey = "updateLimit";

    if(object.has_key(updateLimitKey))
    {
        bourne::json value = object[updateLimitKey];




        ConfigNodePropertyInteger* obj = &updateLimit;
		obj->fromJson(value.dump());

    }

    const char *persistentCacheIncludesKey = "persistentCacheIncludes";

    if(object.has_key(persistentCacheIncludesKey))
    {
        bourne::json value = object[persistentCacheIncludesKey];




        ConfigNodePropertyArray* obj = &persistentCacheIncludes;
		obj->fromJson(value.dump());

    }

    const char *leaseCheckModeKey = "leaseCheckMode";

    if(object.has_key(leaseCheckModeKey))
    {
        bourne::json value = object[leaseCheckModeKey];




        ConfigNodePropertyDropDown* obj = &leaseCheckMode;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["mongouri"] = getMongouri().toJson();






	object["db"] = getDb().toJson();






	object["socketKeepAlive"] = getSocketKeepAlive().toJson();






	object["cache"] = getCache().toJson();






	object["nodeCachePercentage"] = getNodeCachePercentage().toJson();






	object["prevDocCachePercentage"] = getPrevDocCachePercentage().toJson();






	object["childrenCachePercentage"] = getChildrenCachePercentage().toJson();






	object["diffCachePercentage"] = getDiffCachePercentage().toJson();






	object["cacheSegmentCount"] = getCacheSegmentCount().toJson();






	object["cacheStackMoveDistance"] = getCacheStackMoveDistance().toJson();






	object["blobCacheSize"] = getBlobCacheSize().toJson();






	object["persistentCache"] = getPersistentCache().toJson();






	object["journalCache"] = getJournalCache().toJson();






	object["customBlobStore"] = getCustomBlobStore().toJson();






	object["journalGCInterval"] = getJournalGCInterval().toJson();






	object["journalGCMaxAge"] = getJournalGCMaxAge().toJson();






	object["prefetchExternalChanges"] = getPrefetchExternalChanges().toJson();






	object["role"] = getRole().toJson();






	object["versionGcMaxAgeInSecs"] = getVersionGcMaxAgeInSecs().toJson();






	object["versionGCExpression"] = getVersionGCExpression().toJson();






	object["versionGCTimeLimitInSecs"] = getVersionGCTimeLimitInSecs().toJson();






	object["blobGcMaxAgeInSecs"] = getBlobGcMaxAgeInSecs().toJson();






	object["blobTrackSnapshotIntervalInSecs"] = getBlobTrackSnapshotIntervalInSecs().toJson();






	object["repositoryhome"] = getRepositoryhome().toJson();






	object["maxReplicationLagInSecs"] = getMaxReplicationLagInSecs().toJson();






	object["documentStoreType"] = getDocumentStoreType().toJson();






	object["bundlingDisabled"] = getBundlingDisabled().toJson();






	object["updateLimit"] = getUpdateLimit().toJson();






	object["persistentCacheIncludes"] = getPersistentCacheIncludes().toJson();






	object["leaseCheckMode"] = getLeaseCheckMode().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getMongouri()
{
	return mongouri;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setMongouri(ConfigNodePropertyString mongouri)
{
	this->mongouri = mongouri;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getDb()
{
	return db;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setDb(ConfigNodePropertyString db)
{
	this->db = db;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getSocketKeepAlive()
{
	return socketKeepAlive;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setSocketKeepAlive(ConfigNodePropertyBoolean socketKeepAlive)
{
	this->socketKeepAlive = socketKeepAlive;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getCache()
{
	return cache;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setCache(ConfigNodePropertyInteger cache)
{
	this->cache = cache;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getNodeCachePercentage()
{
	return nodeCachePercentage;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setNodeCachePercentage(ConfigNodePropertyInteger nodeCachePercentage)
{
	this->nodeCachePercentage = nodeCachePercentage;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getPrevDocCachePercentage()
{
	return prevDocCachePercentage;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setPrevDocCachePercentage(ConfigNodePropertyInteger prevDocCachePercentage)
{
	this->prevDocCachePercentage = prevDocCachePercentage;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getChildrenCachePercentage()
{
	return childrenCachePercentage;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setChildrenCachePercentage(ConfigNodePropertyInteger childrenCachePercentage)
{
	this->childrenCachePercentage = childrenCachePercentage;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getDiffCachePercentage()
{
	return diffCachePercentage;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setDiffCachePercentage(ConfigNodePropertyInteger diffCachePercentage)
{
	this->diffCachePercentage = diffCachePercentage;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getCacheSegmentCount()
{
	return cacheSegmentCount;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setCacheSegmentCount(ConfigNodePropertyInteger cacheSegmentCount)
{
	this->cacheSegmentCount = cacheSegmentCount;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getCacheStackMoveDistance()
{
	return cacheStackMoveDistance;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setCacheStackMoveDistance(ConfigNodePropertyInteger cacheStackMoveDistance)
{
	this->cacheStackMoveDistance = cacheStackMoveDistance;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getBlobCacheSize()
{
	return blobCacheSize;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setBlobCacheSize(ConfigNodePropertyInteger blobCacheSize)
{
	this->blobCacheSize = blobCacheSize;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getPersistentCache()
{
	return persistentCache;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setPersistentCache(ConfigNodePropertyString persistentCache)
{
	this->persistentCache = persistentCache;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getJournalCache()
{
	return journalCache;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setJournalCache(ConfigNodePropertyString journalCache)
{
	this->journalCache = journalCache;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getCustomBlobStore()
{
	return customBlobStore;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore)
{
	this->customBlobStore = customBlobStore;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getJournalGCInterval()
{
	return journalGCInterval;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setJournalGCInterval(ConfigNodePropertyInteger journalGCInterval)
{
	this->journalGCInterval = journalGCInterval;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getJournalGCMaxAge()
{
	return journalGCMaxAge;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setJournalGCMaxAge(ConfigNodePropertyInteger journalGCMaxAge)
{
	this->journalGCMaxAge = journalGCMaxAge;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getPrefetchExternalChanges()
{
	return prefetchExternalChanges;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setPrefetchExternalChanges(ConfigNodePropertyBoolean prefetchExternalChanges)
{
	this->prefetchExternalChanges = prefetchExternalChanges;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getRole()
{
	return role;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setRole(ConfigNodePropertyString role)
{
	this->role = role;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getVersionGcMaxAgeInSecs()
{
	return versionGcMaxAgeInSecs;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setVersionGcMaxAgeInSecs(ConfigNodePropertyInteger versionGcMaxAgeInSecs)
{
	this->versionGcMaxAgeInSecs = versionGcMaxAgeInSecs;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getVersionGCExpression()
{
	return versionGCExpression;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setVersionGCExpression(ConfigNodePropertyString versionGCExpression)
{
	this->versionGCExpression = versionGCExpression;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getVersionGCTimeLimitInSecs()
{
	return versionGCTimeLimitInSecs;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setVersionGCTimeLimitInSecs(ConfigNodePropertyInteger versionGCTimeLimitInSecs)
{
	this->versionGCTimeLimitInSecs = versionGCTimeLimitInSecs;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getBlobGcMaxAgeInSecs()
{
	return blobGcMaxAgeInSecs;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs)
{
	this->blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getBlobTrackSnapshotIntervalInSecs()
{
	return blobTrackSnapshotIntervalInSecs;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs)
{
	this->blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getRepositoryhome()
{
	return repositoryhome;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setRepositoryhome(ConfigNodePropertyString repositoryhome)
{
	this->repositoryhome = repositoryhome;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getMaxReplicationLagInSecs()
{
	return maxReplicationLagInSecs;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setMaxReplicationLagInSecs(ConfigNodePropertyInteger maxReplicationLagInSecs)
{
	this->maxReplicationLagInSecs = maxReplicationLagInSecs;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getDocumentStoreType()
{
	return documentStoreType;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setDocumentStoreType(ConfigNodePropertyDropDown documentStoreType)
{
	this->documentStoreType = documentStoreType;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getBundlingDisabled()
{
	return bundlingDisabled;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setBundlingDisabled(ConfigNodePropertyBoolean bundlingDisabled)
{
	this->bundlingDisabled = bundlingDisabled;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getUpdateLimit()
{
	return updateLimit;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setUpdateLimit(ConfigNodePropertyInteger updateLimit)
{
	this->updateLimit = updateLimit;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getPersistentCacheIncludes()
{
	return persistentCacheIncludes;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setPersistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes)
{
	this->persistentCacheIncludes = persistentCacheIncludes;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::getLeaseCheckMode()
{
	return leaseCheckMode;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties::setLeaseCheckMode(ConfigNodePropertyDropDown leaseCheckMode)
{
	this->leaseCheckMode = leaseCheckMode;
}



