

#include "ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties();
}

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::~ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo()
{

}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo::setProperties(ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties properties)
{
	this->properties = properties;
}



