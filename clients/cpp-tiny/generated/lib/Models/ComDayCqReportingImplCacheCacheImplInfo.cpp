

#include "ComDayCqReportingImplCacheCacheImplInfo.h"

using namespace Tiny;

ComDayCqReportingImplCacheCacheImplInfo::ComDayCqReportingImplCacheCacheImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqReportingImplCacheCacheImplProperties();
}

ComDayCqReportingImplCacheCacheImplInfo::ComDayCqReportingImplCacheCacheImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReportingImplCacheCacheImplInfo::~ComDayCqReportingImplCacheCacheImplInfo()
{

}

void
ComDayCqReportingImplCacheCacheImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqReportingImplCacheCacheImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReportingImplCacheCacheImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqReportingImplCacheCacheImplInfo::getPid()
{
	return pid;
}

void
ComDayCqReportingImplCacheCacheImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqReportingImplCacheCacheImplInfo::getTitle()
{
	return title;
}

void
ComDayCqReportingImplCacheCacheImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqReportingImplCacheCacheImplInfo::getDescription()
{
	return description;
}

void
ComDayCqReportingImplCacheCacheImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqReportingImplCacheCacheImplProperties
ComDayCqReportingImplCacheCacheImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqReportingImplCacheCacheImplInfo::setProperties(ComDayCqReportingImplCacheCacheImplProperties properties)
{
	this->properties = properties;
}



