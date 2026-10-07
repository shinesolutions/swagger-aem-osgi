

#include "ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.h"

using namespace Tiny;

ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties();
}

ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::~ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo()
{

}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo::setProperties(ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties properties)
{
	this->properties = properties;
}



