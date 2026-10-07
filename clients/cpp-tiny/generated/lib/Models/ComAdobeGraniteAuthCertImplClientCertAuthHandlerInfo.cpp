

#include "ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties();
}

ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::~ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo()
{

}

void
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo::setProperties(ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties properties)
{
	this->properties = properties;
}



