

#include "ComDayCqDamCoreImplServletBinaryProviderServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletBinaryProviderServletInfo::ComDayCqDamCoreImplServletBinaryProviderServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletBinaryProviderServletProperties();
}

ComDayCqDamCoreImplServletBinaryProviderServletInfo::ComDayCqDamCoreImplServletBinaryProviderServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletBinaryProviderServletInfo::~ComDayCqDamCoreImplServletBinaryProviderServletInfo()
{

}

void
ComDayCqDamCoreImplServletBinaryProviderServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletBinaryProviderServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletBinaryProviderServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletBinaryProviderServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletBinaryProviderServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletBinaryProviderServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletBinaryProviderServletProperties
ComDayCqDamCoreImplServletBinaryProviderServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletInfo::setProperties(ComDayCqDamCoreImplServletBinaryProviderServletProperties properties)
{
	this->properties = properties;
}



