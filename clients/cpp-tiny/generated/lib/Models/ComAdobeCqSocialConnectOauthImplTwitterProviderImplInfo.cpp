

#include "ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
}

ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::~ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo()
{

}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo::setProperties(ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties properties)
{
	this->properties = properties;
}



