

#include "ComAdobeGraniteCorsImplCORSPolicyImplInfo.h"

using namespace Tiny;

ComAdobeGraniteCorsImplCORSPolicyImplInfo::ComAdobeGraniteCorsImplCORSPolicyImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteCorsImplCORSPolicyImplProperties();
}

ComAdobeGraniteCorsImplCORSPolicyImplInfo::ComAdobeGraniteCorsImplCORSPolicyImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCorsImplCORSPolicyImplInfo::~ComAdobeGraniteCorsImplCORSPolicyImplInfo()
{

}

void
ComAdobeGraniteCorsImplCORSPolicyImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteCorsImplCORSPolicyImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCorsImplCORSPolicyImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteCorsImplCORSPolicyImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteCorsImplCORSPolicyImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteCorsImplCORSPolicyImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteCorsImplCORSPolicyImplProperties
ComAdobeGraniteCorsImplCORSPolicyImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteCorsImplCORSPolicyImplInfo::setProperties(ComAdobeGraniteCorsImplCORSPolicyImplProperties properties)
{
	this->properties = properties;
}



