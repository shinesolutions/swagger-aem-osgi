

#include "ComDayCqAuthImplCugCugSupportImplInfo.h"

using namespace Tiny;

ComDayCqAuthImplCugCugSupportImplInfo::ComDayCqAuthImplCugCugSupportImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAuthImplCugCugSupportImplProperties();
}

ComDayCqAuthImplCugCugSupportImplInfo::ComDayCqAuthImplCugCugSupportImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAuthImplCugCugSupportImplInfo::~ComDayCqAuthImplCugCugSupportImplInfo()
{

}

void
ComDayCqAuthImplCugCugSupportImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqAuthImplCugCugSupportImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAuthImplCugCugSupportImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAuthImplCugCugSupportImplInfo::getPid()
{
	return pid;
}

void
ComDayCqAuthImplCugCugSupportImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAuthImplCugCugSupportImplInfo::getTitle()
{
	return title;
}

void
ComDayCqAuthImplCugCugSupportImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAuthImplCugCugSupportImplInfo::getDescription()
{
	return description;
}

void
ComDayCqAuthImplCugCugSupportImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAuthImplCugCugSupportImplProperties
ComDayCqAuthImplCugCugSupportImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqAuthImplCugCugSupportImplInfo::setProperties(ComDayCqAuthImplCugCugSupportImplProperties properties)
{
	this->properties = properties;
}



