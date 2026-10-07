

#include "ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.h"

using namespace Tiny;

ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties();
}

ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::~ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo()
{

}

void
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo::setProperties(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties properties)
{
	this->properties = properties;
}



