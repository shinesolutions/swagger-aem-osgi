

#include "ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo.h"

using namespace Tiny;

ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties();
}

ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::~ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo()
{

}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo::setProperties(ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties properties)
{
	this->properties = properties;
}



