

#include "ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::~ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



