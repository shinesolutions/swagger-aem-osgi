

#include "ComAdobeCqAuditPurgeDamInfo.h"

using namespace Tiny;

ComAdobeCqAuditPurgeDamInfo::ComAdobeCqAuditPurgeDamInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqAuditPurgeDamProperties();
}

ComAdobeCqAuditPurgeDamInfo::ComAdobeCqAuditPurgeDamInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAuditPurgeDamInfo::~ComAdobeCqAuditPurgeDamInfo()
{

}

void
ComAdobeCqAuditPurgeDamInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqAuditPurgeDamProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqAuditPurgeDamInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqAuditPurgeDamInfo::getPid()
{
	return pid;
}

void
ComAdobeCqAuditPurgeDamInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqAuditPurgeDamInfo::getTitle()
{
	return title;
}

void
ComAdobeCqAuditPurgeDamInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqAuditPurgeDamInfo::getDescription()
{
	return description;
}

void
ComAdobeCqAuditPurgeDamInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqAuditPurgeDamProperties
ComAdobeCqAuditPurgeDamInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqAuditPurgeDamInfo::setProperties(ComAdobeCqAuditPurgeDamProperties properties)
{
	this->properties = properties;
}



