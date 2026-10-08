

#include "ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties();
}

ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::~ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo()
{

}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo::setProperties(ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties properties)
{
	this->properties = properties;
}



