

#include "ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.h"

using namespace Tiny;

ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties();
}

ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::~ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo()
{

}

void
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo::setProperties(ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties properties)
{
	this->properties = properties;
}



