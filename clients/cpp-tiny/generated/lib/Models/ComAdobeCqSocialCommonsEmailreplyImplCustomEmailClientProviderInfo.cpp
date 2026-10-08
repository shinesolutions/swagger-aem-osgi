

#include "ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::~ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties properties)
{
	this->properties = properties;
}



