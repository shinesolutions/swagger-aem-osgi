

#include "ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties();
}

ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::~ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo()
{

}

void
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo::setProperties(ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties properties)
{
	this->properties = properties;
}



