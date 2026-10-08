

#include "ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties();
}

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::~ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo()
{

}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo::setProperties(ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties properties)
{
	this->properties = properties;
}



