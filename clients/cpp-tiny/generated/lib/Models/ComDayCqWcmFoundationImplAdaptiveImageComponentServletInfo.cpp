

#include "ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo.h"

using namespace Tiny;

ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties();
}

ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::~ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo()
{

}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo::setProperties(ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties properties)
{
	this->properties = properties;
}



