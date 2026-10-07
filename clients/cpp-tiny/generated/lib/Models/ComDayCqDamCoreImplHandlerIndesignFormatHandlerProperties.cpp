

#include "ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties()
{
	mimetype = ConfigNodePropertyArray();
}

ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::~ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties()
{

}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mimetypeKey = "mimetype";

    if(object.has_key(mimetypeKey))
    {
        bourne::json value = object[mimetypeKey];




        ConfigNodePropertyArray* obj = &mimetype;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["mimetype"] = getMimetype().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::getMimetype()
{
	return mimetype;
}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::setMimetype(ConfigNodePropertyArray mimetype)
{
	this->mimetype = mimetype;
}



