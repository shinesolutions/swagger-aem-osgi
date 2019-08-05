#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixJaasConfigurationSpiProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixJaasConfigurationSpiProperties::OrgApacheFelixJaasConfigurationSpiProperties()
{
	//__init();
}

OrgApacheFelixJaasConfigurationSpiProperties::~OrgApacheFelixJaasConfigurationSpiProperties()
{
	//__cleanup();
}

void
OrgApacheFelixJaasConfigurationSpiProperties::__init()
{
	//jaasdefaultRealmName = new ConfigNodePropertyString();
	//jaasconfigProviderName = new ConfigNodePropertyString();
	//jaasglobalConfigPolicy = new ConfigNodePropertyDropDown();
}

void
OrgApacheFelixJaasConfigurationSpiProperties::__cleanup()
{
	//if(jaasdefaultRealmName != NULL) {
	//
	//delete jaasdefaultRealmName;
	//jaasdefaultRealmName = NULL;
	//}
	//if(jaasconfigProviderName != NULL) {
	//
	//delete jaasconfigProviderName;
	//jaasconfigProviderName = NULL;
	//}
	//if(jaasglobalConfigPolicy != NULL) {
	//
	//delete jaasglobalConfigPolicy;
	//jaasglobalConfigPolicy = NULL;
	//}
	//
}

void
OrgApacheFelixJaasConfigurationSpiProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jaasdefaultRealmNameKey = "jaas.defaultRealmName";
	node = json_object_get_member(pJsonObject, jaasdefaultRealmNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jaasdefaultRealmName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jaasdefaultRealmName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaasconfigProviderNameKey = "jaas.configProviderName";
	node = json_object_get_member(pJsonObject, jaasconfigProviderNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jaasconfigProviderName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jaasconfigProviderName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaasglobalConfigPolicyKey = "jaas.globalConfigPolicy";
	node = json_object_get_member(pJsonObject, jaasglobalConfigPolicyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&jaasglobalConfigPolicy, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&jaasglobalConfigPolicy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixJaasConfigurationSpiProperties::OrgApacheFelixJaasConfigurationSpiProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixJaasConfigurationSpiProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJaasdefaultRealmName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJaasdefaultRealmName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaasdefaultRealmNameKey = "jaas.defaultRealmName";
	json_object_set_member(pJsonObject, jaasdefaultRealmNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJaasconfigProviderName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJaasconfigProviderName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaasconfigProviderNameKey = "jaas.configProviderName";
	json_object_set_member(pJsonObject, jaasconfigProviderNameKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getJaasglobalConfigPolicy();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getJaasglobalConfigPolicy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaasglobalConfigPolicyKey = "jaas.globalConfigPolicy";
	json_object_set_member(pJsonObject, jaasglobalConfigPolicyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheFelixJaasConfigurationSpiProperties::getJaasdefaultRealmName()
{
	return jaasdefaultRealmName;
}

void
OrgApacheFelixJaasConfigurationSpiProperties::setJaasdefaultRealmName(ConfigNodePropertyString  jaasdefaultRealmName)
{
	this->jaasdefaultRealmName = jaasdefaultRealmName;
}

ConfigNodePropertyString
OrgApacheFelixJaasConfigurationSpiProperties::getJaasconfigProviderName()
{
	return jaasconfigProviderName;
}

void
OrgApacheFelixJaasConfigurationSpiProperties::setJaasconfigProviderName(ConfigNodePropertyString  jaasconfigProviderName)
{
	this->jaasconfigProviderName = jaasconfigProviderName;
}

ConfigNodePropertyDropDown
OrgApacheFelixJaasConfigurationSpiProperties::getJaasglobalConfigPolicy()
{
	return jaasglobalConfigPolicy;
}

void
OrgApacheFelixJaasConfigurationSpiProperties::setJaasglobalConfigPolicy(ConfigNodePropertyDropDown  jaasglobalConfigPolicy)
{
	this->jaasglobalConfigPolicy = jaasglobalConfigPolicy;
}


