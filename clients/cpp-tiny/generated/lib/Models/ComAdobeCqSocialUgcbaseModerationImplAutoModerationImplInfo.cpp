

#include "ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties();
}

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::~ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo()
{

}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo::setProperties(ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties properties)
{
	this->properties = properties;
}



