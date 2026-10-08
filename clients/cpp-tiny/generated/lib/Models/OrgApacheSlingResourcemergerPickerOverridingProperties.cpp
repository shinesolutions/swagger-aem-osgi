

#include "OrgApacheSlingResourcemergerPickerOverridingProperties.h"

using namespace Tiny;

OrgApacheSlingResourcemergerPickerOverridingProperties::OrgApacheSlingResourcemergerPickerOverridingProperties()
{
	mergeroot = ConfigNodePropertyString();
	mergereadOnly = ConfigNodePropertyBoolean();
}

OrgApacheSlingResourcemergerPickerOverridingProperties::OrgApacheSlingResourcemergerPickerOverridingProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingResourcemergerPickerOverridingProperties::~OrgApacheSlingResourcemergerPickerOverridingProperties()
{

}

void
OrgApacheSlingResourcemergerPickerOverridingProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mergerootKey = "merge.root";

    if(object.has_key(mergerootKey))
    {
        bourne::json value = object[mergerootKey];




        ConfigNodePropertyString* obj = &mergeroot;
		obj->fromJson(value.dump());

    }

    const char *mergereadOnlyKey = "merge.readOnly";

    if(object.has_key(mergereadOnlyKey))
    {
        bourne::json value = object[mergereadOnlyKey];




        ConfigNodePropertyBoolean* obj = &mergereadOnly;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingResourcemergerPickerOverridingProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["mergeroot"] = getMergeroot().toJson();






	object["mergereadOnly"] = getMergereadOnly().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingResourcemergerPickerOverridingProperties::getMergeroot()
{
	return mergeroot;
}

void
OrgApacheSlingResourcemergerPickerOverridingProperties::setMergeroot(ConfigNodePropertyString mergeroot)
{
	this->mergeroot = mergeroot;
}

ConfigNodePropertyBoolean
OrgApacheSlingResourcemergerPickerOverridingProperties::getMergereadOnly()
{
	return mergereadOnly;
}

void
OrgApacheSlingResourcemergerPickerOverridingProperties::setMergereadOnly(ConfigNodePropertyBoolean mergereadOnly)
{
	this->mergereadOnly = mergereadOnly;
}



