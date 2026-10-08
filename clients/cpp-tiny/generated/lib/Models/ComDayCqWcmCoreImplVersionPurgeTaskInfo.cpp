

#include "ComDayCqWcmCoreImplVersionPurgeTaskInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplVersionPurgeTaskInfo::ComDayCqWcmCoreImplVersionPurgeTaskInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplVersionPurgeTaskProperties();
}

ComDayCqWcmCoreImplVersionPurgeTaskInfo::ComDayCqWcmCoreImplVersionPurgeTaskInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplVersionPurgeTaskInfo::~ComDayCqWcmCoreImplVersionPurgeTaskInfo()
{

}

void
ComDayCqWcmCoreImplVersionPurgeTaskInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplVersionPurgeTaskProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplVersionPurgeTaskInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplVersionPurgeTaskInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplVersionPurgeTaskInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplVersionPurgeTaskInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplVersionPurgeTaskProperties
ComDayCqWcmCoreImplVersionPurgeTaskInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskInfo::setProperties(ComDayCqWcmCoreImplVersionPurgeTaskProperties properties)
{
	this->properties = properties;
}



