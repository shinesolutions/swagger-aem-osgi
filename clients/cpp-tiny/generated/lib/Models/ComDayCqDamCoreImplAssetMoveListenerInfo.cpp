

#include "ComDayCqDamCoreImplAssetMoveListenerInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplAssetMoveListenerInfo::ComDayCqDamCoreImplAssetMoveListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplAssetMoveListenerProperties();
}

ComDayCqDamCoreImplAssetMoveListenerInfo::ComDayCqDamCoreImplAssetMoveListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplAssetMoveListenerInfo::~ComDayCqDamCoreImplAssetMoveListenerInfo()
{

}

void
ComDayCqDamCoreImplAssetMoveListenerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplAssetMoveListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplAssetMoveListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplAssetMoveListenerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplAssetMoveListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplAssetMoveListenerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplAssetMoveListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplAssetMoveListenerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplAssetMoveListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplAssetMoveListenerProperties
ComDayCqDamCoreImplAssetMoveListenerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplAssetMoveListenerInfo::setProperties(ComDayCqDamCoreImplAssetMoveListenerProperties properties)
{
	this->properties = properties;
}



