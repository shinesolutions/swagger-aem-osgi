

#include "ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo.h"

using namespace Tiny;

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties();
}

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::~ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo()
{

}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo::setProperties(ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties properties)
{
	this->properties = properties;
}



