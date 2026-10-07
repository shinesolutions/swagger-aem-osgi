

#include "ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties();
}

ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::~ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo()
{

}

void
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo::setProperties(ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties properties)
{
	this->properties = properties;
}



