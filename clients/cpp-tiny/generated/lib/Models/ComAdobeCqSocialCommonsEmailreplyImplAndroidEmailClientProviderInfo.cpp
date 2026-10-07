

#include "ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::~ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties properties)
{
	this->properties = properties;
}



