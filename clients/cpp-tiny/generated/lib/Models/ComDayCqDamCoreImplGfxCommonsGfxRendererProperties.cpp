

#include "ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::ComDayCqDamCoreImplGfxCommonsGfxRendererProperties()
{
	skipbufferedcache = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::ComDayCqDamCoreImplGfxCommonsGfxRendererProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::~ComDayCqDamCoreImplGfxCommonsGfxRendererProperties()
{

}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *skipbufferedcacheKey = "skip.bufferedcache";

    if(object.has_key(skipbufferedcacheKey))
    {
        bourne::json value = object[skipbufferedcacheKey];




        ConfigNodePropertyBoolean* obj = &skipbufferedcache;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["skipbufferedcache"] = getSkipbufferedcache().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::getSkipbufferedcache()
{
	return skipbufferedcache;
}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererProperties::setSkipbufferedcache(ConfigNodePropertyBoolean skipbufferedcache)
{
	this->skipbufferedcache = skipbufferedcache;
}



