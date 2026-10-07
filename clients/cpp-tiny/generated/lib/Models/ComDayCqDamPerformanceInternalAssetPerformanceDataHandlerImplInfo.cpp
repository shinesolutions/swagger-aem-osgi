

#include "ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.h"

using namespace Tiny;

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties();
}

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::~ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo()
{

}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo::setProperties(ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties properties)
{
	this->properties = properties;
}



