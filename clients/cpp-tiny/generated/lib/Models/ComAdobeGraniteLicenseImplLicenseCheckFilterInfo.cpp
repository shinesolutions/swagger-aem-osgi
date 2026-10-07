

#include "ComAdobeGraniteLicenseImplLicenseCheckFilterInfo.h"

using namespace Tiny;

ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::ComAdobeGraniteLicenseImplLicenseCheckFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteLicenseImplLicenseCheckFilterProperties();
}

ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::ComAdobeGraniteLicenseImplLicenseCheckFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::~ComAdobeGraniteLicenseImplLicenseCheckFilterInfo()
{

}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteLicenseImplLicenseCheckFilterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteLicenseImplLicenseCheckFilterProperties
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterInfo::setProperties(ComAdobeGraniteLicenseImplLicenseCheckFilterProperties properties)
{
	this->properties = properties;
}



