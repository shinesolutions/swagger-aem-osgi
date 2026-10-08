

#include "ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties::ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties()
{
	mimetype = ConfigNodePropertyString();
}

ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties::ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties::~ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties()
{

}

void
ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mimetypeKey = "mimetype";

    if(object.has_key(mimetypeKey))
    {
        bourne::json value = object[mimetypeKey];




        ConfigNodePropertyString* obj = &mimetype;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["mimetype"] = getMimetype().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties::getMimetype()
{
	return mimetype;
}

void
ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties::setMimetype(ConfigNodePropertyString mimetype)
{
	this->mimetype = mimetype;
}



