

#include "ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties();
}

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::~ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo()
{

}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::fromJson(std::string jsonObj)
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




        ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo::setProperties(ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties properties)
{
	this->properties = properties;
}



