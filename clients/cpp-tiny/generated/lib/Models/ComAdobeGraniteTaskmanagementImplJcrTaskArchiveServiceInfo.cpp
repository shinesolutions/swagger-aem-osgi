

#include "ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.h"

using namespace Tiny;

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties();
}

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::~ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo()
{

}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo::setProperties(ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties properties)
{
	this->properties = properties;
}



