

#include "ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::~ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties properties)
{
	this->properties = properties;
}



