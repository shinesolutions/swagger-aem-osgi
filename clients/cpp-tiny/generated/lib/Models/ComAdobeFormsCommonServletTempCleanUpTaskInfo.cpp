

#include "ComAdobeFormsCommonServletTempCleanUpTaskInfo.h"

using namespace Tiny;

ComAdobeFormsCommonServletTempCleanUpTaskInfo::ComAdobeFormsCommonServletTempCleanUpTaskInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeFormsCommonServletTempCleanUpTaskProperties();
}

ComAdobeFormsCommonServletTempCleanUpTaskInfo::ComAdobeFormsCommonServletTempCleanUpTaskInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFormsCommonServletTempCleanUpTaskInfo::~ComAdobeFormsCommonServletTempCleanUpTaskInfo()
{

}

void
ComAdobeFormsCommonServletTempCleanUpTaskInfo::fromJson(std::string jsonObj)
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




        ComAdobeFormsCommonServletTempCleanUpTaskProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFormsCommonServletTempCleanUpTaskInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeFormsCommonServletTempCleanUpTaskInfo::getPid()
{
	return pid;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeFormsCommonServletTempCleanUpTaskInfo::getTitle()
{
	return title;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeFormsCommonServletTempCleanUpTaskInfo::getDescription()
{
	return description;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeFormsCommonServletTempCleanUpTaskProperties
ComAdobeFormsCommonServletTempCleanUpTaskInfo::getProperties()
{
	return properties;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskInfo::setProperties(ComAdobeFormsCommonServletTempCleanUpTaskProperties properties)
{
	this->properties = properties;
}



