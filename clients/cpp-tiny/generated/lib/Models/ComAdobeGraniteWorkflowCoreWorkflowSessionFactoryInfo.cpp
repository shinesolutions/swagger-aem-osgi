

#include "ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties();
}

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::~ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo()
{

}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo::setProperties(ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties properties)
{
	this->properties = properties;
}



