

#include "ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.h"

using namespace Tiny;

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties();
}

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::~ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo()
{

}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo::setProperties(ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties properties)
{
	this->properties = properties;
}



