#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::~OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::__init()
{
	//disabled = new ConfigNodePropertyBoolean();
	//debug = new ConfigNodePropertyBoolean();
	//localIndexDir = new ConfigNodePropertyString();
	//enableOpenIndexAsync = new ConfigNodePropertyBoolean();
	//threadPoolSize = new ConfigNodePropertyInteger();
	//prefetchIndexFiles = new ConfigNodePropertyBoolean();
	//extractedTextCacheSizeInMB = new ConfigNodePropertyInteger();
	//extractedTextCacheExpiryInSecs = new ConfigNodePropertyInteger();
	//alwaysUsePreExtractedCache = new ConfigNodePropertyBoolean();
	//booleanClauseLimit = new ConfigNodePropertyInteger();
	//enableHybridIndexing = new ConfigNodePropertyBoolean();
	//hybridQueueSize = new ConfigNodePropertyInteger();
	//disableStoredIndexDefinition = new ConfigNodePropertyBoolean();
	//deletedBlobsCollectionEnabled = new ConfigNodePropertyBoolean();
	//propIndexCleanerIntervalInSecs = new ConfigNodePropertyInteger();
	//enableSingleBlobIndexFiles = new ConfigNodePropertyBoolean();
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::__cleanup()
{
	//if(disabled != NULL) {
	//
	//delete disabled;
	//disabled = NULL;
	//}
	//if(debug != NULL) {
	//
	//delete debug;
	//debug = NULL;
	//}
	//if(localIndexDir != NULL) {
	//
	//delete localIndexDir;
	//localIndexDir = NULL;
	//}
	//if(enableOpenIndexAsync != NULL) {
	//
	//delete enableOpenIndexAsync;
	//enableOpenIndexAsync = NULL;
	//}
	//if(threadPoolSize != NULL) {
	//
	//delete threadPoolSize;
	//threadPoolSize = NULL;
	//}
	//if(prefetchIndexFiles != NULL) {
	//
	//delete prefetchIndexFiles;
	//prefetchIndexFiles = NULL;
	//}
	//if(extractedTextCacheSizeInMB != NULL) {
	//
	//delete extractedTextCacheSizeInMB;
	//extractedTextCacheSizeInMB = NULL;
	//}
	//if(extractedTextCacheExpiryInSecs != NULL) {
	//
	//delete extractedTextCacheExpiryInSecs;
	//extractedTextCacheExpiryInSecs = NULL;
	//}
	//if(alwaysUsePreExtractedCache != NULL) {
	//
	//delete alwaysUsePreExtractedCache;
	//alwaysUsePreExtractedCache = NULL;
	//}
	//if(booleanClauseLimit != NULL) {
	//
	//delete booleanClauseLimit;
	//booleanClauseLimit = NULL;
	//}
	//if(enableHybridIndexing != NULL) {
	//
	//delete enableHybridIndexing;
	//enableHybridIndexing = NULL;
	//}
	//if(hybridQueueSize != NULL) {
	//
	//delete hybridQueueSize;
	//hybridQueueSize = NULL;
	//}
	//if(disableStoredIndexDefinition != NULL) {
	//
	//delete disableStoredIndexDefinition;
	//disableStoredIndexDefinition = NULL;
	//}
	//if(deletedBlobsCollectionEnabled != NULL) {
	//
	//delete deletedBlobsCollectionEnabled;
	//deletedBlobsCollectionEnabled = NULL;
	//}
	//if(propIndexCleanerIntervalInSecs != NULL) {
	//
	//delete propIndexCleanerIntervalInSecs;
	//propIndexCleanerIntervalInSecs = NULL;
	//}
	//if(enableSingleBlobIndexFiles != NULL) {
	//
	//delete enableSingleBlobIndexFiles;
	//enableSingleBlobIndexFiles = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *disabledKey = "disabled";
	node = json_object_get_member(pJsonObject, disabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&disabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&disabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *debugKey = "debug";
	node = json_object_get_member(pJsonObject, debugKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&debug, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&debug);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *localIndexDirKey = "localIndexDir";
	node = json_object_get_member(pJsonObject, localIndexDirKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&localIndexDir, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&localIndexDir);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableOpenIndexAsyncKey = "enableOpenIndexAsync";
	node = json_object_get_member(pJsonObject, enableOpenIndexAsyncKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableOpenIndexAsync, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableOpenIndexAsync);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *threadPoolSizeKey = "threadPoolSize";
	node = json_object_get_member(pJsonObject, threadPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&threadPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&threadPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *prefetchIndexFilesKey = "prefetchIndexFiles";
	node = json_object_get_member(pJsonObject, prefetchIndexFilesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&prefetchIndexFiles, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&prefetchIndexFiles);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *extractedTextCacheSizeInMBKey = "extractedTextCacheSizeInMB";
	node = json_object_get_member(pJsonObject, extractedTextCacheSizeInMBKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&extractedTextCacheSizeInMB, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&extractedTextCacheSizeInMB);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *extractedTextCacheExpiryInSecsKey = "extractedTextCacheExpiryInSecs";
	node = json_object_get_member(pJsonObject, extractedTextCacheExpiryInSecsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&extractedTextCacheExpiryInSecs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&extractedTextCacheExpiryInSecs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *alwaysUsePreExtractedCacheKey = "alwaysUsePreExtractedCache";
	node = json_object_get_member(pJsonObject, alwaysUsePreExtractedCacheKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&alwaysUsePreExtractedCache, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&alwaysUsePreExtractedCache);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *booleanClauseLimitKey = "booleanClauseLimit";
	node = json_object_get_member(pJsonObject, booleanClauseLimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&booleanClauseLimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&booleanClauseLimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableHybridIndexingKey = "enableHybridIndexing";
	node = json_object_get_member(pJsonObject, enableHybridIndexingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableHybridIndexing, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableHybridIndexing);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hybridQueueSizeKey = "hybridQueueSize";
	node = json_object_get_member(pJsonObject, hybridQueueSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&hybridQueueSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&hybridQueueSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *disableStoredIndexDefinitionKey = "disableStoredIndexDefinition";
	node = json_object_get_member(pJsonObject, disableStoredIndexDefinitionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&disableStoredIndexDefinition, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&disableStoredIndexDefinition);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deletedBlobsCollectionEnabledKey = "deletedBlobsCollectionEnabled";
	node = json_object_get_member(pJsonObject, deletedBlobsCollectionEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&deletedBlobsCollectionEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&deletedBlobsCollectionEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *propIndexCleanerIntervalInSecsKey = "propIndexCleanerIntervalInSecs";
	node = json_object_get_member(pJsonObject, propIndexCleanerIntervalInSecsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&propIndexCleanerIntervalInSecs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&propIndexCleanerIntervalInSecs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableSingleBlobIndexFilesKey = "enableSingleBlobIndexFiles";
	node = json_object_get_member(pJsonObject, enableSingleBlobIndexFilesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableSingleBlobIndexFiles, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableSingleBlobIndexFiles);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDisabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDisabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *disabledKey = "disabled";
	json_object_set_member(pJsonObject, disabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDebug();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDebug());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *debugKey = "debug";
	json_object_set_member(pJsonObject, debugKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLocalIndexDir();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLocalIndexDir());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *localIndexDirKey = "localIndexDir";
	json_object_set_member(pJsonObject, localIndexDirKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableOpenIndexAsync();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableOpenIndexAsync());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableOpenIndexAsyncKey = "enableOpenIndexAsync";
	json_object_set_member(pJsonObject, enableOpenIndexAsyncKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getThreadPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getThreadPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *threadPoolSizeKey = "threadPoolSize";
	json_object_set_member(pJsonObject, threadPoolSizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPrefetchIndexFiles();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPrefetchIndexFiles());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *prefetchIndexFilesKey = "prefetchIndexFiles";
	json_object_set_member(pJsonObject, prefetchIndexFilesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getExtractedTextCacheSizeInMB();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getExtractedTextCacheSizeInMB());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *extractedTextCacheSizeInMBKey = "extractedTextCacheSizeInMB";
	json_object_set_member(pJsonObject, extractedTextCacheSizeInMBKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getExtractedTextCacheExpiryInSecs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getExtractedTextCacheExpiryInSecs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *extractedTextCacheExpiryInSecsKey = "extractedTextCacheExpiryInSecs";
	json_object_set_member(pJsonObject, extractedTextCacheExpiryInSecsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAlwaysUsePreExtractedCache();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAlwaysUsePreExtractedCache());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *alwaysUsePreExtractedCacheKey = "alwaysUsePreExtractedCache";
	json_object_set_member(pJsonObject, alwaysUsePreExtractedCacheKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getBooleanClauseLimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getBooleanClauseLimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *booleanClauseLimitKey = "booleanClauseLimit";
	json_object_set_member(pJsonObject, booleanClauseLimitKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableHybridIndexing();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableHybridIndexing());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableHybridIndexingKey = "enableHybridIndexing";
	json_object_set_member(pJsonObject, enableHybridIndexingKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getHybridQueueSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getHybridQueueSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hybridQueueSizeKey = "hybridQueueSize";
	json_object_set_member(pJsonObject, hybridQueueSizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDisableStoredIndexDefinition();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDisableStoredIndexDefinition());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *disableStoredIndexDefinitionKey = "disableStoredIndexDefinition";
	json_object_set_member(pJsonObject, disableStoredIndexDefinitionKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDeletedBlobsCollectionEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDeletedBlobsCollectionEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deletedBlobsCollectionEnabledKey = "deletedBlobsCollectionEnabled";
	json_object_set_member(pJsonObject, deletedBlobsCollectionEnabledKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPropIndexCleanerIntervalInSecs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPropIndexCleanerIntervalInSecs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propIndexCleanerIntervalInSecsKey = "propIndexCleanerIntervalInSecs";
	json_object_set_member(pJsonObject, propIndexCleanerIntervalInSecsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableSingleBlobIndexFiles();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableSingleBlobIndexFiles());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableSingleBlobIndexFilesKey = "enableSingleBlobIndexFiles";
	json_object_set_member(pJsonObject, enableSingleBlobIndexFilesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getDisabled()
{
	return disabled;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setDisabled(ConfigNodePropertyBoolean  disabled)
{
	this->disabled = disabled;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getDebug()
{
	return debug;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setDebug(ConfigNodePropertyBoolean  debug)
{
	this->debug = debug;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getLocalIndexDir()
{
	return localIndexDir;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setLocalIndexDir(ConfigNodePropertyString  localIndexDir)
{
	this->localIndexDir = localIndexDir;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getEnableOpenIndexAsync()
{
	return enableOpenIndexAsync;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setEnableOpenIndexAsync(ConfigNodePropertyBoolean  enableOpenIndexAsync)
{
	this->enableOpenIndexAsync = enableOpenIndexAsync;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getThreadPoolSize()
{
	return threadPoolSize;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setThreadPoolSize(ConfigNodePropertyInteger  threadPoolSize)
{
	this->threadPoolSize = threadPoolSize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getPrefetchIndexFiles()
{
	return prefetchIndexFiles;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setPrefetchIndexFiles(ConfigNodePropertyBoolean  prefetchIndexFiles)
{
	this->prefetchIndexFiles = prefetchIndexFiles;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getExtractedTextCacheSizeInMB()
{
	return extractedTextCacheSizeInMB;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setExtractedTextCacheSizeInMB(ConfigNodePropertyInteger  extractedTextCacheSizeInMB)
{
	this->extractedTextCacheSizeInMB = extractedTextCacheSizeInMB;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getExtractedTextCacheExpiryInSecs()
{
	return extractedTextCacheExpiryInSecs;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setExtractedTextCacheExpiryInSecs(ConfigNodePropertyInteger  extractedTextCacheExpiryInSecs)
{
	this->extractedTextCacheExpiryInSecs = extractedTextCacheExpiryInSecs;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getAlwaysUsePreExtractedCache()
{
	return alwaysUsePreExtractedCache;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setAlwaysUsePreExtractedCache(ConfigNodePropertyBoolean  alwaysUsePreExtractedCache)
{
	this->alwaysUsePreExtractedCache = alwaysUsePreExtractedCache;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getBooleanClauseLimit()
{
	return booleanClauseLimit;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setBooleanClauseLimit(ConfigNodePropertyInteger  booleanClauseLimit)
{
	this->booleanClauseLimit = booleanClauseLimit;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getEnableHybridIndexing()
{
	return enableHybridIndexing;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setEnableHybridIndexing(ConfigNodePropertyBoolean  enableHybridIndexing)
{
	this->enableHybridIndexing = enableHybridIndexing;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getHybridQueueSize()
{
	return hybridQueueSize;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setHybridQueueSize(ConfigNodePropertyInteger  hybridQueueSize)
{
	this->hybridQueueSize = hybridQueueSize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getDisableStoredIndexDefinition()
{
	return disableStoredIndexDefinition;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setDisableStoredIndexDefinition(ConfigNodePropertyBoolean  disableStoredIndexDefinition)
{
	this->disableStoredIndexDefinition = disableStoredIndexDefinition;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getDeletedBlobsCollectionEnabled()
{
	return deletedBlobsCollectionEnabled;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setDeletedBlobsCollectionEnabled(ConfigNodePropertyBoolean  deletedBlobsCollectionEnabled)
{
	this->deletedBlobsCollectionEnabled = deletedBlobsCollectionEnabled;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getPropIndexCleanerIntervalInSecs()
{
	return propIndexCleanerIntervalInSecs;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setPropIndexCleanerIntervalInSecs(ConfigNodePropertyInteger  propIndexCleanerIntervalInSecs)
{
	this->propIndexCleanerIntervalInSecs = propIndexCleanerIntervalInSecs;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::getEnableSingleBlobIndexFiles()
{
	return enableSingleBlobIndexFiles;
}

void
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties::setEnableSingleBlobIndexFiles(ConfigNodePropertyBoolean  enableSingleBlobIndexFiles)
{
	this->enableSingleBlobIndexFiles = enableSingleBlobIndexFiles;
}


