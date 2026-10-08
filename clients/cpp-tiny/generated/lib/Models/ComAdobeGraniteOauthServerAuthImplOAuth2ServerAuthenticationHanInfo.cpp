

#include "ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.h"

using namespace Tiny;

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties();
}

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::~ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo()
{

}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo::setProperties(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties properties)
{
	this->properties = properties;
}



