

#include "ComAdobeGraniteFragsImplRandomFeatureInfo.h"

using namespace Tiny;

ComAdobeGraniteFragsImplRandomFeatureInfo::ComAdobeGraniteFragsImplRandomFeatureInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteFragsImplRandomFeatureProperties();
}

ComAdobeGraniteFragsImplRandomFeatureInfo::ComAdobeGraniteFragsImplRandomFeatureInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteFragsImplRandomFeatureInfo::~ComAdobeGraniteFragsImplRandomFeatureInfo()
{

}

void
ComAdobeGraniteFragsImplRandomFeatureInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteFragsImplRandomFeatureProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteFragsImplRandomFeatureInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteFragsImplRandomFeatureInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteFragsImplRandomFeatureInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteFragsImplRandomFeatureInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteFragsImplRandomFeatureInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteFragsImplRandomFeatureInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteFragsImplRandomFeatureInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteFragsImplRandomFeatureProperties
ComAdobeGraniteFragsImplRandomFeatureInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteFragsImplRandomFeatureInfo::setProperties(ComAdobeGraniteFragsImplRandomFeatureProperties properties)
{
	this->properties = properties;
}



