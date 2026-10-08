

#include "ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.h"

using namespace Tiny;

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties();
}

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::~ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo()
{

}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo::setProperties(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties properties)
{
	this->properties = properties;
}



