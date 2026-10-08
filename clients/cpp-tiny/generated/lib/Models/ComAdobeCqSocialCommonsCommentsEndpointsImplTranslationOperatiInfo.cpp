

#include "ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties();
}

ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::~ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo()
{

}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo::setProperties(ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties properties)
{
	this->properties = properties;
}



