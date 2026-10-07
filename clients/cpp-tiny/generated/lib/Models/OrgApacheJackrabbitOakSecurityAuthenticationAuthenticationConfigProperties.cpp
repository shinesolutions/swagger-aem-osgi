

#include "OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties()
{
	orgapachejackrabbitoakauthenticationappName = ConfigNodePropertyString();
	orgapachejackrabbitoakauthenticationconfigSpiName = ConfigNodePropertyString();
}

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::~OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties()
{

}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapachejackrabbitoakauthenticationappNameKey = "org.apache.jackrabbit.oak.authentication.appName";

    if(object.has_key(orgapachejackrabbitoakauthenticationappNameKey))
    {
        bourne::json value = object[orgapachejackrabbitoakauthenticationappNameKey];




        ConfigNodePropertyString* obj = &orgapachejackrabbitoakauthenticationappName;
		obj->fromJson(value.dump());

    }

    const char *orgapachejackrabbitoakauthenticationconfigSpiNameKey = "org.apache.jackrabbit.oak.authentication.configSpiName";

    if(object.has_key(orgapachejackrabbitoakauthenticationconfigSpiNameKey))
    {
        bourne::json value = object[orgapachejackrabbitoakauthenticationconfigSpiNameKey];




        ConfigNodePropertyString* obj = &orgapachejackrabbitoakauthenticationconfigSpiName;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapachejackrabbitoakauthenticationappName"] = getOrgapachejackrabbitoakauthenticationappName().toJson();






	object["orgapachejackrabbitoakauthenticationconfigSpiName"] = getOrgapachejackrabbitoakauthenticationconfigSpiName().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::getOrgapachejackrabbitoakauthenticationappName()
{
	return orgapachejackrabbitoakauthenticationappName;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::setOrgapachejackrabbitoakauthenticationappName(ConfigNodePropertyString orgapachejackrabbitoakauthenticationappName)
{
	this->orgapachejackrabbitoakauthenticationappName = orgapachejackrabbitoakauthenticationappName;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::getOrgapachejackrabbitoakauthenticationconfigSpiName()
{
	return orgapachejackrabbitoakauthenticationconfigSpiName;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties::setOrgapachejackrabbitoakauthenticationconfigSpiName(ConfigNodePropertyString orgapachejackrabbitoakauthenticationconfigSpiName)
{
	this->orgapachejackrabbitoakauthenticationconfigSpiName = orgapachejackrabbitoakauthenticationconfigSpiName;
}



