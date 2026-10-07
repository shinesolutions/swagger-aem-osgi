

#include "ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo.h"

using namespace Tiny;

ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties();
}

ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::~ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo()
{

}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo::setProperties(ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties properties)
{
	this->properties = properties;
}



