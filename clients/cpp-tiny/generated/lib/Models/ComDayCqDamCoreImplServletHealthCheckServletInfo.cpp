

#include "ComDayCqDamCoreImplServletHealthCheckServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletHealthCheckServletInfo::ComDayCqDamCoreImplServletHealthCheckServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletHealthCheckServletProperties();
}

ComDayCqDamCoreImplServletHealthCheckServletInfo::ComDayCqDamCoreImplServletHealthCheckServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletHealthCheckServletInfo::~ComDayCqDamCoreImplServletHealthCheckServletInfo()
{

}

void
ComDayCqDamCoreImplServletHealthCheckServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletHealthCheckServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletHealthCheckServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletHealthCheckServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletHealthCheckServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletHealthCheckServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletHealthCheckServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletHealthCheckServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletHealthCheckServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletHealthCheckServletProperties
ComDayCqDamCoreImplServletHealthCheckServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletHealthCheckServletInfo::setProperties(ComDayCqDamCoreImplServletHealthCheckServletProperties properties)
{
	this->properties = properties;
}



