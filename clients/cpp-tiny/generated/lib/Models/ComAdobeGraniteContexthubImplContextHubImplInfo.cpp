

#include "ComAdobeGraniteContexthubImplContextHubImplInfo.h"

using namespace Tiny;

ComAdobeGraniteContexthubImplContextHubImplInfo::ComAdobeGraniteContexthubImplContextHubImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteContexthubImplContextHubImplProperties();
}

ComAdobeGraniteContexthubImplContextHubImplInfo::ComAdobeGraniteContexthubImplContextHubImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteContexthubImplContextHubImplInfo::~ComAdobeGraniteContexthubImplContextHubImplInfo()
{

}

void
ComAdobeGraniteContexthubImplContextHubImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteContexthubImplContextHubImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteContexthubImplContextHubImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteContexthubImplContextHubImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteContexthubImplContextHubImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteContexthubImplContextHubImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteContexthubImplContextHubImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteContexthubImplContextHubImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteContexthubImplContextHubImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteContexthubImplContextHubImplProperties
ComAdobeGraniteContexthubImplContextHubImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteContexthubImplContextHubImplInfo::setProperties(ComAdobeGraniteContexthubImplContextHubImplProperties properties)
{
	this->properties = properties;
}



