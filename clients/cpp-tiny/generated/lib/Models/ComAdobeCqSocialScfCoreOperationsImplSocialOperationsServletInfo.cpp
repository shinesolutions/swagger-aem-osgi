

#include "ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.h"

using namespace Tiny;

ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties();
}

ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::~ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo()
{

}

void
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo::setProperties(ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties properties)
{
	this->properties = properties;
}



