

#include "ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.h"

using namespace Tiny;

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();
}

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::~ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo()
{

}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo::setProperties(ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties properties)
{
	this->properties = properties;
}



