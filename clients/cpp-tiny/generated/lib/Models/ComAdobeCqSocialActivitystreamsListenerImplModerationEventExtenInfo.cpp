

#include "ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties();
}

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::~ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo()
{

}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo::setProperties(ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties properties)
{
	this->properties = properties;
}



