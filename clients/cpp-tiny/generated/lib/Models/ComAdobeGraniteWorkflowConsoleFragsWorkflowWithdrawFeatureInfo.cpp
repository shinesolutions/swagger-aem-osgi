

#include "ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties();
}

ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::~ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo()
{

}

void
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo::setProperties(ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties properties)
{
	this->properties = properties;
}



