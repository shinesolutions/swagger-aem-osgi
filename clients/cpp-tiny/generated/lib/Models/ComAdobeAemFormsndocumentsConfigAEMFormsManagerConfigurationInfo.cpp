

#include "ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.h"

using namespace Tiny;

ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties();
}

ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::~ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo()
{

}

void
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::fromJson(std::string jsonObj)
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




        ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::getPid()
{
	return pid;
}

void
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::getTitle()
{
	return title;
}

void
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::getDescription()
{
	return description;
}

void
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::getProperties()
{
	return properties;
}

void
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo::setProperties(ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties properties)
{
	this->properties = properties;
}



