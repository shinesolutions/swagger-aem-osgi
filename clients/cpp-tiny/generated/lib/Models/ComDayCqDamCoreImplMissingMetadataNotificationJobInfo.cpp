

#include "ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::ComDayCqDamCoreImplMissingMetadataNotificationJobInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplMissingMetadataNotificationJobProperties();
}

ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::ComDayCqDamCoreImplMissingMetadataNotificationJobInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::~ComDayCqDamCoreImplMissingMetadataNotificationJobInfo()
{

}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplMissingMetadataNotificationJobProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo::setProperties(ComDayCqDamCoreImplMissingMetadataNotificationJobProperties properties)
{
	this->properties = properties;
}



