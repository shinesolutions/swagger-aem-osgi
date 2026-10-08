

#include "ComAdobeCqSocialSyncImplDiffChangesObserverInfo.h"

using namespace Tiny;

ComAdobeCqSocialSyncImplDiffChangesObserverInfo::ComAdobeCqSocialSyncImplDiffChangesObserverInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialSyncImplDiffChangesObserverProperties();
}

ComAdobeCqSocialSyncImplDiffChangesObserverInfo::ComAdobeCqSocialSyncImplDiffChangesObserverInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSyncImplDiffChangesObserverInfo::~ComAdobeCqSocialSyncImplDiffChangesObserverInfo()
{

}

void
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialSyncImplDiffChangesObserverProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialSyncImplDiffChangesObserverProperties
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverInfo::setProperties(ComAdobeCqSocialSyncImplDiffChangesObserverProperties properties)
{
	this->properties = properties;
}



