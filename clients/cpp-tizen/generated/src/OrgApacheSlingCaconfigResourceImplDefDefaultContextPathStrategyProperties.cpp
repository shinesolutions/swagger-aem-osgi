#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties()
{
	//__init();
}

OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::~OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
	//configRefResourceNames = new ConfigNodePropertyArray();
	//configRefPropertyNames = new ConfigNodePropertyArray();
	//serviceranking = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(configRefResourceNames != NULL) {
	//
	//delete configRefResourceNames;
	//configRefResourceNames = NULL;
	//}
	//if(configRefPropertyNames != NULL) {
	//
	//delete configRefPropertyNames;
	//configRefPropertyNames = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::fromJson(char* jsonStr)
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
	const gchar *configRefResourceNamesKey = "configRefResourceNames";
	node = json_object_get_member(pJsonObject, configRefResourceNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&configRefResourceNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&configRefResourceNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *configRefPropertyNamesKey = "configRefPropertyNames";
	node = json_object_get_member(pJsonObject, configRefPropertyNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&configRefPropertyNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&configRefPropertyNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::toJson()
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
		ConfigNodePropertyArray obj = getConfigRefResourceNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getConfigRefResourceNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configRefResourceNamesKey = "configRefResourceNames";
	json_object_set_member(pJsonObject, configRefResourceNamesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getConfigRefPropertyNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getConfigRefPropertyNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configRefPropertyNamesKey = "configRefPropertyNames";
	json_object_set_member(pJsonObject, configRefPropertyNamesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::getConfigRefResourceNames()
{
	return configRefResourceNames;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::setConfigRefResourceNames(ConfigNodePropertyArray  configRefResourceNames)
{
	this->configRefResourceNames = configRefResourceNames;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::getConfigRefPropertyNames()
{
	return configRefPropertyNames;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::setConfigRefPropertyNames(ConfigNodePropertyArray  configRefPropertyNames)
{
	this->configRefPropertyNames = configRefPropertyNames;
}

ConfigNodePropertyInteger
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}


