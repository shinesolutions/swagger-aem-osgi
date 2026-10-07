

#include "ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.h"

using namespace Tiny;

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties()
{
	securitypreferencesname = ConfigNodePropertyString();
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::~ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties()
{

}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *securitypreferencesnameKey = "security.preferences.name";

    if(object.has_key(securitypreferencesnameKey))
    {
        bourne::json value = object[securitypreferencesnameKey];




        ConfigNodePropertyString* obj = &securitypreferencesname;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["securitypreferencesname"] = getSecuritypreferencesname().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::getSecuritypreferencesname()
{
	return securitypreferencesname;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::setSecuritypreferencesname(ConfigNodePropertyString securitypreferencesname)
{
	this->securitypreferencesname = securitypreferencesname;
}



