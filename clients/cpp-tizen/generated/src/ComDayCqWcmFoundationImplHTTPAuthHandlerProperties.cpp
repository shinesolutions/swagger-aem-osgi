#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::ComDayCqWcmFoundationImplHTTPAuthHandlerProperties()
{
	//__init();
}

ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::~ComDayCqWcmFoundationImplHTTPAuthHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::__init()
{
	//path = new ConfigNodePropertyString();
	//authhttpnologin = new ConfigNodePropertyBoolean();
	//authhttprealm = new ConfigNodePropertyString();
	//authdefaultloginpage = new ConfigNodePropertyString();
	//authcredform = new ConfigNodePropertyArray();
	//authcredutf8 = new ConfigNodePropertyArray();
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(authhttpnologin != NULL) {
	//
	//delete authhttpnologin;
	//authhttpnologin = NULL;
	//}
	//if(authhttprealm != NULL) {
	//
	//delete authhttprealm;
	//authhttprealm = NULL;
	//}
	//if(authdefaultloginpage != NULL) {
	//
	//delete authdefaultloginpage;
	//authdefaultloginpage = NULL;
	//}
	//if(authcredform != NULL) {
	//
	//delete authcredform;
	//authcredform = NULL;
	//}
	//if(authcredutf8 != NULL) {
	//
	//delete authcredutf8;
	//authcredutf8 = NULL;
	//}
	//
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::fromJson(char* jsonStr)
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
	const gchar *authhttpnologinKey = "auth.http.nologin";
	node = json_object_get_member(pJsonObject, authhttpnologinKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&authhttpnologin, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&authhttpnologin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authhttprealmKey = "auth.http.realm";
	node = json_object_get_member(pJsonObject, authhttprealmKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authhttprealm, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authhttprealm);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authdefaultloginpageKey = "auth.default.loginpage";
	node = json_object_get_member(pJsonObject, authdefaultloginpageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authdefaultloginpage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authdefaultloginpage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authcredformKey = "auth.cred.form";
	node = json_object_get_member(pJsonObject, authcredformKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&authcredform, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&authcredform);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authcredutf8Key = "auth.cred.utf8";
	node = json_object_get_member(pJsonObject, authcredutf8Key);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&authcredutf8, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&authcredutf8);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAuthhttpnologin();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAuthhttpnologin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authhttpnologinKey = "auth.http.nologin";
	json_object_set_member(pJsonObject, authhttpnologinKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthhttprealm();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthhttprealm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authhttprealmKey = "auth.http.realm";
	json_object_set_member(pJsonObject, authhttprealmKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthdefaultloginpage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthdefaultloginpage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authdefaultloginpageKey = "auth.default.loginpage";
	json_object_set_member(pJsonObject, authdefaultloginpageKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAuthcredform();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAuthcredform());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authcredformKey = "auth.cred.form";
	json_object_set_member(pJsonObject, authcredformKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAuthcredutf8();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAuthcredutf8());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authcredutf8Key = "auth.cred.utf8";
	json_object_set_member(pJsonObject, authcredutf8Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getPath()
{
	return path;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyBoolean
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthhttpnologin()
{
	return authhttpnologin;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthhttpnologin(ConfigNodePropertyBoolean  authhttpnologin)
{
	this->authhttpnologin = authhttpnologin;
}

ConfigNodePropertyString
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthhttprealm()
{
	return authhttprealm;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthhttprealm(ConfigNodePropertyString  authhttprealm)
{
	this->authhttprealm = authhttprealm;
}

ConfigNodePropertyString
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthdefaultloginpage()
{
	return authdefaultloginpage;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthdefaultloginpage(ConfigNodePropertyString  authdefaultloginpage)
{
	this->authdefaultloginpage = authdefaultloginpage;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthcredform()
{
	return authcredform;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthcredform(ConfigNodePropertyArray  authcredform)
{
	this->authcredform = authcredform;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::getAuthcredutf8()
{
	return authcredutf8;
}

void
ComDayCqWcmFoundationImplHTTPAuthHandlerProperties::setAuthcredutf8(ConfigNodePropertyArray  authcredutf8)
{
	this->authcredutf8 = authcredutf8;
}


