

#include "ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties();
}

ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::~ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo()
{

}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo::setProperties(ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties properties)
{
	this->properties = properties;
}



