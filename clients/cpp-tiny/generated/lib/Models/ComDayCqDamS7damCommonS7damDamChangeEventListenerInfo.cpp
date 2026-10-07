

#include "ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo.h"

using namespace Tiny;

ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties();
}

ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::~ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo()
{

}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo::setProperties(ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties properties)
{
	this->properties = properties;
}



