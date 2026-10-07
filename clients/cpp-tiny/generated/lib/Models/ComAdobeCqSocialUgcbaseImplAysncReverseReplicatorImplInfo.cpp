

#include "ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties();
}

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::~ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo()
{

}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo::setProperties(ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties properties)
{
	this->properties = properties;
}



