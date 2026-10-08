

#include "ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties();
}

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::~ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo()
{

}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo::setProperties(ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties properties)
{
	this->properties = properties;
}



