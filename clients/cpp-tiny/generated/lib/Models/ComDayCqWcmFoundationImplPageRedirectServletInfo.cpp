

#include "ComDayCqWcmFoundationImplPageRedirectServletInfo.h"

using namespace Tiny;

ComDayCqWcmFoundationImplPageRedirectServletInfo::ComDayCqWcmFoundationImplPageRedirectServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmFoundationImplPageRedirectServletProperties();
}

ComDayCqWcmFoundationImplPageRedirectServletInfo::ComDayCqWcmFoundationImplPageRedirectServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationImplPageRedirectServletInfo::~ComDayCqWcmFoundationImplPageRedirectServletInfo()
{

}

void
ComDayCqWcmFoundationImplPageRedirectServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmFoundationImplPageRedirectServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationImplPageRedirectServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmFoundationImplPageRedirectServletInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationImplPageRedirectServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationImplPageRedirectServletInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationImplPageRedirectServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationImplPageRedirectServletInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationImplPageRedirectServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmFoundationImplPageRedirectServletProperties
ComDayCqWcmFoundationImplPageRedirectServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationImplPageRedirectServletInfo::setProperties(ComDayCqWcmFoundationImplPageRedirectServletProperties properties)
{
	this->properties = properties;
}



