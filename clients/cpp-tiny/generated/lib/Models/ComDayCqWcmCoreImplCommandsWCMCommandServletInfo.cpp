

#include "ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::ComDayCqWcmCoreImplCommandsWCMCommandServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplCommandsWCMCommandServletProperties();
}

ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::ComDayCqWcmCoreImplCommandsWCMCommandServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::~ComDayCqWcmCoreImplCommandsWCMCommandServletInfo()
{

}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplCommandsWCMCommandServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplCommandsWCMCommandServletProperties
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletInfo::setProperties(ComDayCqWcmCoreImplCommandsWCMCommandServletProperties properties)
{
	this->properties = properties;
}



