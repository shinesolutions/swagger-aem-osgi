

#include "ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo.h"

using namespace Tiny;

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties();
}

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::~ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo()
{

}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo::setProperties(ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties properties)
{
	this->properties = properties;
}



