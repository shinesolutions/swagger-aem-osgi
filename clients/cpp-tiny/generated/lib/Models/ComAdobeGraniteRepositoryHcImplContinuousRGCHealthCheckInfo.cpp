

#include "ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties();
}

ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::~ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo()
{

}

void
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo::setProperties(ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties properties)
{
	this->properties = properties;
}



