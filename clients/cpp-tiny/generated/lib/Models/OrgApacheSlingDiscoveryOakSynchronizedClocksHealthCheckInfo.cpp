

#include "OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.h"

using namespace Tiny;

OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties();
}

OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::~OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo()
{

}

void
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo::setProperties(OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties properties)
{
	this->properties = properties;
}



