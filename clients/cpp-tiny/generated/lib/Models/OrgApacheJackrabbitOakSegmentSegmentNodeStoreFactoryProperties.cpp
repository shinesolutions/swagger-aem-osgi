

#include "OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties()
{
	repositoryhome = ConfigNodePropertyString();
	tarmkmode = ConfigNodePropertyString();
	tarmksize = ConfigNodePropertyInteger();
	segmentCachesize = ConfigNodePropertyInteger();
	stringCachesize = ConfigNodePropertyInteger();
	templateCachesize = ConfigNodePropertyInteger();
	stringDeduplicationCachesize = ConfigNodePropertyInteger();
	templateDeduplicationCachesize = ConfigNodePropertyInteger();
	nodeDeduplicationCachesize = ConfigNodePropertyInteger();
	pauseCompaction = ConfigNodePropertyBoolean();
	compactionretryCount = ConfigNodePropertyInteger();
	compactionforcetimeout = ConfigNodePropertyInteger();
	compactionsizeDeltaEstimation = ConfigNodePropertyInteger();
	compactiondisableEstimation = ConfigNodePropertyBoolean();
	compactionretainedGenerations = ConfigNodePropertyInteger();
	compactionmemoryThreshold = ConfigNodePropertyInteger();
	compactionprogressLog = ConfigNodePropertyInteger();
	standby = ConfigNodePropertyBoolean();
	customBlobStore = ConfigNodePropertyBoolean();
	customSegmentStore = ConfigNodePropertyBoolean();
	splitPersistence = ConfigNodePropertyBoolean();
	repositorybackupdir = ConfigNodePropertyString();
	blobGcMaxAgeInSecs = ConfigNodePropertyInteger();
	blobTrackSnapshotIntervalInSecs = ConfigNodePropertyInteger();
	role = ConfigNodePropertyString();
	registerDescriptors = ConfigNodePropertyBoolean();
	dispatchChanges = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::~OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties()
{

}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *repositoryhomeKey = "repository.home";

    if(object.has_key(repositoryhomeKey))
    {
        bourne::json value = object[repositoryhomeKey];




        ConfigNodePropertyString* obj = &repositoryhome;
		obj->fromJson(value.dump());

    }

    const char *tarmkmodeKey = "tarmk.mode";

    if(object.has_key(tarmkmodeKey))
    {
        bourne::json value = object[tarmkmodeKey];




        ConfigNodePropertyString* obj = &tarmkmode;
		obj->fromJson(value.dump());

    }

    const char *tarmksizeKey = "tarmk.size";

    if(object.has_key(tarmksizeKey))
    {
        bourne::json value = object[tarmksizeKey];




        ConfigNodePropertyInteger* obj = &tarmksize;
		obj->fromJson(value.dump());

    }

    const char *segmentCachesizeKey = "segmentCache.size";

    if(object.has_key(segmentCachesizeKey))
    {
        bourne::json value = object[segmentCachesizeKey];




        ConfigNodePropertyInteger* obj = &segmentCachesize;
		obj->fromJson(value.dump());

    }

    const char *stringCachesizeKey = "stringCache.size";

    if(object.has_key(stringCachesizeKey))
    {
        bourne::json value = object[stringCachesizeKey];




        ConfigNodePropertyInteger* obj = &stringCachesize;
		obj->fromJson(value.dump());

    }

    const char *templateCachesizeKey = "templateCache.size";

    if(object.has_key(templateCachesizeKey))
    {
        bourne::json value = object[templateCachesizeKey];




        ConfigNodePropertyInteger* obj = &templateCachesize;
		obj->fromJson(value.dump());

    }

    const char *stringDeduplicationCachesizeKey = "stringDeduplicationCache.size";

    if(object.has_key(stringDeduplicationCachesizeKey))
    {
        bourne::json value = object[stringDeduplicationCachesizeKey];




        ConfigNodePropertyInteger* obj = &stringDeduplicationCachesize;
		obj->fromJson(value.dump());

    }

    const char *templateDeduplicationCachesizeKey = "templateDeduplicationCache.size";

    if(object.has_key(templateDeduplicationCachesizeKey))
    {
        bourne::json value = object[templateDeduplicationCachesizeKey];




        ConfigNodePropertyInteger* obj = &templateDeduplicationCachesize;
		obj->fromJson(value.dump());

    }

    const char *nodeDeduplicationCachesizeKey = "nodeDeduplicationCache.size";

    if(object.has_key(nodeDeduplicationCachesizeKey))
    {
        bourne::json value = object[nodeDeduplicationCachesizeKey];




        ConfigNodePropertyInteger* obj = &nodeDeduplicationCachesize;
		obj->fromJson(value.dump());

    }

    const char *pauseCompactionKey = "pauseCompaction";

    if(object.has_key(pauseCompactionKey))
    {
        bourne::json value = object[pauseCompactionKey];




        ConfigNodePropertyBoolean* obj = &pauseCompaction;
		obj->fromJson(value.dump());

    }

    const char *compactionretryCountKey = "compaction.retryCount";

    if(object.has_key(compactionretryCountKey))
    {
        bourne::json value = object[compactionretryCountKey];




        ConfigNodePropertyInteger* obj = &compactionretryCount;
		obj->fromJson(value.dump());

    }

    const char *compactionforcetimeoutKey = "compaction.force.timeout";

    if(object.has_key(compactionforcetimeoutKey))
    {
        bourne::json value = object[compactionforcetimeoutKey];




        ConfigNodePropertyInteger* obj = &compactionforcetimeout;
		obj->fromJson(value.dump());

    }

    const char *compactionsizeDeltaEstimationKey = "compaction.sizeDeltaEstimation";

    if(object.has_key(compactionsizeDeltaEstimationKey))
    {
        bourne::json value = object[compactionsizeDeltaEstimationKey];




        ConfigNodePropertyInteger* obj = &compactionsizeDeltaEstimation;
		obj->fromJson(value.dump());

    }

    const char *compactiondisableEstimationKey = "compaction.disableEstimation";

    if(object.has_key(compactiondisableEstimationKey))
    {
        bourne::json value = object[compactiondisableEstimationKey];




        ConfigNodePropertyBoolean* obj = &compactiondisableEstimation;
		obj->fromJson(value.dump());

    }

    const char *compactionretainedGenerationsKey = "compaction.retainedGenerations";

    if(object.has_key(compactionretainedGenerationsKey))
    {
        bourne::json value = object[compactionretainedGenerationsKey];




        ConfigNodePropertyInteger* obj = &compactionretainedGenerations;
		obj->fromJson(value.dump());

    }

    const char *compactionmemoryThresholdKey = "compaction.memoryThreshold";

    if(object.has_key(compactionmemoryThresholdKey))
    {
        bourne::json value = object[compactionmemoryThresholdKey];




        ConfigNodePropertyInteger* obj = &compactionmemoryThreshold;
		obj->fromJson(value.dump());

    }

    const char *compactionprogressLogKey = "compaction.progressLog";

    if(object.has_key(compactionprogressLogKey))
    {
        bourne::json value = object[compactionprogressLogKey];




        ConfigNodePropertyInteger* obj = &compactionprogressLog;
		obj->fromJson(value.dump());

    }

    const char *standbyKey = "standby";

    if(object.has_key(standbyKey))
    {
        bourne::json value = object[standbyKey];




        ConfigNodePropertyBoolean* obj = &standby;
		obj->fromJson(value.dump());

    }

    const char *customBlobStoreKey = "customBlobStore";

    if(object.has_key(customBlobStoreKey))
    {
        bourne::json value = object[customBlobStoreKey];




        ConfigNodePropertyBoolean* obj = &customBlobStore;
		obj->fromJson(value.dump());

    }

    const char *customSegmentStoreKey = "customSegmentStore";

    if(object.has_key(customSegmentStoreKey))
    {
        bourne::json value = object[customSegmentStoreKey];




        ConfigNodePropertyBoolean* obj = &customSegmentStore;
		obj->fromJson(value.dump());

    }

    const char *splitPersistenceKey = "splitPersistence";

    if(object.has_key(splitPersistenceKey))
    {
        bourne::json value = object[splitPersistenceKey];




        ConfigNodePropertyBoolean* obj = &splitPersistence;
		obj->fromJson(value.dump());

    }

    const char *repositorybackupdirKey = "repository.backup.dir";

    if(object.has_key(repositorybackupdirKey))
    {
        bourne::json value = object[repositorybackupdirKey];




        ConfigNodePropertyString* obj = &repositorybackupdir;
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

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];




        ConfigNodePropertyString* obj = &role;
		obj->fromJson(value.dump());

    }

    const char *registerDescriptorsKey = "registerDescriptors";

    if(object.has_key(registerDescriptorsKey))
    {
        bourne::json value = object[registerDescriptorsKey];




        ConfigNodePropertyBoolean* obj = &registerDescriptors;
		obj->fromJson(value.dump());

    }

    const char *dispatchChangesKey = "dispatchChanges";

    if(object.has_key(dispatchChangesKey))
    {
        bourne::json value = object[dispatchChangesKey];




        ConfigNodePropertyBoolean* obj = &dispatchChanges;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["repositoryhome"] = getRepositoryhome().toJson();






	object["tarmkmode"] = getTarmkmode().toJson();






	object["tarmksize"] = getTarmksize().toJson();






	object["segmentCachesize"] = getSegmentCachesize().toJson();






	object["stringCachesize"] = getStringCachesize().toJson();






	object["templateCachesize"] = getTemplateCachesize().toJson();






	object["stringDeduplicationCachesize"] = getStringDeduplicationCachesize().toJson();






	object["templateDeduplicationCachesize"] = getTemplateDeduplicationCachesize().toJson();






	object["nodeDeduplicationCachesize"] = getNodeDeduplicationCachesize().toJson();






	object["pauseCompaction"] = getPauseCompaction().toJson();






	object["compactionretryCount"] = getCompactionretryCount().toJson();






	object["compactionforcetimeout"] = getCompactionforcetimeout().toJson();






	object["compactionsizeDeltaEstimation"] = getCompactionsizeDeltaEstimation().toJson();






	object["compactiondisableEstimation"] = getCompactiondisableEstimation().toJson();






	object["compactionretainedGenerations"] = getCompactionretainedGenerations().toJson();






	object["compactionmemoryThreshold"] = getCompactionmemoryThreshold().toJson();






	object["compactionprogressLog"] = getCompactionprogressLog().toJson();






	object["standby"] = getStandby().toJson();






	object["customBlobStore"] = getCustomBlobStore().toJson();






	object["customSegmentStore"] = getCustomSegmentStore().toJson();






	object["splitPersistence"] = getSplitPersistence().toJson();






	object["repositorybackupdir"] = getRepositorybackupdir().toJson();






	object["blobGcMaxAgeInSecs"] = getBlobGcMaxAgeInSecs().toJson();






	object["blobTrackSnapshotIntervalInSecs"] = getBlobTrackSnapshotIntervalInSecs().toJson();






	object["role"] = getRole().toJson();






	object["registerDescriptors"] = getRegisterDescriptors().toJson();






	object["dispatchChanges"] = getDispatchChanges().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getRepositoryhome()
{
	return repositoryhome;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setRepositoryhome(ConfigNodePropertyString repositoryhome)
{
	this->repositoryhome = repositoryhome;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getTarmkmode()
{
	return tarmkmode;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setTarmkmode(ConfigNodePropertyString tarmkmode)
{
	this->tarmkmode = tarmkmode;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getTarmksize()
{
	return tarmksize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setTarmksize(ConfigNodePropertyInteger tarmksize)
{
	this->tarmksize = tarmksize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getSegmentCachesize()
{
	return segmentCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setSegmentCachesize(ConfigNodePropertyInteger segmentCachesize)
{
	this->segmentCachesize = segmentCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getStringCachesize()
{
	return stringCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setStringCachesize(ConfigNodePropertyInteger stringCachesize)
{
	this->stringCachesize = stringCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getTemplateCachesize()
{
	return templateCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setTemplateCachesize(ConfigNodePropertyInteger templateCachesize)
{
	this->templateCachesize = templateCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getStringDeduplicationCachesize()
{
	return stringDeduplicationCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setStringDeduplicationCachesize(ConfigNodePropertyInteger stringDeduplicationCachesize)
{
	this->stringDeduplicationCachesize = stringDeduplicationCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getTemplateDeduplicationCachesize()
{
	return templateDeduplicationCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setTemplateDeduplicationCachesize(ConfigNodePropertyInteger templateDeduplicationCachesize)
{
	this->templateDeduplicationCachesize = templateDeduplicationCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getNodeDeduplicationCachesize()
{
	return nodeDeduplicationCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setNodeDeduplicationCachesize(ConfigNodePropertyInteger nodeDeduplicationCachesize)
{
	this->nodeDeduplicationCachesize = nodeDeduplicationCachesize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getPauseCompaction()
{
	return pauseCompaction;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setPauseCompaction(ConfigNodePropertyBoolean pauseCompaction)
{
	this->pauseCompaction = pauseCompaction;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getCompactionretryCount()
{
	return compactionretryCount;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setCompactionretryCount(ConfigNodePropertyInteger compactionretryCount)
{
	this->compactionretryCount = compactionretryCount;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getCompactionforcetimeout()
{
	return compactionforcetimeout;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setCompactionforcetimeout(ConfigNodePropertyInteger compactionforcetimeout)
{
	this->compactionforcetimeout = compactionforcetimeout;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getCompactionsizeDeltaEstimation()
{
	return compactionsizeDeltaEstimation;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setCompactionsizeDeltaEstimation(ConfigNodePropertyInteger compactionsizeDeltaEstimation)
{
	this->compactionsizeDeltaEstimation = compactionsizeDeltaEstimation;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getCompactiondisableEstimation()
{
	return compactiondisableEstimation;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setCompactiondisableEstimation(ConfigNodePropertyBoolean compactiondisableEstimation)
{
	this->compactiondisableEstimation = compactiondisableEstimation;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getCompactionretainedGenerations()
{
	return compactionretainedGenerations;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setCompactionretainedGenerations(ConfigNodePropertyInteger compactionretainedGenerations)
{
	this->compactionretainedGenerations = compactionretainedGenerations;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getCompactionmemoryThreshold()
{
	return compactionmemoryThreshold;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setCompactionmemoryThreshold(ConfigNodePropertyInteger compactionmemoryThreshold)
{
	this->compactionmemoryThreshold = compactionmemoryThreshold;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getCompactionprogressLog()
{
	return compactionprogressLog;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setCompactionprogressLog(ConfigNodePropertyInteger compactionprogressLog)
{
	this->compactionprogressLog = compactionprogressLog;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getStandby()
{
	return standby;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setStandby(ConfigNodePropertyBoolean standby)
{
	this->standby = standby;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getCustomBlobStore()
{
	return customBlobStore;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore)
{
	this->customBlobStore = customBlobStore;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getCustomSegmentStore()
{
	return customSegmentStore;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setCustomSegmentStore(ConfigNodePropertyBoolean customSegmentStore)
{
	this->customSegmentStore = customSegmentStore;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getSplitPersistence()
{
	return splitPersistence;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setSplitPersistence(ConfigNodePropertyBoolean splitPersistence)
{
	this->splitPersistence = splitPersistence;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getRepositorybackupdir()
{
	return repositorybackupdir;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setRepositorybackupdir(ConfigNodePropertyString repositorybackupdir)
{
	this->repositorybackupdir = repositorybackupdir;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getBlobGcMaxAgeInSecs()
{
	return blobGcMaxAgeInSecs;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs)
{
	this->blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getBlobTrackSnapshotIntervalInSecs()
{
	return blobTrackSnapshotIntervalInSecs;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs)
{
	this->blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getRole()
{
	return role;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setRole(ConfigNodePropertyString role)
{
	this->role = role;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getRegisterDescriptors()
{
	return registerDescriptors;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setRegisterDescriptors(ConfigNodePropertyBoolean registerDescriptors)
{
	this->registerDescriptors = registerDescriptors;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::getDispatchChanges()
{
	return dispatchChanges;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties::setDispatchChanges(ConfigNodePropertyBoolean dispatchChanges)
{
	this->dispatchChanges = dispatchChanges;
}



