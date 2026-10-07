

#include "ComDayCqDamCommonsHandlerStandardImageHandlerInfo.h"

using namespace Tiny;

ComDayCqDamCommonsHandlerStandardImageHandlerInfo::ComDayCqDamCommonsHandlerStandardImageHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCommonsHandlerStandardImageHandlerProperties();
}

ComDayCqDamCommonsHandlerStandardImageHandlerInfo::ComDayCqDamCommonsHandlerStandardImageHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCommonsHandlerStandardImageHandlerInfo::~ComDayCqDamCommonsHandlerStandardImageHandlerInfo()
{

}

void
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCommonsHandlerStandardImageHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCommonsHandlerStandardImageHandlerProperties
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCommonsHandlerStandardImageHandlerInfo::setProperties(ComDayCqDamCommonsHandlerStandardImageHandlerProperties properties)
{
	this->properties = properties;
}



