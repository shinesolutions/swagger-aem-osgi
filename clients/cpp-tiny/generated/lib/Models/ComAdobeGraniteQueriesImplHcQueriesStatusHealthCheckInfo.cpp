

#include "ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties();
}

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::~ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo()
{

}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo::setProperties(ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties properties)
{
	this->properties = properties;
}



