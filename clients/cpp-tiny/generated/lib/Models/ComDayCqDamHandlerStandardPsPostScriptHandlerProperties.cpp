

#include "ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.h"

using namespace Tiny;

ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::ComDayCqDamHandlerStandardPsPostScriptHandlerProperties()
{
	rasterannotation = ConfigNodePropertyBoolean();
}

ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::ComDayCqDamHandlerStandardPsPostScriptHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::~ComDayCqDamHandlerStandardPsPostScriptHandlerProperties()
{

}

void
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rasterannotationKey = "raster.annotation";

    if(object.has_key(rasterannotationKey))
    {
        bourne::json value = object[rasterannotationKey];




        ConfigNodePropertyBoolean* obj = &rasterannotation;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["rasterannotation"] = getRasterannotation().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::getRasterannotation()
{
	return rasterannotation;
}

void
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::setRasterannotation(ConfigNodePropertyBoolean rasterannotation)
{
	this->rasterannotation = rasterannotation;
}



