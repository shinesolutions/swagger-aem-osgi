

#include "ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties();
}

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::~ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo()
{

}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo::setProperties(ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties properties)
{
	this->properties = properties;
}



