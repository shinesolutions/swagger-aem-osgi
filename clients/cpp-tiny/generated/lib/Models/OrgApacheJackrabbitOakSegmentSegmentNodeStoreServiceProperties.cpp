

#include "OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties()
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
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::~OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties()
{

}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::fromJson(std::string jsonObj)
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


}

bourne::json
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::toJson()
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


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getRepositoryhome()
{
	return repositoryhome;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setRepositoryhome(ConfigNodePropertyString repositoryhome)
{
	this->repositoryhome = repositoryhome;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTarmkmode()
{
	return tarmkmode;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTarmkmode(ConfigNodePropertyString tarmkmode)
{
	this->tarmkmode = tarmkmode;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTarmksize()
{
	return tarmksize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTarmksize(ConfigNodePropertyInteger tarmksize)
{
	this->tarmksize = tarmksize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getSegmentCachesize()
{
	return segmentCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setSegmentCachesize(ConfigNodePropertyInteger segmentCachesize)
{
	this->segmentCachesize = segmentCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getStringCachesize()
{
	return stringCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setStringCachesize(ConfigNodePropertyInteger stringCachesize)
{
	this->stringCachesize = stringCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTemplateCachesize()
{
	return templateCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTemplateCachesize(ConfigNodePropertyInteger templateCachesize)
{
	this->templateCachesize = templateCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getStringDeduplicationCachesize()
{
	return stringDeduplicationCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setStringDeduplicationCachesize(ConfigNodePropertyInteger stringDeduplicationCachesize)
{
	this->stringDeduplicationCachesize = stringDeduplicationCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTemplateDeduplicationCachesize()
{
	return templateDeduplicationCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTemplateDeduplicationCachesize(ConfigNodePropertyInteger templateDeduplicationCachesize)
{
	this->templateDeduplicationCachesize = templateDeduplicationCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getNodeDeduplicationCachesize()
{
	return nodeDeduplicationCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setNodeDeduplicationCachesize(ConfigNodePropertyInteger nodeDeduplicationCachesize)
{
	this->nodeDeduplicationCachesize = nodeDeduplicationCachesize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getPauseCompaction()
{
	return pauseCompaction;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setPauseCompaction(ConfigNodePropertyBoolean pauseCompaction)
{
	this->pauseCompaction = pauseCompaction;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionretryCount()
{
	return compactionretryCount;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionretryCount(ConfigNodePropertyInteger compactionretryCount)
{
	this->compactionretryCount = compactionretryCount;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionforcetimeout()
{
	return compactionforcetimeout;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionforcetimeout(ConfigNodePropertyInteger compactionforcetimeout)
{
	this->compactionforcetimeout = compactionforcetimeout;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionsizeDeltaEstimation()
{
	return compactionsizeDeltaEstimation;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionsizeDeltaEstimation(ConfigNodePropertyInteger compactionsizeDeltaEstimation)
{
	this->compactionsizeDeltaEstimation = compactionsizeDeltaEstimation;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactiondisableEstimation()
{
	return compactiondisableEstimation;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactiondisableEstimation(ConfigNodePropertyBoolean compactiondisableEstimation)
{
	this->compactiondisableEstimation = compactiondisableEstimation;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionretainedGenerations()
{
	return compactionretainedGenerations;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionretainedGenerations(ConfigNodePropertyInteger compactionretainedGenerations)
{
	this->compactionretainedGenerations = compactionretainedGenerations;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionmemoryThreshold()
{
	return compactionmemoryThreshold;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionmemoryThreshold(ConfigNodePropertyInteger compactionmemoryThreshold)
{
	this->compactionmemoryThreshold = compactionmemoryThreshold;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionprogressLog()
{
	return compactionprogressLog;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionprogressLog(ConfigNodePropertyInteger compactionprogressLog)
{
	this->compactionprogressLog = compactionprogressLog;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getStandby()
{
	return standby;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setStandby(ConfigNodePropertyBoolean standby)
{
	this->standby = standby;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCustomBlobStore()
{
	return customBlobStore;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCustomBlobStore(ConfigNodePropertyBoolean customBlobStore)
{
	this->customBlobStore = customBlobStore;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCustomSegmentStore()
{
	return customSegmentStore;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCustomSegmentStore(ConfigNodePropertyBoolean customSegmentStore)
{
	this->customSegmentStore = customSegmentStore;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getSplitPersistence()
{
	return splitPersistence;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setSplitPersistence(ConfigNodePropertyBoolean splitPersistence)
{
	this->splitPersistence = splitPersistence;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getRepositorybackupdir()
{
	return repositorybackupdir;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setRepositorybackupdir(ConfigNodePropertyString repositorybackupdir)
{
	this->repositorybackupdir = repositorybackupdir;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getBlobGcMaxAgeInSecs()
{
	return blobGcMaxAgeInSecs;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger blobGcMaxAgeInSecs)
{
	this->blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getBlobTrackSnapshotIntervalInSecs()
{
	return blobTrackSnapshotIntervalInSecs;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs)
{
	this->blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
}



