

#include "ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties();
}

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::~ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo()
{

}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo::setProperties(ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties properties)
{
	this->properties = properties;
}



