

#include "ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties();
}

ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::~ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo()
{

}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo::setProperties(ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties properties)
{
	this->properties = properties;
}



