

#include "ComDayCqWcmCoreImplServletsFindReplaceServletInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsFindReplaceServletInfo::ComDayCqWcmCoreImplServletsFindReplaceServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplServletsFindReplaceServletProperties();
}

ComDayCqWcmCoreImplServletsFindReplaceServletInfo::ComDayCqWcmCoreImplServletsFindReplaceServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsFindReplaceServletInfo::~ComDayCqWcmCoreImplServletsFindReplaceServletInfo()
{

}

void
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplServletsFindReplaceServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplServletsFindReplaceServletProperties
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplServletsFindReplaceServletInfo::setProperties(ComDayCqWcmCoreImplServletsFindReplaceServletProperties properties)
{
	this->properties = properties;
}



