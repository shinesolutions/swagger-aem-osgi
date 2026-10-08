

#include "ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties();
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::~ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo()
{

}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::setProperties(ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties properties)
{
	this->properties = properties;
}



