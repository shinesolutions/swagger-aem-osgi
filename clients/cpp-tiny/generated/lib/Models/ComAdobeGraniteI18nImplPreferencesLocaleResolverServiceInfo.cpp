

#include "ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.h"

using namespace Tiny;

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties();
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::~ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo()
{

}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::setProperties(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties properties)
{
	this->properties = properties;
}



