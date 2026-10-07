

#include "OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties::OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties()
{
	name = ConfigNodePropertyString();
	path = ConfigNodePropertyString();
}

OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties::OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties::~OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties()
{

}

void
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties::fromJson(std::string jsonObj)
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


}

bourne::json
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["path"] = getPath().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties::getPath()
{
	return path;
}

void
OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}



