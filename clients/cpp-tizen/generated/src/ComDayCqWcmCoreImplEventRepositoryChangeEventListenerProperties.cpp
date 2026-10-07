#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties()
{
	//__init();
}

ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::~ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::__init()
{
	//paths = new ConfigNodePropertyArray();
	//excludedPaths = new ConfigNodePropertyArray();
}

void
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::__cleanup()
{
	//if(paths != NULL) {
	//
	//delete paths;
	//paths = NULL;
	//}
	//if(excludedPaths != NULL) {
	//
	//delete excludedPaths;
	//excludedPaths = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathsKey = "paths";
	node = json_object_get_member(pJsonObject, pathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&paths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&paths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *excludedPathsKey = "excludedPaths";
	node = json_object_get_member(pJsonObject, excludedPathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&excludedPaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&excludedPaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathsKey = "paths";
	json_object_set_member(pJsonObject, pathsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExcludedPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExcludedPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *excludedPathsKey = "excludedPaths";
	json_object_set_member(pJsonObject, excludedPathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::getPaths()
{
	return paths;
}

void
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::setPaths(ConfigNodePropertyArray  paths)
{
	this->paths = paths;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::getExcludedPaths()
{
	return excludedPaths;
}

void
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::setExcludedPaths(ConfigNodePropertyArray  excludedPaths)
{
	this->excludedPaths = excludedPaths;
}


