

#include "ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties();
}

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::~ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo()
{

}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo::setProperties(ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties properties)
{
	this->properties = properties;
}



