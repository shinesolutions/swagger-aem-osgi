

#include "ComAdobeGraniteAuthOauthProviderInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthProviderInfo::ComAdobeGraniteAuthOauthProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthOauthProviderProperties();
}

ComAdobeGraniteAuthOauthProviderInfo::ComAdobeGraniteAuthOauthProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthProviderInfo::~ComAdobeGraniteAuthOauthProviderInfo()
{

}

void
ComAdobeGraniteAuthOauthProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthOauthProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthOauthProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthOauthProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthOauthProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthOauthProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthOauthProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthOauthProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthOauthProviderProperties
ComAdobeGraniteAuthOauthProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthOauthProviderInfo::setProperties(ComAdobeGraniteAuthOauthProviderProperties properties)
{
	this->properties = properties;
}



