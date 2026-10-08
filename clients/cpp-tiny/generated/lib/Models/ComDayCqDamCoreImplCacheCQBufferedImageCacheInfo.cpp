

#include "ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties();
}

ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::~ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo()
{

}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo::setProperties(ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties properties)
{
	this->properties = properties;
}



