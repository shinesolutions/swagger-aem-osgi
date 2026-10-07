

#include "ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
	ignoredbundles = ConfigNodePropertyArray();
}

ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::~ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *ignoredbundlesKey = "ignored.bundles";

    if(object.has_key(ignoredbundlesKey))
    {
        bourne::json value = object[ignoredbundlesKey];




        ConfigNodePropertyArray* obj = &ignoredbundles;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();






	object["ignoredbundles"] = getIgnoredbundles().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::getIgnoredbundles()
{
	return ignoredbundles;
}

void
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::setIgnoredbundles(ConfigNodePropertyArray ignoredbundles)
{
	this->ignoredbundles = ignoredbundles;
}



