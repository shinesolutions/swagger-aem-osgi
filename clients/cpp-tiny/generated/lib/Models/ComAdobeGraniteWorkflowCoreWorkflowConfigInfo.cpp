

#include "ComAdobeGraniteWorkflowCoreWorkflowConfigInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::ComAdobeGraniteWorkflowCoreWorkflowConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowCoreWorkflowConfigProperties();
}

ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::ComAdobeGraniteWorkflowCoreWorkflowConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::~ComAdobeGraniteWorkflowCoreWorkflowConfigInfo()
{

}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowCoreWorkflowConfigProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowCoreWorkflowConfigProperties
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigInfo::setProperties(ComAdobeGraniteWorkflowCoreWorkflowConfigProperties properties)
{
	this->properties = properties;
}



