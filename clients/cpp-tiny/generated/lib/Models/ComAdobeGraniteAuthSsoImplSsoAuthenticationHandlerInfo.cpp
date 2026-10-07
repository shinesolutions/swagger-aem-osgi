

#include "ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.h"

using namespace Tiny;

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties();
}

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::~ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo()
{

}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo::setProperties(ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties properties)
{
	this->properties = properties;
}



