

#include "ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties()
{
	path = ConfigNodePropertyString();
	oauthclientIdsallowed = ConfigNodePropertyArray();
	authbearersyncims = ConfigNodePropertyBoolean();
	authtokenRequestParameter = ConfigNodePropertyString();
	oauthbearerconfigid = ConfigNodePropertyString();
	oauthjwtsupport = ConfigNodePropertyBoolean();
}

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::~ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties()
{

}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *oauthclientIdsallowedKey = "oauth.clientIds.allowed";

    if(object.has_key(oauthclientIdsallowedKey))
    {
        bourne::json value = object[oauthclientIdsallowedKey];




        ConfigNodePropertyArray* obj = &oauthclientIdsallowed;
		obj->fromJson(value.dump());

    }

    const char *authbearersyncimsKey = "auth.bearer.sync.ims";

    if(object.has_key(authbearersyncimsKey))
    {
        bourne::json value = object[authbearersyncimsKey];




        ConfigNodePropertyBoolean* obj = &authbearersyncims;
		obj->fromJson(value.dump());

    }

    const char *authtokenRequestParameterKey = "auth.tokenRequestParameter";

    if(object.has_key(authtokenRequestParameterKey))
    {
        bourne::json value = object[authtokenRequestParameterKey];




        ConfigNodePropertyString* obj = &authtokenRequestParameter;
		obj->fromJson(value.dump());

    }

    const char *oauthbearerconfigidKey = "oauth.bearer.configid";

    if(object.has_key(oauthbearerconfigidKey))
    {
        bourne::json value = object[oauthbearerconfigidKey];




        ConfigNodePropertyString* obj = &oauthbearerconfigid;
		obj->fromJson(value.dump());

    }

    const char *oauthjwtsupportKey = "oauth.jwt.support";

    if(object.has_key(oauthjwtsupportKey))
    {
        bourne::json value = object[oauthjwtsupportKey];




        ConfigNodePropertyBoolean* obj = &oauthjwtsupport;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["oauthclientIdsallowed"] = getOauthclientIdsallowed().toJson();






	object["authbearersyncims"] = getAuthbearersyncims().toJson();






	object["authtokenRequestParameter"] = getAuthtokenRequestParameter().toJson();






	object["oauthbearerconfigid"] = getOauthbearerconfigid().toJson();






	object["oauthjwtsupport"] = getOauthjwtsupport().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getOauthclientIdsallowed()
{
	return oauthclientIdsallowed;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setOauthclientIdsallowed(ConfigNodePropertyArray oauthclientIdsallowed)
{
	this->oauthclientIdsallowed = oauthclientIdsallowed;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getAuthbearersyncims()
{
	return authbearersyncims;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setAuthbearersyncims(ConfigNodePropertyBoolean authbearersyncims)
{
	this->authbearersyncims = authbearersyncims;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getAuthtokenRequestParameter()
{
	return authtokenRequestParameter;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setAuthtokenRequestParameter(ConfigNodePropertyString authtokenRequestParameter)
{
	this->authtokenRequestParameter = authtokenRequestParameter;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getOauthbearerconfigid()
{
	return oauthbearerconfigid;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setOauthbearerconfigid(ConfigNodePropertyString oauthbearerconfigid)
{
	this->oauthbearerconfigid = oauthbearerconfigid;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getOauthjwtsupport()
{
	return oauthjwtsupport;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setOauthjwtsupport(ConfigNodePropertyBoolean oauthjwtsupport)
{
	this->oauthjwtsupport = oauthjwtsupport;
}



