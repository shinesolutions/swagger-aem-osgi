

#include "ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties();
}

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::~ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo()
{

}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo::setProperties(ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties properties)
{
	this->properties = properties;
}



