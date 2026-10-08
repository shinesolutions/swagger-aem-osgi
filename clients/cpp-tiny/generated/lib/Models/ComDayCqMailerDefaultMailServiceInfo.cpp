

#include "ComDayCqMailerDefaultMailServiceInfo.h"

using namespace Tiny;

ComDayCqMailerDefaultMailServiceInfo::ComDayCqMailerDefaultMailServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMailerDefaultMailServiceProperties();
}

ComDayCqMailerDefaultMailServiceInfo::ComDayCqMailerDefaultMailServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMailerDefaultMailServiceInfo::~ComDayCqMailerDefaultMailServiceInfo()
{

}

void
ComDayCqMailerDefaultMailServiceInfo::fromJson(std::string jsonObj)
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




        ComDayCqMailerDefaultMailServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMailerDefaultMailServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMailerDefaultMailServiceInfo::getPid()
{
	return pid;
}

void
ComDayCqMailerDefaultMailServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMailerDefaultMailServiceInfo::getTitle()
{
	return title;
}

void
ComDayCqMailerDefaultMailServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMailerDefaultMailServiceInfo::getDescription()
{
	return description;
}

void
ComDayCqMailerDefaultMailServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMailerDefaultMailServiceProperties
ComDayCqMailerDefaultMailServiceInfo::getProperties()
{
	return properties;
}

void
ComDayCqMailerDefaultMailServiceInfo::setProperties(ComDayCqMailerDefaultMailServiceProperties properties)
{
	this->properties = properties;
}



