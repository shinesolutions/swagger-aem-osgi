#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties()
{
	//__init();
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::~OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
	//configPropertyInheritancePropertyNames = new ConfigNodePropertyArray();
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(configPropertyInheritancePropertyNames != NULL) {
	//
	//delete configPropertyInheritancePropertyNames;
	//configPropertyInheritancePropertyNames = NULL;
	//}
	//
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::fromJson(char* jsonStr)
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
	const gchar *configPropertyInheritancePropertyNamesKey = "configPropertyInheritancePropertyNames";
	node = json_object_get_member(pJsonObject, configPropertyInheritancePropertyNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&configPropertyInheritancePropertyNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&configPropertyInheritancePropertyNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::toJson()
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
		ConfigNodePropertyArray obj = getConfigPropertyInheritancePropertyNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getConfigPropertyInheritancePropertyNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configPropertyInheritancePropertyNamesKey = "configPropertyInheritancePropertyNames";
	json_object_set_member(pJsonObject, configPropertyInheritancePropertyNamesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::getConfigPropertyInheritancePropertyNames()
{
	return configPropertyInheritancePropertyNames;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::setConfigPropertyInheritancePropertyNames(ConfigNodePropertyArray  configPropertyInheritancePropertyNames)
{
	this->configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
}


