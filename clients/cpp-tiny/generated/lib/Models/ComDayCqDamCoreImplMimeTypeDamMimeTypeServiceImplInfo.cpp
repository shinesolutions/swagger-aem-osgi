

#include "ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties();
}

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::~ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo()
{

}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo::setProperties(ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties properties)
{
	this->properties = properties;
}



