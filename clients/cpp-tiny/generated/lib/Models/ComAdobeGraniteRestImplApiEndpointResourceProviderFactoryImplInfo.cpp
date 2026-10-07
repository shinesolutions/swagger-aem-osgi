

#include "ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.h"

using namespace Tiny;

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties();
}

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::~ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo()
{

}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo::setProperties(ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties properties)
{
	this->properties = properties;
}



