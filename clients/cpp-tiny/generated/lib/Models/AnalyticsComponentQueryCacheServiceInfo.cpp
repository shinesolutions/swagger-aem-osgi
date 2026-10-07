

#include "AnalyticsComponentQueryCacheServiceInfo.h"

using namespace Tiny;

AnalyticsComponentQueryCacheServiceInfo::AnalyticsComponentQueryCacheServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = AnalyticsComponentQueryCacheServiceProperties();
}

AnalyticsComponentQueryCacheServiceInfo::AnalyticsComponentQueryCacheServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

AnalyticsComponentQueryCacheServiceInfo::~AnalyticsComponentQueryCacheServiceInfo()
{

}

void
AnalyticsComponentQueryCacheServiceInfo::fromJson(std::string jsonObj)
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




        AnalyticsComponentQueryCacheServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
AnalyticsComponentQueryCacheServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
AnalyticsComponentQueryCacheServiceInfo::getPid()
{
	return pid;
}

void
AnalyticsComponentQueryCacheServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
AnalyticsComponentQueryCacheServiceInfo::getTitle()
{
	return title;
}

void
AnalyticsComponentQueryCacheServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
AnalyticsComponentQueryCacheServiceInfo::getDescription()
{
	return description;
}

void
AnalyticsComponentQueryCacheServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

AnalyticsComponentQueryCacheServiceProperties
AnalyticsComponentQueryCacheServiceInfo::getProperties()
{
	return properties;
}

void
AnalyticsComponentQueryCacheServiceInfo::setProperties(AnalyticsComponentQueryCacheServiceProperties properties)
{
	this->properties = properties;
}



