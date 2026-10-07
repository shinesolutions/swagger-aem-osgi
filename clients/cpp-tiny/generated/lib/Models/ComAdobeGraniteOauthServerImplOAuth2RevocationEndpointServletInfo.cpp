

#include "ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties();
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::~ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo()
{

}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::setProperties(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties properties)
{
	this->properties = properties;
}



