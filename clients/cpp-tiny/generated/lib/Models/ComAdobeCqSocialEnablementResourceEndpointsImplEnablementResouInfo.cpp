

#include "ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.h"

using namespace Tiny;

ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties();
}

ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::~ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo()
{

}

void
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo::setProperties(ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties properties)
{
	this->properties = properties;
}



