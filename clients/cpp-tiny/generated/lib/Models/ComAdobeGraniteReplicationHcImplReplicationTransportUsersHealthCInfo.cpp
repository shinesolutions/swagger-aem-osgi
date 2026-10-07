

#include "ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.h"

using namespace Tiny;

ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties();
}

ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::~ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo()
{

}

void
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo::setProperties(ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties properties)
{
	this->properties = properties;
}



