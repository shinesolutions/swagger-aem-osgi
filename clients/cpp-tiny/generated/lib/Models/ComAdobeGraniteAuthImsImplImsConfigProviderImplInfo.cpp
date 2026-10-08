

#include "ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties();
}

ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::~ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo()
{

}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo::setProperties(ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties properties)
{
	this->properties = properties;
}



