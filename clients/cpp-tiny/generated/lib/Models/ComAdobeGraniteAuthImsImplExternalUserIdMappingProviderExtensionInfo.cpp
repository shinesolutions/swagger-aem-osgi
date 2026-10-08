

#include "ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties();
}

ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::~ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo()
{

}

void
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo::setProperties(ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties properties)
{
	this->properties = properties;
}



