#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::ComAdobeGraniteWorkflowCorePayloadMapCacheProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::~ComAdobeGraniteWorkflowCorePayloadMapCacheProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::__init()
{
	//getSystemWorkflowModels = new ConfigNodePropertyArray();
	//getPackageRootPath = new ConfigNodePropertyString();
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::__cleanup()
{
	//if(getSystemWorkflowModels != NULL) {
	//
	//delete getSystemWorkflowModels;
	//getSystemWorkflowModels = NULL;
	//}
	//if(getPackageRootPath != NULL) {
	//
	//delete getPackageRootPath;
	//getPackageRootPath = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *getSystemWorkflowModelsKey = "getSystemWorkflowModels";
	node = json_object_get_member(pJsonObject, getSystemWorkflowModelsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&getSystemWorkflowModels, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&getSystemWorkflowModels);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *getPackageRootPathKey = "getPackageRootPath";
	node = json_object_get_member(pJsonObject, getPackageRootPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&getPackageRootPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&getPackageRootPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::ComAdobeGraniteWorkflowCorePayloadMapCacheProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGetSystemWorkflowModels();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGetSystemWorkflowModels());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *getSystemWorkflowModelsKey = "getSystemWorkflowModels";
	json_object_set_member(pJsonObject, getSystemWorkflowModelsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGetPackageRootPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGetPackageRootPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *getPackageRootPathKey = "getPackageRootPath";
	json_object_set_member(pJsonObject, getPackageRootPathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::getGetSystemWorkflowModels()
{
	return getSystemWorkflowModels;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::setGetSystemWorkflowModels(ConfigNodePropertyArray  getSystemWorkflowModels)
{
	this->getSystemWorkflowModels = getSystemWorkflowModels;
}

ConfigNodePropertyString
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::getGetPackageRootPath()
{
	return getPackageRootPath;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheProperties::setGetPackageRootPath(ConfigNodePropertyString  getPackageRootPath)
{
	this->getPackageRootPath = getPackageRootPath;
}


