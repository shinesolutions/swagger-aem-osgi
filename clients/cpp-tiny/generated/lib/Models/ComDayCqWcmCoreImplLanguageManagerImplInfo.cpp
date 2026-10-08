

#include "ComDayCqWcmCoreImplLanguageManagerImplInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplLanguageManagerImplInfo::ComDayCqWcmCoreImplLanguageManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplLanguageManagerImplProperties();
}

ComDayCqWcmCoreImplLanguageManagerImplInfo::ComDayCqWcmCoreImplLanguageManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplLanguageManagerImplInfo::~ComDayCqWcmCoreImplLanguageManagerImplInfo()
{

}

void
ComDayCqWcmCoreImplLanguageManagerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplLanguageManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplLanguageManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplLanguageManagerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplLanguageManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplLanguageManagerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplLanguageManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplLanguageManagerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplLanguageManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplLanguageManagerImplProperties
ComDayCqWcmCoreImplLanguageManagerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplLanguageManagerImplInfo::setProperties(ComDayCqWcmCoreImplLanguageManagerImplProperties properties)
{
	this->properties = properties;
}



