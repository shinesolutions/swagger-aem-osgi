

#include "ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties();
}

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::~ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo()
{

}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo::setProperties(ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties properties)
{
	this->properties = properties;
}



