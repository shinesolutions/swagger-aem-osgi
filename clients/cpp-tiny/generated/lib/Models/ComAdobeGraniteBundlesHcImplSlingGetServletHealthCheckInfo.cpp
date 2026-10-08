

#include "ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties();
}

ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::~ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo()
{

}

void
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo::setProperties(ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties properties)
{
	this->properties = properties;
}



