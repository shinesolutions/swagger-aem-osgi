

#include "ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.h"

using namespace Tiny;

ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::ComAdobeGraniteHttpcacheFileFileCacheStoreInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteHttpcacheFileFileCacheStoreProperties();
}

ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::ComAdobeGraniteHttpcacheFileFileCacheStoreInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::~ComAdobeGraniteHttpcacheFileFileCacheStoreInfo()
{

}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteHttpcacheFileFileCacheStoreProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreInfo::setProperties(ComAdobeGraniteHttpcacheFileFileCacheStoreProperties properties)
{
	this->properties = properties;
}



