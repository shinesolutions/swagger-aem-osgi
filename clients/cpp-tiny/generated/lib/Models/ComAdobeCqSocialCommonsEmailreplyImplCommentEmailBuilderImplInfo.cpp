

#include "ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::~ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties properties)
{
	this->properties = properties;
}



