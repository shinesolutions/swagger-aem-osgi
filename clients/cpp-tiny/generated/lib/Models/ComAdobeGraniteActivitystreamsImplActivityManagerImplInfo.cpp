

#include "ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.h"

using namespace Tiny;

ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties();
}

ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::~ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo()
{

}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo::setProperties(ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties properties)
{
	this->properties = properties;
}



