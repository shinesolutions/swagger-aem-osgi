#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCommonsHttpclientProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCommonsHttpclientProperties::ComDayCommonsHttpclientProperties()
{
	//__init();
}

ComDayCommonsHttpclientProperties::~ComDayCommonsHttpclientProperties()
{
	//__cleanup();
}

void
ComDayCommonsHttpclientProperties::__init()
{
	//proxyenabled = new ConfigNodePropertyBoolean();
	//proxyhost = new ConfigNodePropertyString();
	//proxyuser = new ConfigNodePropertyString();
	//proxypassword = new ConfigNodePropertyString();
	//proxyntlmhost = new ConfigNodePropertyString();
	//proxyntlmdomain = new ConfigNodePropertyString();
	//proxyexceptions = new ConfigNodePropertyArray();
}

void
ComDayCommonsHttpclientProperties::__cleanup()
{
	//if(proxyenabled != NULL) {
	//
	//delete proxyenabled;
	//proxyenabled = NULL;
	//}
	//if(proxyhost != NULL) {
	//
	//delete proxyhost;
	//proxyhost = NULL;
	//}
	//if(proxyuser != NULL) {
	//
	//delete proxyuser;
	//proxyuser = NULL;
	//}
	//if(proxypassword != NULL) {
	//
	//delete proxypassword;
	//proxypassword = NULL;
	//}
	//if(proxyntlmhost != NULL) {
	//
	//delete proxyntlmhost;
	//proxyntlmhost = NULL;
	//}
	//if(proxyntlmdomain != NULL) {
	//
	//delete proxyntlmdomain;
	//proxyntlmdomain = NULL;
	//}
	//if(proxyexceptions != NULL) {
	//
	//delete proxyexceptions;
	//proxyexceptions = NULL;
	//}
	//
}

void
ComDayCommonsHttpclientProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *proxyenabledKey = "proxy.enabled";
	node = json_object_get_member(pJsonObject, proxyenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&proxyenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&proxyenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *proxyhostKey = "proxy.host";
	node = json_object_get_member(pJsonObject, proxyhostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&proxyhost, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&proxyhost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *proxyuserKey = "proxy.user";
	node = json_object_get_member(pJsonObject, proxyuserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&proxyuser, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&proxyuser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *proxypasswordKey = "proxy.password";
	node = json_object_get_member(pJsonObject, proxypasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&proxypassword, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&proxypassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *proxyntlmhostKey = "proxy.ntlm.host";
	node = json_object_get_member(pJsonObject, proxyntlmhostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&proxyntlmhost, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&proxyntlmhost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *proxyntlmdomainKey = "proxy.ntlm.domain";
	node = json_object_get_member(pJsonObject, proxyntlmdomainKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&proxyntlmdomain, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&proxyntlmdomain);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *proxyexceptionsKey = "proxy.exceptions";
	node = json_object_get_member(pJsonObject, proxyexceptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&proxyexceptions, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&proxyexceptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCommonsHttpclientProperties::ComDayCommonsHttpclientProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCommonsHttpclientProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getProxyenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getProxyenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *proxyenabledKey = "proxy.enabled";
	json_object_set_member(pJsonObject, proxyenabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProxyhost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProxyhost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *proxyhostKey = "proxy.host";
	json_object_set_member(pJsonObject, proxyhostKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProxyuser();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProxyuser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *proxyuserKey = "proxy.user";
	json_object_set_member(pJsonObject, proxyuserKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProxypassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProxypassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *proxypasswordKey = "proxy.password";
	json_object_set_member(pJsonObject, proxypasswordKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProxyntlmhost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProxyntlmhost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *proxyntlmhostKey = "proxy.ntlm.host";
	json_object_set_member(pJsonObject, proxyntlmhostKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProxyntlmdomain();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProxyntlmdomain());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *proxyntlmdomainKey = "proxy.ntlm.domain";
	json_object_set_member(pJsonObject, proxyntlmdomainKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getProxyexceptions();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getProxyexceptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *proxyexceptionsKey = "proxy.exceptions";
	json_object_set_member(pJsonObject, proxyexceptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCommonsHttpclientProperties::getProxyenabled()
{
	return proxyenabled;
}

void
ComDayCommonsHttpclientProperties::setProxyenabled(ConfigNodePropertyBoolean  proxyenabled)
{
	this->proxyenabled = proxyenabled;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxyhost()
{
	return proxyhost;
}

void
ComDayCommonsHttpclientProperties::setProxyhost(ConfigNodePropertyString  proxyhost)
{
	this->proxyhost = proxyhost;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxyuser()
{
	return proxyuser;
}

void
ComDayCommonsHttpclientProperties::setProxyuser(ConfigNodePropertyString  proxyuser)
{
	this->proxyuser = proxyuser;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxypassword()
{
	return proxypassword;
}

void
ComDayCommonsHttpclientProperties::setProxypassword(ConfigNodePropertyString  proxypassword)
{
	this->proxypassword = proxypassword;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxyntlmhost()
{
	return proxyntlmhost;
}

void
ComDayCommonsHttpclientProperties::setProxyntlmhost(ConfigNodePropertyString  proxyntlmhost)
{
	this->proxyntlmhost = proxyntlmhost;
}

ConfigNodePropertyString
ComDayCommonsHttpclientProperties::getProxyntlmdomain()
{
	return proxyntlmdomain;
}

void
ComDayCommonsHttpclientProperties::setProxyntlmdomain(ConfigNodePropertyString  proxyntlmdomain)
{
	this->proxyntlmdomain = proxyntlmdomain;
}

ConfigNodePropertyArray
ComDayCommonsHttpclientProperties::getProxyexceptions()
{
	return proxyexceptions;
}

void
ComDayCommonsHttpclientProperties::setProxyexceptions(ConfigNodePropertyArray  proxyexceptions)
{
	this->proxyexceptions = proxyexceptions;
}


