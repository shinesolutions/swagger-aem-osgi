

#include "ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties()
{
	oauthcookielogintimeout = ConfigNodePropertyString();
	oauthcookiemaxage = ConfigNodePropertyString();
}

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties::~ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties()
{

}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthcookielogintimeout"] = getOauthcookielogintimeout().toJson();






	object["oauthcookiemaxage"] = getOauthcookiemaxage().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties::getOauthcookielogintimeout()
{
	return oauthcookielogintimeout;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties::setOauthcookielogintimeout(ConfigNodePropertyString oauthcookielogintimeout)
{
	this->oauthcookielogintimeout = oauthcookielogintimeout;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties::getOauthcookiemaxage()
{
	return oauthcookiemaxage;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties::setOauthcookiemaxage(ConfigNodePropertyString oauthcookiemaxage)
{
	this->oauthcookiemaxage = oauthcookiemaxage;
}



