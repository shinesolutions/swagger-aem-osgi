

#include "ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
	minimumcodecachesize = ConfigNodePropertyInteger();
}

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::~ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *minimumcodecachesizeKey = "minimum.code.cache.size";

    if(object.has_key(minimumcodecachesizeKey))
    {
        bourne::json value = object[minimumcodecachesizeKey];




        ConfigNodePropertyInteger* obj = &minimumcodecachesize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();






	object["minimumcodecachesize"] = getMinimumcodecachesize().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyInteger
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::getMinimumcodecachesize()
{
	return minimumcodecachesize;
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::setMinimumcodecachesize(ConfigNodePropertyInteger minimumcodecachesize)
{
	this->minimumcodecachesize = minimumcodecachesize;
}



