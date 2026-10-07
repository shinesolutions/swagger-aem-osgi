

#include "ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::~ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties properties)
{
	this->properties = properties;
}



