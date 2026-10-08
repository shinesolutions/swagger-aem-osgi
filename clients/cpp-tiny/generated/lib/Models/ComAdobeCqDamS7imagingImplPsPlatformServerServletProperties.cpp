

#include "ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.h"

using namespace Tiny;

ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties()
{
	cacheenable = ConfigNodePropertyBoolean();
	cacherootPaths = ConfigNodePropertyArray();
	cachemaxSize = ConfigNodePropertyInteger();
	cachemaxEntries = ConfigNodePropertyInteger();
}

ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::~ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties()
{

}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cacheenableKey = "cache.enable";

    if(object.has_key(cacheenableKey))
    {
        bourne::json value = object[cacheenableKey];




        ConfigNodePropertyBoolean* obj = &cacheenable;
		obj->fromJson(value.dump());

    }

    const char *cacherootPathsKey = "cache.rootPaths";

    if(object.has_key(cacherootPathsKey))
    {
        bourne::json value = object[cacherootPathsKey];




        ConfigNodePropertyArray* obj = &cacherootPaths;
		obj->fromJson(value.dump());

    }

    const char *cachemaxSizeKey = "cache.maxSize";

    if(object.has_key(cachemaxSizeKey))
    {
        bourne::json value = object[cachemaxSizeKey];




        ConfigNodePropertyInteger* obj = &cachemaxSize;
		obj->fromJson(value.dump());

    }

    const char *cachemaxEntriesKey = "cache.maxEntries";

    if(object.has_key(cachemaxEntriesKey))
    {
        bourne::json value = object[cachemaxEntriesKey];




        ConfigNodePropertyInteger* obj = &cachemaxEntries;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cacheenable"] = getCacheenable().toJson();






	object["cacherootPaths"] = getCacherootPaths().toJson();






	object["cachemaxSize"] = getCachemaxSize().toJson();






	object["cachemaxEntries"] = getCachemaxEntries().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::getCacheenable()
{
	return cacheenable;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::setCacheenable(ConfigNodePropertyBoolean cacheenable)
{
	this->cacheenable = cacheenable;
}

ConfigNodePropertyArray
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::getCacherootPaths()
{
	return cacherootPaths;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::setCacherootPaths(ConfigNodePropertyArray cacherootPaths)
{
	this->cacherootPaths = cacherootPaths;
}

ConfigNodePropertyInteger
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::getCachemaxSize()
{
	return cachemaxSize;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::setCachemaxSize(ConfigNodePropertyInteger cachemaxSize)
{
	this->cachemaxSize = cachemaxSize;
}

ConfigNodePropertyInteger
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::getCachemaxEntries()
{
	return cachemaxEntries;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::setCachemaxEntries(ConfigNodePropertyInteger cachemaxEntries)
{
	this->cachemaxEntries = cachemaxEntries;
}



