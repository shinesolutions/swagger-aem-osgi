

#include "ComDayCqDamCoreProcessMetadataProcessorProcessInfo.h"

using namespace Tiny;

ComDayCqDamCoreProcessMetadataProcessorProcessInfo::ComDayCqDamCoreProcessMetadataProcessorProcessInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreProcessMetadataProcessorProcessProperties();
}

ComDayCqDamCoreProcessMetadataProcessorProcessInfo::ComDayCqDamCoreProcessMetadataProcessorProcessInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreProcessMetadataProcessorProcessInfo::~ComDayCqDamCoreProcessMetadataProcessorProcessInfo()
{

}

void
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreProcessMetadataProcessorProcessProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreProcessMetadataProcessorProcessProperties
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessInfo::setProperties(ComDayCqDamCoreProcessMetadataProcessorProcessProperties properties)
{
	this->properties = properties;
}



