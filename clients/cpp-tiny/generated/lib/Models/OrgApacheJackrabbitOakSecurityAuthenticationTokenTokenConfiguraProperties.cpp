

#include "OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties()
{
	tokenExpiration = ConfigNodePropertyString();
	tokenLength = ConfigNodePropertyString();
	tokenRefresh = ConfigNodePropertyBoolean();
	tokenCleanupThreshold = ConfigNodePropertyInteger();
	passwordHashAlgorithm = ConfigNodePropertyString();
	passwordHashIterations = ConfigNodePropertyInteger();
	passwordSaltSize = ConfigNodePropertyInteger();
}

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::~OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties()
{

}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tokenExpirationKey = "tokenExpiration";

    if(object.has_key(tokenExpirationKey))
    {
        bourne::json value = object[tokenExpirationKey];




        ConfigNodePropertyString* obj = &tokenExpiration;
		obj->fromJson(value.dump());

    }

    const char *tokenLengthKey = "tokenLength";

    if(object.has_key(tokenLengthKey))
    {
        bourne::json value = object[tokenLengthKey];




        ConfigNodePropertyString* obj = &tokenLength;
		obj->fromJson(value.dump());

    }

    const char *tokenRefreshKey = "tokenRefresh";

    if(object.has_key(tokenRefreshKey))
    {
        bourne::json value = object[tokenRefreshKey];




        ConfigNodePropertyBoolean* obj = &tokenRefresh;
		obj->fromJson(value.dump());

    }

    const char *tokenCleanupThresholdKey = "tokenCleanupThreshold";

    if(object.has_key(tokenCleanupThresholdKey))
    {
        bourne::json value = object[tokenCleanupThresholdKey];




        ConfigNodePropertyInteger* obj = &tokenCleanupThreshold;
		obj->fromJson(value.dump());

    }

    const char *passwordHashAlgorithmKey = "passwordHashAlgorithm";

    if(object.has_key(passwordHashAlgorithmKey))
    {
        bourne::json value = object[passwordHashAlgorithmKey];




        ConfigNodePropertyString* obj = &passwordHashAlgorithm;
		obj->fromJson(value.dump());

    }

    const char *passwordHashIterationsKey = "passwordHashIterations";

    if(object.has_key(passwordHashIterationsKey))
    {
        bourne::json value = object[passwordHashIterationsKey];




        ConfigNodePropertyInteger* obj = &passwordHashIterations;
		obj->fromJson(value.dump());

    }

    const char *passwordSaltSizeKey = "passwordSaltSize";

    if(object.has_key(passwordSaltSizeKey))
    {
        bourne::json value = object[passwordSaltSizeKey];




        ConfigNodePropertyInteger* obj = &passwordSaltSize;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["tokenExpiration"] = getTokenExpiration().toJson();






	object["tokenLength"] = getTokenLength().toJson();






	object["tokenRefresh"] = getTokenRefresh().toJson();






	object["tokenCleanupThreshold"] = getTokenCleanupThreshold().toJson();






	object["passwordHashAlgorithm"] = getPasswordHashAlgorithm().toJson();






	object["passwordHashIterations"] = getPasswordHashIterations().toJson();






	object["passwordSaltSize"] = getPasswordSaltSize().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getTokenExpiration()
{
	return tokenExpiration;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setTokenExpiration(ConfigNodePropertyString tokenExpiration)
{
	this->tokenExpiration = tokenExpiration;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getTokenLength()
{
	return tokenLength;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setTokenLength(ConfigNodePropertyString tokenLength)
{
	this->tokenLength = tokenLength;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getTokenRefresh()
{
	return tokenRefresh;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setTokenRefresh(ConfigNodePropertyBoolean tokenRefresh)
{
	this->tokenRefresh = tokenRefresh;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getTokenCleanupThreshold()
{
	return tokenCleanupThreshold;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setTokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold)
{
	this->tokenCleanupThreshold = tokenCleanupThreshold;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getPasswordHashAlgorithm()
{
	return passwordHashAlgorithm;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm)
{
	this->passwordHashAlgorithm = passwordHashAlgorithm;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getPasswordHashIterations()
{
	return passwordHashIterations;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations)
{
	this->passwordHashIterations = passwordHashIterations;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getPasswordSaltSize()
{
	return passwordSaltSize;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize)
{
	this->passwordSaltSize = passwordSaltSize;
}



