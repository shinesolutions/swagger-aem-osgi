

#include "OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties()
{
	cugSupportedPaths = ConfigNodePropertyArray();
	cugEnabled = ConfigNodePropertyBoolean();
	configurationRanking = ConfigNodePropertyInteger();
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::~OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties()
{

}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cugSupportedPathsKey = "cugSupportedPaths";

    if(object.has_key(cugSupportedPathsKey))
    {
        bourne::json value = object[cugSupportedPathsKey];




        ConfigNodePropertyArray* obj = &cugSupportedPaths;
		obj->fromJson(value.dump());

    }

    const char *cugEnabledKey = "cugEnabled";

    if(object.has_key(cugEnabledKey))
    {
        bourne::json value = object[cugEnabledKey];




        ConfigNodePropertyBoolean* obj = &cugEnabled;
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
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cugSupportedPaths"] = getCugSupportedPaths().toJson();






	object["cugEnabled"] = getCugEnabled().toJson();






	object["configurationRanking"] = getConfigurationRanking().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::getCugSupportedPaths()
{
	return cugSupportedPaths;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::setCugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths)
{
	this->cugSupportedPaths = cugSupportedPaths;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::getCugEnabled()
{
	return cugEnabled;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::setCugEnabled(ConfigNodePropertyBoolean cugEnabled)
{
	this->cugEnabled = cugEnabled;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::getConfigurationRanking()
{
	return configurationRanking;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties::setConfigurationRanking(ConfigNodePropertyInteger configurationRanking)
{
	this->configurationRanking = configurationRanking;
}



