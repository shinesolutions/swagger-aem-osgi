

#include "ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.h"

using namespace Tiny;

ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties();
}

ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::~ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo()
{

}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo::setProperties(ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties properties)
{
	this->properties = properties;
}



