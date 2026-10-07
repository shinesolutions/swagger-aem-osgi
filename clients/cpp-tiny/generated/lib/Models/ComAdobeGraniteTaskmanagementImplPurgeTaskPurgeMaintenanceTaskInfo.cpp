

#include "ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo.h"

using namespace Tiny;

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties();
}

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::~ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo()
{

}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo::setProperties(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties properties)
{
	this->properties = properties;
}



