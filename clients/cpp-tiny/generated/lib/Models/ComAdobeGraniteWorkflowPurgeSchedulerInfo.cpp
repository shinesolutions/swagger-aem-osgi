

#include "ComAdobeGraniteWorkflowPurgeSchedulerInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowPurgeSchedulerInfo::ComAdobeGraniteWorkflowPurgeSchedulerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowPurgeSchedulerProperties();
}

ComAdobeGraniteWorkflowPurgeSchedulerInfo::ComAdobeGraniteWorkflowPurgeSchedulerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowPurgeSchedulerInfo::~ComAdobeGraniteWorkflowPurgeSchedulerInfo()
{

}

void
ComAdobeGraniteWorkflowPurgeSchedulerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowPurgeSchedulerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowPurgeSchedulerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowPurgeSchedulerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowPurgeSchedulerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowPurgeSchedulerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowPurgeSchedulerProperties
ComAdobeGraniteWorkflowPurgeSchedulerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowPurgeSchedulerInfo::setProperties(ComAdobeGraniteWorkflowPurgeSchedulerProperties properties)
{
	this->properties = properties;
}



