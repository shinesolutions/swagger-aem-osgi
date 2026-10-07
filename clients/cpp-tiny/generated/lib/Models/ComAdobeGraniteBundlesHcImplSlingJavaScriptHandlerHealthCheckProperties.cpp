

#include "ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties::~ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



