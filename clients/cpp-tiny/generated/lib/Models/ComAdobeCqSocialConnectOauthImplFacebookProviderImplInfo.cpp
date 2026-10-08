

#include "ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties();
}

ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::~ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo()
{

}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo::setProperties(ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties properties)
{
	this->properties = properties;
}



