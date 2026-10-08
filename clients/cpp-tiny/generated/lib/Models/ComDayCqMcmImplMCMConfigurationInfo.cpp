

#include "ComDayCqMcmImplMCMConfigurationInfo.h"

using namespace Tiny;

ComDayCqMcmImplMCMConfigurationInfo::ComDayCqMcmImplMCMConfigurationInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMcmImplMCMConfigurationProperties();
}

ComDayCqMcmImplMCMConfigurationInfo::ComDayCqMcmImplMCMConfigurationInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmImplMCMConfigurationInfo::~ComDayCqMcmImplMCMConfigurationInfo()
{

}

void
ComDayCqMcmImplMCMConfigurationInfo::fromJson(std::string jsonObj)
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




        ComDayCqMcmImplMCMConfigurationProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmImplMCMConfigurationInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMcmImplMCMConfigurationInfo::getPid()
{
	return pid;
}

void
ComDayCqMcmImplMCMConfigurationInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMcmImplMCMConfigurationInfo::getTitle()
{
	return title;
}

void
ComDayCqMcmImplMCMConfigurationInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMcmImplMCMConfigurationInfo::getDescription()
{
	return description;
}

void
ComDayCqMcmImplMCMConfigurationInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMcmImplMCMConfigurationProperties
ComDayCqMcmImplMCMConfigurationInfo::getProperties()
{
	return properties;
}

void
ComDayCqMcmImplMCMConfigurationInfo::setProperties(ComDayCqMcmImplMCMConfigurationProperties properties)
{
	this->properties = properties;
}



