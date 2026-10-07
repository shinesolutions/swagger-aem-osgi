

#include "ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties::~ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



