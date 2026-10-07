

#include "ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties();
}

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::~ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo()
{

}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo::setProperties(ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties properties)
{
	this->properties = properties;
}



