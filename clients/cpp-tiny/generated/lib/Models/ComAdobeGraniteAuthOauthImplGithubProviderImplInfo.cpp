

#include "ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::ComAdobeGraniteAuthOauthImplGithubProviderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthOauthImplGithubProviderImplProperties();
}

ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::ComAdobeGraniteAuthOauthImplGithubProviderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::~ComAdobeGraniteAuthOauthImplGithubProviderImplInfo()
{

}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthOauthImplGithubProviderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplInfo::setProperties(ComAdobeGraniteAuthOauthImplGithubProviderImplProperties properties)
{
	this->properties = properties;
}



