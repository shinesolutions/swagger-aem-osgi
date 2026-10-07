

#include "ComAdobeCqSocialScoringImplScoringEventListenerInfo.h"

using namespace Tiny;

ComAdobeCqSocialScoringImplScoringEventListenerInfo::ComAdobeCqSocialScoringImplScoringEventListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialScoringImplScoringEventListenerProperties();
}

ComAdobeCqSocialScoringImplScoringEventListenerInfo::ComAdobeCqSocialScoringImplScoringEventListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialScoringImplScoringEventListenerInfo::~ComAdobeCqSocialScoringImplScoringEventListenerInfo()
{

}

void
ComAdobeCqSocialScoringImplScoringEventListenerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialScoringImplScoringEventListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialScoringImplScoringEventListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialScoringImplScoringEventListenerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialScoringImplScoringEventListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialScoringImplScoringEventListenerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialScoringImplScoringEventListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialScoringImplScoringEventListenerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialScoringImplScoringEventListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialScoringImplScoringEventListenerProperties
ComAdobeCqSocialScoringImplScoringEventListenerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialScoringImplScoringEventListenerInfo::setProperties(ComAdobeCqSocialScoringImplScoringEventListenerProperties properties)
{
	this->properties = properties;
}



