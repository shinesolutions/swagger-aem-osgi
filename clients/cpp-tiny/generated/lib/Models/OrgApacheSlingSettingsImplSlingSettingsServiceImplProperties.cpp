

#include "OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.h"

using namespace Tiny;

OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties()
{
	slingname = ConfigNodePropertyString();
	slingdescription = ConfigNodePropertyString();
}

OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::~OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties()
{

}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingnameKey = "sling.name";

    if(object.has_key(slingnameKey))
    {
        bourne::json value = object[slingnameKey];




        ConfigNodePropertyString* obj = &slingname;
		obj->fromJson(value.dump());

    }

    const char *slingdescriptionKey = "sling.description";

    if(object.has_key(slingdescriptionKey))
    {
        bourne::json value = object[slingdescriptionKey];




        ConfigNodePropertyString* obj = &slingdescription;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingname"] = getSlingname().toJson();






	object["slingdescription"] = getSlingdescription().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::getSlingname()
{
	return slingname;
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::setSlingname(ConfigNodePropertyString slingname)
{
	this->slingname = slingname;
}

ConfigNodePropertyString
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::getSlingdescription()
{
	return slingdescription;
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::setSlingdescription(ConfigNodePropertyString slingdescription)
{
	this->slingdescription = slingdescription;
}



