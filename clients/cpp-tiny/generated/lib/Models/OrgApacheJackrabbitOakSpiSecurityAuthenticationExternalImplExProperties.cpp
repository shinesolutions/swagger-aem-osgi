

#include "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties()
{
	jaasranking = ConfigNodePropertyInteger();
	jaascontrolFlag = ConfigNodePropertyString();
	jaasrealmName = ConfigNodePropertyString();
	idpname = ConfigNodePropertyString();
	synchandlerName = ConfigNodePropertyString();
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties()
{

}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jaasrankingKey = "jaas.ranking";

    if(object.has_key(jaasrankingKey))
    {
        bourne::json value = object[jaasrankingKey];




        ConfigNodePropertyInteger* obj = &jaasranking;
		obj->fromJson(value.dump());

    }

    const char *jaascontrolFlagKey = "jaas.controlFlag";

    if(object.has_key(jaascontrolFlagKey))
    {
        bourne::json value = object[jaascontrolFlagKey];




        ConfigNodePropertyString* obj = &jaascontrolFlag;
		obj->fromJson(value.dump());

    }

    const char *jaasrealmNameKey = "jaas.realmName";

    if(object.has_key(jaasrealmNameKey))
    {
        bourne::json value = object[jaasrealmNameKey];




        ConfigNodePropertyString* obj = &jaasrealmName;
		obj->fromJson(value.dump());

    }

    const char *idpnameKey = "idp.name";

    if(object.has_key(idpnameKey))
    {
        bourne::json value = object[idpnameKey];




        ConfigNodePropertyString* obj = &idpname;
		obj->fromJson(value.dump());

    }

    const char *synchandlerNameKey = "sync.handlerName";

    if(object.has_key(synchandlerNameKey))
    {
        bourne::json value = object[synchandlerNameKey];




        ConfigNodePropertyString* obj = &synchandlerName;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jaasranking"] = getJaasranking().toJson();






	object["jaascontrolFlag"] = getJaascontrolFlag().toJson();






	object["jaasrealmName"] = getJaasrealmName().toJson();






	object["idpname"] = getIdpname().toJson();






	object["synchandlerName"] = getSynchandlerName().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getJaasranking()
{
	return jaasranking;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setJaasranking(ConfigNodePropertyInteger jaasranking)
{
	this->jaasranking = jaasranking;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getJaascontrolFlag()
{
	return jaascontrolFlag;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setJaascontrolFlag(ConfigNodePropertyString jaascontrolFlag)
{
	this->jaascontrolFlag = jaascontrolFlag;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getJaasrealmName()
{
	return jaasrealmName;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setJaasrealmName(ConfigNodePropertyString jaasrealmName)
{
	this->jaasrealmName = jaasrealmName;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getIdpname()
{
	return idpname;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setIdpname(ConfigNodePropertyString idpname)
{
	this->idpname = idpname;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getSynchandlerName()
{
	return synchandlerName;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setSynchandlerName(ConfigNodePropertyString synchandlerName)
{
	this->synchandlerName = synchandlerName;
}



