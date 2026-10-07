

#include "ComAdobeGraniteAuthOauthProviderProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthProviderProperties::ComAdobeGraniteAuthOauthProviderProperties()
{
	oauthconfigid = ConfigNodePropertyString();
	oauthclientid = ConfigNodePropertyString();
	oauthclientsecret = ConfigNodePropertyString();
	oauthscope = ConfigNodePropertyArray();
	oauthconfigproviderid = ConfigNodePropertyString();
	oauthcreateusers = ConfigNodePropertyBoolean();
	oauthuseridproperty = ConfigNodePropertyString();
	forcestrictusernamematching = ConfigNodePropertyBoolean();
	oauthencodeuserids = ConfigNodePropertyBoolean();
	oauthhashuserids = ConfigNodePropertyBoolean();
	oauthcallBackUrl = ConfigNodePropertyString();
	oauthaccesstokenpersist = ConfigNodePropertyBoolean();
	oauthaccesstokenpersistcookie = ConfigNodePropertyBoolean();
	oauthcsrfstateprotection = ConfigNodePropertyBoolean();
	oauthredirectrequestparams = ConfigNodePropertyBoolean();
	oauthconfigsiblingsallow = ConfigNodePropertyBoolean();
}

ComAdobeGraniteAuthOauthProviderProperties::ComAdobeGraniteAuthOauthProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthProviderProperties::~ComAdobeGraniteAuthOauthProviderProperties()
{

}

void
ComAdobeGraniteAuthOauthProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthconfigidKey = "oauth.config.id";

    if(object.has_key(oauthconfigidKey))
    {
        bourne::json value = object[oauthconfigidKey];




        ConfigNodePropertyString* obj = &oauthconfigid;
		obj->fromJson(value.dump());

    }

    const char *oauthclientidKey = "oauth.client.id";

    if(object.has_key(oauthclientidKey))
    {
        bourne::json value = object[oauthclientidKey];




        ConfigNodePropertyString* obj = &oauthclientid;
		obj->fromJson(value.dump());

    }

    const char *oauthclientsecretKey = "oauth.client.secret";

    if(object.has_key(oauthclientsecretKey))
    {
        bourne::json value = object[oauthclientsecretKey];




        ConfigNodePropertyString* obj = &oauthclientsecret;
		obj->fromJson(value.dump());

    }

    const char *oauthscopeKey = "oauth.scope";

    if(object.has_key(oauthscopeKey))
    {
        bourne::json value = object[oauthscopeKey];




        ConfigNodePropertyArray* obj = &oauthscope;
		obj->fromJson(value.dump());

    }

    const char *oauthconfigprovideridKey = "oauth.config.provider.id";

    if(object.has_key(oauthconfigprovideridKey))
    {
        bourne::json value = object[oauthconfigprovideridKey];




        ConfigNodePropertyString* obj = &oauthconfigproviderid;
		obj->fromJson(value.dump());

    }

    const char *oauthcreateusersKey = "oauth.create.users";

    if(object.has_key(oauthcreateusersKey))
    {
        bourne::json value = object[oauthcreateusersKey];




        ConfigNodePropertyBoolean* obj = &oauthcreateusers;
		obj->fromJson(value.dump());

    }

    const char *oauthuseridpropertyKey = "oauth.userid.property";

    if(object.has_key(oauthuseridpropertyKey))
    {
        bourne::json value = object[oauthuseridpropertyKey];




        ConfigNodePropertyString* obj = &oauthuseridproperty;
		obj->fromJson(value.dump());

    }

    const char *forcestrictusernamematchingKey = "force.strict.username.matching";

    if(object.has_key(forcestrictusernamematchingKey))
    {
        bourne::json value = object[forcestrictusernamematchingKey];




        ConfigNodePropertyBoolean* obj = &forcestrictusernamematching;
		obj->fromJson(value.dump());

    }

    const char *oauthencodeuseridsKey = "oauth.encode.userids";

    if(object.has_key(oauthencodeuseridsKey))
    {
        bourne::json value = object[oauthencodeuseridsKey];




        ConfigNodePropertyBoolean* obj = &oauthencodeuserids;
		obj->fromJson(value.dump());

    }

    const char *oauthhashuseridsKey = "oauth.hash.userids";

    if(object.has_key(oauthhashuseridsKey))
    {
        bourne::json value = object[oauthhashuseridsKey];




        ConfigNodePropertyBoolean* obj = &oauthhashuserids;
		obj->fromJson(value.dump());

    }

    const char *oauthcallBackUrlKey = "oauth.callBackUrl";

    if(object.has_key(oauthcallBackUrlKey))
    {
        bourne::json value = object[oauthcallBackUrlKey];




        ConfigNodePropertyString* obj = &oauthcallBackUrl;
		obj->fromJson(value.dump());

    }

    const char *oauthaccesstokenpersistKey = "oauth.access.token.persist";

    if(object.has_key(oauthaccesstokenpersistKey))
    {
        bourne::json value = object[oauthaccesstokenpersistKey];




        ConfigNodePropertyBoolean* obj = &oauthaccesstokenpersist;
		obj->fromJson(value.dump());

    }

    const char *oauthaccesstokenpersistcookieKey = "oauth.access.token.persist.cookie";

    if(object.has_key(oauthaccesstokenpersistcookieKey))
    {
        bourne::json value = object[oauthaccesstokenpersistcookieKey];




        ConfigNodePropertyBoolean* obj = &oauthaccesstokenpersistcookie;
		obj->fromJson(value.dump());

    }

    const char *oauthcsrfstateprotectionKey = "oauth.csrf.state.protection";

    if(object.has_key(oauthcsrfstateprotectionKey))
    {
        bourne::json value = object[oauthcsrfstateprotectionKey];




        ConfigNodePropertyBoolean* obj = &oauthcsrfstateprotection;
		obj->fromJson(value.dump());

    }

    const char *oauthredirectrequestparamsKey = "oauth.redirect.request.params";

    if(object.has_key(oauthredirectrequestparamsKey))
    {
        bourne::json value = object[oauthredirectrequestparamsKey];




        ConfigNodePropertyBoolean* obj = &oauthredirectrequestparams;
		obj->fromJson(value.dump());

    }

    const char *oauthconfigsiblingsallowKey = "oauth.config.siblings.allow";

    if(object.has_key(oauthconfigsiblingsallowKey))
    {
        bourne::json value = object[oauthconfigsiblingsallowKey];




        ConfigNodePropertyBoolean* obj = &oauthconfigsiblingsallow;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthconfigid"] = getOauthconfigid().toJson();






	object["oauthclientid"] = getOauthclientid().toJson();






	object["oauthclientsecret"] = getOauthclientsecret().toJson();






	object["oauthscope"] = getOauthscope().toJson();






	object["oauthconfigproviderid"] = getOauthconfigproviderid().toJson();






	object["oauthcreateusers"] = getOauthcreateusers().toJson();






	object["oauthuseridproperty"] = getOauthuseridproperty().toJson();






	object["forcestrictusernamematching"] = getForcestrictusernamematching().toJson();






	object["oauthencodeuserids"] = getOauthencodeuserids().toJson();






	object["oauthhashuserids"] = getOauthhashuserids().toJson();






	object["oauthcallBackUrl"] = getOauthcallBackUrl().toJson();






	object["oauthaccesstokenpersist"] = getOauthaccesstokenpersist().toJson();






	object["oauthaccesstokenpersistcookie"] = getOauthaccesstokenpersistcookie().toJson();






	object["oauthcsrfstateprotection"] = getOauthcsrfstateprotection().toJson();






	object["oauthredirectrequestparams"] = getOauthredirectrequestparams().toJson();






	object["oauthconfigsiblingsallow"] = getOauthconfigsiblingsallow().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthconfigid()
{
	return oauthconfigid;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthconfigid(ConfigNodePropertyString oauthconfigid)
{
	this->oauthconfigid = oauthconfigid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthclientid()
{
	return oauthclientid;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthclientid(ConfigNodePropertyString oauthclientid)
{
	this->oauthclientid = oauthclientid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthclientsecret()
{
	return oauthclientsecret;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthclientsecret(ConfigNodePropertyString oauthclientsecret)
{
	this->oauthclientsecret = oauthclientsecret;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthOauthProviderProperties::getOauthscope()
{
	return oauthscope;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthscope(ConfigNodePropertyArray oauthscope)
{
	this->oauthscope = oauthscope;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthconfigproviderid()
{
	return oauthconfigproviderid;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthconfigproviderid(ConfigNodePropertyString oauthconfigproviderid)
{
	this->oauthconfigproviderid = oauthconfigproviderid;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthcreateusers()
{
	return oauthcreateusers;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthcreateusers(ConfigNodePropertyBoolean oauthcreateusers)
{
	this->oauthcreateusers = oauthcreateusers;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthuseridproperty()
{
	return oauthuseridproperty;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthuseridproperty(ConfigNodePropertyString oauthuseridproperty)
{
	this->oauthuseridproperty = oauthuseridproperty;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getForcestrictusernamematching()
{
	return forcestrictusernamematching;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setForcestrictusernamematching(ConfigNodePropertyBoolean forcestrictusernamematching)
{
	this->forcestrictusernamematching = forcestrictusernamematching;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthencodeuserids()
{
	return oauthencodeuserids;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthencodeuserids(ConfigNodePropertyBoolean oauthencodeuserids)
{
	this->oauthencodeuserids = oauthencodeuserids;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthhashuserids()
{
	return oauthhashuserids;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthhashuserids(ConfigNodePropertyBoolean oauthhashuserids)
{
	this->oauthhashuserids = oauthhashuserids;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthProviderProperties::getOauthcallBackUrl()
{
	return oauthcallBackUrl;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthcallBackUrl(ConfigNodePropertyString oauthcallBackUrl)
{
	this->oauthcallBackUrl = oauthcallBackUrl;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthaccesstokenpersist()
{
	return oauthaccesstokenpersist;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthaccesstokenpersist(ConfigNodePropertyBoolean oauthaccesstokenpersist)
{
	this->oauthaccesstokenpersist = oauthaccesstokenpersist;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthaccesstokenpersistcookie()
{
	return oauthaccesstokenpersistcookie;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthaccesstokenpersistcookie(ConfigNodePropertyBoolean oauthaccesstokenpersistcookie)
{
	this->oauthaccesstokenpersistcookie = oauthaccesstokenpersistcookie;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthcsrfstateprotection()
{
	return oauthcsrfstateprotection;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthcsrfstateprotection(ConfigNodePropertyBoolean oauthcsrfstateprotection)
{
	this->oauthcsrfstateprotection = oauthcsrfstateprotection;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthredirectrequestparams()
{
	return oauthredirectrequestparams;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthredirectrequestparams(ConfigNodePropertyBoolean oauthredirectrequestparams)
{
	this->oauthredirectrequestparams = oauthredirectrequestparams;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthProviderProperties::getOauthconfigsiblingsallow()
{
	return oauthconfigsiblingsallow;
}

void
ComAdobeGraniteAuthOauthProviderProperties::setOauthconfigsiblingsallow(ConfigNodePropertyBoolean oauthconfigsiblingsallow)
{
	this->oauthconfigsiblingsallow = oauthconfigsiblingsallow;
}



