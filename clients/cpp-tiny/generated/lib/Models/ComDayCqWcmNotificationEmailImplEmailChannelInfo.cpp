

#include "ComDayCqWcmNotificationEmailImplEmailChannelInfo.h"

using namespace Tiny;

ComDayCqWcmNotificationEmailImplEmailChannelInfo::ComDayCqWcmNotificationEmailImplEmailChannelInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmNotificationEmailImplEmailChannelProperties();
}

ComDayCqWcmNotificationEmailImplEmailChannelInfo::ComDayCqWcmNotificationEmailImplEmailChannelInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmNotificationEmailImplEmailChannelInfo::~ComDayCqWcmNotificationEmailImplEmailChannelInfo()
{

}

void
ComDayCqWcmNotificationEmailImplEmailChannelInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmNotificationEmailImplEmailChannelProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmNotificationEmailImplEmailChannelInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmNotificationEmailImplEmailChannelInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmNotificationEmailImplEmailChannelInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmNotificationEmailImplEmailChannelInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmNotificationEmailImplEmailChannelInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmNotificationEmailImplEmailChannelInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmNotificationEmailImplEmailChannelInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmNotificationEmailImplEmailChannelProperties
ComDayCqWcmNotificationEmailImplEmailChannelInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmNotificationEmailImplEmailChannelInfo::setProperties(ComDayCqWcmNotificationEmailImplEmailChannelProperties properties)
{
	this->properties = properties;
}



