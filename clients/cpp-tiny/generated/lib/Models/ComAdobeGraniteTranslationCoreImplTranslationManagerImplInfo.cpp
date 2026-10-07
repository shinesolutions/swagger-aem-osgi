

#include "ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.h"

using namespace Tiny;

ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties();
}

ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::~ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo()
{

}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo::setProperties(ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties properties)
{
	this->properties = properties;
}



