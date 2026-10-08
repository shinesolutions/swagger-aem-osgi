

#include "OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties()
{
	path = ConfigNodePropertyString();
	checkpathprefix = ConfigNodePropertyString();
	jcrPath = ConfigNodePropertyString();
}

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::~OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties()
{

}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *checkpathprefixKey = "checkpath.prefix";

    if(object.has_key(checkpathprefixKey))
    {
        bourne::json value = object[checkpathprefixKey];




        ConfigNodePropertyString* obj = &checkpathprefix;
		obj->fromJson(value.dump());

    }

    const char *jcrPathKey = "jcrPath";

    if(object.has_key(jcrPathKey))
    {
        bourne::json value = object[jcrPathKey];




        ConfigNodePropertyString* obj = &jcrPath;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["checkpathprefix"] = getCheckpathprefix().toJson();






	object["jcrPath"] = getJcrPath().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::getPath()
{
	return path;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyString
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::getCheckpathprefix()
{
	return checkpathprefix;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::setCheckpathprefix(ConfigNodePropertyString checkpathprefix)
{
	this->checkpathprefix = checkpathprefix;
}

ConfigNodePropertyString
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::getJcrPath()
{
	return jcrPath;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::setJcrPath(ConfigNodePropertyString jcrPath)
{
	this->jcrPath = jcrPath;
}



