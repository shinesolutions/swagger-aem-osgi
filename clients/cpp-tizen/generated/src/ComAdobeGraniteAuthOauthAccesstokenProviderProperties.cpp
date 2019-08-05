#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthOauthAccesstokenProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthOauthAccesstokenProviderProperties::ComAdobeGraniteAuthOauthAccesstokenProviderProperties()
{
	//__init();
}

ComAdobeGraniteAuthOauthAccesstokenProviderProperties::~ComAdobeGraniteAuthOauthAccesstokenProviderProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//authtokenprovidertitle = new ConfigNodePropertyString();
	//authtokenproviderdefaultclaims = new ConfigNodePropertyArray();
	//authtokenproviderendpoint = new ConfigNodePropertyString();
	//authaccesstokenrequest = new ConfigNodePropertyString();
	//authtokenproviderkeypairalias = new ConfigNodePropertyString();
	//authtokenproviderconntimeout = new ConfigNodePropertyInteger();
	//authtokenprovidersotimeout = new ConfigNodePropertyInteger();
	//authtokenproviderclientid = new ConfigNodePropertyString();
	//authtokenproviderscope = new ConfigNodePropertyString();
	//authtokenproviderreuseaccesstoken = new ConfigNodePropertyBoolean();
	//authtokenproviderrelaxedssl = new ConfigNodePropertyBoolean();
	//tokenrequestcustomizertype = new ConfigNodePropertyString();
	//authtokenvalidatortype = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(authtokenprovidertitle != NULL) {
	//
	//delete authtokenprovidertitle;
	//authtokenprovidertitle = NULL;
	//}
	//if(authtokenproviderdefaultclaims != NULL) {
	//
	//delete authtokenproviderdefaultclaims;
	//authtokenproviderdefaultclaims = NULL;
	//}
	//if(authtokenproviderendpoint != NULL) {
	//
	//delete authtokenproviderendpoint;
	//authtokenproviderendpoint = NULL;
	//}
	//if(authaccesstokenrequest != NULL) {
	//
	//delete authaccesstokenrequest;
	//authaccesstokenrequest = NULL;
	//}
	//if(authtokenproviderkeypairalias != NULL) {
	//
	//delete authtokenproviderkeypairalias;
	//authtokenproviderkeypairalias = NULL;
	//}
	//if(authtokenproviderconntimeout != NULL) {
	//
	//delete authtokenproviderconntimeout;
	//authtokenproviderconntimeout = NULL;
	//}
	//if(authtokenprovidersotimeout != NULL) {
	//
	//delete authtokenprovidersotimeout;
	//authtokenprovidersotimeout = NULL;
	//}
	//if(authtokenproviderclientid != NULL) {
	//
	//delete authtokenproviderclientid;
	//authtokenproviderclientid = NULL;
	//}
	//if(authtokenproviderscope != NULL) {
	//
	//delete authtokenproviderscope;
	//authtokenproviderscope = NULL;
	//}
	//if(authtokenproviderreuseaccesstoken != NULL) {
	//
	//delete authtokenproviderreuseaccesstoken;
	//authtokenproviderreuseaccesstoken = NULL;
	//}
	//if(authtokenproviderrelaxedssl != NULL) {
	//
	//delete authtokenproviderrelaxedssl;
	//authtokenproviderrelaxedssl = NULL;
	//}
	//if(tokenrequestcustomizertype != NULL) {
	//
	//delete tokenrequestcustomizertype;
	//tokenrequestcustomizertype = NULL;
	//}
	//if(authtokenvalidatortype != NULL) {
	//
	//delete authtokenvalidatortype;
	//authtokenvalidatortype = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::fromJson(char* jsonStr)
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
	const gchar *authtokenprovidertitleKey = "auth.token.provider.title";
	node = json_object_get_member(pJsonObject, authtokenprovidertitleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authtokenprovidertitle, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authtokenprovidertitle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenproviderdefaultclaimsKey = "auth.token.provider.default.claims";
	node = json_object_get_member(pJsonObject, authtokenproviderdefaultclaimsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&authtokenproviderdefaultclaims, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&authtokenproviderdefaultclaims);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenproviderendpointKey = "auth.token.provider.endpoint";
	node = json_object_get_member(pJsonObject, authtokenproviderendpointKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authtokenproviderendpoint, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authtokenproviderendpoint);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authaccesstokenrequestKey = "auth.access.token.request";
	node = json_object_get_member(pJsonObject, authaccesstokenrequestKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authaccesstokenrequest, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authaccesstokenrequest);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenproviderkeypairaliasKey = "auth.token.provider.keypair.alias";
	node = json_object_get_member(pJsonObject, authtokenproviderkeypairaliasKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authtokenproviderkeypairalias, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authtokenproviderkeypairalias);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenproviderconntimeoutKey = "auth.token.provider.conn.timeout";
	node = json_object_get_member(pJsonObject, authtokenproviderconntimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&authtokenproviderconntimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&authtokenproviderconntimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenprovidersotimeoutKey = "auth.token.provider.so.timeout";
	node = json_object_get_member(pJsonObject, authtokenprovidersotimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&authtokenprovidersotimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&authtokenprovidersotimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenproviderclientidKey = "auth.token.provider.client.id";
	node = json_object_get_member(pJsonObject, authtokenproviderclientidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authtokenproviderclientid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authtokenproviderclientid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenproviderscopeKey = "auth.token.provider.scope";
	node = json_object_get_member(pJsonObject, authtokenproviderscopeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authtokenproviderscope, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authtokenproviderscope);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenproviderreuseaccesstokenKey = "auth.token.provider.reuse.access.token";
	node = json_object_get_member(pJsonObject, authtokenproviderreuseaccesstokenKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&authtokenproviderreuseaccesstoken, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&authtokenproviderreuseaccesstoken);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenproviderrelaxedsslKey = "auth.token.provider.relaxed.ssl";
	node = json_object_get_member(pJsonObject, authtokenproviderrelaxedsslKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&authtokenproviderrelaxedssl, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&authtokenproviderrelaxedssl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tokenrequestcustomizertypeKey = "token.request.customizer.type";
	node = json_object_get_member(pJsonObject, tokenrequestcustomizertypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&tokenrequestcustomizertype, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&tokenrequestcustomizertype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenvalidatortypeKey = "auth.token.validator.type";
	node = json_object_get_member(pJsonObject, authtokenvalidatortypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authtokenvalidatortype, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authtokenvalidatortype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthOauthAccesstokenProviderProperties::ComAdobeGraniteAuthOauthAccesstokenProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::toJson()
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
		ConfigNodePropertyString obj = getAuthtokenprovidertitle();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthtokenprovidertitle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenprovidertitleKey = "auth.token.provider.title";
	json_object_set_member(pJsonObject, authtokenprovidertitleKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAuthtokenproviderdefaultclaims();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAuthtokenproviderdefaultclaims());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenproviderdefaultclaimsKey = "auth.token.provider.default.claims";
	json_object_set_member(pJsonObject, authtokenproviderdefaultclaimsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthtokenproviderendpoint();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthtokenproviderendpoint());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenproviderendpointKey = "auth.token.provider.endpoint";
	json_object_set_member(pJsonObject, authtokenproviderendpointKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthaccesstokenrequest();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthaccesstokenrequest());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authaccesstokenrequestKey = "auth.access.token.request";
	json_object_set_member(pJsonObject, authaccesstokenrequestKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthtokenproviderkeypairalias();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthtokenproviderkeypairalias());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenproviderkeypairaliasKey = "auth.token.provider.keypair.alias";
	json_object_set_member(pJsonObject, authtokenproviderkeypairaliasKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getAuthtokenproviderconntimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getAuthtokenproviderconntimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenproviderconntimeoutKey = "auth.token.provider.conn.timeout";
	json_object_set_member(pJsonObject, authtokenproviderconntimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getAuthtokenprovidersotimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getAuthtokenprovidersotimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenprovidersotimeoutKey = "auth.token.provider.so.timeout";
	json_object_set_member(pJsonObject, authtokenprovidersotimeoutKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthtokenproviderclientid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthtokenproviderclientid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenproviderclientidKey = "auth.token.provider.client.id";
	json_object_set_member(pJsonObject, authtokenproviderclientidKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthtokenproviderscope();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthtokenproviderscope());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenproviderscopeKey = "auth.token.provider.scope";
	json_object_set_member(pJsonObject, authtokenproviderscopeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAuthtokenproviderreuseaccesstoken();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAuthtokenproviderreuseaccesstoken());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenproviderreuseaccesstokenKey = "auth.token.provider.reuse.access.token";
	json_object_set_member(pJsonObject, authtokenproviderreuseaccesstokenKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAuthtokenproviderrelaxedssl();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAuthtokenproviderrelaxedssl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenproviderrelaxedsslKey = "auth.token.provider.relaxed.ssl";
	json_object_set_member(pJsonObject, authtokenproviderrelaxedsslKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTokenrequestcustomizertype();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTokenrequestcustomizertype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tokenrequestcustomizertypeKey = "token.request.customizer.type";
	json_object_set_member(pJsonObject, tokenrequestcustomizertypeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthtokenvalidatortype();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthtokenvalidatortype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenvalidatortypeKey = "auth.token.validator.type";
	json_object_set_member(pJsonObject, authtokenvalidatortypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getName()
{
	return name;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenprovidertitle()
{
	return authtokenprovidertitle;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenprovidertitle(ConfigNodePropertyString  authtokenprovidertitle)
{
	this->authtokenprovidertitle = authtokenprovidertitle;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderdefaultclaims()
{
	return authtokenproviderdefaultclaims;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderdefaultclaims(ConfigNodePropertyArray  authtokenproviderdefaultclaims)
{
	this->authtokenproviderdefaultclaims = authtokenproviderdefaultclaims;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderendpoint()
{
	return authtokenproviderendpoint;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderendpoint(ConfigNodePropertyString  authtokenproviderendpoint)
{
	this->authtokenproviderendpoint = authtokenproviderendpoint;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthaccesstokenrequest()
{
	return authaccesstokenrequest;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthaccesstokenrequest(ConfigNodePropertyString  authaccesstokenrequest)
{
	this->authaccesstokenrequest = authaccesstokenrequest;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderkeypairalias()
{
	return authtokenproviderkeypairalias;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderkeypairalias(ConfigNodePropertyString  authtokenproviderkeypairalias)
{
	this->authtokenproviderkeypairalias = authtokenproviderkeypairalias;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderconntimeout()
{
	return authtokenproviderconntimeout;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderconntimeout(ConfigNodePropertyInteger  authtokenproviderconntimeout)
{
	this->authtokenproviderconntimeout = authtokenproviderconntimeout;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenprovidersotimeout()
{
	return authtokenprovidersotimeout;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenprovidersotimeout(ConfigNodePropertyInteger  authtokenprovidersotimeout)
{
	this->authtokenprovidersotimeout = authtokenprovidersotimeout;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderclientid()
{
	return authtokenproviderclientid;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderclientid(ConfigNodePropertyString  authtokenproviderclientid)
{
	this->authtokenproviderclientid = authtokenproviderclientid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderscope()
{
	return authtokenproviderscope;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderscope(ConfigNodePropertyString  authtokenproviderscope)
{
	this->authtokenproviderscope = authtokenproviderscope;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderreuseaccesstoken()
{
	return authtokenproviderreuseaccesstoken;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderreuseaccesstoken(ConfigNodePropertyBoolean  authtokenproviderreuseaccesstoken)
{
	this->authtokenproviderreuseaccesstoken = authtokenproviderreuseaccesstoken;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenproviderrelaxedssl()
{
	return authtokenproviderrelaxedssl;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenproviderrelaxedssl(ConfigNodePropertyBoolean  authtokenproviderrelaxedssl)
{
	this->authtokenproviderrelaxedssl = authtokenproviderrelaxedssl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getTokenrequestcustomizertype()
{
	return tokenrequestcustomizertype;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setTokenrequestcustomizertype(ConfigNodePropertyString  tokenrequestcustomizertype)
{
	this->tokenrequestcustomizertype = tokenrequestcustomizertype;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::getAuthtokenvalidatortype()
{
	return authtokenvalidatortype;
}

void
ComAdobeGraniteAuthOauthAccesstokenProviderProperties::setAuthtokenvalidatortype(ConfigNodePropertyString  authtokenvalidatortype)
{
	this->authtokenvalidatortype = authtokenvalidatortype;
}


