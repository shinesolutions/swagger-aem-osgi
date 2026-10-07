

#include "OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties()
{
	permissionsJr2 = ConfigNodePropertyDropDown();
	importBehavior = ConfigNodePropertyDropDown();
	readPaths = ConfigNodePropertyArray();
	administrativePrincipals = ConfigNodePropertyArray();
	configurationRanking = ConfigNodePropertyInteger();
}

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::~OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties()
{

}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *permissionsJr2Key = "permissionsJr2";

    if(object.has_key(permissionsJr2Key))
    {
        bourne::json value = object[permissionsJr2Key];




        ConfigNodePropertyDropDown* obj = &permissionsJr2;
		obj->fromJson(value.dump());

    }

    const char *importBehaviorKey = "importBehavior";

    if(object.has_key(importBehaviorKey))
    {
        bourne::json value = object[importBehaviorKey];




        ConfigNodePropertyDropDown* obj = &importBehavior;
		obj->fromJson(value.dump());

    }

    const char *readPathsKey = "readPaths";

    if(object.has_key(readPathsKey))
    {
        bourne::json value = object[readPathsKey];




        ConfigNodePropertyArray* obj = &readPaths;
		obj->fromJson(value.dump());

    }

    const char *administrativePrincipalsKey = "administrativePrincipals";

    if(object.has_key(administrativePrincipalsKey))
    {
        bourne::json value = object[administrativePrincipalsKey];




        ConfigNodePropertyArray* obj = &administrativePrincipals;
		obj->fromJson(value.dump());

    }

    const char *configurationRankingKey = "configurationRanking";

    if(object.has_key(configurationRankingKey))
    {
        bourne::json value = object[configurationRankingKey];




        ConfigNodePropertyInteger* obj = &configurationRanking;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["permissionsJr2"] = getPermissionsJr2().toJson();






	object["importBehavior"] = getImportBehavior().toJson();






	object["readPaths"] = getReadPaths().toJson();






	object["administrativePrincipals"] = getAdministrativePrincipals().toJson();






	object["configurationRanking"] = getConfigurationRanking().toJson();


    return object;

}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getPermissionsJr2()
{
	return permissionsJr2;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setPermissionsJr2(ConfigNodePropertyDropDown permissionsJr2)
{
	this->permissionsJr2 = permissionsJr2;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getImportBehavior()
{
	return importBehavior;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setImportBehavior(ConfigNodePropertyDropDown importBehavior)
{
	this->importBehavior = importBehavior;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getReadPaths()
{
	return readPaths;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setReadPaths(ConfigNodePropertyArray readPaths)
{
	this->readPaths = readPaths;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getAdministrativePrincipals()
{
	return administrativePrincipals;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setAdministrativePrincipals(ConfigNodePropertyArray administrativePrincipals)
{
	this->administrativePrincipals = administrativePrincipals;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::getConfigurationRanking()
{
	return configurationRanking;
}

void
OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties::setConfigurationRanking(ConfigNodePropertyInteger configurationRanking)
{
	this->configurationRanking = configurationRanking;
}



