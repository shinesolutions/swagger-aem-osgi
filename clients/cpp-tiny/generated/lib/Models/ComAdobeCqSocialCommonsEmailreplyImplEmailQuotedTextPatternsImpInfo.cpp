

#include "ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties();
}

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::~ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo::setProperties(ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties properties)
{
	this->properties = properties;
}



