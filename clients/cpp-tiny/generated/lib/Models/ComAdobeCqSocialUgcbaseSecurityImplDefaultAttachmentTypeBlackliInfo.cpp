

#include "ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties();
}

ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::~ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo()
{

}

void
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo::setProperties(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties properties)
{
	this->properties = properties;
}



