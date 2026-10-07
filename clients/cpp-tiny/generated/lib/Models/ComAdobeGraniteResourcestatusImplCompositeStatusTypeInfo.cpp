

#include "ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.h"

using namespace Tiny;

ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties();
}

ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::~ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo()
{

}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo::setProperties(ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties properties)
{
	this->properties = properties;
}



