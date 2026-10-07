

#include "ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties();
}

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::~ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo()
{

}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo::setProperties(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties properties)
{
	this->properties = properties;
}



