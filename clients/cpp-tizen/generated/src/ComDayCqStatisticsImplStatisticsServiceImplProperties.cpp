#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqStatisticsImplStatisticsServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqStatisticsImplStatisticsServiceImplProperties::ComDayCqStatisticsImplStatisticsServiceImplProperties()
{
	//__init();
}

ComDayCqStatisticsImplStatisticsServiceImplProperties::~ComDayCqStatisticsImplStatisticsServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::__init()
{
	//schedulerperiod = new ConfigNodePropertyInteger();
	//schedulerconcurrent = new ConfigNodePropertyBoolean();
	//path = new ConfigNodePropertyString();
	//workspace = new ConfigNodePropertyString();
	//keywordsPath = new ConfigNodePropertyString();
	//asyncEntries = new ConfigNodePropertyBoolean();
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::__cleanup()
{
	//if(schedulerperiod != NULL) {
	//
	//delete schedulerperiod;
	//schedulerperiod = NULL;
	//}
	//if(schedulerconcurrent != NULL) {
	//
	//delete schedulerconcurrent;
	//schedulerconcurrent = NULL;
	//}
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(workspace != NULL) {
	//
	//delete workspace;
	//workspace = NULL;
	//}
	//if(keywordsPath != NULL) {
	//
	//delete keywordsPath;
	//keywordsPath = NULL;
	//}
	//if(asyncEntries != NULL) {
	//
	//delete asyncEntries;
	//asyncEntries = NULL;
	//}
	//
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerperiodKey = "scheduler.period";
	node = json_object_get_member(pJsonObject, schedulerperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&schedulerperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&schedulerperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *schedulerconcurrentKey = "scheduler.concurrent";
	node = json_object_get_member(pJsonObject, schedulerconcurrentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&schedulerconcurrent, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&schedulerconcurrent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&path, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *workspaceKey = "workspace";
	node = json_object_get_member(pJsonObject, workspaceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&workspace, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&workspace);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *keywordsPathKey = "keywordsPath";
	node = json_object_get_member(pJsonObject, keywordsPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&keywordsPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&keywordsPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *asyncEntriesKey = "asyncEntries";
	node = json_object_get_member(pJsonObject, asyncEntriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&asyncEntries, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&asyncEntries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqStatisticsImplStatisticsServiceImplProperties::ComDayCqStatisticsImplStatisticsServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqStatisticsImplStatisticsServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSchedulerperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSchedulerperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerperiodKey = "scheduler.period";
	json_object_set_member(pJsonObject, schedulerperiodKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSchedulerconcurrent();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSchedulerconcurrent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerconcurrentKey = "scheduler.concurrent";
	json_object_set_member(pJsonObject, schedulerconcurrentKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getWorkspace();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getWorkspace());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *workspaceKey = "workspace";
	json_object_set_member(pJsonObject, workspaceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getKeywordsPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getKeywordsPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *keywordsPathKey = "keywordsPath";
	json_object_set_member(pJsonObject, keywordsPathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAsyncEntries();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAsyncEntries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *asyncEntriesKey = "asyncEntries";
	json_object_set_member(pJsonObject, asyncEntriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqStatisticsImplStatisticsServiceImplProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setSchedulerperiod(ConfigNodePropertyInteger  schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}

ConfigNodePropertyBoolean
ComDayCqStatisticsImplStatisticsServiceImplProperties::getSchedulerconcurrent()
{
	return schedulerconcurrent;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setSchedulerconcurrent(ConfigNodePropertyBoolean  schedulerconcurrent)
{
	this->schedulerconcurrent = schedulerconcurrent;
}

ConfigNodePropertyString
ComDayCqStatisticsImplStatisticsServiceImplProperties::getPath()
{
	return path;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyString
ComDayCqStatisticsImplStatisticsServiceImplProperties::getWorkspace()
{
	return workspace;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setWorkspace(ConfigNodePropertyString  workspace)
{
	this->workspace = workspace;
}

ConfigNodePropertyString
ComDayCqStatisticsImplStatisticsServiceImplProperties::getKeywordsPath()
{
	return keywordsPath;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setKeywordsPath(ConfigNodePropertyString  keywordsPath)
{
	this->keywordsPath = keywordsPath;
}

ConfigNodePropertyBoolean
ComDayCqStatisticsImplStatisticsServiceImplProperties::getAsyncEntries()
{
	return asyncEntries;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setAsyncEntries(ConfigNodePropertyBoolean  asyncEntries)
{
	this->asyncEntries = asyncEntries;
}


