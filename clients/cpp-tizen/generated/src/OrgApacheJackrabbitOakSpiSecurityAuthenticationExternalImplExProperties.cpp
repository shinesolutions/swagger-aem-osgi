#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::__init()
{
	//jaasranking = new ConfigNodePropertyInteger();
	//jaascontrolFlag = new ConfigNodePropertyString();
	//jaasrealmName = new ConfigNodePropertyString();
	//idpname = new ConfigNodePropertyString();
	//synchandlerName = new ConfigNodePropertyString();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::__cleanup()
{
	//if(jaasranking != NULL) {
	//
	//delete jaasranking;
	//jaasranking = NULL;
	//}
	//if(jaascontrolFlag != NULL) {
	//
	//delete jaascontrolFlag;
	//jaascontrolFlag = NULL;
	//}
	//if(jaasrealmName != NULL) {
	//
	//delete jaasrealmName;
	//jaasrealmName = NULL;
	//}
	//if(idpname != NULL) {
	//
	//delete idpname;
	//idpname = NULL;
	//}
	//if(synchandlerName != NULL) {
	//
	//delete synchandlerName;
	//synchandlerName = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jaasrankingKey = "jaas.ranking";
	node = json_object_get_member(pJsonObject, jaasrankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&jaasranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&jaasranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaascontrolFlagKey = "jaas.controlFlag";
	node = json_object_get_member(pJsonObject, jaascontrolFlagKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jaascontrolFlag, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jaascontrolFlag);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaasrealmNameKey = "jaas.realmName";
	node = json_object_get_member(pJsonObject, jaasrealmNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jaasrealmName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jaasrealmName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idpnameKey = "idp.name";
	node = json_object_get_member(pJsonObject, idpnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&idpname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&idpname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *synchandlerNameKey = "sync.handlerName";
	node = json_object_get_member(pJsonObject, synchandlerNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&synchandlerName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&synchandlerName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getJaasranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getJaasranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaasrankingKey = "jaas.ranking";
	json_object_set_member(pJsonObject, jaasrankingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJaascontrolFlag();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJaascontrolFlag());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaascontrolFlagKey = "jaas.controlFlag";
	json_object_set_member(pJsonObject, jaascontrolFlagKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJaasrealmName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJaasrealmName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaasrealmNameKey = "jaas.realmName";
	json_object_set_member(pJsonObject, jaasrealmNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getIdpname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getIdpname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idpnameKey = "idp.name";
	json_object_set_member(pJsonObject, idpnameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSynchandlerName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSynchandlerName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *synchandlerNameKey = "sync.handlerName";
	json_object_set_member(pJsonObject, synchandlerNameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getJaasranking()
{
	return jaasranking;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setJaasranking(ConfigNodePropertyInteger  jaasranking)
{
	this->jaasranking = jaasranking;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getJaascontrolFlag()
{
	return jaascontrolFlag;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setJaascontrolFlag(ConfigNodePropertyString  jaascontrolFlag)
{
	this->jaascontrolFlag = jaascontrolFlag;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getJaasrealmName()
{
	return jaasrealmName;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setJaasrealmName(ConfigNodePropertyString  jaasrealmName)
{
	this->jaasrealmName = jaasrealmName;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getIdpname()
{
	return idpname;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setIdpname(ConfigNodePropertyString  idpname)
{
	this->idpname = idpname;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::getSynchandlerName()
{
	return synchandlerName;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties::setSynchandlerName(ConfigNodePropertyString  synchandlerName)
{
	this->synchandlerName = synchandlerName;
}


