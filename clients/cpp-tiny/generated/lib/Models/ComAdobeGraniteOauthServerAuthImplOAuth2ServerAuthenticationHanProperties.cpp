

#include "ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.h"

using namespace Tiny;

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties()
{
	path = ConfigNodePropertyString();
	jaascontrolFlag = ConfigNodePropertyString();
	jaasrealmName = ConfigNodePropertyString();
	jaasranking = ConfigNodePropertyInteger();
	oauthofflinevalidation = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::~ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties()
{

}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *jaascontrolFlagKey = "jaas.controlFlag";

    if(object.has_key(jaascontrolFlagKey))
    {
        bourne::json value = object[jaascontrolFlagKey];




        ConfigNodePropertyString* obj = &jaascontrolFlag;
		obj->fromJson(value.dump());

    }

    const char *jaasrealmNameKey = "jaas.realmName";

    if(object.has_key(jaasrealmNameKey))
    {
        bourne::json value = object[jaasrealmNameKey];




        ConfigNodePropertyString* obj = &jaasrealmName;
		obj->fromJson(value.dump());

    }

    const char *jaasrankingKey = "jaas.ranking";

    if(object.has_key(jaasrankingKey))
    {
        bourne::json value = object[jaasrankingKey];




        ConfigNodePropertyInteger* obj = &jaasranking;
		obj->fromJson(value.dump());

    }

    const char *oauthofflinevalidationKey = "oauth.offline.validation";

    if(object.has_key(oauthofflinevalidationKey))
    {
        bourne::json value = object[oauthofflinevalidationKey];




        ConfigNodePropertyBoolean* obj = &oauthofflinevalidation;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["jaascontrolFlag"] = getJaascontrolFlag().toJson();






	object["jaasrealmName"] = getJaasrealmName().toJson();






	object["jaasranking"] = getJaasranking().toJson();






	object["oauthofflinevalidation"] = getOauthofflinevalidation().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getJaascontrolFlag()
{
	return jaascontrolFlag;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setJaascontrolFlag(ConfigNodePropertyString jaascontrolFlag)
{
	this->jaascontrolFlag = jaascontrolFlag;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getJaasrealmName()
{
	return jaasrealmName;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setJaasrealmName(ConfigNodePropertyString jaasrealmName)
{
	this->jaasrealmName = jaasrealmName;
}

ConfigNodePropertyInteger
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getJaasranking()
{
	return jaasranking;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setJaasranking(ConfigNodePropertyInteger jaasranking)
{
	this->jaasranking = jaasranking;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getOauthofflinevalidation()
{
	return oauthofflinevalidation;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setOauthofflinevalidation(ConfigNodePropertyBoolean oauthofflinevalidation)
{
	this->oauthofflinevalidation = oauthofflinevalidation;
}



