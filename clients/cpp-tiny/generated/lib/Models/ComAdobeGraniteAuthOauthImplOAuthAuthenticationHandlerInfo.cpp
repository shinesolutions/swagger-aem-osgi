

#include "ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties();
}

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::~ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo()
{

}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo::setProperties(ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties properties)
{
	this->properties = properties;
}



