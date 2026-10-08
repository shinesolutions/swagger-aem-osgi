

#include "ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.h"

using namespace Tiny;

ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties();
}

ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::~ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo()
{

}

void
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo::setProperties(ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties properties)
{
	this->properties = properties;
}



