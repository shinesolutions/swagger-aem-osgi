

#include "ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties()
{
	scene7FlashTemplatesrti = ConfigNodePropertyString();
	scene7FlashTemplatesrsi = ConfigNodePropertyString();
	scene7FlashTemplatesrb = ConfigNodePropertyString();
	scene7FlashTemplatesrurl = ConfigNodePropertyString();
	scene7FlashTemplateurlFormatParameter = ConfigNodePropertyString();
}

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::~ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties()
{

}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scene7FlashTemplatesrtiKey = "scene7FlashTemplates.rti";

    if(object.has_key(scene7FlashTemplatesrtiKey))
    {
        bourne::json value = object[scene7FlashTemplatesrtiKey];




        ConfigNodePropertyString* obj = &scene7FlashTemplatesrti;
		obj->fromJson(value.dump());

    }

    const char *scene7FlashTemplatesrsiKey = "scene7FlashTemplates.rsi";

    if(object.has_key(scene7FlashTemplatesrsiKey))
    {
        bourne::json value = object[scene7FlashTemplatesrsiKey];




        ConfigNodePropertyString* obj = &scene7FlashTemplatesrsi;
		obj->fromJson(value.dump());

    }

    const char *scene7FlashTemplatesrbKey = "scene7FlashTemplates.rb";

    if(object.has_key(scene7FlashTemplatesrbKey))
    {
        bourne::json value = object[scene7FlashTemplatesrbKey];




        ConfigNodePropertyString* obj = &scene7FlashTemplatesrb;
		obj->fromJson(value.dump());

    }

    const char *scene7FlashTemplatesrurlKey = "scene7FlashTemplates.rurl";

    if(object.has_key(scene7FlashTemplatesrurlKey))
    {
        bourne::json value = object[scene7FlashTemplatesrurlKey];




        ConfigNodePropertyString* obj = &scene7FlashTemplatesrurl;
		obj->fromJson(value.dump());

    }

    const char *scene7FlashTemplateurlFormatParameterKey = "scene7FlashTemplate.urlFormatParameter";

    if(object.has_key(scene7FlashTemplateurlFormatParameterKey))
    {
        bourne::json value = object[scene7FlashTemplateurlFormatParameterKey];




        ConfigNodePropertyString* obj = &scene7FlashTemplateurlFormatParameter;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["scene7FlashTemplatesrti"] = getScene7FlashTemplatesrti().toJson();






	object["scene7FlashTemplatesrsi"] = getScene7FlashTemplatesrsi().toJson();






	object["scene7FlashTemplatesrb"] = getScene7FlashTemplatesrb().toJson();






	object["scene7FlashTemplatesrurl"] = getScene7FlashTemplatesrurl().toJson();






	object["scene7FlashTemplateurlFormatParameter"] = getScene7FlashTemplateurlFormatParameter().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplatesrti()
{
	return scene7FlashTemplatesrti;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplatesrti(ConfigNodePropertyString scene7FlashTemplatesrti)
{
	this->scene7FlashTemplatesrti = scene7FlashTemplatesrti;
}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplatesrsi()
{
	return scene7FlashTemplatesrsi;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplatesrsi(ConfigNodePropertyString scene7FlashTemplatesrsi)
{
	this->scene7FlashTemplatesrsi = scene7FlashTemplatesrsi;
}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplatesrb()
{
	return scene7FlashTemplatesrb;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplatesrb(ConfigNodePropertyString scene7FlashTemplatesrb)
{
	this->scene7FlashTemplatesrb = scene7FlashTemplatesrb;
}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplatesrurl()
{
	return scene7FlashTemplatesrurl;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplatesrurl(ConfigNodePropertyString scene7FlashTemplatesrurl)
{
	this->scene7FlashTemplatesrurl = scene7FlashTemplatesrurl;
}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplateurlFormatParameter()
{
	return scene7FlashTemplateurlFormatParameter;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplateurlFormatParameter(ConfigNodePropertyString scene7FlashTemplateurlFormatParameter)
{
	this->scene7FlashTemplateurlFormatParameter = scene7FlashTemplateurlFormatParameter;
}



