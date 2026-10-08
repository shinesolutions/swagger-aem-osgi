

#include "ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.h"

using namespace Tiny;

ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::ComDayCqTaggingImplJcrTagManagerFactoryImplProperties()
{
	validationenabled = ConfigNodePropertyBoolean();
}

ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::ComDayCqTaggingImplJcrTagManagerFactoryImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::~ComDayCqTaggingImplJcrTagManagerFactoryImplProperties()
{

}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *validationenabledKey = "validation.enabled";

    if(object.has_key(validationenabledKey))
    {
        bourne::json value = object[validationenabledKey];




        ConfigNodePropertyBoolean* obj = &validationenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["validationenabled"] = getValidationenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::getValidationenabled()
{
	return validationenabled;
}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::setValidationenabled(ConfigNodePropertyBoolean validationenabled)
{
	this->validationenabled = validationenabled;
}



