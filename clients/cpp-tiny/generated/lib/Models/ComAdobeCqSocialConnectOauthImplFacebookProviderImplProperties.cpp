

#include "ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties()
{
	oauthproviderid = ConfigNodePropertyString();
	oauthcloudconfigroot = ConfigNodePropertyString();
	providerconfigroot = ConfigNodePropertyString();
	providerconfigcreatetagsenabled = ConfigNodePropertyBoolean();
	providerconfiguserfolder = ConfigNodePropertyDropDown();
	providerconfigfacebookfetchfields = ConfigNodePropertyBoolean();
	providerconfigfacebookfields = ConfigNodePropertyArray();
	providerconfigrefreshuserdataenabled = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::~ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties()
{

}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthprovideridKey = "oauth.provider.id";

    if(object.has_key(oauthprovideridKey))
    {
        bourne::json value = object[oauthprovideridKey];




        ConfigNodePropertyString* obj = &oauthproviderid;
		obj->fromJson(value.dump());

    }

    const char *oauthcloudconfigrootKey = "oauth.cloud.config.root";

    if(object.has_key(oauthcloudconfigrootKey))
    {
        bourne::json value = object[oauthcloudconfigrootKey];




        ConfigNodePropertyString* obj = &oauthcloudconfigroot;
		obj->fromJson(value.dump());

    }

    const char *providerconfigrootKey = "provider.config.root";

    if(object.has_key(providerconfigrootKey))
    {
        bourne::json value = object[providerconfigrootKey];




        ConfigNodePropertyString* obj = &providerconfigroot;
		obj->fromJson(value.dump());

    }

    const char *providerconfigcreatetagsenabledKey = "provider.config.create.tags.enabled";

    if(object.has_key(providerconfigcreatetagsenabledKey))
    {
        bourne::json value = object[providerconfigcreatetagsenabledKey];




        ConfigNodePropertyBoolean* obj = &providerconfigcreatetagsenabled;
		obj->fromJson(value.dump());

    }

    const char *providerconfiguserfolderKey = "provider.config.user.folder";

    if(object.has_key(providerconfiguserfolderKey))
    {
        bourne::json value = object[providerconfiguserfolderKey];




        ConfigNodePropertyDropDown* obj = &providerconfiguserfolder;
		obj->fromJson(value.dump());

    }

    const char *providerconfigfacebookfetchfieldsKey = "provider.config.facebook.fetch.fields";

    if(object.has_key(providerconfigfacebookfetchfieldsKey))
    {
        bourne::json value = object[providerconfigfacebookfetchfieldsKey];




        ConfigNodePropertyBoolean* obj = &providerconfigfacebookfetchfields;
		obj->fromJson(value.dump());

    }

    const char *providerconfigfacebookfieldsKey = "provider.config.facebook.fields";

    if(object.has_key(providerconfigfacebookfieldsKey))
    {
        bourne::json value = object[providerconfigfacebookfieldsKey];




        ConfigNodePropertyArray* obj = &providerconfigfacebookfields;
		obj->fromJson(value.dump());

    }

    const char *providerconfigrefreshuserdataenabledKey = "provider.config.refresh.userdata.enabled";

    if(object.has_key(providerconfigrefreshuserdataenabledKey))
    {
        bourne::json value = object[providerconfigrefreshuserdataenabledKey];




        ConfigNodePropertyBoolean* obj = &providerconfigrefreshuserdataenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthproviderid"] = getOauthproviderid().toJson();






	object["oauthcloudconfigroot"] = getOauthcloudconfigroot().toJson();






	object["providerconfigroot"] = getProviderconfigroot().toJson();






	object["providerconfigcreatetagsenabled"] = getProviderconfigcreatetagsenabled().toJson();






	object["providerconfiguserfolder"] = getProviderconfiguserfolder().toJson();






	object["providerconfigfacebookfetchfields"] = getProviderconfigfacebookfetchfields().toJson();






	object["providerconfigfacebookfields"] = getProviderconfigfacebookfields().toJson();






	object["providerconfigrefreshuserdataenabled"] = getProviderconfigrefreshuserdataenabled().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setOauthproviderid(ConfigNodePropertyString oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getOauthcloudconfigroot()
{
	return oauthcloudconfigroot;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setOauthcloudconfigroot(ConfigNodePropertyString oauthcloudconfigroot)
{
	this->oauthcloudconfigroot = oauthcloudconfigroot;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigroot()
{
	return providerconfigroot;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigroot(ConfigNodePropertyString providerconfigroot)
{
	this->providerconfigroot = providerconfigroot;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigcreatetagsenabled()
{
	return providerconfigcreatetagsenabled;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigcreatetagsenabled(ConfigNodePropertyBoolean providerconfigcreatetagsenabled)
{
	this->providerconfigcreatetagsenabled = providerconfigcreatetagsenabled;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfiguserfolder()
{
	return providerconfiguserfolder;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfiguserfolder(ConfigNodePropertyDropDown providerconfiguserfolder)
{
	this->providerconfiguserfolder = providerconfiguserfolder;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigfacebookfetchfields()
{
	return providerconfigfacebookfetchfields;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigfacebookfetchfields(ConfigNodePropertyBoolean providerconfigfacebookfetchfields)
{
	this->providerconfigfacebookfetchfields = providerconfigfacebookfetchfields;
}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigfacebookfields()
{
	return providerconfigfacebookfields;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigfacebookfields(ConfigNodePropertyArray providerconfigfacebookfields)
{
	this->providerconfigfacebookfields = providerconfigfacebookfields;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::getProviderconfigrefreshuserdataenabled()
{
	return providerconfigrefreshuserdataenabled;
}

void
ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties::setProviderconfigrefreshuserdataenabled(ConfigNodePropertyBoolean providerconfigrefreshuserdataenabled)
{
	this->providerconfigrefreshuserdataenabled = providerconfigrefreshuserdataenabled;
}



