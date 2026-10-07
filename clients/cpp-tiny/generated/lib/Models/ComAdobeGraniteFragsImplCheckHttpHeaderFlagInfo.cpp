

#include "ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.h"

using namespace Tiny;

ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties();
}

ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::~ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo()
{

}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo::setProperties(ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties properties)
{
	this->properties = properties;
}



