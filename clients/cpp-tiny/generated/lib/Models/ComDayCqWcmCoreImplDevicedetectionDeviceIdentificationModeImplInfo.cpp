

#include "ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties();
}

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::~ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo()
{

}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo::setProperties(ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties properties)
{
	this->properties = properties;
}



