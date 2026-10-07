

#include "ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties()
{
	granitedata = ConfigNodePropertyArray();
}

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::~ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties()
{

}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *granitedataKey = "granite:data";

    if(object.has_key(granitedataKey))
    {
        bourne::json value = object[granitedataKey];




        ConfigNodePropertyArray* obj = &granitedata;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["granitedata"] = getGranitedata().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::getGranitedata()
{
	return granitedata;
}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::setGranitedata(ConfigNodePropertyArray granitedata)
{
	this->granitedata = granitedata;
}



