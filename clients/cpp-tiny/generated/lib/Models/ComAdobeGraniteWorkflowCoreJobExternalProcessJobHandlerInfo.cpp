

#include "ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties();
}

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::~ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo()
{

}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo::setProperties(ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties properties)
{
	this->properties = properties;
}



