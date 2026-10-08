

#include "ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties();
}

ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::~ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo()
{

}

void
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo::setProperties(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties properties)
{
	this->properties = properties;
}



