

#include "OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.h"

using namespace Tiny;

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties()
{
	homePath = ConfigNodePropertyString();
}

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::~OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties()
{

}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *homePathKey = "homePath";

    if(object.has_key(homePathKey))
    {
        bourne::json value = object[homePathKey];




        ConfigNodePropertyString* obj = &homePath;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["homePath"] = getHomePath().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::getHomePath()
{
	return homePath;
}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::setHomePath(ConfigNodePropertyString homePath)
{
	this->homePath = homePath;
}



