

#include "ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties()
{
	oauthproviderid = ConfigNodePropertyString();
	oauthcloudconfigroot = ConfigNodePropertyString();
	providerconfigroot = ConfigNodePropertyString();
	providerconfiguserfolder = ConfigNodePropertyDropDown();
	providerconfigtwitterenableparams = ConfigNodePropertyBoolean();
	providerconfigtwitterparams = ConfigNodePropertyArray();
	providerconfigrefreshuserdataenabled = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::~ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties()
{

}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::fromJson(std::string jsonObj)
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

    const char *providerconfiguserfolderKey = "provider.config.user.folder";

    if(object.has_key(providerconfiguserfolderKey))
    {
        bourne::json value = object[providerconfiguserfolderKey];




        ConfigNodePropertyDropDown* obj = &providerconfiguserfolder;
		obj->fromJson(value.dump());

    }

    const char *providerconfigtwitterenableparamsKey = "provider.config.twitter.enable.params";

    if(object.has_key(providerconfigtwitterenableparamsKey))
    {
        bourne::json value = object[providerconfigtwitterenableparamsKey];




        ConfigNodePropertyBoolean* obj = &providerconfigtwitterenableparams;
		obj->fromJson(value.dump());

    }

    const char *providerconfigtwitterparamsKey = "provider.config.twitter.params";

    if(object.has_key(providerconfigtwitterparamsKey))
    {
        bourne::json value = object[providerconfigtwitterparamsKey];




        ConfigNodePropertyArray* obj = &providerconfigtwitterparams;
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
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthproviderid"] = getOauthproviderid().toJson();






	object["oauthcloudconfigroot"] = getOauthcloudconfigroot().toJson();






	object["providerconfigroot"] = getProviderconfigroot().toJson();






	object["providerconfiguserfolder"] = getProviderconfiguserfolder().toJson();






	object["providerconfigtwitterenableparams"] = getProviderconfigtwitterenableparams().toJson();






	object["providerconfigtwitterparams"] = getProviderconfigtwitterparams().toJson();






	object["providerconfigrefreshuserdataenabled"] = getProviderconfigrefreshuserdataenabled().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setOauthproviderid(ConfigNodePropertyString oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getOauthcloudconfigroot()
{
	return oauthcloudconfigroot;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setOauthcloudconfigroot(ConfigNodePropertyString oauthcloudconfigroot)
{
	this->oauthcloudconfigroot = oauthcloudconfigroot;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfigroot()
{
	return providerconfigroot;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfigroot(ConfigNodePropertyString providerconfigroot)
{
	this->providerconfigroot = providerconfigroot;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfiguserfolder()
{
	return providerconfiguserfolder;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfiguserfolder(ConfigNodePropertyDropDown providerconfiguserfolder)
{
	this->providerconfiguserfolder = providerconfiguserfolder;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfigtwitterenableparams()
{
	return providerconfigtwitterenableparams;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfigtwitterenableparams(ConfigNodePropertyBoolean providerconfigtwitterenableparams)
{
	this->providerconfigtwitterenableparams = providerconfigtwitterenableparams;
}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfigtwitterparams()
{
	return providerconfigtwitterparams;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfigtwitterparams(ConfigNodePropertyArray providerconfigtwitterparams)
{
	this->providerconfigtwitterparams = providerconfigtwitterparams;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::getProviderconfigrefreshuserdataenabled()
{
	return providerconfigrefreshuserdataenabled;
}

void
ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties::setProviderconfigrefreshuserdataenabled(ConfigNodePropertyBoolean providerconfigrefreshuserdataenabled)
{
	this->providerconfigrefreshuserdataenabled = providerconfigrefreshuserdataenabled;
}



