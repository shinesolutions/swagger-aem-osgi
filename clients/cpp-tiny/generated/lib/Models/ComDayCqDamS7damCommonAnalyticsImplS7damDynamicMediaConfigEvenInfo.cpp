

#include "ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.h"

using namespace Tiny;

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties();
}

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::~ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo()
{

}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::getPid()
{
	return pid;
}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::getTitle()
{
	return title;
}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::getDescription()
{
	return description;
}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo::setProperties(ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties properties)
{
	this->properties = properties;
}



