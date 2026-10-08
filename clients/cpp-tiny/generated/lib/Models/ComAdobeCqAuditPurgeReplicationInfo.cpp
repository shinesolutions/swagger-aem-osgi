

#include "ComAdobeCqAuditPurgeReplicationInfo.h"

using namespace Tiny;

ComAdobeCqAuditPurgeReplicationInfo::ComAdobeCqAuditPurgeReplicationInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqAuditPurgeReplicationProperties();
}

ComAdobeCqAuditPurgeReplicationInfo::ComAdobeCqAuditPurgeReplicationInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAuditPurgeReplicationInfo::~ComAdobeCqAuditPurgeReplicationInfo()
{

}

void
ComAdobeCqAuditPurgeReplicationInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqAuditPurgeReplicationProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqAuditPurgeReplicationInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqAuditPurgeReplicationInfo::getPid()
{
	return pid;
}

void
ComAdobeCqAuditPurgeReplicationInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqAuditPurgeReplicationInfo::getTitle()
{
	return title;
}

void
ComAdobeCqAuditPurgeReplicationInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqAuditPurgeReplicationInfo::getDescription()
{
	return description;
}

void
ComAdobeCqAuditPurgeReplicationInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqAuditPurgeReplicationProperties
ComAdobeCqAuditPurgeReplicationInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqAuditPurgeReplicationInfo::setProperties(ComAdobeCqAuditPurgeReplicationProperties properties)
{
	this->properties = properties;
}



