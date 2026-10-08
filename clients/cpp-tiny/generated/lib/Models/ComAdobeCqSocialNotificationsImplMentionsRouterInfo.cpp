

#include "ComAdobeCqSocialNotificationsImplMentionsRouterInfo.h"

using namespace Tiny;

ComAdobeCqSocialNotificationsImplMentionsRouterInfo::ComAdobeCqSocialNotificationsImplMentionsRouterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialNotificationsImplMentionsRouterProperties();
}

ComAdobeCqSocialNotificationsImplMentionsRouterInfo::ComAdobeCqSocialNotificationsImplMentionsRouterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialNotificationsImplMentionsRouterInfo::~ComAdobeCqSocialNotificationsImplMentionsRouterInfo()
{

}

void
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialNotificationsImplMentionsRouterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialNotificationsImplMentionsRouterProperties
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialNotificationsImplMentionsRouterInfo::setProperties(ComAdobeCqSocialNotificationsImplMentionsRouterProperties properties)
{
	this->properties = properties;
}



