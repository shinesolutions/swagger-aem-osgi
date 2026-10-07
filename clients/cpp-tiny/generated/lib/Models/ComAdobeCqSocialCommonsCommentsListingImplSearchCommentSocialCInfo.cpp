

#include "ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties();
}

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::~ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo()
{

}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo::setProperties(ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties properties)
{
	this->properties = properties;
}



