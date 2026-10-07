

#include "ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.h"

using namespace Tiny;

ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties()
{
	processlabel = ConfigNodePropertyString();
	extractpages = ConfigNodePropertyBoolean();
}

ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::~ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties()
{

}

void
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *processlabelKey = "process.label";

    if(object.has_key(processlabelKey))
    {
        bourne::json value = object[processlabelKey];




        ConfigNodePropertyString* obj = &processlabel;
		obj->fromJson(value.dump());

    }

    const char *extractpagesKey = "extract.pages";

    if(object.has_key(extractpagesKey))
    {
        bourne::json value = object[extractpagesKey];




        ConfigNodePropertyBoolean* obj = &extractpages;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["processlabel"] = getProcesslabel().toJson();






	object["extractpages"] = getExtractpages().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::setProcesslabel(ConfigNodePropertyString processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyBoolean
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::getExtractpages()
{
	return extractpages;
}

void
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::setExtractpages(ConfigNodePropertyBoolean extractpages)
{
	this->extractpages = extractpages;
}



