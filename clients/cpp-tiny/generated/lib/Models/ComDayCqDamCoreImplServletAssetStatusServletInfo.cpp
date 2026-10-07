

#include "ComDayCqDamCoreImplServletAssetStatusServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletAssetStatusServletInfo::ComDayCqDamCoreImplServletAssetStatusServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletAssetStatusServletProperties();
}

ComDayCqDamCoreImplServletAssetStatusServletInfo::ComDayCqDamCoreImplServletAssetStatusServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletAssetStatusServletInfo::~ComDayCqDamCoreImplServletAssetStatusServletInfo()
{

}

void
ComDayCqDamCoreImplServletAssetStatusServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletAssetStatusServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletAssetStatusServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletAssetStatusServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletAssetStatusServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletAssetStatusServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletAssetStatusServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletAssetStatusServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletAssetStatusServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletAssetStatusServletProperties
ComDayCqDamCoreImplServletAssetStatusServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletAssetStatusServletInfo::setProperties(ComDayCqDamCoreImplServletAssetStatusServletProperties properties)
{
	this->properties = properties;
}



