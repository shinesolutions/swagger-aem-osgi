

#include "ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties();
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::~ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo()
{

}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::setProperties(ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties properties)
{
	this->properties = properties;
}



