

#include "ComDayCqDamCoreImplLightboxLightboxServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplLightboxLightboxServletInfo::ComDayCqDamCoreImplLightboxLightboxServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplLightboxLightboxServletProperties();
}

ComDayCqDamCoreImplLightboxLightboxServletInfo::ComDayCqDamCoreImplLightboxLightboxServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplLightboxLightboxServletInfo::~ComDayCqDamCoreImplLightboxLightboxServletInfo()
{

}

void
ComDayCqDamCoreImplLightboxLightboxServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplLightboxLightboxServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplLightboxLightboxServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplLightboxLightboxServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplLightboxLightboxServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplLightboxLightboxServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplLightboxLightboxServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplLightboxLightboxServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplLightboxLightboxServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplLightboxLightboxServletProperties
ComDayCqDamCoreImplLightboxLightboxServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplLightboxLightboxServletInfo::setProperties(ComDayCqDamCoreImplLightboxLightboxServletProperties properties)
{
	this->properties = properties;
}



