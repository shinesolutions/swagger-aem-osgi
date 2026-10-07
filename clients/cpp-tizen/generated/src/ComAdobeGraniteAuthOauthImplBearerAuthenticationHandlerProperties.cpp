#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties()
{
	//__init();
}

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::~ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::__init()
{
	//path = new ConfigNodePropertyString();
	//oauthclientIdsallowed = new ConfigNodePropertyArray();
	//authbearersyncims = new ConfigNodePropertyBoolean();
	//authtokenRequestParameter = new ConfigNodePropertyString();
	//oauthbearerconfigid = new ConfigNodePropertyString();
	//oauthjwtsupport = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(oauthclientIdsallowed != NULL) {
	//
	//delete oauthclientIdsallowed;
	//oauthclientIdsallowed = NULL;
	//}
	//if(authbearersyncims != NULL) {
	//
	//delete authbearersyncims;
	//authbearersyncims = NULL;
	//}
	//if(authtokenRequestParameter != NULL) {
	//
	//delete authtokenRequestParameter;
	//authtokenRequestParameter = NULL;
	//}
	//if(oauthbearerconfigid != NULL) {
	//
	//delete oauthbearerconfigid;
	//oauthbearerconfigid = NULL;
	//}
	//if(oauthjwtsupport != NULL) {
	//
	//delete oauthjwtsupport;
	//oauthjwtsupport = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&path, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthclientIdsallowedKey = "oauth.clientIds.allowed";
	node = json_object_get_member(pJsonObject, oauthclientIdsallowedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&oauthclientIdsallowed, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&oauthclientIdsallowed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authbearersyncimsKey = "auth.bearer.sync.ims";
	node = json_object_get_member(pJsonObject, authbearersyncimsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&authbearersyncims, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&authbearersyncims);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authtokenRequestParameterKey = "auth.tokenRequestParameter";
	node = json_object_get_member(pJsonObject, authtokenRequestParameterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authtokenRequestParameter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authtokenRequestParameter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthbearerconfigidKey = "oauth.bearer.configid";
	node = json_object_get_member(pJsonObject, oauthbearerconfigidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthbearerconfigid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthbearerconfigid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthjwtsupportKey = "oauth.jwt.support";
	node = json_object_get_member(pJsonObject, oauthjwtsupportKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthjwtsupport, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthjwtsupport);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOauthclientIdsallowed();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOauthclientIdsallowed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthclientIdsallowedKey = "oauth.clientIds.allowed";
	json_object_set_member(pJsonObject, oauthclientIdsallowedKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAuthbearersyncims();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAuthbearersyncims());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authbearersyncimsKey = "auth.bearer.sync.ims";
	json_object_set_member(pJsonObject, authbearersyncimsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthtokenRequestParameter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthtokenRequestParameter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenRequestParameterKey = "auth.tokenRequestParameter";
	json_object_set_member(pJsonObject, authtokenRequestParameterKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthbearerconfigid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthbearerconfigid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthbearerconfigidKey = "oauth.bearer.configid";
	json_object_set_member(pJsonObject, oauthbearerconfigidKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthjwtsupport();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthjwtsupport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthjwtsupportKey = "oauth.jwt.support";
	json_object_set_member(pJsonObject, oauthjwtsupportKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getOauthclientIdsallowed()
{
	return oauthclientIdsallowed;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setOauthclientIdsallowed(ConfigNodePropertyArray  oauthclientIdsallowed)
{
	this->oauthclientIdsallowed = oauthclientIdsallowed;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getAuthbearersyncims()
{
	return authbearersyncims;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setAuthbearersyncims(ConfigNodePropertyBoolean  authbearersyncims)
{
	this->authbearersyncims = authbearersyncims;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getAuthtokenRequestParameter()
{
	return authtokenRequestParameter;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setAuthtokenRequestParameter(ConfigNodePropertyString  authtokenRequestParameter)
{
	this->authtokenRequestParameter = authtokenRequestParameter;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getOauthbearerconfigid()
{
	return oauthbearerconfigid;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setOauthbearerconfigid(ConfigNodePropertyString  oauthbearerconfigid)
{
	this->oauthbearerconfigid = oauthbearerconfigid;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::getOauthjwtsupport()
{
	return oauthjwtsupport;
}

void
ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties::setOauthjwtsupport(ConfigNodePropertyBoolean  oauthjwtsupport)
{
	this->oauthjwtsupport = oauthjwtsupport;
}


