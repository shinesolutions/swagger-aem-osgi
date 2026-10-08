

#include "ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.h"

using namespace Tiny;

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties();
}

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::~ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo()
{

}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo::setProperties(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties properties)
{
	this->properties = properties;
}



