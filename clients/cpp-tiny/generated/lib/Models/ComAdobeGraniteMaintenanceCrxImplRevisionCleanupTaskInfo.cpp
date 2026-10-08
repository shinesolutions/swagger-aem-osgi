

#include "ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo.h"

using namespace Tiny;

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties();
}

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::~ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo()
{

}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo::setProperties(ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties properties)
{
	this->properties = properties;
}



