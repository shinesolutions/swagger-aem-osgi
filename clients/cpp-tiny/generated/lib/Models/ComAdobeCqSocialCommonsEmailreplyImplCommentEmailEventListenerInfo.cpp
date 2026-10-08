

#include "ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::~ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties properties)
{
	this->properties = properties;
}



