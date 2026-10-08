

#include "ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties();
}

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::~ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo()
{

}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo::setProperties(ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties properties)
{
	this->properties = properties;
}



