

#include "ComDayCqDamCoreImplServletCompanionServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletCompanionServletInfo::ComDayCqDamCoreImplServletCompanionServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletCompanionServletProperties();
}

ComDayCqDamCoreImplServletCompanionServletInfo::ComDayCqDamCoreImplServletCompanionServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletCompanionServletInfo::~ComDayCqDamCoreImplServletCompanionServletInfo()
{

}

void
ComDayCqDamCoreImplServletCompanionServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletCompanionServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletCompanionServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletCompanionServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletCompanionServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletCompanionServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletCompanionServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletCompanionServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletCompanionServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletCompanionServletProperties
ComDayCqDamCoreImplServletCompanionServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletCompanionServletInfo::setProperties(ComDayCqDamCoreImplServletCompanionServletProperties properties)
{
	this->properties = properties;
}



