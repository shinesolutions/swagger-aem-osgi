

#include "ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties()
{
	cqdamimagecachemaxmemory = ConfigNodePropertyInteger();
	cqdamimagecachemaxage = ConfigNodePropertyInteger();
	cqdamimagecachemaxdimension = ConfigNodePropertyString();
}

ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::~ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties()
{

}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamimagecachemaxmemoryKey = "cq.dam.image.cache.max.memory";

    if(object.has_key(cqdamimagecachemaxmemoryKey))
    {
        bourne::json value = object[cqdamimagecachemaxmemoryKey];




        ConfigNodePropertyInteger* obj = &cqdamimagecachemaxmemory;
		obj->fromJson(value.dump());

    }

    const char *cqdamimagecachemaxageKey = "cq.dam.image.cache.max.age";

    if(object.has_key(cqdamimagecachemaxageKey))
    {
        bourne::json value = object[cqdamimagecachemaxageKey];




        ConfigNodePropertyInteger* obj = &cqdamimagecachemaxage;
		obj->fromJson(value.dump());

    }

    const char *cqdamimagecachemaxdimensionKey = "cq.dam.image.cache.max.dimension";

    if(object.has_key(cqdamimagecachemaxdimensionKey))
    {
        bourne::json value = object[cqdamimagecachemaxdimensionKey];




        ConfigNodePropertyString* obj = &cqdamimagecachemaxdimension;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamimagecachemaxmemory"] = getCqdamimagecachemaxmemory().toJson();






	object["cqdamimagecachemaxage"] = getCqdamimagecachemaxage().toJson();






	object["cqdamimagecachemaxdimension"] = getCqdamimagecachemaxdimension().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::getCqdamimagecachemaxmemory()
{
	return cqdamimagecachemaxmemory;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::setCqdamimagecachemaxmemory(ConfigNodePropertyInteger cqdamimagecachemaxmemory)
{
	this->cqdamimagecachemaxmemory = cqdamimagecachemaxmemory;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::getCqdamimagecachemaxage()
{
	return cqdamimagecachemaxage;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::setCqdamimagecachemaxage(ConfigNodePropertyInteger cqdamimagecachemaxage)
{
	this->cqdamimagecachemaxage = cqdamimagecachemaxage;
}

ConfigNodePropertyString
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::getCqdamimagecachemaxdimension()
{
	return cqdamimagecachemaxdimension;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::setCqdamimagecachemaxdimension(ConfigNodePropertyString cqdamimagecachemaxdimension)
{
	this->cqdamimagecachemaxdimension = cqdamimagecachemaxdimension;
}



