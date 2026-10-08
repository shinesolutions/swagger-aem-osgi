

#include "ComDayCqDamHandlerFfmpegLocatorImplInfo.h"

using namespace Tiny;

ComDayCqDamHandlerFfmpegLocatorImplInfo::ComDayCqDamHandlerFfmpegLocatorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamHandlerFfmpegLocatorImplProperties();
}

ComDayCqDamHandlerFfmpegLocatorImplInfo::ComDayCqDamHandlerFfmpegLocatorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamHandlerFfmpegLocatorImplInfo::~ComDayCqDamHandlerFfmpegLocatorImplInfo()
{

}

void
ComDayCqDamHandlerFfmpegLocatorImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamHandlerFfmpegLocatorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamHandlerFfmpegLocatorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamHandlerFfmpegLocatorImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamHandlerFfmpegLocatorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamHandlerFfmpegLocatorImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamHandlerFfmpegLocatorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamHandlerFfmpegLocatorImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamHandlerFfmpegLocatorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamHandlerFfmpegLocatorImplProperties
ComDayCqDamHandlerFfmpegLocatorImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamHandlerFfmpegLocatorImplInfo::setProperties(ComDayCqDamHandlerFfmpegLocatorImplProperties properties)
{
	this->properties = properties;
}



