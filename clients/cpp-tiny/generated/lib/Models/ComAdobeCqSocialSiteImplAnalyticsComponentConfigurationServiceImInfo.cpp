

#include "ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.h"

using namespace Tiny;

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties();
}

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::~ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo()
{

}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo::setProperties(ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties properties)
{
	this->properties = properties;
}



