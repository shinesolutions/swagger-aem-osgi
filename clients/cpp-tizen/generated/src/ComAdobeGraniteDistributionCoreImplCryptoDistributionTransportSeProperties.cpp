#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties()
{
	//__init();
}

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::~ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//username = new ConfigNodePropertyString();
	//encryptedPassword = new ConfigNodePropertyString();
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//if(encryptedPassword != NULL) {
	//
	//delete encryptedPassword;
	//encryptedPassword = NULL;
	//}
	//
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&name, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&username, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&username);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *encryptedPasswordKey = "encryptedPassword";
	node = json_object_get_member(pJsonObject, encryptedPasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&encryptedPassword, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&encryptedPassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUsername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUsername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEncryptedPassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEncryptedPassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *encryptedPasswordKey = "encryptedPassword";
	json_object_set_member(pJsonObject, encryptedPasswordKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::getName()
{
	return name;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::getUsername()
{
	return username;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::setUsername(ConfigNodePropertyString  username)
{
	this->username = username;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::getEncryptedPassword()
{
	return encryptedPassword;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::setEncryptedPassword(ConfigNodePropertyString  encryptedPassword)
{
	this->encryptedPassword = encryptedPassword;
}


