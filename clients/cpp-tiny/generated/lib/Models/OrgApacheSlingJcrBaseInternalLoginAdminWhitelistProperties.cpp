

#include "OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.h"

using namespace Tiny;

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties()
{
	whitelistbypass = ConfigNodePropertyBoolean();
	whitelistbundlesregexp = ConfigNodePropertyString();
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties()
{

}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *whitelistbypassKey = "whitelist.bypass";

    if(object.has_key(whitelistbypassKey))
    {
        bourne::json value = object[whitelistbypassKey];




        ConfigNodePropertyBoolean* obj = &whitelistbypass;
		obj->fromJson(value.dump());

    }

    const char *whitelistbundlesregexpKey = "whitelist.bundles.regexp";

    if(object.has_key(whitelistbundlesregexpKey))
    {
        bourne::json value = object[whitelistbundlesregexpKey];




        ConfigNodePropertyString* obj = &whitelistbundlesregexp;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["whitelistbypass"] = getWhitelistbypass().toJson();






	object["whitelistbundlesregexp"] = getWhitelistbundlesregexp().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::getWhitelistbypass()
{
	return whitelistbypass;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::setWhitelistbypass(ConfigNodePropertyBoolean whitelistbypass)
{
	this->whitelistbypass = whitelistbypass;
}

ConfigNodePropertyString
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::getWhitelistbundlesregexp()
{
	return whitelistbundlesregexp;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::setWhitelistbundlesregexp(ConfigNodePropertyString whitelistbundlesregexp)
{
	this->whitelistbundlesregexp = whitelistbundlesregexp;
}



