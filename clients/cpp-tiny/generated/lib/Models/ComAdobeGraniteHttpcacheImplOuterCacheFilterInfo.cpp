

#include "ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.h"

using namespace Tiny;

ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties();
}

ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::~ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo()
{

}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo::setProperties(ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties properties)
{
	this->properties = properties;
}



