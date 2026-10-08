

#include "ComDayCqDamCoreImplRenditionMakerImplInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplRenditionMakerImplInfo::ComDayCqDamCoreImplRenditionMakerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplRenditionMakerImplProperties();
}

ComDayCqDamCoreImplRenditionMakerImplInfo::ComDayCqDamCoreImplRenditionMakerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplRenditionMakerImplInfo::~ComDayCqDamCoreImplRenditionMakerImplInfo()
{

}

void
ComDayCqDamCoreImplRenditionMakerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplRenditionMakerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplRenditionMakerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplRenditionMakerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplRenditionMakerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplRenditionMakerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplRenditionMakerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplRenditionMakerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplRenditionMakerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplRenditionMakerImplProperties
ComDayCqDamCoreImplRenditionMakerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplRenditionMakerImplInfo::setProperties(ComDayCqDamCoreImplRenditionMakerImplProperties properties)
{
	this->properties = properties;
}



