

#include "ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::~ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties properties)
{
	this->properties = properties;
}



