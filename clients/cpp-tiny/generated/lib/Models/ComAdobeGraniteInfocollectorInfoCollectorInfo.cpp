

#include "ComAdobeGraniteInfocollectorInfoCollectorInfo.h"

using namespace Tiny;

ComAdobeGraniteInfocollectorInfoCollectorInfo::ComAdobeGraniteInfocollectorInfoCollectorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteInfocollectorInfoCollectorProperties();
}

ComAdobeGraniteInfocollectorInfoCollectorInfo::ComAdobeGraniteInfocollectorInfoCollectorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteInfocollectorInfoCollectorInfo::~ComAdobeGraniteInfocollectorInfoCollectorInfo()
{

}

void
ComAdobeGraniteInfocollectorInfoCollectorInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteInfocollectorInfoCollectorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteInfocollectorInfoCollectorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteInfocollectorInfoCollectorInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteInfocollectorInfoCollectorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteInfocollectorInfoCollectorInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteInfocollectorInfoCollectorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteInfocollectorInfoCollectorInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteInfocollectorInfoCollectorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteInfocollectorInfoCollectorProperties
ComAdobeGraniteInfocollectorInfoCollectorInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteInfocollectorInfoCollectorInfo::setProperties(ComAdobeGraniteInfocollectorInfoCollectorProperties properties)
{
	this->properties = properties;
}



