

#include "ComAdobeGraniteOptoutImplOptOutServiceImplProperties.h"

using namespace Tiny;

ComAdobeGraniteOptoutImplOptOutServiceImplProperties::ComAdobeGraniteOptoutImplOptOutServiceImplProperties()
{
	optoutcookies = ConfigNodePropertyArray();
	optoutheaders = ConfigNodePropertyArray();
	optoutwhitelistcookies = ConfigNodePropertyArray();
}

ComAdobeGraniteOptoutImplOptOutServiceImplProperties::ComAdobeGraniteOptoutImplOptOutServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOptoutImplOptOutServiceImplProperties::~ComAdobeGraniteOptoutImplOptOutServiceImplProperties()
{

}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *optoutcookiesKey = "optout.cookies";

    if(object.has_key(optoutcookiesKey))
    {
        bourne::json value = object[optoutcookiesKey];




        ConfigNodePropertyArray* obj = &optoutcookies;
		obj->fromJson(value.dump());

    }

    const char *optoutheadersKey = "optout.headers";

    if(object.has_key(optoutheadersKey))
    {
        bourne::json value = object[optoutheadersKey];




        ConfigNodePropertyArray* obj = &optoutheaders;
		obj->fromJson(value.dump());

    }

    const char *optoutwhitelistcookiesKey = "optout.whitelist.cookies";

    if(object.has_key(optoutwhitelistcookiesKey))
    {
        bourne::json value = object[optoutwhitelistcookiesKey];




        ConfigNodePropertyArray* obj = &optoutwhitelistcookies;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["optoutcookies"] = getOptoutcookies().toJson();






	object["optoutheaders"] = getOptoutheaders().toJson();






	object["optoutwhitelistcookies"] = getOptoutwhitelistcookies().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::getOptoutcookies()
{
	return optoutcookies;
}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::setOptoutcookies(ConfigNodePropertyArray optoutcookies)
{
	this->optoutcookies = optoutcookies;
}

ConfigNodePropertyArray
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::getOptoutheaders()
{
	return optoutheaders;
}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::setOptoutheaders(ConfigNodePropertyArray optoutheaders)
{
	this->optoutheaders = optoutheaders;
}

ConfigNodePropertyArray
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::getOptoutwhitelistcookies()
{
	return optoutwhitelistcookies;
}

void
ComAdobeGraniteOptoutImplOptOutServiceImplProperties::setOptoutwhitelistcookies(ConfigNodePropertyArray optoutwhitelistcookies)
{
	this->optoutwhitelistcookies = optoutwhitelistcookies;
}



