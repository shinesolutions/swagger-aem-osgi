

#include "ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties::ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties::ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties::~ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



