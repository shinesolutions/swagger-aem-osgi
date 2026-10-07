

#include "ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties();
}

ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::~ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo()
{

}

void
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo::setProperties(ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties properties)
{
	this->properties = properties;
}



