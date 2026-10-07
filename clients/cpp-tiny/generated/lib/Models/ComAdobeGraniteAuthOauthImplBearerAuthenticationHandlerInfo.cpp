

#include "ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties();
}

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::~ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo()
{

}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo::setProperties(ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties properties)
{
	this->properties = properties;
}



