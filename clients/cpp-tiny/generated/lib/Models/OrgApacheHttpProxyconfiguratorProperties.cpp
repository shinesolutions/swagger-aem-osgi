

#include "OrgApacheHttpProxyconfiguratorProperties.h"

using namespace Tiny;

OrgApacheHttpProxyconfiguratorProperties::OrgApacheHttpProxyconfiguratorProperties()
{
	proxyenabled = ConfigNodePropertyBoolean();
	proxyhost = ConfigNodePropertyString();
	proxyport = ConfigNodePropertyInteger();
	proxyuser = ConfigNodePropertyString();
	proxypassword = ConfigNodePropertyString();
	proxyexceptions = ConfigNodePropertyArray();
}

OrgApacheHttpProxyconfiguratorProperties::OrgApacheHttpProxyconfiguratorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheHttpProxyconfiguratorProperties::~OrgApacheHttpProxyconfiguratorProperties()
{

}

void
OrgApacheHttpProxyconfiguratorProperties::fromJson(std::string jsonObj)
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

    const char *proxyportKey = "proxy.port";

    if(object.has_key(proxyportKey))
    {
        bourne::json value = object[proxyportKey];




        ConfigNodePropertyInteger* obj = &proxyport;
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

    const char *proxyexceptionsKey = "proxy.exceptions";

    if(object.has_key(proxyexceptionsKey))
    {
        bourne::json value = object[proxyexceptionsKey];




        ConfigNodePropertyArray* obj = &proxyexceptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheHttpProxyconfiguratorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["proxyenabled"] = getProxyenabled().toJson();






	object["proxyhost"] = getProxyhost().toJson();






	object["proxyport"] = getProxyport().toJson();






	object["proxyuser"] = getProxyuser().toJson();






	object["proxypassword"] = getProxypassword().toJson();






	object["proxyexceptions"] = getProxyexceptions().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheHttpProxyconfiguratorProperties::getProxyenabled()
{
	return proxyenabled;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyenabled(ConfigNodePropertyBoolean proxyenabled)
{
	this->proxyenabled = proxyenabled;
}

ConfigNodePropertyString
OrgApacheHttpProxyconfiguratorProperties::getProxyhost()
{
	return proxyhost;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyhost(ConfigNodePropertyString proxyhost)
{
	this->proxyhost = proxyhost;
}

ConfigNodePropertyInteger
OrgApacheHttpProxyconfiguratorProperties::getProxyport()
{
	return proxyport;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyport(ConfigNodePropertyInteger proxyport)
{
	this->proxyport = proxyport;
}

ConfigNodePropertyString
OrgApacheHttpProxyconfiguratorProperties::getProxyuser()
{
	return proxyuser;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyuser(ConfigNodePropertyString proxyuser)
{
	this->proxyuser = proxyuser;
}

ConfigNodePropertyString
OrgApacheHttpProxyconfiguratorProperties::getProxypassword()
{
	return proxypassword;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxypassword(ConfigNodePropertyString proxypassword)
{
	this->proxypassword = proxypassword;
}

ConfigNodePropertyArray
OrgApacheHttpProxyconfiguratorProperties::getProxyexceptions()
{
	return proxyexceptions;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyexceptions(ConfigNodePropertyArray proxyexceptions)
{
	this->proxyexceptions = proxyexceptions;
}



