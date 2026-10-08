

#include "ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::~ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties properties)
{
	this->properties = properties;
}



