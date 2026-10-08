

#include "ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.h"

using namespace Tiny;

ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties();
}

ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::~ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo()
{

}

void
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo::setProperties(ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties properties)
{
	this->properties = properties;
}



