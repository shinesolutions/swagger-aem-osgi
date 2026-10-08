

#include "ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties();
}

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::~ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo()
{

}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo::setProperties(ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties properties)
{
	this->properties = properties;
}



