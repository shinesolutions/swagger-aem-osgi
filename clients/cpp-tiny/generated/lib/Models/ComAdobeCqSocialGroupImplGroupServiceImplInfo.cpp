

#include "ComAdobeCqSocialGroupImplGroupServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialGroupImplGroupServiceImplInfo::ComAdobeCqSocialGroupImplGroupServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialGroupImplGroupServiceImplProperties();
}

ComAdobeCqSocialGroupImplGroupServiceImplInfo::ComAdobeCqSocialGroupImplGroupServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialGroupImplGroupServiceImplInfo::~ComAdobeCqSocialGroupImplGroupServiceImplInfo()
{

}

void
ComAdobeCqSocialGroupImplGroupServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialGroupImplGroupServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialGroupImplGroupServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialGroupImplGroupServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialGroupImplGroupServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialGroupImplGroupServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialGroupImplGroupServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialGroupImplGroupServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialGroupImplGroupServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialGroupImplGroupServiceImplProperties
ComAdobeCqSocialGroupImplGroupServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialGroupImplGroupServiceImplInfo::setProperties(ComAdobeCqSocialGroupImplGroupServiceImplProperties properties)
{
	this->properties = properties;
}



