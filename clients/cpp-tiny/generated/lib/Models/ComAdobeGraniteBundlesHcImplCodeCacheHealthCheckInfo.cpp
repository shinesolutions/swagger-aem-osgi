

#include "ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties();
}

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::~ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo()
{

}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo::setProperties(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties properties)
{
	this->properties = properties;
}



