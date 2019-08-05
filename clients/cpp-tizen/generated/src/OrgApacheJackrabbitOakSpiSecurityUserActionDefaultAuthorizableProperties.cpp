#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::~OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::__init()
{
	//enabledActions = new ConfigNodePropertyDropDown();
	//userPrivilegeNames = new ConfigNodePropertyArray();
	//groupPrivilegeNames = new ConfigNodePropertyArray();
	//constraint = new ConfigNodePropertyString();
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::__cleanup()
{
	//if(enabledActions != NULL) {
	//
	//delete enabledActions;
	//enabledActions = NULL;
	//}
	//if(userPrivilegeNames != NULL) {
	//
	//delete userPrivilegeNames;
	//userPrivilegeNames = NULL;
	//}
	//if(groupPrivilegeNames != NULL) {
	//
	//delete groupPrivilegeNames;
	//groupPrivilegeNames = NULL;
	//}
	//if(constraint != NULL) {
	//
	//delete constraint;
	//constraint = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enabledActionsKey = "enabledActions";
	node = json_object_get_member(pJsonObject, enabledActionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&enabledActions, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&enabledActions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userPrivilegeNamesKey = "userPrivilegeNames";
	node = json_object_get_member(pJsonObject, userPrivilegeNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&userPrivilegeNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&userPrivilegeNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupPrivilegeNamesKey = "groupPrivilegeNames";
	node = json_object_get_member(pJsonObject, groupPrivilegeNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&groupPrivilegeNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&groupPrivilegeNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *constraintKey = "constraint";
	node = json_object_get_member(pJsonObject, constraintKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&constraint, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&constraint);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getEnabledActions();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getEnabledActions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledActionsKey = "enabledActions";
	json_object_set_member(pJsonObject, enabledActionsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getUserPrivilegeNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUserPrivilegeNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userPrivilegeNamesKey = "userPrivilegeNames";
	json_object_set_member(pJsonObject, userPrivilegeNamesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGroupPrivilegeNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGroupPrivilegeNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupPrivilegeNamesKey = "groupPrivilegeNames";
	json_object_set_member(pJsonObject, groupPrivilegeNamesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getConstraint();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getConstraint());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *constraintKey = "constraint";
	json_object_set_member(pJsonObject, constraintKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getEnabledActions()
{
	return enabledActions;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setEnabledActions(ConfigNodePropertyDropDown  enabledActions)
{
	this->enabledActions = enabledActions;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getUserPrivilegeNames()
{
	return userPrivilegeNames;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setUserPrivilegeNames(ConfigNodePropertyArray  userPrivilegeNames)
{
	this->userPrivilegeNames = userPrivilegeNames;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getGroupPrivilegeNames()
{
	return groupPrivilegeNames;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setGroupPrivilegeNames(ConfigNodePropertyArray  groupPrivilegeNames)
{
	this->groupPrivilegeNames = groupPrivilegeNames;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getConstraint()
{
	return constraint;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setConstraint(ConfigNodePropertyString  constraint)
{
	this->constraint = constraint;
}


