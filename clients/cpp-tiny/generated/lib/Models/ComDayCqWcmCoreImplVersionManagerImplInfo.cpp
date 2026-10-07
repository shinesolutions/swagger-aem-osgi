

#include "ComDayCqWcmCoreImplVersionManagerImplInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplVersionManagerImplInfo::ComDayCqWcmCoreImplVersionManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplVersionManagerImplProperties();
}

ComDayCqWcmCoreImplVersionManagerImplInfo::ComDayCqWcmCoreImplVersionManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplVersionManagerImplInfo::~ComDayCqWcmCoreImplVersionManagerImplInfo()
{

}

void
ComDayCqWcmCoreImplVersionManagerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplVersionManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplVersionManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplVersionManagerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplVersionManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplVersionManagerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplVersionManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplVersionManagerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplVersionManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplVersionManagerImplProperties
ComDayCqWcmCoreImplVersionManagerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplVersionManagerImplInfo::setProperties(ComDayCqWcmCoreImplVersionManagerImplProperties properties)
{
	this->properties = properties;
}



