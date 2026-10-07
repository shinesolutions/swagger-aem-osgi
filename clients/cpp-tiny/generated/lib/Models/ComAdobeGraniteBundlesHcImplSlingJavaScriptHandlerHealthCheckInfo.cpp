

#include "ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties();
}

ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::~ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo()
{

}

void
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo::setProperties(ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties properties)
{
	this->properties = properties;
}



