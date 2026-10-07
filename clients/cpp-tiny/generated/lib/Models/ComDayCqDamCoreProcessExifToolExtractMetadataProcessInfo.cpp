

#include "ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo.h"

using namespace Tiny;

ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties();
}

ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::~ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo()
{

}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo::setProperties(ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties properties)
{
	this->properties = properties;
}



