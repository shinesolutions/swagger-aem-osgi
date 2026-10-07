

#include "ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties();
}

ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::~ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo()
{

}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo::setProperties(ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties properties)
{
	this->properties = properties;
}



