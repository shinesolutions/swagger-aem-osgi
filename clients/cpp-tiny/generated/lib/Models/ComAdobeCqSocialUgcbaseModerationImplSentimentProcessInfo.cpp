

#include "ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties();
}

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::~ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo()
{

}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo::setProperties(ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties properties)
{
	this->properties = properties;
}



