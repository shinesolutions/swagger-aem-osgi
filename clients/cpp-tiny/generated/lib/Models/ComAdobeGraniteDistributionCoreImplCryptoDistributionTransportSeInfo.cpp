

#include "ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties();
}

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::~ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo()
{

}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo::setProperties(ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties properties)
{
	this->properties = properties;
}



