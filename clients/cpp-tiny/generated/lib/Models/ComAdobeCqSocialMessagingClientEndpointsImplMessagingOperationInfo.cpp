

#include "ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.h"

using namespace Tiny;

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties();
}

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::~ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo()
{

}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo::setProperties(ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties properties)
{
	this->properties = properties;
}



