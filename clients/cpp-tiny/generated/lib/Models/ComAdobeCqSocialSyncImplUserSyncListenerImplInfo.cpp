

#include "ComAdobeCqSocialSyncImplUserSyncListenerImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::ComAdobeCqSocialSyncImplUserSyncListenerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialSyncImplUserSyncListenerImplProperties();
}

ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::ComAdobeCqSocialSyncImplUserSyncListenerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::~ComAdobeCqSocialSyncImplUserSyncListenerImplInfo()
{

}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialSyncImplUserSyncListenerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplInfo::setProperties(ComAdobeCqSocialSyncImplUserSyncListenerImplProperties properties)
{
	this->properties = properties;
}



