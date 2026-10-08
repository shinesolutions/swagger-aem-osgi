

#include "ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.h"

using namespace Tiny;

ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties();
}

ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::~ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo()
{

}

void
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo::setProperties(ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties properties)
{
	this->properties = properties;
}



