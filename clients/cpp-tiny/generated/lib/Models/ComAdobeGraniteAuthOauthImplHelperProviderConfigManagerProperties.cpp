

#include "ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties()
{
	oauthcookielogintimeout = ConfigNodePropertyString();
	oauthcookiemaxage = ConfigNodePropertyString();
}

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::~ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties()
{

}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthcookielogintimeoutKey = "oauth.cookie.login.timeout";

    if(object.has_key(oauthcookielogintimeoutKey))
    {
        bourne::json value = object[oauthcookielogintimeoutKey];




        ConfigNodePropertyString* obj = &oauthcookielogintimeout;
		obj->fromJson(value.dump());

    }

    const char *oauthcookiemaxageKey = "oauth.cookie.max.age";

    if(object.has_key(oauthcookiemaxageKey))
    {
        bourne::json value = object[oauthcookiemaxageKey];




        ConfigNodePropertyString* obj = &oauthcookiemaxage;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthcookielogintimeout"] = getOauthcookielogintimeout().toJson();






	object["oauthcookiemaxage"] = getOauthcookiemaxage().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::getOauthcookielogintimeout()
{
	return oauthcookielogintimeout;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::setOauthcookielogintimeout(ConfigNodePropertyString oauthcookielogintimeout)
{
	this->oauthcookielogintimeout = oauthcookielogintimeout;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::getOauthcookiemaxage()
{
	return oauthcookiemaxage;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::setOauthcookiemaxage(ConfigNodePropertyString oauthcookiemaxage)
{
	this->oauthcookiemaxage = oauthcookiemaxage;
}



