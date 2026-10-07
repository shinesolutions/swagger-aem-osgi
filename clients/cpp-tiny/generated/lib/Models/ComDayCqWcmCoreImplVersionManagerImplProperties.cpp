

#include "ComDayCqWcmCoreImplVersionManagerImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplVersionManagerImplProperties::ComDayCqWcmCoreImplVersionManagerImplProperties()
{
	versionmanagercreateVersionOnActivation = ConfigNodePropertyBoolean();
	versionmanagerpurgingEnabled = ConfigNodePropertyBoolean();
	versionmanagerpurgePaths = ConfigNodePropertyArray();
	versionmanagerivPaths = ConfigNodePropertyArray();
	versionmanagermaxAgeDays = ConfigNodePropertyInteger();
	versionmanagermaxNumberVersions = ConfigNodePropertyInteger();
	versionmanagerminNumberVersions = ConfigNodePropertyInteger();
}

ComDayCqWcmCoreImplVersionManagerImplProperties::ComDayCqWcmCoreImplVersionManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplVersionManagerImplProperties::~ComDayCqWcmCoreImplVersionManagerImplProperties()
{

}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *versionmanagercreateVersionOnActivationKey = "versionmanager.createVersionOnActivation";

    if(object.has_key(versionmanagercreateVersionOnActivationKey))
    {
        bourne::json value = object[versionmanagercreateVersionOnActivationKey];




        ConfigNodePropertyBoolean* obj = &versionmanagercreateVersionOnActivation;
		obj->fromJson(value.dump());

    }

    const char *versionmanagerpurgingEnabledKey = "versionmanager.purgingEnabled";

    if(object.has_key(versionmanagerpurgingEnabledKey))
    {
        bourne::json value = object[versionmanagerpurgingEnabledKey];




        ConfigNodePropertyBoolean* obj = &versionmanagerpurgingEnabled;
		obj->fromJson(value.dump());

    }

    const char *versionmanagerpurgePathsKey = "versionmanager.purgePaths";

    if(object.has_key(versionmanagerpurgePathsKey))
    {
        bourne::json value = object[versionmanagerpurgePathsKey];




        ConfigNodePropertyArray* obj = &versionmanagerpurgePaths;
		obj->fromJson(value.dump());

    }

    const char *versionmanagerivPathsKey = "versionmanager.ivPaths";

    if(object.has_key(versionmanagerivPathsKey))
    {
        bourne::json value = object[versionmanagerivPathsKey];




        ConfigNodePropertyArray* obj = &versionmanagerivPaths;
		obj->fromJson(value.dump());

    }

    const char *versionmanagermaxAgeDaysKey = "versionmanager.maxAgeDays";

    if(object.has_key(versionmanagermaxAgeDaysKey))
    {
        bourne::json value = object[versionmanagermaxAgeDaysKey];




        ConfigNodePropertyInteger* obj = &versionmanagermaxAgeDays;
		obj->fromJson(value.dump());

    }

    const char *versionmanagermaxNumberVersionsKey = "versionmanager.maxNumberVersions";

    if(object.has_key(versionmanagermaxNumberVersionsKey))
    {
        bourne::json value = object[versionmanagermaxNumberVersionsKey];




        ConfigNodePropertyInteger* obj = &versionmanagermaxNumberVersions;
		obj->fromJson(value.dump());

    }

    const char *versionmanagerminNumberVersionsKey = "versionmanager.minNumberVersions";

    if(object.has_key(versionmanagerminNumberVersionsKey))
    {
        bourne::json value = object[versionmanagerminNumberVersionsKey];




        ConfigNodePropertyInteger* obj = &versionmanagerminNumberVersions;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplVersionManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["versionmanagercreateVersionOnActivation"] = getVersionmanagercreateVersionOnActivation().toJson();






	object["versionmanagerpurgingEnabled"] = getVersionmanagerpurgingEnabled().toJson();






	object["versionmanagerpurgePaths"] = getVersionmanagerpurgePaths().toJson();






	object["versionmanagerivPaths"] = getVersionmanagerivPaths().toJson();






	object["versionmanagermaxAgeDays"] = getVersionmanagermaxAgeDays().toJson();






	object["versionmanagermaxNumberVersions"] = getVersionmanagermaxNumberVersions().toJson();






	object["versionmanagerminNumberVersions"] = getVersionmanagerminNumberVersions().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagercreateVersionOnActivation()
{
	return versionmanagercreateVersionOnActivation;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagercreateVersionOnActivation(ConfigNodePropertyBoolean versionmanagercreateVersionOnActivation)
{
	this->versionmanagercreateVersionOnActivation = versionmanagercreateVersionOnActivation;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerpurgingEnabled()
{
	return versionmanagerpurgingEnabled;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerpurgingEnabled(ConfigNodePropertyBoolean versionmanagerpurgingEnabled)
{
	this->versionmanagerpurgingEnabled = versionmanagerpurgingEnabled;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerpurgePaths()
{
	return versionmanagerpurgePaths;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerpurgePaths(ConfigNodePropertyArray versionmanagerpurgePaths)
{
	this->versionmanagerpurgePaths = versionmanagerpurgePaths;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerivPaths()
{
	return versionmanagerivPaths;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerivPaths(ConfigNodePropertyArray versionmanagerivPaths)
{
	this->versionmanagerivPaths = versionmanagerivPaths;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagermaxAgeDays()
{
	return versionmanagermaxAgeDays;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagermaxAgeDays(ConfigNodePropertyInteger versionmanagermaxAgeDays)
{
	this->versionmanagermaxAgeDays = versionmanagermaxAgeDays;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagermaxNumberVersions()
{
	return versionmanagermaxNumberVersions;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagermaxNumberVersions(ConfigNodePropertyInteger versionmanagermaxNumberVersions)
{
	this->versionmanagermaxNumberVersions = versionmanagermaxNumberVersions;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerminNumberVersions()
{
	return versionmanagerminNumberVersions;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerminNumberVersions(ConfigNodePropertyInteger versionmanagerminNumberVersions)
{
	this->versionmanagerminNumberVersions = versionmanagerminNumberVersions;
}



