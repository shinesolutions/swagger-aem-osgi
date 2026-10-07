

#include "ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties();
}

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::~ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo()
{

}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo::setProperties(ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties properties)
{
	this->properties = properties;
}



