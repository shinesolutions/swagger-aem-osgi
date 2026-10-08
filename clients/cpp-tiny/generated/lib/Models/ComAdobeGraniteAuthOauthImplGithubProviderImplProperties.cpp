

#include "ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::ComAdobeGraniteAuthOauthImplGithubProviderImplProperties()
{
	oauthproviderid = ConfigNodePropertyString();
	oauthprovidergithubauthorizationurl = ConfigNodePropertyString();
	oauthprovidergithubtokenurl = ConfigNodePropertyString();
	oauthprovidergithubprofileurl = ConfigNodePropertyString();
}

ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::~ComAdobeGraniteAuthOauthImplGithubProviderImplProperties()
{

}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthprovideridKey = "oauth.provider.id";

    if(object.has_key(oauthprovideridKey))
    {
        bourne::json value = object[oauthprovideridKey];




        ConfigNodePropertyString* obj = &oauthproviderid;
		obj->fromJson(value.dump());

    }

    const char *oauthprovidergithubauthorizationurlKey = "oauth.provider.github.authorization.url";

    if(object.has_key(oauthprovidergithubauthorizationurlKey))
    {
        bourne::json value = object[oauthprovidergithubauthorizationurlKey];




        ConfigNodePropertyString* obj = &oauthprovidergithubauthorizationurl;
		obj->fromJson(value.dump());

    }

    const char *oauthprovidergithubtokenurlKey = "oauth.provider.github.token.url";

    if(object.has_key(oauthprovidergithubtokenurlKey))
    {
        bourne::json value = object[oauthprovidergithubtokenurlKey];




        ConfigNodePropertyString* obj = &oauthprovidergithubtokenurl;
		obj->fromJson(value.dump());

    }

    const char *oauthprovidergithubprofileurlKey = "oauth.provider.github.profile.url";

    if(object.has_key(oauthprovidergithubprofileurlKey))
    {
        bourne::json value = object[oauthprovidergithubprofileurlKey];




        ConfigNodePropertyString* obj = &oauthprovidergithubprofileurl;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthproviderid"] = getOauthproviderid().toJson();






	object["oauthprovidergithubauthorizationurl"] = getOauthprovidergithubauthorizationurl().toJson();






	object["oauthprovidergithubtokenurl"] = getOauthprovidergithubtokenurl().toJson();






	object["oauthprovidergithubprofileurl"] = getOauthprovidergithubprofileurl().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::setOauthproviderid(ConfigNodePropertyString oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::getOauthprovidergithubauthorizationurl()
{
	return oauthprovidergithubauthorizationurl;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::setOauthprovidergithubauthorizationurl(ConfigNodePropertyString oauthprovidergithubauthorizationurl)
{
	this->oauthprovidergithubauthorizationurl = oauthprovidergithubauthorizationurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::getOauthprovidergithubtokenurl()
{
	return oauthprovidergithubtokenurl;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::setOauthprovidergithubtokenurl(ConfigNodePropertyString oauthprovidergithubtokenurl)
{
	this->oauthprovidergithubtokenurl = oauthprovidergithubtokenurl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::getOauthprovidergithubprofileurl()
{
	return oauthprovidergithubprofileurl;
}

void
ComAdobeGraniteAuthOauthImplGithubProviderImplProperties::setOauthprovidergithubprofileurl(ConfigNodePropertyString oauthprovidergithubprofileurl)
{
	this->oauthprovidergithubprofileurl = oauthprovidergithubprofileurl;
}



