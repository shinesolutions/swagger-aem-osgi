

#include "OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties()
{
	name = ConfigNodePropertyString();
	path = ConfigNodePropertyString();
	serviceName = ConfigNodePropertyString();
	nuggetsPath = ConfigNodePropertyString();
}

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::~OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties()
{

}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::fromJson(std::string jsonObj)
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

    const char *serviceNameKey = "serviceName";

    if(object.has_key(serviceNameKey))
    {
        bourne::json value = object[serviceNameKey];




        ConfigNodePropertyString* obj = &serviceName;
		obj->fromJson(value.dump());

    }

    const char *nuggetsPathKey = "nuggetsPath";

    if(object.has_key(nuggetsPathKey))
    {
        bourne::json value = object[nuggetsPathKey];




        ConfigNodePropertyString* obj = &nuggetsPath;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["path"] = getPath().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["nuggetsPath"] = getNuggetsPath().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::getPath()
{
	return path;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::getNuggetsPath()
{
	return nuggetsPath;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::setNuggetsPath(ConfigNodePropertyString nuggetsPath)
{
	this->nuggetsPath = nuggetsPath;
}



