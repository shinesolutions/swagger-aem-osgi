

#include "ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties();
}

ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::~ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo()
{

}

void
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo::setProperties(ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties properties)
{
	this->properties = properties;
}



