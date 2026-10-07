

#include "OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties()
{
	disabled = ConfigNodePropertyBoolean();
	debug = ConfigNodePropertyBoolean();
	localIndexDir = ConfigNodePropertyString();
	enableOpenIndexAsync = ConfigNodePropertyBoolean();
	threadPoolSize = ConfigNodePropertyInteger();
	prefetchIndexFiles = ConfigNodePropertyBoolean();
	extractedTextCacheSizeInMB = ConfigNodePropertyInteger();
	extractedTextCacheExpiryInSecs = ConfigNodePropertyInteger();
	alwaysUsePreExtractedCache = ConfigNodePropertyBoolean();
	booleanClauseLimit = ConfigNodePropertyInteger();
	enableHybridIndexing = ConfigNodePropertyBoolean();
	hybridQueueSize = ConfigNodePropertyInteger();
	disableStoredIndexDefinition = ConfigNodePropertyBoolean();
	deletedBlobsCollectionEnabled = ConfigNodePropertyBoolean();
	propIndexCleanerIntervalInSecs = ConfigNodePropertyInteger();
	enableSingleBlobIndexFiles = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::~OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties()
{

}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *disabledKey = "disabled";

    if(object.has_key(disabledKey))
    {
        bourne::json value = object[disabledKey];




        ConfigNodePropertyBoolean* obj = &disabled;
		obj->fromJson(value.dump());

    }

    const char *debugKey = "debug";

    if(object.has_key(debugKey))
    {
        bourne::json value = object[debugKey];




        ConfigNodePropertyBoolean* obj = &debug;
		obj->fromJson(value.dump());

    }

    const char *localIndexDirKey = "localIndexDir";

    if(object.has_key(localIndexDirKey))
    {
        bourne::json value = object[localIndexDirKey];




        ConfigNodePropertyString* obj = &localIndexDir;
		obj->fromJson(value.dump());

    }

    const char *enableOpenIndexAsyncKey = "enableOpenIndexAsync";

    if(object.has_key(enableOpenIndexAsyncKey))
    {
        bourne::json value = object[enableOpenIndexAsyncKey];




        ConfigNodePropertyBoolean* obj = &enableOpenIndexAsync;
		obj->fromJson(value.dump());

    }

    const char *threadPoolSizeKey = "threadPoolSize";

    if(object.has_key(threadPoolSizeKey))
    {
        bourne::json value = object[threadPoolSizeKey];




        ConfigNodePropertyInteger* obj = &threadPoolSize;
		obj->fromJson(value.dump());

    }

    const char *prefetchIndexFilesKey = "prefetchIndexFiles";

    if(object.has_key(prefetchIndexFilesKey))
    {
        bourne::json value = object[prefetchIndexFilesKey];




        ConfigNodePropertyBoolean* obj = &prefetchIndexFiles;
		obj->fromJson(value.dump());

    }

    const char *extractedTextCacheSizeInMBKey = "extractedTextCacheSizeInMB";

    if(object.has_key(extractedTextCacheSizeInMBKey))
    {
        bourne::json value = object[extractedTextCacheSizeInMBKey];




        ConfigNodePropertyInteger* obj = &extractedTextCacheSizeInMB;
		obj->fromJson(value.dump());

    }

    const char *extractedTextCacheExpiryInSecsKey = "extractedTextCacheExpiryInSecs";

    if(object.has_key(extractedTextCacheExpiryInSecsKey))
    {
        bourne::json value = object[extractedTextCacheExpiryInSecsKey];




        ConfigNodePropertyInteger* obj = &extractedTextCacheExpiryInSecs;
		obj->fromJson(value.dump());

    }

    const char *alwaysUsePreExtractedCacheKey = "alwaysUsePreExtractedCache";

    if(object.has_key(alwaysUsePreExtractedCacheKey))
    {
        bourne::json value = object[alwaysUsePreExtractedCacheKey];




        ConfigNodePropertyBoolean* obj = &alwaysUsePreExtractedCache;
		obj->fromJson(value.dump());

    }

    const char *booleanClauseLimitKey = "booleanClauseLimit";

    if(object.has_key(booleanClauseLimitKey))
    {
        bourne::json value = object[booleanClauseLimitKey];




        ConfigNodePropertyInteger* obj = &booleanClauseLimit;
		obj->fromJson(value.dump());

    }

    const char *enableHybridIndexingKey = "enableHybridIndexing";

    if(object.has_key(enableHybridIndexingKey))
    {
        bourne::json value = object[enableHybridIndexingKey];




        ConfigNodePropertyBoolean* obj = &enableHybridIndexing;
		obj->fromJson(value.dump());

    }

    const char *hybridQueueSizeKey = "hybridQueueSize";

    if(object.has_key(hybridQueueSizeKey))
    {
        bourne::json value = object[hybridQueueSizeKey];




        ConfigNodePropertyInteger* obj = &hybridQueueSize;
		obj->fromJson(value.dump());

    }

    const char *disableStoredIndexDefinitionKey = "disableStoredIndexDefinition";

    if(object.has_key(disableStoredIndexDefinitionKey))
    {
        bourne::json value = object[disableStoredIndexDefinitionKey];




        ConfigNodePropertyBoolean* obj = &disableStoredIndexDefinition;
		obj->fromJson(value.dump());

    }

    const char *deletedBlobsCollectionEnabledKey = "deletedBlobsCollectionEnabled";

    if(object.has_key(deletedBlobsCollectionEnabledKey))
    {
        bourne::json value = object[deletedBlobsCollectionEnabledKey];




        ConfigNodePropertyBoolean* obj = &deletedBlobsCollectionEnabled;
		obj->fromJson(value.dump());

    }

    const char *propIndexCleanerIntervalInSecsKey = "propIndexCleanerIntervalInSecs";

    if(object.has_key(propIndexCleanerIntervalInSecsKey))
    {
        bourne::json value = object[propIndexCleanerIntervalInSecsKey];




        ConfigNodePropertyInteger* obj = &propIndexCleanerIntervalInSecs;
		obj->fromJson(value.dump());

    }

    const char *enableSingleBlobIndexFilesKey = "enableSingleBlobIndexFiles";

    if(object.has_key(enableSingleBlobIndexFilesKey))
    {
        bourne::json value = object[enableSingleBlobIndexFilesKey];




        ConfigNodePropertyBoolean* obj = &enableSingleBlobIndexFiles;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["disabled"] = getDisabled().toJson();






	object["debug"] = getDebug().toJson();






	object["localIndexDir"] = getLocalIndexDir().toJson();






	object["enableOpenIndexAsync"] = getEnableOpenIndexAsync().toJson();






	object["threadPoolSize"] = getThreadPoolSize().toJson();






	object["prefetchIndexFiles"] = getPrefetchIndexFiles().toJson();






	object["extractedTextCacheSizeInMB"] = getExtractedTextCacheSizeInMB().toJson();






	object["extractedTextCacheExpiryInSecs"] = getExtractedTextCacheExpiryInSecs().toJson();






	object["alwaysUsePreExtractedCache"] = getAlwaysUsePreExtractedCache().toJson();






	object["booleanClauseLimit"] = getBooleanClauseLimit().toJson();






	object["enableHybridIndexing"] = getEnableHybridIndexing().toJson();






	object["hybridQueueSize"] = getHybridQueueSize().toJson();






	object["disableStoredIndexDefinition"] = getDisableStoredIndexDefinition().toJson();






	object["deletedBlobsCollectionEnabled"] = getDeletedBlobsCollectionEnabled().toJson();






	object["propIndexCleanerIntervalInSecs"] = getPropIndexCleanerIntervalInSecs().toJson();






	object["enableSingleBlobIndexFiles"] = getEnableSingleBlobIndexFiles().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getDisabled()
{
	return disabled;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setDisabled(ConfigNodePropertyBoolean disabled)
{
	this->disabled = disabled;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getDebug()
{
	return debug;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setDebug(ConfigNodePropertyBoolean debug)
{
	this->debug = debug;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getLocalIndexDir()
{
	return localIndexDir;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setLocalIndexDir(ConfigNodePropertyString localIndexDir)
{
	this->localIndexDir = localIndexDir;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getEnableOpenIndexAsync()
{
	return enableOpenIndexAsync;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setEnableOpenIndexAsync(ConfigNodePropertyBoolean enableOpenIndexAsync)
{
	this->enableOpenIndexAsync = enableOpenIndexAsync;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getThreadPoolSize()
{
	return threadPoolSize;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize)
{
	this->threadPoolSize = threadPoolSize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getPrefetchIndexFiles()
{
	return prefetchIndexFiles;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setPrefetchIndexFiles(ConfigNodePropertyBoolean prefetchIndexFiles)
{
	this->prefetchIndexFiles = prefetchIndexFiles;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getExtractedTextCacheSizeInMB()
{
	return extractedTextCacheSizeInMB;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setExtractedTextCacheSizeInMB(ConfigNodePropertyInteger extractedTextCacheSizeInMB)
{
	this->extractedTextCacheSizeInMB = extractedTextCacheSizeInMB;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getExtractedTextCacheExpiryInSecs()
{
	return extractedTextCacheExpiryInSecs;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setExtractedTextCacheExpiryInSecs(ConfigNodePropertyInteger extractedTextCacheExpiryInSecs)
{
	this->extractedTextCacheExpiryInSecs = extractedTextCacheExpiryInSecs;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getAlwaysUsePreExtractedCache()
{
	return alwaysUsePreExtractedCache;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setAlwaysUsePreExtractedCache(ConfigNodePropertyBoolean alwaysUsePreExtractedCache)
{
	this->alwaysUsePreExtractedCache = alwaysUsePreExtractedCache;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getBooleanClauseLimit()
{
	return booleanClauseLimit;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setBooleanClauseLimit(ConfigNodePropertyInteger booleanClauseLimit)
{
	this->booleanClauseLimit = booleanClauseLimit;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getEnableHybridIndexing()
{
	return enableHybridIndexing;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setEnableHybridIndexing(ConfigNodePropertyBoolean enableHybridIndexing)
{
	this->enableHybridIndexing = enableHybridIndexing;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getHybridQueueSize()
{
	return hybridQueueSize;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setHybridQueueSize(ConfigNodePropertyInteger hybridQueueSize)
{
	this->hybridQueueSize = hybridQueueSize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getDisableStoredIndexDefinition()
{
	return disableStoredIndexDefinition;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setDisableStoredIndexDefinition(ConfigNodePropertyBoolean disableStoredIndexDefinition)
{
	this->disableStoredIndexDefinition = disableStoredIndexDefinition;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getDeletedBlobsCollectionEnabled()
{
	return deletedBlobsCollectionEnabled;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setDeletedBlobsCollectionEnabled(ConfigNodePropertyBoolean deletedBlobsCollectionEnabled)
{
	this->deletedBlobsCollectionEnabled = deletedBlobsCollectionEnabled;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getPropIndexCleanerIntervalInSecs()
{
	return propIndexCleanerIntervalInSecs;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setPropIndexCleanerIntervalInSecs(ConfigNodePropertyInteger propIndexCleanerIntervalInSecs)
{
	this->propIndexCleanerIntervalInSecs = propIndexCleanerIntervalInSecs;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getEnableSingleBlobIndexFiles()
{
	return enableSingleBlobIndexFiles;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setEnableSingleBlobIndexFiles(ConfigNodePropertyBoolean enableSingleBlobIndexFiles)
{
	this->enableSingleBlobIndexFiles = enableSingleBlobIndexFiles;
}



