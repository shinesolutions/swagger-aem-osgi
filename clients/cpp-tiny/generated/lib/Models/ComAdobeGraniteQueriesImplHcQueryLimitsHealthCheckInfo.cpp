

#include "ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties();
}

ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::~ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo()
{

}

void
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo::setProperties(ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties properties)
{
	this->properties = properties;
}



