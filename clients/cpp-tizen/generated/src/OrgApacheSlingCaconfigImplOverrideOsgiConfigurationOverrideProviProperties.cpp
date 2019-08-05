#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties()
{
	//__init();
}

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::~OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::__init()
{
	//description = new ConfigNodePropertyString();
	//overrides = new ConfigNodePropertyArray();
	//enabled = new ConfigNodePropertyBoolean();
	//serviceranking = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(overrides != NULL) {
	//
	//delete overrides;
	//overrides = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&description, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&description);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *overridesKey = "overrides";
	node = json_object_get_member(pJsonObject, overridesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&overrides, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&overrides);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDescription();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDescription());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOverrides();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOverrides());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *overridesKey = "overrides";
	json_object_set_member(pJsonObject, overridesKey, node);
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

ConfigNodePropertyString
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::getDescription()
{
	return description;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::setDescription(ConfigNodePropertyString  description)
{
	this->description = description;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::getOverrides()
{
	return overrides;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::setOverrides(ConfigNodePropertyArray  overrides)
{
	this->overrides = overrides;
}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyInteger
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}


