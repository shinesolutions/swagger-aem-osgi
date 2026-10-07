

#include "ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.h"

using namespace Tiny;

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties()
{
	facebook = ConfigNodePropertyArray();
	twitter = ConfigNodePropertyArray();
	providerconfiguserfolder = ConfigNodePropertyString();
}

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::~ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties()
{

}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *facebookKey = "facebook";

    if(object.has_key(facebookKey))
    {
        bourne::json value = object[facebookKey];




        ConfigNodePropertyArray* obj = &facebook;
		obj->fromJson(value.dump());

    }

    const char *twitterKey = "twitter";

    if(object.has_key(twitterKey))
    {
        bourne::json value = object[twitterKey];




        ConfigNodePropertyArray* obj = &twitter;
		obj->fromJson(value.dump());

    }

    const char *providerconfiguserfolderKey = "provider.config.user.folder";

    if(object.has_key(providerconfiguserfolderKey))
    {
        bourne::json value = object[providerconfiguserfolderKey];




        ConfigNodePropertyString* obj = &providerconfiguserfolder;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["facebook"] = getFacebook().toJson();






	object["twitter"] = getTwitter().toJson();






	object["providerconfiguserfolder"] = getProviderconfiguserfolder().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::getFacebook()
{
	return facebook;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::setFacebook(ConfigNodePropertyArray facebook)
{
	this->facebook = facebook;
}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::getTwitter()
{
	return twitter;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::setTwitter(ConfigNodePropertyArray twitter)
{
	this->twitter = twitter;
}

ConfigNodePropertyString
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::getProviderconfiguserfolder()
{
	return providerconfiguserfolder;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties::setProviderconfiguserfolder(ConfigNodePropertyString providerconfiguserfolder)
{
	this->providerconfiguserfolder = providerconfiguserfolder;
}



