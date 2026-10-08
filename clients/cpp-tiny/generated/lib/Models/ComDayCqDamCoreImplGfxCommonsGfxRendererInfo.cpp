

#include "ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::ComDayCqDamCoreImplGfxCommonsGfxRendererInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplGfxCommonsGfxRendererProperties();
}

ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::ComDayCqDamCoreImplGfxCommonsGfxRendererInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::~ComDayCqDamCoreImplGfxCommonsGfxRendererInfo()
{

}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplGfxCommonsGfxRendererProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplGfxCommonsGfxRendererProperties
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplGfxCommonsGfxRendererInfo::setProperties(ComDayCqDamCoreImplGfxCommonsGfxRendererProperties properties)
{
	this->properties = properties;
}



