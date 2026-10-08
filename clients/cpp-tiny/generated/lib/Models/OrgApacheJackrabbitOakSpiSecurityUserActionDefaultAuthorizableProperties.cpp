

#include "OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties()
{
	enabledActions = ConfigNodePropertyDropDown();
	userPrivilegeNames = ConfigNodePropertyArray();
	groupPrivilegeNames = ConfigNodePropertyArray();
	constraint = ConfigNodePropertyString();
}

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::~OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties()
{

}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledActionsKey = "enabledActions";

    if(object.has_key(enabledActionsKey))
    {
        bourne::json value = object[enabledActionsKey];




        ConfigNodePropertyDropDown* obj = &enabledActions;
		obj->fromJson(value.dump());

    }

    const char *userPrivilegeNamesKey = "userPrivilegeNames";

    if(object.has_key(userPrivilegeNamesKey))
    {
        bourne::json value = object[userPrivilegeNamesKey];




        ConfigNodePropertyArray* obj = &userPrivilegeNames;
		obj->fromJson(value.dump());

    }

    const char *groupPrivilegeNamesKey = "groupPrivilegeNames";

    if(object.has_key(groupPrivilegeNamesKey))
    {
        bourne::json value = object[groupPrivilegeNamesKey];




        ConfigNodePropertyArray* obj = &groupPrivilegeNames;
		obj->fromJson(value.dump());

    }

    const char *constraintKey = "constraint";

    if(object.has_key(constraintKey))
    {
        bourne::json value = object[constraintKey];




        ConfigNodePropertyString* obj = &constraint;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabledActions"] = getEnabledActions().toJson();






	object["userPrivilegeNames"] = getUserPrivilegeNames().toJson();






	object["groupPrivilegeNames"] = getGroupPrivilegeNames().toJson();






	object["constraint"] = getConstraint().toJson();


    return object;

}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getEnabledActions()
{
	return enabledActions;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setEnabledActions(ConfigNodePropertyDropDown enabledActions)
{
	this->enabledActions = enabledActions;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getUserPrivilegeNames()
{
	return userPrivilegeNames;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setUserPrivilegeNames(ConfigNodePropertyArray userPrivilegeNames)
{
	this->userPrivilegeNames = userPrivilegeNames;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getGroupPrivilegeNames()
{
	return groupPrivilegeNames;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setGroupPrivilegeNames(ConfigNodePropertyArray groupPrivilegeNames)
{
	this->groupPrivilegeNames = groupPrivilegeNames;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getConstraint()
{
	return constraint;
}

void
OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setConstraint(ConfigNodePropertyString constraint)
{
	this->constraint = constraint;
}



