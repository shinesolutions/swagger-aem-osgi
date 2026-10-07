

#include "OrgApacheSlingFeatureflagsFeatureProperties.h"

using namespace Tiny;

OrgApacheSlingFeatureflagsFeatureProperties::OrgApacheSlingFeatureflagsFeatureProperties()
{
	name = ConfigNodePropertyString();
	description = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
}

OrgApacheSlingFeatureflagsFeatureProperties::OrgApacheSlingFeatureflagsFeatureProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingFeatureflagsFeatureProperties::~OrgApacheSlingFeatureflagsFeatureProperties()
{

}

void
OrgApacheSlingFeatureflagsFeatureProperties::fromJson(std::string jsonObj)
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
OrgApacheSlingFeatureflagsFeatureProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["description"] = getDescription().toJson();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingFeatureflagsFeatureProperties::getName()
{
	return name;
}

void
OrgApacheSlingFeatureflagsFeatureProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingFeatureflagsFeatureProperties::getDescription()
{
	return description;
}

void
OrgApacheSlingFeatureflagsFeatureProperties::setDescription(ConfigNodePropertyString description)
{
	this->description = description;
}

ConfigNodePropertyBoolean
OrgApacheSlingFeatureflagsFeatureProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingFeatureflagsFeatureProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



