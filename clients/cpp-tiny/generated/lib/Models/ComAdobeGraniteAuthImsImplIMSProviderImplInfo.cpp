

#include "ComAdobeGraniteAuthImsImplIMSProviderImplInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplIMSProviderImplInfo::ComAdobeGraniteAuthImsImplIMSProviderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthImsImplIMSProviderImplProperties();
}

ComAdobeGraniteAuthImsImplIMSProviderImplInfo::ComAdobeGraniteAuthImsImplIMSProviderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplIMSProviderImplInfo::~ComAdobeGraniteAuthImsImplIMSProviderImplInfo()
{

}

void
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthImsImplIMSProviderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthImsImplIMSProviderImplProperties
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthImsImplIMSProviderImplInfo::setProperties(ComAdobeGraniteAuthImsImplIMSProviderImplProperties properties)
{
	this->properties = properties;
}



