

#include "ComDayCommonsHttpclientInfo.h"

using namespace Tiny;

ComDayCommonsHttpclientInfo::ComDayCommonsHttpclientInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCommonsHttpclientProperties();
}

ComDayCommonsHttpclientInfo::ComDayCommonsHttpclientInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCommonsHttpclientInfo::~ComDayCommonsHttpclientInfo()
{

}

void
ComDayCommonsHttpclientInfo::fromJson(std::string jsonObj)
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




        ComDayCommonsHttpclientProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCommonsHttpclientInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCommonsHttpclientInfo::getPid()
{
	return pid;
}

void
ComDayCommonsHttpclientInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCommonsHttpclientInfo::getTitle()
{
	return title;
}

void
ComDayCommonsHttpclientInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCommonsHttpclientInfo::getDescription()
{
	return description;
}

void
ComDayCommonsHttpclientInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCommonsHttpclientProperties
ComDayCommonsHttpclientInfo::getProperties()
{
	return properties;
}

void
ComDayCommonsHttpclientInfo::setProperties(ComDayCommonsHttpclientProperties properties)
{
	this->properties = properties;
}



