

#include "ComAdobeCqProjectsPurgeSchedulerInfo.h"

using namespace Tiny;

ComAdobeCqProjectsPurgeSchedulerInfo::ComAdobeCqProjectsPurgeSchedulerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqProjectsPurgeSchedulerProperties();
}

ComAdobeCqProjectsPurgeSchedulerInfo::ComAdobeCqProjectsPurgeSchedulerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqProjectsPurgeSchedulerInfo::~ComAdobeCqProjectsPurgeSchedulerInfo()
{

}

void
ComAdobeCqProjectsPurgeSchedulerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqProjectsPurgeSchedulerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqProjectsPurgeSchedulerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqProjectsPurgeSchedulerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqProjectsPurgeSchedulerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqProjectsPurgeSchedulerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqProjectsPurgeSchedulerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqProjectsPurgeSchedulerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqProjectsPurgeSchedulerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqProjectsPurgeSchedulerProperties
ComAdobeCqProjectsPurgeSchedulerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqProjectsPurgeSchedulerInfo::setProperties(ComAdobeCqProjectsPurgeSchedulerProperties properties)
{
	this->properties = properties;
}



