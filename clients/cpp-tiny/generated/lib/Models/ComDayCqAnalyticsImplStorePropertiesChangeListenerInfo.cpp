

#include "ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.h"

using namespace Tiny;

ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties();
}

ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::~ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo()
{

}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::fromJson(std::string jsonObj)
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




        ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo::setProperties(ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties properties)
{
	this->properties = properties;
}



