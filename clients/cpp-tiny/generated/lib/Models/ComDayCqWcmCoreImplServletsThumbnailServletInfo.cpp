

#include "ComDayCqWcmCoreImplServletsThumbnailServletInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsThumbnailServletInfo::ComDayCqWcmCoreImplServletsThumbnailServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplServletsThumbnailServletProperties();
}

ComDayCqWcmCoreImplServletsThumbnailServletInfo::ComDayCqWcmCoreImplServletsThumbnailServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsThumbnailServletInfo::~ComDayCqWcmCoreImplServletsThumbnailServletInfo()
{

}

void
ComDayCqWcmCoreImplServletsThumbnailServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplServletsThumbnailServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsThumbnailServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplServletsThumbnailServletInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplServletsThumbnailServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplServletsThumbnailServletInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplServletsThumbnailServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplServletsThumbnailServletInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplServletsThumbnailServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplServletsThumbnailServletProperties
ComDayCqWcmCoreImplServletsThumbnailServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplServletsThumbnailServletInfo::setProperties(ComDayCqWcmCoreImplServletsThumbnailServletProperties properties)
{
	this->properties = properties;
}



