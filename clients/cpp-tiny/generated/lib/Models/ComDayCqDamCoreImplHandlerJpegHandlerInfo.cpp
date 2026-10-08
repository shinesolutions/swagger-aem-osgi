

#include "ComDayCqDamCoreImplHandlerJpegHandlerInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplHandlerJpegHandlerInfo::ComDayCqDamCoreImplHandlerJpegHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplHandlerJpegHandlerProperties();
}

ComDayCqDamCoreImplHandlerJpegHandlerInfo::ComDayCqDamCoreImplHandlerJpegHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplHandlerJpegHandlerInfo::~ComDayCqDamCoreImplHandlerJpegHandlerInfo()
{

}

void
ComDayCqDamCoreImplHandlerJpegHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplHandlerJpegHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplHandlerJpegHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplHandlerJpegHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplHandlerJpegHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplHandlerJpegHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplHandlerJpegHandlerProperties
ComDayCqDamCoreImplHandlerJpegHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerInfo::setProperties(ComDayCqDamCoreImplHandlerJpegHandlerProperties properties)
{
	this->properties = properties;
}



