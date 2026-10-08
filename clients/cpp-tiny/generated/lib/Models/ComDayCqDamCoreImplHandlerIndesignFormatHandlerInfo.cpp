

#include "ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties();
}

ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::~ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo()
{

}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::setProperties(ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties properties)
{
	this->properties = properties;
}



