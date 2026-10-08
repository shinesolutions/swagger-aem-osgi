

#include "ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties();
}

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::~ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo()
{

}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo::setProperties(ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties properties)
{
	this->properties = properties;
}



