

#include "MessagingUserComponentFactoryInfo.h"

using namespace Tiny;

MessagingUserComponentFactoryInfo::MessagingUserComponentFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = MessagingUserComponentFactoryProperties();
}

MessagingUserComponentFactoryInfo::MessagingUserComponentFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessagingUserComponentFactoryInfo::~MessagingUserComponentFactoryInfo()
{

}

void
MessagingUserComponentFactoryInfo::fromJson(std::string jsonObj)
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




        MessagingUserComponentFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessagingUserComponentFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
MessagingUserComponentFactoryInfo::getPid()
{
	return pid;
}

void
MessagingUserComponentFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
MessagingUserComponentFactoryInfo::getTitle()
{
	return title;
}

void
MessagingUserComponentFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
MessagingUserComponentFactoryInfo::getDescription()
{
	return description;
}

void
MessagingUserComponentFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

MessagingUserComponentFactoryProperties
MessagingUserComponentFactoryInfo::getProperties()
{
	return properties;
}

void
MessagingUserComponentFactoryInfo::setProperties(MessagingUserComponentFactoryProperties properties)
{
	this->properties = properties;
}



