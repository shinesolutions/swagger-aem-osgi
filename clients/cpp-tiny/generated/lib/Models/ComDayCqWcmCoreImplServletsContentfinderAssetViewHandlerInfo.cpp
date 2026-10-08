

#include "ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties();
}

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::~ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo()
{

}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo::setProperties(ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties properties)
{
	this->properties = properties;
}



