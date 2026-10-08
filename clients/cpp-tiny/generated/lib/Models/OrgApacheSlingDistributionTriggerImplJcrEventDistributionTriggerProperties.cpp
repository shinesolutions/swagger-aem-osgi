

#include "OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties()
{
	name = ConfigNodePropertyString();
	path = ConfigNodePropertyString();
	ignoredPathsPatterns = ConfigNodePropertyArray();
	serviceName = ConfigNodePropertyString();
	deep = ConfigNodePropertyBoolean();
}

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::~OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties()
{

}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::fromJson(std::string jsonObj)
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

    const char *ignoredPathsPatternsKey = "ignoredPathsPatterns";

    if(object.has_key(ignoredPathsPatternsKey))
    {
        bourne::json value = object[ignoredPathsPatternsKey];




        ConfigNodePropertyArray* obj = &ignoredPathsPatterns;
		obj->fromJson(value.dump());

    }

    const char *serviceNameKey = "serviceName";

    if(object.has_key(serviceNameKey))
    {
        bourne::json value = object[serviceNameKey];




        ConfigNodePropertyString* obj = &serviceName;
		obj->fromJson(value.dump());

    }

    const char *deepKey = "deep";

    if(object.has_key(deepKey))
    {
        bourne::json value = object[deepKey];




        ConfigNodePropertyBoolean* obj = &deep;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["path"] = getPath().toJson();






	object["ignoredPathsPatterns"] = getIgnoredPathsPatterns().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["deep"] = getDeep().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getPath()
{
	return path;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getIgnoredPathsPatterns()
{
	return ignoredPathsPatterns;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setIgnoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns)
{
	this->ignoredPathsPatterns = ignoredPathsPatterns;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getDeep()
{
	return deep;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setDeep(ConfigNodePropertyBoolean deep)
{
	this->deep = deep;
}



