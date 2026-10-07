#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheHttpProxyconfiguratorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheHttpProxyconfiguratorProperties::OrgApacheHttpProxyconfiguratorProperties()
{
	//__init();
}

OrgApacheHttpProxyconfiguratorProperties::~OrgApacheHttpProxyconfiguratorProperties()
{
	//__cleanup();
}

void
OrgApacheHttpProxyconfiguratorProperties::__init()
{
	//proxyenabled = new ConfigNodePropertyBoolean();
	//proxyhost = new ConfigNodePropertyString();
	//proxyport = new ConfigNodePropertyInteger();
	//proxyuser = new ConfigNodePropertyString();
	//proxypassword = new ConfigNodePropertyString();
	//proxyexceptions = new ConfigNodePropertyArray();
}

void
OrgApacheHttpProxyconfiguratorProperties::__cleanup()
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
	//if(proxyport != NULL) {
	//
	//delete proxyport;
	//proxyport = NULL;
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
	//if(proxyexceptions != NULL) {
	//
	//delete proxyexceptions;
	//proxyexceptions = NULL;
	//}
	//
}

void
OrgApacheHttpProxyconfiguratorProperties::fromJson(char* jsonStr)
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
	const gchar *proxyportKey = "proxy.port";
	node = json_object_get_member(pJsonObject, proxyportKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&proxyport, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&proxyport);
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

OrgApacheHttpProxyconfiguratorProperties::OrgApacheHttpProxyconfiguratorProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheHttpProxyconfiguratorProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getProxyport();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getProxyport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *proxyportKey = "proxy.port";
	json_object_set_member(pJsonObject, proxyportKey, node);
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
OrgApacheHttpProxyconfiguratorProperties::getProxyenabled()
{
	return proxyenabled;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyenabled(ConfigNodePropertyBoolean  proxyenabled)
{
	this->proxyenabled = proxyenabled;
}

ConfigNodePropertyString
OrgApacheHttpProxyconfiguratorProperties::getProxyhost()
{
	return proxyhost;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyhost(ConfigNodePropertyString  proxyhost)
{
	this->proxyhost = proxyhost;
}

ConfigNodePropertyInteger
OrgApacheHttpProxyconfiguratorProperties::getProxyport()
{
	return proxyport;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyport(ConfigNodePropertyInteger  proxyport)
{
	this->proxyport = proxyport;
}

ConfigNodePropertyString
OrgApacheHttpProxyconfiguratorProperties::getProxyuser()
{
	return proxyuser;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyuser(ConfigNodePropertyString  proxyuser)
{
	this->proxyuser = proxyuser;
}

ConfigNodePropertyString
OrgApacheHttpProxyconfiguratorProperties::getProxypassword()
{
	return proxypassword;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxypassword(ConfigNodePropertyString  proxypassword)
{
	this->proxypassword = proxypassword;
}

ConfigNodePropertyArray
OrgApacheHttpProxyconfiguratorProperties::getProxyexceptions()
{
	return proxyexceptions;
}

void
OrgApacheHttpProxyconfiguratorProperties::setProxyexceptions(ConfigNodePropertyArray  proxyexceptions)
{
	this->proxyexceptions = proxyexceptions;
}


