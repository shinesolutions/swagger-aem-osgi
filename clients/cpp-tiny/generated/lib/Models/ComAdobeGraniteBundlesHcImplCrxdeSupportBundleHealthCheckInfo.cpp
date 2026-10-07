

#include "ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties();
}

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::~ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo()
{

}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo::setProperties(ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties properties)
{
	this->properties = properties;
}



