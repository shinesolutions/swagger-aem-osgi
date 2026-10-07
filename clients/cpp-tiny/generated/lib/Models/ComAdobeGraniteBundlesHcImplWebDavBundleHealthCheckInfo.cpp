

#include "ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties();
}

ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::~ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo()
{

}

void
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo::setProperties(ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties properties)
{
	this->properties = properties;
}



