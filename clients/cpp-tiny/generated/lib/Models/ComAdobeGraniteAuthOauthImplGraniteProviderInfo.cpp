

#include "ComAdobeGraniteAuthOauthImplGraniteProviderInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplGraniteProviderInfo::ComAdobeGraniteAuthOauthImplGraniteProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthOauthImplGraniteProviderProperties();
}

ComAdobeGraniteAuthOauthImplGraniteProviderInfo::ComAdobeGraniteAuthOauthImplGraniteProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplGraniteProviderInfo::~ComAdobeGraniteAuthOauthImplGraniteProviderInfo()
{

}

void
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthOauthImplGraniteProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthOauthImplGraniteProviderProperties
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthOauthImplGraniteProviderInfo::setProperties(ComAdobeGraniteAuthOauthImplGraniteProviderProperties properties)
{
	this->properties = properties;
}



