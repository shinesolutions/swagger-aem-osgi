

#include "ComDayCqDamHandlerStandardPdfPdfHandlerProperties.h"

using namespace Tiny;

ComDayCqDamHandlerStandardPdfPdfHandlerProperties::ComDayCqDamHandlerStandardPdfPdfHandlerProperties()
{
	rasterannotation = ConfigNodePropertyBoolean();
}

ComDayCqDamHandlerStandardPdfPdfHandlerProperties::ComDayCqDamHandlerStandardPdfPdfHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamHandlerStandardPdfPdfHandlerProperties::~ComDayCqDamHandlerStandardPdfPdfHandlerProperties()
{

}

void
ComDayCqDamHandlerStandardPdfPdfHandlerProperties::fromJson(std::string jsonObj)
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
ComDayCqDamHandlerStandardPdfPdfHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["rasterannotation"] = getRasterannotation().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamHandlerStandardPdfPdfHandlerProperties::getRasterannotation()
{
	return rasterannotation;
}

void
ComDayCqDamHandlerStandardPdfPdfHandlerProperties::setRasterannotation(ConfigNodePropertyBoolean rasterannotation)
{
	this->rasterannotation = rasterannotation;
}



