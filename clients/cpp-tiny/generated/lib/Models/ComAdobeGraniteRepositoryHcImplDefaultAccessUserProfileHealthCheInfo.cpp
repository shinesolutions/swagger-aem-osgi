

#include "ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties();
}

ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::~ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo()
{

}

void
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo::setProperties(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties properties)
{
	this->properties = properties;
}



