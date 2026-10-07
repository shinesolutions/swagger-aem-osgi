

#include "ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.h"

using namespace Tiny;

ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties();
}

ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::~ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo()
{

}

void
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo::setProperties(ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties properties)
{
	this->properties = properties;
}



