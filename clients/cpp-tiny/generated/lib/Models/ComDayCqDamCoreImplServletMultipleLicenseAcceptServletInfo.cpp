

#include "ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties();
}

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::~ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo()
{

}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo::setProperties(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties properties)
{
	this->properties = properties;
}



