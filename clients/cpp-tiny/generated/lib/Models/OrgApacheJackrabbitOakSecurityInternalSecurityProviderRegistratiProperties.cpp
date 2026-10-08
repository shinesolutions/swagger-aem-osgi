

#include "OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties()
{
	requiredServicePids = ConfigNodePropertyArray();
	authorizationCompositionType = ConfigNodePropertyDropDown();
}

OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::~OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties()
{

}

void
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *requiredServicePidsKey = "requiredServicePids";

    if(object.has_key(requiredServicePidsKey))
    {
        bourne::json value = object[requiredServicePidsKey];




        ConfigNodePropertyArray* obj = &requiredServicePids;
		obj->fromJson(value.dump());

    }

    const char *authorizationCompositionTypeKey = "authorizationCompositionType";

    if(object.has_key(authorizationCompositionTypeKey))
    {
        bourne::json value = object[authorizationCompositionTypeKey];




        ConfigNodePropertyDropDown* obj = &authorizationCompositionType;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["requiredServicePids"] = getRequiredServicePids().toJson();






	object["authorizationCompositionType"] = getAuthorizationCompositionType().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::getRequiredServicePids()
{
	return requiredServicePids;
}

void
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::setRequiredServicePids(ConfigNodePropertyArray requiredServicePids)
{
	this->requiredServicePids = requiredServicePids;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::getAuthorizationCompositionType()
{
	return authorizationCompositionType;
}

void
OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties::setAuthorizationCompositionType(ConfigNodePropertyDropDown authorizationCompositionType)
{
	this->authorizationCompositionType = authorizationCompositionType;
}



