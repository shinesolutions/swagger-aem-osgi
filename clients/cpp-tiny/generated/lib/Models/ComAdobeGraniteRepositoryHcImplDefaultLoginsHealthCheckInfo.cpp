

#include "ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties();
}

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::~ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo()
{

}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo::setProperties(ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties properties)
{
	this->properties = properties;
}



