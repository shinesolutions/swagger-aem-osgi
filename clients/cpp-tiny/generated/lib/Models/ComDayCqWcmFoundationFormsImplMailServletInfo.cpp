

#include "ComDayCqWcmFoundationFormsImplMailServletInfo.h"

using namespace Tiny;

ComDayCqWcmFoundationFormsImplMailServletInfo::ComDayCqWcmFoundationFormsImplMailServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmFoundationFormsImplMailServletProperties();
}

ComDayCqWcmFoundationFormsImplMailServletInfo::ComDayCqWcmFoundationFormsImplMailServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationFormsImplMailServletInfo::~ComDayCqWcmFoundationFormsImplMailServletInfo()
{

}

void
ComDayCqWcmFoundationFormsImplMailServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmFoundationFormsImplMailServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationFormsImplMailServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmFoundationFormsImplMailServletInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationFormsImplMailServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationFormsImplMailServletInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationFormsImplMailServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationFormsImplMailServletInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationFormsImplMailServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmFoundationFormsImplMailServletProperties
ComDayCqWcmFoundationFormsImplMailServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationFormsImplMailServletInfo::setProperties(ComDayCqWcmFoundationFormsImplMailServletProperties properties)
{
	this->properties = properties;
}



