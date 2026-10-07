

#include "ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.h"

using namespace Tiny;

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties();
}

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::~ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo()
{

}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo::setProperties(ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties properties)
{
	this->properties = properties;
}



