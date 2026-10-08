

#include "OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties()
{
	name = ConfigNodePropertyString();
	path = ConfigNodePropertyString();
}

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::~OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties()
{

}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::fromJson(std::string jsonObj)
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
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["path"] = getPath().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::getPath()
{
	return path;
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}



