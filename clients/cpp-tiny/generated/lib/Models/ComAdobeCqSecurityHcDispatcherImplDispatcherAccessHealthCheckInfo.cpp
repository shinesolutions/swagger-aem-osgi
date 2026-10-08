

#include "ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.h"

using namespace Tiny;

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties();
}

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::~ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo()
{

}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo::setProperties(ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties properties)
{
	this->properties = properties;
}



