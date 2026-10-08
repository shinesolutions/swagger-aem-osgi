

#include "ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties();
}

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::~ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo()
{

}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo::setProperties(ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties properties)
{
	this->properties = properties;
}



