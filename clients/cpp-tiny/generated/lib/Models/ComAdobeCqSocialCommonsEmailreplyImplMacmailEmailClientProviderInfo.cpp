

#include "ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::~ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties properties)
{
	this->properties = properties;
}



