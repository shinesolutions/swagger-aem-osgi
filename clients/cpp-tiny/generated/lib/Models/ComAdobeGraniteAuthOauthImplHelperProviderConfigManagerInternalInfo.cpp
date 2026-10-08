

#include "ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties();
}

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::~ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo()
{

}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo::setProperties(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties properties)
{
	this->properties = properties;
}



