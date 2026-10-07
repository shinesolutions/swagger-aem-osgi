

#include "ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.h"

using namespace Tiny;

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties();
}

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::~ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo()
{

}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo::setProperties(ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties properties)
{
	this->properties = properties;
}



