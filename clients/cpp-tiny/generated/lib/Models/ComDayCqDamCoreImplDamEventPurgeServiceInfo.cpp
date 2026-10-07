

#include "ComDayCqDamCoreImplDamEventPurgeServiceInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplDamEventPurgeServiceInfo::ComDayCqDamCoreImplDamEventPurgeServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplDamEventPurgeServiceProperties();
}

ComDayCqDamCoreImplDamEventPurgeServiceInfo::ComDayCqDamCoreImplDamEventPurgeServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplDamEventPurgeServiceInfo::~ComDayCqDamCoreImplDamEventPurgeServiceInfo()
{

}

void
ComDayCqDamCoreImplDamEventPurgeServiceInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplDamEventPurgeServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplDamEventPurgeServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplDamEventPurgeServiceInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplDamEventPurgeServiceInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplDamEventPurgeServiceInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplDamEventPurgeServiceProperties
ComDayCqDamCoreImplDamEventPurgeServiceInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplDamEventPurgeServiceInfo::setProperties(ComDayCqDamCoreImplDamEventPurgeServiceProperties properties)
{
	this->properties = properties;
}



