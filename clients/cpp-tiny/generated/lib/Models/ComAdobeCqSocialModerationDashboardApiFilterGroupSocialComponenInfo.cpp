

#include "ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.h"

using namespace Tiny;

ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties();
}

ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::~ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo()
{

}

void
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo::setProperties(ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties properties)
{
	this->properties = properties;
}



