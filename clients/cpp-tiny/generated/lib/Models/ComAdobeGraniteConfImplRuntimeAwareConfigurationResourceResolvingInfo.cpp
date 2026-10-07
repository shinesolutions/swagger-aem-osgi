

#include "ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.h"

using namespace Tiny;

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties();
}

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::~ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo()
{

}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo::setProperties(ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties properties)
{
	this->properties = properties;
}



