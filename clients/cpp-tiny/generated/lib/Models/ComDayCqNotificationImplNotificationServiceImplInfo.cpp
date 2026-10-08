

#include "ComDayCqNotificationImplNotificationServiceImplInfo.h"

using namespace Tiny;

ComDayCqNotificationImplNotificationServiceImplInfo::ComDayCqNotificationImplNotificationServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqNotificationImplNotificationServiceImplProperties();
}

ComDayCqNotificationImplNotificationServiceImplInfo::ComDayCqNotificationImplNotificationServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqNotificationImplNotificationServiceImplInfo::~ComDayCqNotificationImplNotificationServiceImplInfo()
{

}

void
ComDayCqNotificationImplNotificationServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqNotificationImplNotificationServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqNotificationImplNotificationServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqNotificationImplNotificationServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqNotificationImplNotificationServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqNotificationImplNotificationServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqNotificationImplNotificationServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqNotificationImplNotificationServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqNotificationImplNotificationServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqNotificationImplNotificationServiceImplProperties
ComDayCqNotificationImplNotificationServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqNotificationImplNotificationServiceImplInfo::setProperties(ComDayCqNotificationImplNotificationServiceImplProperties properties)
{
	this->properties = properties;
}



