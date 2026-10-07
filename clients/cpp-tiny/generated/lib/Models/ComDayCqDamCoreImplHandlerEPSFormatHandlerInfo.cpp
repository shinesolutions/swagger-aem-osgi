

#include "ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties();
}

ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::~ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo()
{

}

void
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo::setProperties(ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties properties)
{
	this->properties = properties;
}



