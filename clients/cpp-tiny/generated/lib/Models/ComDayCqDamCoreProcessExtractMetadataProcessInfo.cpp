

#include "ComDayCqDamCoreProcessExtractMetadataProcessInfo.h"

using namespace Tiny;

ComDayCqDamCoreProcessExtractMetadataProcessInfo::ComDayCqDamCoreProcessExtractMetadataProcessInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreProcessExtractMetadataProcessProperties();
}

ComDayCqDamCoreProcessExtractMetadataProcessInfo::ComDayCqDamCoreProcessExtractMetadataProcessInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreProcessExtractMetadataProcessInfo::~ComDayCqDamCoreProcessExtractMetadataProcessInfo()
{

}

void
ComDayCqDamCoreProcessExtractMetadataProcessInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreProcessExtractMetadataProcessProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreProcessExtractMetadataProcessInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreProcessExtractMetadataProcessInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreProcessExtractMetadataProcessInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreProcessExtractMetadataProcessInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreProcessExtractMetadataProcessInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreProcessExtractMetadataProcessInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreProcessExtractMetadataProcessInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreProcessExtractMetadataProcessProperties
ComDayCqDamCoreProcessExtractMetadataProcessInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreProcessExtractMetadataProcessInfo::setProperties(ComDayCqDamCoreProcessExtractMetadataProcessProperties properties)
{
	this->properties = properties;
}



