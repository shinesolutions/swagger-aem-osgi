

#include "ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.h"

using namespace Tiny;

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();
}

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::~ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo()
{

}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::getPid()
{
	return pid;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::getTitle()
{
	return title;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::getDescription()
{
	return description;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo::setProperties(ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties properties)
{
	this->properties = properties;
}



