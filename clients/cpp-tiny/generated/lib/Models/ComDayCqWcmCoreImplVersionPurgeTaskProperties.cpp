

#include "ComDayCqWcmCoreImplVersionPurgeTaskProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplVersionPurgeTaskProperties::ComDayCqWcmCoreImplVersionPurgeTaskProperties()
{
	versionpurgepaths = ConfigNodePropertyArray();
	versionpurgerecursive = ConfigNodePropertyBoolean();
	versionpurgemaxVersions = ConfigNodePropertyInteger();
	versionpurgeminVersions = ConfigNodePropertyInteger();
	versionpurgemaxAgeDays = ConfigNodePropertyInteger();
}

ComDayCqWcmCoreImplVersionPurgeTaskProperties::ComDayCqWcmCoreImplVersionPurgeTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplVersionPurgeTaskProperties::~ComDayCqWcmCoreImplVersionPurgeTaskProperties()
{

}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *versionpurgepathsKey = "versionpurge.paths";

    if(object.has_key(versionpurgepathsKey))
    {
        bourne::json value = object[versionpurgepathsKey];




        ConfigNodePropertyArray* obj = &versionpurgepaths;
		obj->fromJson(value.dump());

    }

    const char *versionpurgerecursiveKey = "versionpurge.recursive";

    if(object.has_key(versionpurgerecursiveKey))
    {
        bourne::json value = object[versionpurgerecursiveKey];




        ConfigNodePropertyBoolean* obj = &versionpurgerecursive;
		obj->fromJson(value.dump());

    }

    const char *versionpurgemaxVersionsKey = "versionpurge.maxVersions";

    if(object.has_key(versionpurgemaxVersionsKey))
    {
        bourne::json value = object[versionpurgemaxVersionsKey];




        ConfigNodePropertyInteger* obj = &versionpurgemaxVersions;
		obj->fromJson(value.dump());

    }

    const char *versionpurgeminVersionsKey = "versionpurge.minVersions";

    if(object.has_key(versionpurgeminVersionsKey))
    {
        bourne::json value = object[versionpurgeminVersionsKey];




        ConfigNodePropertyInteger* obj = &versionpurgeminVersions;
		obj->fromJson(value.dump());

    }

    const char *versionpurgemaxAgeDaysKey = "versionpurge.maxAgeDays";

    if(object.has_key(versionpurgemaxAgeDaysKey))
    {
        bourne::json value = object[versionpurgemaxAgeDaysKey];




        ConfigNodePropertyInteger* obj = &versionpurgemaxAgeDays;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplVersionPurgeTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["versionpurgepaths"] = getVersionpurgepaths().toJson();






	object["versionpurgerecursive"] = getVersionpurgerecursive().toJson();






	object["versionpurgemaxVersions"] = getVersionpurgemaxVersions().toJson();






	object["versionpurgeminVersions"] = getVersionpurgeminVersions().toJson();






	object["versionpurgemaxAgeDays"] = getVersionpurgemaxAgeDays().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgepaths()
{
	return versionpurgepaths;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgepaths(ConfigNodePropertyArray versionpurgepaths)
{
	this->versionpurgepaths = versionpurgepaths;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgerecursive()
{
	return versionpurgerecursive;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgerecursive(ConfigNodePropertyBoolean versionpurgerecursive)
{
	this->versionpurgerecursive = versionpurgerecursive;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgemaxVersions()
{
	return versionpurgemaxVersions;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgemaxVersions(ConfigNodePropertyInteger versionpurgemaxVersions)
{
	this->versionpurgemaxVersions = versionpurgemaxVersions;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgeminVersions()
{
	return versionpurgeminVersions;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgeminVersions(ConfigNodePropertyInteger versionpurgeminVersions)
{
	this->versionpurgeminVersions = versionpurgeminVersions;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgemaxAgeDays()
{
	return versionpurgemaxAgeDays;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgemaxAgeDays(ConfigNodePropertyInteger versionpurgemaxAgeDays)
{
	this->versionpurgemaxAgeDays = versionpurgemaxAgeDays;
}



