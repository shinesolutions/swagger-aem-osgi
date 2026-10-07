

#include "ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.h"

using namespace Tiny;

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties();
}

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::~ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo()
{

}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo::setProperties(ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties properties)
{
	this->properties = properties;
}



