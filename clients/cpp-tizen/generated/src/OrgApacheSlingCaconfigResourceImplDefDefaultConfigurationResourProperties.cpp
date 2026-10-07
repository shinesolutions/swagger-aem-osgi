#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties()
{
	//__init();
}

OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::~OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
	//configPath = new ConfigNodePropertyString();
	//fallbackPaths = new ConfigNodePropertyArray();
	//configCollectionInheritancePropertyNames = new ConfigNodePropertyArray();
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(configPath != NULL) {
	//
	//delete configPath;
	//configPath = NULL;
	//}
	//if(fallbackPaths != NULL) {
	//
	//delete fallbackPaths;
	//fallbackPaths = NULL;
	//}
	//if(configCollectionInheritancePropertyNames != NULL) {
	//
	//delete configCollectionInheritancePropertyNames;
	//configCollectionInheritancePropertyNames = NULL;
	//}
	//
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::fromJson(char* jsonStr)
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
	const gchar *configPathKey = "configPath";
	node = json_object_get_member(pJsonObject, configPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&configPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&configPath);
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
	const gchar *configCollectionInheritancePropertyNamesKey = "configCollectionInheritancePropertyNames";
	node = json_object_get_member(pJsonObject, configCollectionInheritancePropertyNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&configCollectionInheritancePropertyNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&configCollectionInheritancePropertyNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getConfigPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getConfigPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configPathKey = "configPath";
	json_object_set_member(pJsonObject, configPathKey, node);
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getConfigCollectionInheritancePropertyNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getConfigCollectionInheritancePropertyNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configCollectionInheritancePropertyNamesKey = "configCollectionInheritancePropertyNames";
	json_object_set_member(pJsonObject, configCollectionInheritancePropertyNamesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getConfigPath()
{
	return configPath;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setConfigPath(ConfigNodePropertyString  configPath)
{
	this->configPath = configPath;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getFallbackPaths()
{
	return fallbackPaths;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setFallbackPaths(ConfigNodePropertyArray  fallbackPaths)
{
	this->fallbackPaths = fallbackPaths;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getConfigCollectionInheritancePropertyNames()
{
	return configCollectionInheritancePropertyNames;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setConfigCollectionInheritancePropertyNames(ConfigNodePropertyArray  configCollectionInheritancePropertyNames)
{
	this->configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
}


