

#include "ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties();
}

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::~ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo()
{

}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo::setProperties(ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties properties)
{
	this->properties = properties;
}



