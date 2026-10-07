

#include "ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.h"

using namespace Tiny;

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties();
}

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::~ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo()
{

}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo::setProperties(ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties properties)
{
	this->properties = properties;
}



