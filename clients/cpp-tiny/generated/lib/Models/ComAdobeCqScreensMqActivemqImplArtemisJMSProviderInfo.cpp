

#include "ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.h"

using namespace Tiny;

ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties();
}

ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::~ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo()
{

}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo::setProperties(ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties properties)
{
	this->properties = properties;
}



