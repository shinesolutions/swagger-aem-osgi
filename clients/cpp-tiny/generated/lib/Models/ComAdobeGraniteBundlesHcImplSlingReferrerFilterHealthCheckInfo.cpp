

#include "ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties();
}

ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::~ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo()
{

}

void
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo::setProperties(ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties properties)
{
	this->properties = properties;
}



