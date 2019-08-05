#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::~OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::__init()
{
	//repositoryhome = new ConfigNodePropertyString();
	//tarmkmode = new ConfigNodePropertyString();
	//tarmksize = new ConfigNodePropertyInteger();
	//segmentCachesize = new ConfigNodePropertyInteger();
	//stringCachesize = new ConfigNodePropertyInteger();
	//templateCachesize = new ConfigNodePropertyInteger();
	//stringDeduplicationCachesize = new ConfigNodePropertyInteger();
	//templateDeduplicationCachesize = new ConfigNodePropertyInteger();
	//nodeDeduplicationCachesize = new ConfigNodePropertyInteger();
	//pauseCompaction = new ConfigNodePropertyBoolean();
	//compactionretryCount = new ConfigNodePropertyInteger();
	//compactionforcetimeout = new ConfigNodePropertyInteger();
	//compactionsizeDeltaEstimation = new ConfigNodePropertyInteger();
	//compactiondisableEstimation = new ConfigNodePropertyBoolean();
	//compactionretainedGenerations = new ConfigNodePropertyInteger();
	//compactionmemoryThreshold = new ConfigNodePropertyInteger();
	//compactionprogressLog = new ConfigNodePropertyInteger();
	//standby = new ConfigNodePropertyBoolean();
	//customBlobStore = new ConfigNodePropertyBoolean();
	//customSegmentStore = new ConfigNodePropertyBoolean();
	//splitPersistence = new ConfigNodePropertyBoolean();
	//repositorybackupdir = new ConfigNodePropertyString();
	//blobGcMaxAgeInSecs = new ConfigNodePropertyInteger();
	//blobTrackSnapshotIntervalInSecs = new ConfigNodePropertyInteger();
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::__cleanup()
{
	//if(repositoryhome != NULL) {
	//
	//delete repositoryhome;
	//repositoryhome = NULL;
	//}
	//if(tarmkmode != NULL) {
	//
	//delete tarmkmode;
	//tarmkmode = NULL;
	//}
	//if(tarmksize != NULL) {
	//
	//delete tarmksize;
	//tarmksize = NULL;
	//}
	//if(segmentCachesize != NULL) {
	//
	//delete segmentCachesize;
	//segmentCachesize = NULL;
	//}
	//if(stringCachesize != NULL) {
	//
	//delete stringCachesize;
	//stringCachesize = NULL;
	//}
	//if(templateCachesize != NULL) {
	//
	//delete templateCachesize;
	//templateCachesize = NULL;
	//}
	//if(stringDeduplicationCachesize != NULL) {
	//
	//delete stringDeduplicationCachesize;
	//stringDeduplicationCachesize = NULL;
	//}
	//if(templateDeduplicationCachesize != NULL) {
	//
	//delete templateDeduplicationCachesize;
	//templateDeduplicationCachesize = NULL;
	//}
	//if(nodeDeduplicationCachesize != NULL) {
	//
	//delete nodeDeduplicationCachesize;
	//nodeDeduplicationCachesize = NULL;
	//}
	//if(pauseCompaction != NULL) {
	//
	//delete pauseCompaction;
	//pauseCompaction = NULL;
	//}
	//if(compactionretryCount != NULL) {
	//
	//delete compactionretryCount;
	//compactionretryCount = NULL;
	//}
	//if(compactionforcetimeout != NULL) {
	//
	//delete compactionforcetimeout;
	//compactionforcetimeout = NULL;
	//}
	//if(compactionsizeDeltaEstimation != NULL) {
	//
	//delete compactionsizeDeltaEstimation;
	//compactionsizeDeltaEstimation = NULL;
	//}
	//if(compactiondisableEstimation != NULL) {
	//
	//delete compactiondisableEstimation;
	//compactiondisableEstimation = NULL;
	//}
	//if(compactionretainedGenerations != NULL) {
	//
	//delete compactionretainedGenerations;
	//compactionretainedGenerations = NULL;
	//}
	//if(compactionmemoryThreshold != NULL) {
	//
	//delete compactionmemoryThreshold;
	//compactionmemoryThreshold = NULL;
	//}
	//if(compactionprogressLog != NULL) {
	//
	//delete compactionprogressLog;
	//compactionprogressLog = NULL;
	//}
	//if(standby != NULL) {
	//
	//delete standby;
	//standby = NULL;
	//}
	//if(customBlobStore != NULL) {
	//
	//delete customBlobStore;
	//customBlobStore = NULL;
	//}
	//if(customSegmentStore != NULL) {
	//
	//delete customSegmentStore;
	//customSegmentStore = NULL;
	//}
	//if(splitPersistence != NULL) {
	//
	//delete splitPersistence;
	//splitPersistence = NULL;
	//}
	//if(repositorybackupdir != NULL) {
	//
	//delete repositorybackupdir;
	//repositorybackupdir = NULL;
	//}
	//if(blobGcMaxAgeInSecs != NULL) {
	//
	//delete blobGcMaxAgeInSecs;
	//blobGcMaxAgeInSecs = NULL;
	//}
	//if(blobTrackSnapshotIntervalInSecs != NULL) {
	//
	//delete blobTrackSnapshotIntervalInSecs;
	//blobTrackSnapshotIntervalInSecs = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *repositoryhomeKey = "repository.home";
	node = json_object_get_member(pJsonObject, repositoryhomeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&repositoryhome, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&repositoryhome);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tarmkmodeKey = "tarmk.mode";
	node = json_object_get_member(pJsonObject, tarmkmodeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&tarmkmode, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&tarmkmode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tarmksizeKey = "tarmk.size";
	node = json_object_get_member(pJsonObject, tarmksizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&tarmksize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&tarmksize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *segmentCachesizeKey = "segmentCache.size";
	node = json_object_get_member(pJsonObject, segmentCachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&segmentCachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&segmentCachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stringCachesizeKey = "stringCache.size";
	node = json_object_get_member(pJsonObject, stringCachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&stringCachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&stringCachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *templateCachesizeKey = "templateCache.size";
	node = json_object_get_member(pJsonObject, templateCachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&templateCachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&templateCachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stringDeduplicationCachesizeKey = "stringDeduplicationCache.size";
	node = json_object_get_member(pJsonObject, stringDeduplicationCachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&stringDeduplicationCachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&stringDeduplicationCachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *templateDeduplicationCachesizeKey = "templateDeduplicationCache.size";
	node = json_object_get_member(pJsonObject, templateDeduplicationCachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&templateDeduplicationCachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&templateDeduplicationCachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nodeDeduplicationCachesizeKey = "nodeDeduplicationCache.size";
	node = json_object_get_member(pJsonObject, nodeDeduplicationCachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&nodeDeduplicationCachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&nodeDeduplicationCachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pauseCompactionKey = "pauseCompaction";
	node = json_object_get_member(pJsonObject, pauseCompactionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&pauseCompaction, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&pauseCompaction);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compactionretryCountKey = "compaction.retryCount";
	node = json_object_get_member(pJsonObject, compactionretryCountKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&compactionretryCount, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&compactionretryCount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compactionforcetimeoutKey = "compaction.force.timeout";
	node = json_object_get_member(pJsonObject, compactionforcetimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&compactionforcetimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&compactionforcetimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compactionsizeDeltaEstimationKey = "compaction.sizeDeltaEstimation";
	node = json_object_get_member(pJsonObject, compactionsizeDeltaEstimationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&compactionsizeDeltaEstimation, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&compactionsizeDeltaEstimation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compactiondisableEstimationKey = "compaction.disableEstimation";
	node = json_object_get_member(pJsonObject, compactiondisableEstimationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&compactiondisableEstimation, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&compactiondisableEstimation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compactionretainedGenerationsKey = "compaction.retainedGenerations";
	node = json_object_get_member(pJsonObject, compactionretainedGenerationsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&compactionretainedGenerations, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&compactionretainedGenerations);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compactionmemoryThresholdKey = "compaction.memoryThreshold";
	node = json_object_get_member(pJsonObject, compactionmemoryThresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&compactionmemoryThreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&compactionmemoryThreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compactionprogressLogKey = "compaction.progressLog";
	node = json_object_get_member(pJsonObject, compactionprogressLogKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&compactionprogressLog, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&compactionprogressLog);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *standbyKey = "standby";
	node = json_object_get_member(pJsonObject, standbyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&standby, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&standby);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *customBlobStoreKey = "customBlobStore";
	node = json_object_get_member(pJsonObject, customBlobStoreKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&customBlobStore, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&customBlobStore);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *customSegmentStoreKey = "customSegmentStore";
	node = json_object_get_member(pJsonObject, customSegmentStoreKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&customSegmentStore, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&customSegmentStore);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *splitPersistenceKey = "splitPersistence";
	node = json_object_get_member(pJsonObject, splitPersistenceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&splitPersistence, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&splitPersistence);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repositorybackupdirKey = "repository.backup.dir";
	node = json_object_get_member(pJsonObject, repositorybackupdirKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&repositorybackupdir, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&repositorybackupdir);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *blobGcMaxAgeInSecsKey = "blobGcMaxAgeInSecs";
	node = json_object_get_member(pJsonObject, blobGcMaxAgeInSecsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&blobGcMaxAgeInSecs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&blobGcMaxAgeInSecs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *blobTrackSnapshotIntervalInSecsKey = "blobTrackSnapshotIntervalInSecs";
	node = json_object_get_member(pJsonObject, blobTrackSnapshotIntervalInSecsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&blobTrackSnapshotIntervalInSecs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&blobTrackSnapshotIntervalInSecs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRepositoryhome();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRepositoryhome());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repositoryhomeKey = "repository.home";
	json_object_set_member(pJsonObject, repositoryhomeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTarmkmode();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTarmkmode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tarmkmodeKey = "tarmk.mode";
	json_object_set_member(pJsonObject, tarmkmodeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTarmksize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTarmksize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tarmksizeKey = "tarmk.size";
	json_object_set_member(pJsonObject, tarmksizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSegmentCachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSegmentCachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *segmentCachesizeKey = "segmentCache.size";
	json_object_set_member(pJsonObject, segmentCachesizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getStringCachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getStringCachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stringCachesizeKey = "stringCache.size";
	json_object_set_member(pJsonObject, stringCachesizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTemplateCachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTemplateCachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *templateCachesizeKey = "templateCache.size";
	json_object_set_member(pJsonObject, templateCachesizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getStringDeduplicationCachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getStringDeduplicationCachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stringDeduplicationCachesizeKey = "stringDeduplicationCache.size";
	json_object_set_member(pJsonObject, stringDeduplicationCachesizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTemplateDeduplicationCachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTemplateDeduplicationCachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *templateDeduplicationCachesizeKey = "templateDeduplicationCache.size";
	json_object_set_member(pJsonObject, templateDeduplicationCachesizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getNodeDeduplicationCachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getNodeDeduplicationCachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nodeDeduplicationCachesizeKey = "nodeDeduplicationCache.size";
	json_object_set_member(pJsonObject, nodeDeduplicationCachesizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPauseCompaction();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPauseCompaction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pauseCompactionKey = "pauseCompaction";
	json_object_set_member(pJsonObject, pauseCompactionKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCompactionretryCount();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCompactionretryCount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compactionretryCountKey = "compaction.retryCount";
	json_object_set_member(pJsonObject, compactionretryCountKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCompactionforcetimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCompactionforcetimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compactionforcetimeoutKey = "compaction.force.timeout";
	json_object_set_member(pJsonObject, compactionforcetimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCompactionsizeDeltaEstimation();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCompactionsizeDeltaEstimation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compactionsizeDeltaEstimationKey = "compaction.sizeDeltaEstimation";
	json_object_set_member(pJsonObject, compactionsizeDeltaEstimationKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCompactiondisableEstimation();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCompactiondisableEstimation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compactiondisableEstimationKey = "compaction.disableEstimation";
	json_object_set_member(pJsonObject, compactiondisableEstimationKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCompactionretainedGenerations();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCompactionretainedGenerations());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compactionretainedGenerationsKey = "compaction.retainedGenerations";
	json_object_set_member(pJsonObject, compactionretainedGenerationsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCompactionmemoryThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCompactionmemoryThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compactionmemoryThresholdKey = "compaction.memoryThreshold";
	json_object_set_member(pJsonObject, compactionmemoryThresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCompactionprogressLog();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCompactionprogressLog());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compactionprogressLogKey = "compaction.progressLog";
	json_object_set_member(pJsonObject, compactionprogressLogKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getStandby();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getStandby());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *standbyKey = "standby";
	json_object_set_member(pJsonObject, standbyKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCustomBlobStore();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCustomBlobStore());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *customBlobStoreKey = "customBlobStore";
	json_object_set_member(pJsonObject, customBlobStoreKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCustomSegmentStore();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCustomSegmentStore());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *customSegmentStoreKey = "customSegmentStore";
	json_object_set_member(pJsonObject, customSegmentStoreKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSplitPersistence();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSplitPersistence());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *splitPersistenceKey = "splitPersistence";
	json_object_set_member(pJsonObject, splitPersistenceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRepositorybackupdir();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRepositorybackupdir());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repositorybackupdirKey = "repository.backup.dir";
	json_object_set_member(pJsonObject, repositorybackupdirKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getBlobGcMaxAgeInSecs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getBlobGcMaxAgeInSecs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *blobGcMaxAgeInSecsKey = "blobGcMaxAgeInSecs";
	json_object_set_member(pJsonObject, blobGcMaxAgeInSecsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getBlobTrackSnapshotIntervalInSecs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getBlobTrackSnapshotIntervalInSecs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *blobTrackSnapshotIntervalInSecsKey = "blobTrackSnapshotIntervalInSecs";
	json_object_set_member(pJsonObject, blobTrackSnapshotIntervalInSecsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getRepositoryhome()
{
	return repositoryhome;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setRepositoryhome(ConfigNodePropertyString  repositoryhome)
{
	this->repositoryhome = repositoryhome;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTarmkmode()
{
	return tarmkmode;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTarmkmode(ConfigNodePropertyString  tarmkmode)
{
	this->tarmkmode = tarmkmode;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTarmksize()
{
	return tarmksize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTarmksize(ConfigNodePropertyInteger  tarmksize)
{
	this->tarmksize = tarmksize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getSegmentCachesize()
{
	return segmentCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setSegmentCachesize(ConfigNodePropertyInteger  segmentCachesize)
{
	this->segmentCachesize = segmentCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getStringCachesize()
{
	return stringCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setStringCachesize(ConfigNodePropertyInteger  stringCachesize)
{
	this->stringCachesize = stringCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTemplateCachesize()
{
	return templateCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTemplateCachesize(ConfigNodePropertyInteger  templateCachesize)
{
	this->templateCachesize = templateCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getStringDeduplicationCachesize()
{
	return stringDeduplicationCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setStringDeduplicationCachesize(ConfigNodePropertyInteger  stringDeduplicationCachesize)
{
	this->stringDeduplicationCachesize = stringDeduplicationCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTemplateDeduplicationCachesize()
{
	return templateDeduplicationCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTemplateDeduplicationCachesize(ConfigNodePropertyInteger  templateDeduplicationCachesize)
{
	this->templateDeduplicationCachesize = templateDeduplicationCachesize;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getNodeDeduplicationCachesize()
{
	return nodeDeduplicationCachesize;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setNodeDeduplicationCachesize(ConfigNodePropertyInteger  nodeDeduplicationCachesize)
{
	this->nodeDeduplicationCachesize = nodeDeduplicationCachesize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getPauseCompaction()
{
	return pauseCompaction;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setPauseCompaction(ConfigNodePropertyBoolean  pauseCompaction)
{
	this->pauseCompaction = pauseCompaction;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionretryCount()
{
	return compactionretryCount;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionretryCount(ConfigNodePropertyInteger  compactionretryCount)
{
	this->compactionretryCount = compactionretryCount;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionforcetimeout()
{
	return compactionforcetimeout;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionforcetimeout(ConfigNodePropertyInteger  compactionforcetimeout)
{
	this->compactionforcetimeout = compactionforcetimeout;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionsizeDeltaEstimation()
{
	return compactionsizeDeltaEstimation;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionsizeDeltaEstimation(ConfigNodePropertyInteger  compactionsizeDeltaEstimation)
{
	this->compactionsizeDeltaEstimation = compactionsizeDeltaEstimation;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactiondisableEstimation()
{
	return compactiondisableEstimation;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactiondisableEstimation(ConfigNodePropertyBoolean  compactiondisableEstimation)
{
	this->compactiondisableEstimation = compactiondisableEstimation;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionretainedGenerations()
{
	return compactionretainedGenerations;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionretainedGenerations(ConfigNodePropertyInteger  compactionretainedGenerations)
{
	this->compactionretainedGenerations = compactionretainedGenerations;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionmemoryThreshold()
{
	return compactionmemoryThreshold;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionmemoryThreshold(ConfigNodePropertyInteger  compactionmemoryThreshold)
{
	this->compactionmemoryThreshold = compactionmemoryThreshold;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionprogressLog()
{
	return compactionprogressLog;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionprogressLog(ConfigNodePropertyInteger  compactionprogressLog)
{
	this->compactionprogressLog = compactionprogressLog;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getStandby()
{
	return standby;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setStandby(ConfigNodePropertyBoolean  standby)
{
	this->standby = standby;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCustomBlobStore()
{
	return customBlobStore;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCustomBlobStore(ConfigNodePropertyBoolean  customBlobStore)
{
	this->customBlobStore = customBlobStore;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCustomSegmentStore()
{
	return customSegmentStore;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCustomSegmentStore(ConfigNodePropertyBoolean  customSegmentStore)
{
	this->customSegmentStore = customSegmentStore;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getSplitPersistence()
{
	return splitPersistence;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setSplitPersistence(ConfigNodePropertyBoolean  splitPersistence)
{
	this->splitPersistence = splitPersistence;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getRepositorybackupdir()
{
	return repositorybackupdir;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setRepositorybackupdir(ConfigNodePropertyString  repositorybackupdir)
{
	this->repositorybackupdir = repositorybackupdir;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getBlobGcMaxAgeInSecs()
{
	return blobGcMaxAgeInSecs;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger  blobGcMaxAgeInSecs)
{
	this->blobGcMaxAgeInSecs = blobGcMaxAgeInSecs;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getBlobTrackSnapshotIntervalInSecs()
{
	return blobTrackSnapshotIntervalInSecs;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger  blobTrackSnapshotIntervalInSecs)
{
	this->blobTrackSnapshotIntervalInSecs = blobTrackSnapshotIntervalInSecs;
}


