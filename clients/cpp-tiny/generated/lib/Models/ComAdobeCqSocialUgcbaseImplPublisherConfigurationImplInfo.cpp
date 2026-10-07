

#include "ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties();
}

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::~ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo()
{

}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo::setProperties(ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties properties)
{
	this->properties = properties;
}



