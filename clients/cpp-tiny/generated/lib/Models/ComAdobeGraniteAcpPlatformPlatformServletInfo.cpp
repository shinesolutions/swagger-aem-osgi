

#include "ComAdobeGraniteAcpPlatformPlatformServletInfo.h"

using namespace Tiny;

ComAdobeGraniteAcpPlatformPlatformServletInfo::ComAdobeGraniteAcpPlatformPlatformServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAcpPlatformPlatformServletProperties();
}

ComAdobeGraniteAcpPlatformPlatformServletInfo::ComAdobeGraniteAcpPlatformPlatformServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAcpPlatformPlatformServletInfo::~ComAdobeGraniteAcpPlatformPlatformServletInfo()
{

}

void
ComAdobeGraniteAcpPlatformPlatformServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAcpPlatformPlatformServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAcpPlatformPlatformServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAcpPlatformPlatformServletInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAcpPlatformPlatformServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAcpPlatformPlatformServletInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAcpPlatformPlatformServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAcpPlatformPlatformServletInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAcpPlatformPlatformServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAcpPlatformPlatformServletProperties
ComAdobeGraniteAcpPlatformPlatformServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAcpPlatformPlatformServletInfo::setProperties(ComAdobeGraniteAcpPlatformPlatformServletProperties properties)
{
	this->properties = properties;
}



