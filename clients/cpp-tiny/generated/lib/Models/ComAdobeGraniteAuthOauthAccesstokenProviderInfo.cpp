

#include "ComAdobeGraniteAuthOauthAccesstokenProviderInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthAccesstokenProviderInfo::ComAdobeGraniteAuthOauthAccesstokenProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthOauthAccesstokenProviderProperties();
}

ComAdobeGraniteAuthOauthAccesstokenProviderInfo::ComAdobeGraniteAuthOauthAccesstokenProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthAccesstokenProviderInfo::~ComAdobeGraniteAuthOauthAccesstokenProviderInfo()
{

}

void
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthOauthAccesstokenProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthOauthAccesstokenProviderProperties
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderInfo::setProperties(ComAdobeGraniteAuthOauthAccesstokenProviderProperties properties)
{
	this->properties = properties;
}



