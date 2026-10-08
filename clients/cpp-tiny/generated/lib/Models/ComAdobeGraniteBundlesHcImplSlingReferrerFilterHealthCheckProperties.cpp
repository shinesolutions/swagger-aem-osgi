

#include "ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties::~ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



