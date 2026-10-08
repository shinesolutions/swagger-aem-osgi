

#include "ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.h"

using namespace Tiny;

ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties()
{
	omnisearchsuggestionrequiretextmin = ConfigNodePropertyInteger();
	omnisearchsuggestionspellcheckrequire = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::~ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties()
{

}

void
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *omnisearchsuggestionrequiretextminKey = "omnisearch.suggestion.requiretext.min";

    if(object.has_key(omnisearchsuggestionrequiretextminKey))
    {
        bourne::json value = object[omnisearchsuggestionrequiretextminKey];




        ConfigNodePropertyInteger* obj = &omnisearchsuggestionrequiretextmin;
		obj->fromJson(value.dump());

    }

    const char *omnisearchsuggestionspellcheckrequireKey = "omnisearch.suggestion.spellcheck.require";

    if(object.has_key(omnisearchsuggestionspellcheckrequireKey))
    {
        bourne::json value = object[omnisearchsuggestionspellcheckrequireKey];




        ConfigNodePropertyBoolean* obj = &omnisearchsuggestionspellcheckrequire;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["omnisearchsuggestionrequiretextmin"] = getOmnisearchsuggestionrequiretextmin().toJson();






	object["omnisearchsuggestionspellcheckrequire"] = getOmnisearchsuggestionspellcheckrequire().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::getOmnisearchsuggestionrequiretextmin()
{
	return omnisearchsuggestionrequiretextmin;
}

void
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::setOmnisearchsuggestionrequiretextmin(ConfigNodePropertyInteger omnisearchsuggestionrequiretextmin)
{
	this->omnisearchsuggestionrequiretextmin = omnisearchsuggestionrequiretextmin;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::getOmnisearchsuggestionspellcheckrequire()
{
	return omnisearchsuggestionspellcheckrequire;
}

void
ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties::setOmnisearchsuggestionspellcheckrequire(ConfigNodePropertyBoolean omnisearchsuggestionspellcheckrequire)
{
	this->omnisearchsuggestionspellcheckrequire = omnisearchsuggestionspellcheckrequire;
}



