

#include "ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo.h"

using namespace Tiny;

ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties();
}

ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::~ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo()
{

}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo::setProperties(ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties properties)
{
	this->properties = properties;
}



