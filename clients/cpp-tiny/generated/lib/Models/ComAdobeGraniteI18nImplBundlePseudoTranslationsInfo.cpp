

#include "ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.h"

using namespace Tiny;

ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties();
}

ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::~ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo()
{

}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo::setProperties(ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties properties)
{
	this->properties = properties;
}



