

#include "ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties::ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties::ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties::~ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



