

#include "ComAdobeCqHcContentPackagesHealthCheckInfo.h"

using namespace Tiny;

ComAdobeCqHcContentPackagesHealthCheckInfo::ComAdobeCqHcContentPackagesHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqHcContentPackagesHealthCheckProperties();
}

ComAdobeCqHcContentPackagesHealthCheckInfo::ComAdobeCqHcContentPackagesHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqHcContentPackagesHealthCheckInfo::~ComAdobeCqHcContentPackagesHealthCheckInfo()
{

}

void
ComAdobeCqHcContentPackagesHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqHcContentPackagesHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqHcContentPackagesHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqHcContentPackagesHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeCqHcContentPackagesHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqHcContentPackagesHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeCqHcContentPackagesHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqHcContentPackagesHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeCqHcContentPackagesHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqHcContentPackagesHealthCheckProperties
ComAdobeCqHcContentPackagesHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqHcContentPackagesHealthCheckInfo::setProperties(ComAdobeCqHcContentPackagesHealthCheckProperties properties)
{
	this->properties = properties;
}



