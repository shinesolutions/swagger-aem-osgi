

#include "ComDayCqDamCommonsUtilImplAssetCacheImplInfo.h"

using namespace Tiny;

ComDayCqDamCommonsUtilImplAssetCacheImplInfo::ComDayCqDamCommonsUtilImplAssetCacheImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCommonsUtilImplAssetCacheImplProperties();
}

ComDayCqDamCommonsUtilImplAssetCacheImplInfo::ComDayCqDamCommonsUtilImplAssetCacheImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCommonsUtilImplAssetCacheImplInfo::~ComDayCqDamCommonsUtilImplAssetCacheImplInfo()
{

}

void
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCommonsUtilImplAssetCacheImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCommonsUtilImplAssetCacheImplProperties
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplInfo::setProperties(ComDayCqDamCommonsUtilImplAssetCacheImplProperties properties)
{
	this->properties = properties;
}



