

#include "OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties()
{
	name = ConfigNodePropertyString();
	path = ConfigNodePropertyString();
	seconds = ConfigNodePropertyString();
	serviceName = ConfigNodePropertyString();
}

OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::~OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties()
{

}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *secondsKey = "seconds";

    if(object.has_key(secondsKey))
    {
        bourne::json value = object[secondsKey];




        ConfigNodePropertyString* obj = &seconds;
		obj->fromJson(value.dump());

    }

    const char *serviceNameKey = "serviceName";

    if(object.has_key(serviceNameKey))
    {
        bourne::json value = object[serviceNameKey];




        ConfigNodePropertyString* obj = &serviceName;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["path"] = getPath().toJson();






	object["seconds"] = getSeconds().toJson();






	object["serviceName"] = getServiceName().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::getPath()
{
	return path;
}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::getSeconds()
{
	return seconds;
}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::setSeconds(ConfigNodePropertyString seconds)
{
	this->seconds = seconds;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}



