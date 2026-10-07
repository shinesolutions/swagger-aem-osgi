

#include "ComDayCommonsHttpclientProperties.h"

using namespace Tiny;

ComDayCommonsHttpclientProperties::ComDayCommonsHttpclientProperties()
{
	proxyenabled = ConfigNodePropertyBoolean();
	proxyhost = ConfigNodePropertyString();
	proxyuser = ConfigNodePropertyString();
	proxypassword = ConfigNodePropertyString();
	proxyntlmhost = ConfigNodePropertyString();
	proxyntlmdomain = ConfigNodePropertyString();
	proxyexceptions = ConfigNodePropertyArray();
}

ComDayCommonsHttpclientProperties::ComDayCommonsHttpclientProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCommonsHttpclientProperties::~ComDayCommonsHttpclientProperties()
{

}

void
ComDayCommonsHttpclientProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *proxyenabledKey = "proxy.enabled";

    if(object.has_key(proxyenabledKey))
    {
        bourne::json value = object[proxyenabledKey];




        ConfigNodePropertyBoolean* obj = &proxyenabled;
		obj->fromJson(value.dump());

    }

    const char *proxyhostKey = "proxy.host";

    if(object.has_key(proxyhostKey))
    {
        bourne::json value = object[proxyhostKey];




        ConfigNodePropertyString* obj = &proxyhost;
		obj->fromJson(value.dump());

    }

    const char *proxyuserKey = "proxy.user";

    if(object.has_key(proxyuserKey))
    {
        bourne::json value = object[proxyuserKey];




        ConfigNodePropertyString* obj = &proxyuser;
		obj->fromJson(value.dump());

    }

    const char *proxypasswordKey = "proxy.password";

    if(object.has_key(proxypasswordKey))
    {
        bourne::json value = object[proxypasswordKey];




        ConfigNodePropertyString* obj = &proxypassword;
		obj->fromJson(value.dump());

    }

    const char *proxyntlmhostKey = "proxy.ntlm.host";

    if(object.has_key(proxyntlmhostKey))
    {
        bourne::json value = object[proxyntlmhostKey];




        ConfigNodePropertyString* obj = &proxyntlmhost;
		obj->fromJson(value.dump());

    }

    const char *proxyntlmdomainKey = "proxy.ntlm.domain";

    if(object.has_key(proxyntlmdomainKey))
    {
        bourne::json value = object[proxyntlmdomainKey];




        ConfigNodePropertyString* obj = &proxyntlmdomain;
		obj->fromJson(value.dump());

    }

    const char *proxyexceptionsKey = "proxy.exceptions";

    if(object.has_key(proxyexceptionsKey))
    {
        bourne::json value = object[proxyexceptionsKey];




        ConfigNodePropertyArray* obj = &proxyexceptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCommonsHttpclientProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["proxyenabled"] = getProxyenabled().toJson();






	object["proxyhost"] = getProxyhost().toJson();






	object["proxyuser"] = getProxyuser().toJson();






	object["proxypassword"] = getProxypassword().toJson();






	object["proxyntlmhost"] = getProxyntlmhost().toJson();






	object["proxyntlmdomain"] = getProxyntlmdomain().toJson();






	object["proxyexceptions"] = getProxyexceptions().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCommonsHttpclientProperties::getProxyenabled()
{
	return proxyenabled;
}

void
ComDayCommonsHttpclientProperties::setProxyenabled(ConfigNodePropertyBoolean proxyenabled)
{
	this->proxyenabled = proxyenabled;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxyhost()
{
	return proxyhost;
}

void
ComDayCommonsHttpclientProperties::setProxyhost(ConfigNodePropertyString proxyhost)
{
	this->proxyhost = proxyhost;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxyuser()
{
	return proxyuser;
}

void
ComDayCommonsHttpclientProperties::setProxyuser(ConfigNodePropertyString proxyuser)
{
	this->proxyuser = proxyuser;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxypassword()
{
	return proxypassword;
}

void
ComDayCommonsHttpclientProperties::setProxypassword(ConfigNodePropertyString proxypassword)
{
	this->proxypassword = proxypassword;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxyntlmhost()
{
	return proxyntlmhost;
}

void
ComDayCommonsHttpclientProperties::setProxyntlmhost(ConfigNodePropertyString proxyntlmhost)
{
	this->proxyntlmhost = proxyntlmhost;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxyntlmdomain()
{
	return proxyntlmdomain;
}

void
ComDayCommonsHttpclientProperties::setProxyntlmdomain(ConfigNodePropertyString proxyntlmdomain)
{
	this->proxyntlmdomain = proxyntlmdomain;
}

ConfigNodePropertyArray
ComDayCommonsHttpclientProperties::getProxyexceptions()
{
	return proxyexceptions;
}

void
ComDayCommonsHttpclientProperties::setProxyexceptions(ConfigNodePropertyArray proxyexceptions)
{
	this->proxyexceptions = proxyexceptions;
}



