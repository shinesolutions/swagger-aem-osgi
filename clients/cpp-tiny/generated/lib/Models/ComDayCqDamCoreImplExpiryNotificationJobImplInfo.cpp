

#include "ComDayCqDamCoreImplExpiryNotificationJobImplInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplExpiryNotificationJobImplInfo::ComDayCqDamCoreImplExpiryNotificationJobImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplExpiryNotificationJobImplProperties();
}

ComDayCqDamCoreImplExpiryNotificationJobImplInfo::ComDayCqDamCoreImplExpiryNotificationJobImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplExpiryNotificationJobImplInfo::~ComDayCqDamCoreImplExpiryNotificationJobImplInfo()
{

}

void
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplExpiryNotificationJobImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplExpiryNotificationJobImplProperties
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplInfo::setProperties(ComDayCqDamCoreImplExpiryNotificationJobImplProperties properties)
{
	this->properties = properties;
}



