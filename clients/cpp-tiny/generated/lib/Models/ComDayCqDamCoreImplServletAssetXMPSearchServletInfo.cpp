

#include "ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::ComDayCqDamCoreImplServletAssetXMPSearchServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletAssetXMPSearchServletProperties();
}

ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::ComDayCqDamCoreImplServletAssetXMPSearchServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::~ComDayCqDamCoreImplServletAssetXMPSearchServletInfo()
{

}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletAssetXMPSearchServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletAssetXMPSearchServletProperties
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletInfo::setProperties(ComDayCqDamCoreImplServletAssetXMPSearchServletProperties properties)
{
	this->properties = properties;
}



