#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties()
{
	//__init();
}

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::~ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
	//fallbackPaths = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(fallbackPaths != NULL) {
	//
	//delete fallbackPaths;
	//fallbackPaths = NULL;
	//}
	//
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fallbackPathsKey = "fallbackPaths";
	node = json_object_get_member(pJsonObject, fallbackPathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&fallbackPaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&fallbackPaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFallbackPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFallbackPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fallbackPathsKey = "fallbackPaths";
	json_object_set_member(pJsonObject, fallbackPathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::getFallbackPaths()
{
	return fallbackPaths;
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::setFallbackPaths(ConfigNodePropertyArray  fallbackPaths)
{
	this->fallbackPaths = fallbackPaths;
}


