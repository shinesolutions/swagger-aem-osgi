

#include "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties()
{
	protectExternalId = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties()
{

}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *protectExternalIdKey = "protectExternalId";

    if(object.has_key(protectExternalIdKey))
    {
        bourne::json value = object[protectExternalIdKey];




        ConfigNodePropertyBoolean* obj = &protectExternalId;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["protectExternalId"] = getProtectExternalId().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::getProtectExternalId()
{
	return protectExternalId;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties::setProtectExternalId(ConfigNodePropertyBoolean protectExternalId)
{
	this->protectExternalId = protectExternalId;
}



