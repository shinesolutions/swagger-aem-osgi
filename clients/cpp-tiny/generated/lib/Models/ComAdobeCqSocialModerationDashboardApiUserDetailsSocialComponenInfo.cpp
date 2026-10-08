

#include "ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.h"

using namespace Tiny;

ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties();
}

ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::~ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo()
{

}

void
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo::setProperties(ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties properties)
{
	this->properties = properties;
}



