

#include "ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties();
}

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::~ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo()
{

}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo::setProperties(ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties properties)
{
	this->properties = properties;
}



