

#include "ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties();
}

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::~ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo()
{

}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo::setProperties(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties properties)
{
	this->properties = properties;
}



