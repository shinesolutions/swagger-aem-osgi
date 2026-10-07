

#include "ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties();
}

ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::~ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo()
{

}

void
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo::setProperties(ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties properties)
{
	this->properties = properties;
}



