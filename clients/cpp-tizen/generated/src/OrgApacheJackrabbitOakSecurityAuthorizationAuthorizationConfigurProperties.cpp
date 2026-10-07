#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::~OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::__init()
{
	//permissionsJr2 = new ConfigNodePropertyDropDown();
	//importBehavior = new ConfigNodePropertyDropDown();
	//readPaths = new ConfigNodePropertyArray();
	//administrativePrincipals = new ConfigNodePropertyArray();
	//configurationRanking = new ConfigNodePropertyInteger();
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::__cleanup()
{
	//if(permissionsJr2 != NULL) {
	//
	//delete permissionsJr2;
	//permissionsJr2 = NULL;
	//}
	//if(importBehavior != NULL) {
	//
	//delete importBehavior;
	//importBehavior = NULL;
	//}
	//if(readPaths != NULL) {
	//
	//delete readPaths;
	//readPaths = NULL;
	//}
	//if(administrativePrincipals != NULL) {
	//
	//delete administrativePrincipals;
	//administrativePrincipals = NULL;
	//}
	//if(configurationRanking != NULL) {
	//
	//delete configurationRanking;
	//configurationRanking = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *permissionsJr2Key = "permissionsJr2";
	node = json_object_get_member(pJsonObject, permissionsJr2Key);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&permissionsJr2, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&permissionsJr2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *importBehaviorKey = "importBehavior";
	node = json_object_get_member(pJsonObject, importBehaviorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&importBehavior, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&importBehavior);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *readPathsKey = "readPaths";
	node = json_object_get_member(pJsonObject, readPathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&readPaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&readPaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *administrativePrincipalsKey = "administrativePrincipals";
	node = json_object_get_member(pJsonObject, administrativePrincipalsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&administrativePrincipals, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&administrativePrincipals);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *configurationRankingKey = "configurationRanking";
	node = json_object_get_member(pJsonObject, configurationRankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&configurationRanking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&configurationRanking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getPermissionsJr2();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getPermissionsJr2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *permissionsJr2Key = "permissionsJr2";
	json_object_set_member(pJsonObject, permissionsJr2Key, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getImportBehavior();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getImportBehavior());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *importBehaviorKey = "importBehavior";
	json_object_set_member(pJsonObject, importBehaviorKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getReadPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getReadPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *readPathsKey = "readPaths";
	json_object_set_member(pJsonObject, readPathsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAdministrativePrincipals();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAdministrativePrincipals());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *administrativePrincipalsKey = "administrativePrincipals";
	json_object_set_member(pJsonObject, administrativePrincipalsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConfigurationRanking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConfigurationRanking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configurationRankingKey = "configurationRanking";
	json_object_set_member(pJsonObject, configurationRankingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getPermissionsJr2()
{
	return permissionsJr2;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setPermissionsJr2(ConfigNodePropertyDropDown  permissionsJr2)
{
	this->permissionsJr2 = permissionsJr2;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getImportBehavior()
{
	return importBehavior;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setImportBehavior(ConfigNodePropertyDropDown  importBehavior)
{
	this->importBehavior = importBehavior;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getReadPaths()
{
	return readPaths;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setReadPaths(ConfigNodePropertyArray  readPaths)
{
	this->readPaths = readPaths;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getAdministrativePrincipals()
{
	return administrativePrincipals;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setAdministrativePrincipals(ConfigNodePropertyArray  administrativePrincipals)
{
	this->administrativePrincipals = administrativePrincipals;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getConfigurationRanking()
{
	return configurationRanking;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setConfigurationRanking(ConfigNodePropertyInteger  configurationRanking)
{
	this->configurationRanking = configurationRanking;
}


