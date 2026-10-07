

#include "ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.h"

using namespace Tiny;

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties();
}

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::~ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo()
{

}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo::setProperties(ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties properties)
{
	this->properties = properties;
}



