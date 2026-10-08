

#include "ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties();
}

ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::~ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo()
{

}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo::setProperties(ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties properties)
{
	this->properties = properties;
}



