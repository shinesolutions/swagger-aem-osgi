

#include "OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.h"

using namespace Tiny;

OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties()
{
	packageRoots = ConfigNodePropertyArray();
}

OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::~OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties()
{

}

void
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *packageRootsKey = "packageRoots";

    if(object.has_key(packageRootsKey))
    {
        bourne::json value = object[packageRootsKey];




        ConfigNodePropertyArray* obj = &packageRoots;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["packageRoots"] = getPackageRoots().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::getPackageRoots()
{
	return packageRoots;
}

void
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::setPackageRoots(ConfigNodePropertyArray packageRoots)
{
	this->packageRoots = packageRoots;
}



