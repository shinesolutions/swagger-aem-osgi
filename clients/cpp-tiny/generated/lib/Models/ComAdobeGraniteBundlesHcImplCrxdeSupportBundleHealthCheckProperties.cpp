

#include "ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::~ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



