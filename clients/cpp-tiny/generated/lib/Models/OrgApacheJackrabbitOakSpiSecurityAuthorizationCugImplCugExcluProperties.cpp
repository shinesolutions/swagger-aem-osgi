

#include "OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties()
{
	principalNames = ConfigNodePropertyArray();
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::~OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties()
{

}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *principalNamesKey = "principalNames";

    if(object.has_key(principalNamesKey))
    {
        bourne::json value = object[principalNamesKey];




        ConfigNodePropertyArray* obj = &principalNames;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["principalNames"] = getPrincipalNames().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::getPrincipalNames()
{
	return principalNames;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties::setPrincipalNames(ConfigNodePropertyArray principalNames)
{
	this->principalNames = principalNames;
}



