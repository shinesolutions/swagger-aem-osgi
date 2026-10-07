

#include "ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties();
}

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::~ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo()
{

}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo::setProperties(ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties properties)
{
	this->properties = properties;
}



