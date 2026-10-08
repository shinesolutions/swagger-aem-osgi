

#include "OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.h"

using namespace Tiny;

OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties()
{
	name = ConfigNodePropertyString();
	description = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
}

OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::~OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties()
{

}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];




        ConfigNodePropertyString* obj = &description;
		obj->fromJson(value.dump());

    }

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["description"] = getDescription().toJson();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::getName()
{
	return name;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::getDescription()
{
	return description;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::setDescription(ConfigNodePropertyString description)
{
	this->description = description;
}

ConfigNodePropertyBoolean
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



