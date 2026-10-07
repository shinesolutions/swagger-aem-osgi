#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties()
{
	//__init();
}

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::~ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::__init()
{
	//nuiEnabled = new ConfigNodePropertyBoolean();
	//nuiServiceUrl = new ConfigNodePropertyString();
	//nuiApiKey = new ConfigNodePropertyString();
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::__cleanup()
{
	//if(nuiEnabled != NULL) {
	//
	//delete nuiEnabled;
	//nuiEnabled = NULL;
	//}
	//if(nuiServiceUrl != NULL) {
	//
	//delete nuiServiceUrl;
	//nuiServiceUrl = NULL;
	//}
	//if(nuiApiKey != NULL) {
	//
	//delete nuiApiKey;
	//nuiApiKey = NULL;
	//}
	//
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nuiEnabledKey = "nuiEnabled";
	node = json_object_get_member(pJsonObject, nuiEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&nuiEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&nuiEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nuiServiceUrlKey = "nuiServiceUrl";
	node = json_object_get_member(pJsonObject, nuiServiceUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&nuiServiceUrl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&nuiServiceUrl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nuiApiKeyKey = "nuiApiKey";
	node = json_object_get_member(pJsonObject, nuiApiKeyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&nuiApiKey, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&nuiApiKey);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getNuiEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getNuiEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nuiEnabledKey = "nuiEnabled";
	json_object_set_member(pJsonObject, nuiEnabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getNuiServiceUrl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getNuiServiceUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nuiServiceUrlKey = "nuiServiceUrl";
	json_object_set_member(pJsonObject, nuiServiceUrlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getNuiApiKey();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getNuiApiKey());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nuiApiKeyKey = "nuiApiKey";
	json_object_set_member(pJsonObject, nuiApiKeyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::getNuiEnabled()
{
	return nuiEnabled;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::setNuiEnabled(ConfigNodePropertyBoolean  nuiEnabled)
{
	this->nuiEnabled = nuiEnabled;
}

ConfigNodePropertyString
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::getNuiServiceUrl()
{
	return nuiServiceUrl;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::setNuiServiceUrl(ConfigNodePropertyString  nuiServiceUrl)
{
	this->nuiServiceUrl = nuiServiceUrl;
}

ConfigNodePropertyString
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::getNuiApiKey()
{
	return nuiApiKey;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties::setNuiApiKey(ConfigNodePropertyString  nuiApiKey)
{
	this->nuiApiKey = nuiApiKey;
}


