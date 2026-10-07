

#include "ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.h"

using namespace Tiny;

ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties();
}

ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::~ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo()
{

}

void
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo::setProperties(ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties properties)
{
	this->properties = properties;
}



