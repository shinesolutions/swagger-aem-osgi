

#include "ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties();
}

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::~ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo()
{

}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo::setProperties(ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties properties)
{
	this->properties = properties;
}



