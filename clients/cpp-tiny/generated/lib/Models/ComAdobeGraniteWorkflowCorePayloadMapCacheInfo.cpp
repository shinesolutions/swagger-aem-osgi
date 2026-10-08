

#include "ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::ComAdobeGraniteWorkflowCorePayloadMapCacheInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowCorePayloadMapCacheProperties();
}

ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::ComAdobeGraniteWorkflowCorePayloadMapCacheInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::~ComAdobeGraniteWorkflowCorePayloadMapCacheInfo()
{

}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowCorePayloadMapCacheProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowCorePayloadMapCacheProperties
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::setProperties(ComAdobeGraniteWorkflowCorePayloadMapCacheProperties properties)
{
	this->properties = properties;
}



