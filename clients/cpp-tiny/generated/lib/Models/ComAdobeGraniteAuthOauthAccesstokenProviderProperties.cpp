

#include "ComAdobeGraniteAuthOauthAccesstokenProviderProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthAccesstokenProviderProperties::ComAdobeGraniteAuthOauthAccesstokenProviderProperties()
{
	name = ConfigNodePropertyString();
	authtokenprovidertitle = ConfigNodePropertyString();
	authtokenproviderdefaultclaims = ConfigNodePropertyArray();
	authtokenproviderendpoint = ConfigNodePropertyString();
	authaccesstokenrequest = ConfigNodePropertyString();
	authtokenproviderkeypairalias = ConfigNodePropertyString();
	authtokenproviderconntimeout = ConfigNodePropertyInteger();
	authtokenprovidersotimeout = ConfigNodePropertyInteger();
	authtokenproviderclientid = ConfigNodePropertyString();
	authtokenproviderscope = ConfigNodePropertyString();
	authtokenproviderreuseaccesstoken = ConfigNodePropertyBoolean();
	authtokenproviderrelaxedssl = ConfigNodePropertyBoolean();
	tokenrequestcustomizertype = ConfigNodePropertyString();
	authtokenvalidatortype = ConfigNodePropertyString();
}

ComAdobeGraniteAuthOauthAccesstokenProviderProperties::ComAdobeGraniteAuthOauthAccesstokenProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthAccesstokenProviderProperties::~ComAdobeGraniteAuthOauthAccesstokenProviderProperties()
{

}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *authtokenprovidertitleKey = "auth.token.provider.title";

    if(object.has_key(authtokenprovidertitleKey))
    {
        bourne::json value = object[authtokenprovidertitleKey];




        ConfigNodePropertyString* obj = &authtokenprovidertitle;
		obj->fromJson(value.dump());

    }

    const char *authtokenproviderdefaultclaimsKey = "auth.token.provider.default.claims";

    if(object.has_key(authtokenproviderdefaultclaimsKey))
    {
        bourne::json value = object[authtokenproviderdefaultclaimsKey];




        ConfigNodePropertyArray* obj = &authtokenproviderdefaultclaims;
		obj->fromJson(value.dump());

    }

    const char *authtokenproviderendpointKey = "auth.token.provider.endpoint";

    if(object.has_key(authtokenproviderendpointKey))
    {
        bourne::json value = object[authtokenproviderendpointKey];




        ConfigNodePropertyString* obj = &authtokenproviderendpoint;
		obj->fromJson(value.dump());

    }

    const char *authaccesstokenrequestKey = "auth.access.token.request";

    if(object.has_key(authaccesstokenrequestKey))
    {
        bourne::json value = object[authaccesstokenrequestKey];




        ConfigNodePropertyString* obj = &authaccesstokenrequest;
		obj->fromJson(value.dump());

    }

    const char *authtokenproviderkeypairaliasKey = "auth.token.provider.keypair.alias";

    if(object.has_key(authtokenproviderkeypairaliasKey))
    {
        bourne::json value = object[authtokenproviderkeypairaliasKey];




        ConfigNodePropertyString* obj = &authtokenproviderkeypairalias;
		obj->fromJson(value.dump());

    }

    const char *authtokenproviderconntimeoutKey = "auth.token.provider.conn.timeout";

    if(object.has_key(authtokenproviderconntimeoutKey))
    {
        bourne::json value = object[authtokenproviderconntimeoutKey];




        ConfigNodePropertyInteger* obj = &authtokenproviderconntimeout;
		obj->fromJson(value.dump());

    }

    const char *authtokenprovidersotimeoutKey = "auth.token.provider.so.timeout";

    if(object.has_key(authtokenprovidersotimeoutKey))
    {
        bourne::json value = object[authtokenprovidersotimeoutKey];




        ConfigNodePropertyInteger* obj = &authtokenprovidersotimeout;
		obj->fromJson(value.dump());

    }

    const char *authtokenproviderclientidKey = "auth.token.provider.client.id";

    if(object.has_key(authtokenproviderclientidKey))
    {
        bourne::json value = object[authtokenproviderclientidKey];




        ConfigNodePropertyString* obj = &authtokenproviderclientid;
		obj->fromJson(value.dump());

    }

    const char *authtokenproviderscopeKey = "auth.token.provider.scope";

    if(object.has_key(authtokenproviderscopeKey))
    {
        bourne::json value = object[authtokenproviderscopeKey];




        ConfigNodePropertyString* obj = &authtokenproviderscope;
		obj->fromJson(value.dump());

    }

    const char *authtokenproviderreuseaccesstokenKey = "auth.token.provider.reuse.access.token";

    if(object.has_key(authtokenproviderreuseaccesstokenKey))
    {
        bourne::json value = object[authtokenproviderreuseaccesstokenKey];




        ConfigNodePropertyBoolean* obj = &authtokenproviderreuseaccesstoken;
		obj->fromJson(value.dump());

    }

    const char *authtokenproviderrelaxedsslKey = "auth.token.provider.relaxed.ssl";

    if(object.has_key(authtokenproviderrelaxedsslKey))
    {
        bourne::json value = object[authtokenproviderrelaxedsslKey];




        ConfigNodePropertyBoolean* obj = &authtokenproviderrelaxedssl;
		obj->fromJson(value.dump());

    }

    const char *tokenrequestcustomizertypeKey = "token.request.customizer.type";

    if(object.has_key(tokenrequestcustomizertypeKey))
    {
        bourne::json value = object[tokenrequestcustomizertypeKey];




        ConfigNodePropertyString* obj = &tokenrequestcustomizertype;
		obj->fromJson(value.dump());

    }

    const char *authtokenvalidatortypeKey = "auth.token.validator.type";

    if(object.has_key(authtokenvalidatortypeKey))
    {
        bourne::json value = object[authtokenvalidatortypeKey];




        ConfigNodePropertyString* obj = &authtokenvalidatortype;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["authtokenprovidertitle"] = getAuthtokenprovidertitle().toJson();






	object["authtokenproviderdefaultclaims"] = getAuthtokenproviderdefaultclaims().toJson();






	object["authtokenproviderendpoint"] = getAuthtokenproviderendpoint().toJson();






	object["authaccesstokenrequest"] = getAuthaccesstokenrequest().toJson();






	object["authtokenproviderkeypairalias"] = getAuthtokenproviderkeypairalias().toJson();






	object["authtokenproviderconntimeout"] = getAuthtokenproviderconntimeout().toJson();






	object["authtokenprovidersotimeout"] = getAuthtokenprovidersotimeout().toJson();






	object["authtokenproviderclientid"] = getAuthtokenproviderclientid().toJson();






	object["authtokenproviderscope"] = getAuthtokenproviderscope().toJson();






	object["authtokenproviderreuseaccesstoken"] = getAuthtokenproviderreuseaccesstoken().toJson();






	object["authtokenproviderrelaxedssl"] = getAuthtokenproviderrelaxedssl().toJson();






	object["tokenrequestcustomizertype"] = getTokenrequestcustomizertype().toJson();






	object["authtokenvalidatortype"] = getAuthtokenvalidatortype().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getName()
{
	return name;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenprovidertitle()
{
	return authtokenprovidertitle;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenprovidertitle(ConfigNodePropertyString authtokenprovidertitle)
{
	this->authtokenprovidertitle = authtokenprovidertitle;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderdefaultclaims()
{
	return authtokenproviderdefaultclaims;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderdefaultclaims(ConfigNodePropertyArray authtokenproviderdefaultclaims)
{
	this->authtokenproviderdefaultclaims = authtokenproviderdefaultclaims;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderendpoint()
{
	return authtokenproviderendpoint;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderendpoint(ConfigNodePropertyString authtokenproviderendpoint)
{
	this->authtokenproviderendpoint = authtokenproviderendpoint;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthaccesstokenrequest()
{
	return authaccesstokenrequest;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthaccesstokenrequest(ConfigNodePropertyString authaccesstokenrequest)
{
	this->authaccesstokenrequest = authaccesstokenrequest;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderkeypairalias()
{
	return authtokenproviderkeypairalias;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderkeypairalias(ConfigNodePropertyString authtokenproviderkeypairalias)
{
	this->authtokenproviderkeypairalias = authtokenproviderkeypairalias;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderconntimeout()
{
	return authtokenproviderconntimeout;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderconntimeout(ConfigNodePropertyInteger authtokenproviderconntimeout)
{
	this->authtokenproviderconntimeout = authtokenproviderconntimeout;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenprovidersotimeout()
{
	return authtokenprovidersotimeout;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenprovidersotimeout(ConfigNodePropertyInteger authtokenprovidersotimeout)
{
	this->authtokenprovidersotimeout = authtokenprovidersotimeout;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderclientid()
{
	return authtokenproviderclientid;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderclientid(ConfigNodePropertyString authtokenproviderclientid)
{
	this->authtokenproviderclientid = authtokenproviderclientid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderscope()
{
	return authtokenproviderscope;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderscope(ConfigNodePropertyString authtokenproviderscope)
{
	this->authtokenproviderscope = authtokenproviderscope;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderreuseaccesstoken()
{
	return authtokenproviderreuseaccesstoken;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderreuseaccesstoken(ConfigNodePropertyBoolean authtokenproviderreuseaccesstoken)
{
	this->authtokenproviderreuseaccesstoken = authtokenproviderreuseaccesstoken;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderrelaxedssl()
{
	return authtokenproviderrelaxedssl;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderrelaxedssl(ConfigNodePropertyBoolean authtokenproviderrelaxedssl)
{
	this->authtokenproviderrelaxedssl = authtokenproviderrelaxedssl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getTokenrequestcustomizertype()
{
	return tokenrequestcustomizertype;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setTokenrequestcustomizertype(ConfigNodePropertyString tokenrequestcustomizertype)
{
	this->tokenrequestcustomizertype = tokenrequestcustomizertype;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenvalidatortype()
{
	return authtokenvalidatortype;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenvalidatortype(ConfigNodePropertyString authtokenvalidatortype)
{
	this->authtokenvalidatortype = authtokenvalidatortype;
}



