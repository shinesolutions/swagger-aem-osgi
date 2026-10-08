

#include "ComAdobeGraniteWorkflowCoreJobJobHandlerInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::ComAdobeGraniteWorkflowCoreJobJobHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowCoreJobJobHandlerProperties();
}

ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::ComAdobeGraniteWorkflowCoreJobJobHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::~ComAdobeGraniteWorkflowCoreJobJobHandlerInfo()
{

}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowCoreJobJobHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowCoreJobJobHandlerProperties
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerInfo::setProperties(ComAdobeGraniteWorkflowCoreJobJobHandlerProperties properties)
{
	this->properties = properties;
}



