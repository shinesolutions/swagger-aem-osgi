

#include "ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.h"

using namespace Tiny;

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties();
}

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::~ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo()
{

}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::fromJson(std::string jsonObj)
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




        ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::getPid()
{
	return pid;
}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::getTitle()
{
	return title;
}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::getDescription()
{
	return description;
}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::getProperties()
{
	return properties;
}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo::setProperties(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties properties)
{
	this->properties = properties;
}



