

#include "ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties();
}

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::~ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo()
{

}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo::setProperties(ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties properties)
{
	this->properties = properties;
}



