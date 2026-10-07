

#include "ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.h"

using namespace Tiny;

ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::ComAdobeFormsCommonServiceImplDefaultDataProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeFormsCommonServiceImplDefaultDataProviderProperties();
}

ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::ComAdobeFormsCommonServiceImplDefaultDataProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::~ComAdobeFormsCommonServiceImplDefaultDataProviderInfo()
{

}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeFormsCommonServiceImplDefaultDataProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeFormsCommonServiceImplDefaultDataProviderProperties
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderInfo::setProperties(ComAdobeFormsCommonServiceImplDefaultDataProviderProperties properties)
{
	this->properties = properties;
}



