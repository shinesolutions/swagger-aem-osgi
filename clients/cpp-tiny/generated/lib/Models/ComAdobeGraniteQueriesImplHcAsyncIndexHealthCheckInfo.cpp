

#include "ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties();
}

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::~ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo()
{

}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo::setProperties(ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties properties)
{
	this->properties = properties;
}



