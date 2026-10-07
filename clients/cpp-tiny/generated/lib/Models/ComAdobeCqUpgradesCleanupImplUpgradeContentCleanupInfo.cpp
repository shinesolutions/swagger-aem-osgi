

#include "ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.h"

using namespace Tiny;

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties();
}

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::~ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo()
{

}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::getPid()
{
	return pid;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::getTitle()
{
	return title;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::getDescription()
{
	return description;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo::setProperties(ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties properties)
{
	this->properties = properties;
}



