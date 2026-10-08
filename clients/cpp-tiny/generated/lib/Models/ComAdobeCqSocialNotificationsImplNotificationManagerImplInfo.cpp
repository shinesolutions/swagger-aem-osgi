

#include "ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties();
}

ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::~ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo()
{

}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo::setProperties(ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties properties)
{
	this->properties = properties;
}



