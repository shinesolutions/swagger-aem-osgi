

#include "ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties();
}

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::~ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo()
{

}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::fromJson(std::string jsonObj)
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




        ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo::setProperties(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties properties)
{
	this->properties = properties;
}



