

#include "ComDayCqDamCoreImplDamEventRecorderImplInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplDamEventRecorderImplInfo::ComDayCqDamCoreImplDamEventRecorderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplDamEventRecorderImplProperties();
}

ComDayCqDamCoreImplDamEventRecorderImplInfo::ComDayCqDamCoreImplDamEventRecorderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplDamEventRecorderImplInfo::~ComDayCqDamCoreImplDamEventRecorderImplInfo()
{

}

void
ComDayCqDamCoreImplDamEventRecorderImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplDamEventRecorderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplDamEventRecorderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplDamEventRecorderImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplDamEventRecorderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplDamEventRecorderImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplDamEventRecorderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplDamEventRecorderImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplDamEventRecorderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplDamEventRecorderImplProperties
ComDayCqDamCoreImplDamEventRecorderImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplDamEventRecorderImplInfo::setProperties(ComDayCqDamCoreImplDamEventRecorderImplProperties properties)
{
	this->properties = properties;
}



