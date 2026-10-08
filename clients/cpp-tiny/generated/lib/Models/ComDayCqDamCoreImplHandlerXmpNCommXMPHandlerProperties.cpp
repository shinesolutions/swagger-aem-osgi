

#include "ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties()
{
	xmphandlercqformats = ConfigNodePropertyArray();
}

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::~ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties()
{

}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *xmphandlercqformatsKey = "xmphandler.cq.formats";

    if(object.has_key(xmphandlercqformatsKey))
    {
        bourne::json value = object[xmphandlercqformatsKey];




        ConfigNodePropertyArray* obj = &xmphandlercqformats;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["xmphandlercqformats"] = getXmphandlercqformats().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::getXmphandlercqformats()
{
	return xmphandlercqformats;
}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties::setXmphandlercqformats(ConfigNodePropertyArray xmphandlercqformats)
{
	this->xmphandlercqformats = xmphandlercqformats;
}



