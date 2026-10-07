

#include "OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.h"

using namespace Tiny;

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties()
{
	whitelistname = ConfigNodePropertyString();
	whitelistbundles = ConfigNodePropertyArray();
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties()
{

}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *whitelistnameKey = "whitelist.name";

    if(object.has_key(whitelistnameKey))
    {
        bourne::json value = object[whitelistnameKey];




        ConfigNodePropertyString* obj = &whitelistname;
		obj->fromJson(value.dump());

    }

    const char *whitelistbundlesKey = "whitelist.bundles";

    if(object.has_key(whitelistbundlesKey))
    {
        bourne::json value = object[whitelistbundlesKey];




        ConfigNodePropertyArray* obj = &whitelistbundles;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["whitelistname"] = getWhitelistname().toJson();






	object["whitelistbundles"] = getWhitelistbundles().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::getWhitelistname()
{
	return whitelistname;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::setWhitelistname(ConfigNodePropertyString whitelistname)
{
	this->whitelistname = whitelistname;
}

ConfigNodePropertyArray
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::getWhitelistbundles()
{
	return whitelistbundles;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::setWhitelistbundles(ConfigNodePropertyArray whitelistbundles)
{
	this->whitelistbundles = whitelistbundles;
}



