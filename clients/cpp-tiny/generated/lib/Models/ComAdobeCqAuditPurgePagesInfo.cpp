

#include "ComAdobeCqAuditPurgePagesInfo.h"

using namespace Tiny;

ComAdobeCqAuditPurgePagesInfo::ComAdobeCqAuditPurgePagesInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqAuditPurgePagesProperties();
}

ComAdobeCqAuditPurgePagesInfo::ComAdobeCqAuditPurgePagesInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAuditPurgePagesInfo::~ComAdobeCqAuditPurgePagesInfo()
{

}

void
ComAdobeCqAuditPurgePagesInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqAuditPurgePagesProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqAuditPurgePagesInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqAuditPurgePagesInfo::getPid()
{
	return pid;
}

void
ComAdobeCqAuditPurgePagesInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqAuditPurgePagesInfo::getTitle()
{
	return title;
}

void
ComAdobeCqAuditPurgePagesInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqAuditPurgePagesInfo::getDescription()
{
	return description;
}

void
ComAdobeCqAuditPurgePagesInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqAuditPurgePagesProperties
ComAdobeCqAuditPurgePagesInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqAuditPurgePagesInfo::setProperties(ComAdobeCqAuditPurgePagesProperties properties)
{
	this->properties = properties;
}



