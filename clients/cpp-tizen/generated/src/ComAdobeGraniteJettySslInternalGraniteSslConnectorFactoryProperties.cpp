#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties()
{
	//__init();
}

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::~ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::__init()
{
	//comadobegranitejettysslport = new ConfigNodePropertyInteger();
	//comadobegranitejettysslkeystoreuser = new ConfigNodePropertyString();
	//comadobegranitejettysslkeystorepassword = new ConfigNodePropertyString();
	//comadobegranitejettysslciphersuitesexcluded = new ConfigNodePropertyArray();
	//comadobegranitejettysslciphersuitesincluded = new ConfigNodePropertyArray();
	//comadobegranitejettysslclientcertificate = new ConfigNodePropertyDropDown();
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::__cleanup()
{
	//if(comadobegranitejettysslport != NULL) {
	//
	//delete comadobegranitejettysslport;
	//comadobegranitejettysslport = NULL;
	//}
	//if(comadobegranitejettysslkeystoreuser != NULL) {
	//
	//delete comadobegranitejettysslkeystoreuser;
	//comadobegranitejettysslkeystoreuser = NULL;
	//}
	//if(comadobegranitejettysslkeystorepassword != NULL) {
	//
	//delete comadobegranitejettysslkeystorepassword;
	//comadobegranitejettysslkeystorepassword = NULL;
	//}
	//if(comadobegranitejettysslciphersuitesexcluded != NULL) {
	//
	//delete comadobegranitejettysslciphersuitesexcluded;
	//comadobegranitejettysslciphersuitesexcluded = NULL;
	//}
	//if(comadobegranitejettysslciphersuitesincluded != NULL) {
	//
	//delete comadobegranitejettysslciphersuitesincluded;
	//comadobegranitejettysslciphersuitesincluded = NULL;
	//}
	//if(comadobegranitejettysslclientcertificate != NULL) {
	//
	//delete comadobegranitejettysslclientcertificate;
	//comadobegranitejettysslclientcertificate = NULL;
	//}
	//
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobegranitejettysslportKey = "com.adobe.granite.jetty.ssl.port";
	node = json_object_get_member(pJsonObject, comadobegranitejettysslportKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobegranitejettysslport, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobegranitejettysslport);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobegranitejettysslkeystoreuserKey = "com.adobe.granite.jetty.ssl.keystore.user";
	node = json_object_get_member(pJsonObject, comadobegranitejettysslkeystoreuserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobegranitejettysslkeystoreuser, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobegranitejettysslkeystoreuser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobegranitejettysslkeystorepasswordKey = "com.adobe.granite.jetty.ssl.keystore.password";
	node = json_object_get_member(pJsonObject, comadobegranitejettysslkeystorepasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobegranitejettysslkeystorepassword, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobegranitejettysslkeystorepassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobegranitejettysslciphersuitesexcludedKey = "com.adobe.granite.jetty.ssl.ciphersuites.excluded";
	node = json_object_get_member(pJsonObject, comadobegranitejettysslciphersuitesexcludedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&comadobegranitejettysslciphersuitesexcluded, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&comadobegranitejettysslciphersuitesexcluded);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobegranitejettysslciphersuitesincludedKey = "com.adobe.granite.jetty.ssl.ciphersuites.included";
	node = json_object_get_member(pJsonObject, comadobegranitejettysslciphersuitesincludedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&comadobegranitejettysslciphersuitesincluded, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&comadobegranitejettysslciphersuitesincluded);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobegranitejettysslclientcertificateKey = "com.adobe.granite.jetty.ssl.client.certificate";
	node = json_object_get_member(pJsonObject, comadobegranitejettysslclientcertificateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&comadobegranitejettysslclientcertificate, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&comadobegranitejettysslclientcertificate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobegranitejettysslport();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobegranitejettysslport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitejettysslportKey = "com.adobe.granite.jetty.ssl.port";
	json_object_set_member(pJsonObject, comadobegranitejettysslportKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobegranitejettysslkeystoreuser();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobegranitejettysslkeystoreuser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitejettysslkeystoreuserKey = "com.adobe.granite.jetty.ssl.keystore.user";
	json_object_set_member(pJsonObject, comadobegranitejettysslkeystoreuserKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobegranitejettysslkeystorepassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobegranitejettysslkeystorepassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitejettysslkeystorepasswordKey = "com.adobe.granite.jetty.ssl.keystore.password";
	json_object_set_member(pJsonObject, comadobegranitejettysslkeystorepasswordKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComadobegranitejettysslciphersuitesexcluded();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComadobegranitejettysslciphersuitesexcluded());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitejettysslciphersuitesexcludedKey = "com.adobe.granite.jetty.ssl.ciphersuites.excluded";
	json_object_set_member(pJsonObject, comadobegranitejettysslciphersuitesexcludedKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComadobegranitejettysslciphersuitesincluded();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComadobegranitejettysslciphersuitesincluded());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitejettysslciphersuitesincludedKey = "com.adobe.granite.jetty.ssl.ciphersuites.included";
	json_object_set_member(pJsonObject, comadobegranitejettysslciphersuitesincludedKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getComadobegranitejettysslclientcertificate();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getComadobegranitejettysslclientcertificate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitejettysslclientcertificateKey = "com.adobe.granite.jetty.ssl.client.certificate";
	json_object_set_member(pJsonObject, comadobegranitejettysslclientcertificateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslport()
{
	return comadobegranitejettysslport;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslport(ConfigNodePropertyInteger  comadobegranitejettysslport)
{
	this->comadobegranitejettysslport = comadobegranitejettysslport;
}

ConfigNodePropertyString
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslkeystoreuser()
{
	return comadobegranitejettysslkeystoreuser;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslkeystoreuser(ConfigNodePropertyString  comadobegranitejettysslkeystoreuser)
{
	this->comadobegranitejettysslkeystoreuser = comadobegranitejettysslkeystoreuser;
}

ConfigNodePropertyString
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslkeystorepassword()
{
	return comadobegranitejettysslkeystorepassword;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslkeystorepassword(ConfigNodePropertyString  comadobegranitejettysslkeystorepassword)
{
	this->comadobegranitejettysslkeystorepassword = comadobegranitejettysslkeystorepassword;
}

ConfigNodePropertyArray
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslciphersuitesexcluded()
{
	return comadobegranitejettysslciphersuitesexcluded;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslciphersuitesexcluded(ConfigNodePropertyArray  comadobegranitejettysslciphersuitesexcluded)
{
	this->comadobegranitejettysslciphersuitesexcluded = comadobegranitejettysslciphersuitesexcluded;
}

ConfigNodePropertyArray
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslciphersuitesincluded()
{
	return comadobegranitejettysslciphersuitesincluded;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslciphersuitesincluded(ConfigNodePropertyArray  comadobegranitejettysslciphersuitesincluded)
{
	this->comadobegranitejettysslciphersuitesincluded = comadobegranitejettysslciphersuitesincluded;
}

ConfigNodePropertyDropDown
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::getComadobegranitejettysslclientcertificate()
{
	return comadobegranitejettysslclientcertificate;
}

void
ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties::setComadobegranitejettysslclientcertificate(ConfigNodePropertyDropDown  comadobegranitejettysslclientcertificate)
{
	this->comadobegranitejettysslclientcertificate = comadobegranitejettysslclientcertificate;
}


