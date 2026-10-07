

#include "ComAdobeGraniteCorsImplCORSPolicyImplProperties.h"

using namespace Tiny;

ComAdobeGraniteCorsImplCORSPolicyImplProperties::ComAdobeGraniteCorsImplCORSPolicyImplProperties()
{
	alloworigin = ConfigNodePropertyArray();
	alloworiginregexp = ConfigNodePropertyArray();
	allowedpaths = ConfigNodePropertyArray();
	exposedheaders = ConfigNodePropertyArray();
	maxage = ConfigNodePropertyInteger();
	supportedheaders = ConfigNodePropertyArray();
	supportedmethods = ConfigNodePropertyArray();
	supportscredentials = ConfigNodePropertyBoolean();
}

ComAdobeGraniteCorsImplCORSPolicyImplProperties::ComAdobeGraniteCorsImplCORSPolicyImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCorsImplCORSPolicyImplProperties::~ComAdobeGraniteCorsImplCORSPolicyImplProperties()
{

}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *alloworiginKey = "alloworigin";

    if(object.has_key(alloworiginKey))
    {
        bourne::json value = object[alloworiginKey];




        ConfigNodePropertyArray* obj = &alloworigin;
		obj->fromJson(value.dump());

    }

    const char *alloworiginregexpKey = "alloworiginregexp";

    if(object.has_key(alloworiginregexpKey))
    {
        bourne::json value = object[alloworiginregexpKey];




        ConfigNodePropertyArray* obj = &alloworiginregexp;
		obj->fromJson(value.dump());

    }

    const char *allowedpathsKey = "allowedpaths";

    if(object.has_key(allowedpathsKey))
    {
        bourne::json value = object[allowedpathsKey];




        ConfigNodePropertyArray* obj = &allowedpaths;
		obj->fromJson(value.dump());

    }

    const char *exposedheadersKey = "exposedheaders";

    if(object.has_key(exposedheadersKey))
    {
        bourne::json value = object[exposedheadersKey];




        ConfigNodePropertyArray* obj = &exposedheaders;
		obj->fromJson(value.dump());

    }

    const char *maxageKey = "maxage";

    if(object.has_key(maxageKey))
    {
        bourne::json value = object[maxageKey];




        ConfigNodePropertyInteger* obj = &maxage;
		obj->fromJson(value.dump());

    }

    const char *supportedheadersKey = "supportedheaders";

    if(object.has_key(supportedheadersKey))
    {
        bourne::json value = object[supportedheadersKey];




        ConfigNodePropertyArray* obj = &supportedheaders;
		obj->fromJson(value.dump());

    }

    const char *supportedmethodsKey = "supportedmethods";

    if(object.has_key(supportedmethodsKey))
    {
        bourne::json value = object[supportedmethodsKey];




        ConfigNodePropertyArray* obj = &supportedmethods;
		obj->fromJson(value.dump());

    }

    const char *supportscredentialsKey = "supportscredentials";

    if(object.has_key(supportscredentialsKey))
    {
        bourne::json value = object[supportscredentialsKey];




        ConfigNodePropertyBoolean* obj = &supportscredentials;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCorsImplCORSPolicyImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["alloworigin"] = getAlloworigin().toJson();






	object["alloworiginregexp"] = getAlloworiginregexp().toJson();






	object["allowedpaths"] = getAllowedpaths().toJson();






	object["exposedheaders"] = getExposedheaders().toJson();






	object["maxage"] = getMaxage().toJson();






	object["supportedheaders"] = getSupportedheaders().toJson();






	object["supportedmethods"] = getSupportedmethods().toJson();






	object["supportscredentials"] = getSupportscredentials().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getAlloworigin()
{
	return alloworigin;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setAlloworigin(ConfigNodePropertyArray alloworigin)
{
	this->alloworigin = alloworigin;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getAlloworiginregexp()
{
	return alloworiginregexp;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setAlloworiginregexp(ConfigNodePropertyArray alloworiginregexp)
{
	this->alloworiginregexp = alloworiginregexp;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getAllowedpaths()
{
	return allowedpaths;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setAllowedpaths(ConfigNodePropertyArray allowedpaths)
{
	this->allowedpaths = allowedpaths;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getExposedheaders()
{
	return exposedheaders;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setExposedheaders(ConfigNodePropertyArray exposedheaders)
{
	this->exposedheaders = exposedheaders;
}

ConfigNodePropertyInteger
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getMaxage()
{
	return maxage;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setMaxage(ConfigNodePropertyInteger maxage)
{
	this->maxage = maxage;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getSupportedheaders()
{
	return supportedheaders;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setSupportedheaders(ConfigNodePropertyArray supportedheaders)
{
	this->supportedheaders = supportedheaders;
}

ConfigNodePropertyArray
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getSupportedmethods()
{
	return supportedmethods;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setSupportedmethods(ConfigNodePropertyArray supportedmethods)
{
	this->supportedmethods = supportedmethods;
}

ConfigNodePropertyBoolean
ComAdobeGraniteCorsImplCORSPolicyImplProperties::getSupportscredentials()
{
	return supportscredentials;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplProperties::setSupportscredentials(ConfigNodePropertyBoolean supportscredentials)
{
	this->supportscredentials = supportscredentials;
}



