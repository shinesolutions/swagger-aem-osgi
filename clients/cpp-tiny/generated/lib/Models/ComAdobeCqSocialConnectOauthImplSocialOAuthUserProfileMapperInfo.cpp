

#include "ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.h"

using namespace Tiny;

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties();
}

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::~ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo()
{

}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo::setProperties(ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties properties)
{
	this->properties = properties;
}



