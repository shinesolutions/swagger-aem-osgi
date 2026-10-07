#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties()
{
	//__init();
}

OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::~OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::__init()
{
	//osgihttpwhiteboardcontextselect = new ConfigNodePropertyString();
	//osgihttpwhiteboardlistener = new ConfigNodePropertyString();
	//authsudocookie = new ConfigNodePropertyString();
	//authsudoparameter = new ConfigNodePropertyString();
	//authannonymous = new ConfigNodePropertyBoolean();
	//slingauthrequirements = new ConfigNodePropertyArray();
	//slingauthanonymoususer = new ConfigNodePropertyString();
	//slingauthanonymouspassword = new ConfigNodePropertyString();
	//authhttp = new ConfigNodePropertyDropDown();
	//authhttprealm = new ConfigNodePropertyString();
	//authurisuffix = new ConfigNodePropertyArray();
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::__cleanup()
{
	//if(osgihttpwhiteboardcontextselect != NULL) {
	//
	//delete osgihttpwhiteboardcontextselect;
	//osgihttpwhiteboardcontextselect = NULL;
	//}
	//if(osgihttpwhiteboardlistener != NULL) {
	//
	//delete osgihttpwhiteboardlistener;
	//osgihttpwhiteboardlistener = NULL;
	//}
	//if(authsudocookie != NULL) {
	//
	//delete authsudocookie;
	//authsudocookie = NULL;
	//}
	//if(authsudoparameter != NULL) {
	//
	//delete authsudoparameter;
	//authsudoparameter = NULL;
	//}
	//if(authannonymous != NULL) {
	//
	//delete authannonymous;
	//authannonymous = NULL;
	//}
	//if(slingauthrequirements != NULL) {
	//
	//delete slingauthrequirements;
	//slingauthrequirements = NULL;
	//}
	//if(slingauthanonymoususer != NULL) {
	//
	//delete slingauthanonymoususer;
	//slingauthanonymoususer = NULL;
	//}
	//if(slingauthanonymouspassword != NULL) {
	//
	//delete slingauthanonymouspassword;
	//slingauthanonymouspassword = NULL;
	//}
	//if(authhttp != NULL) {
	//
	//delete authhttp;
	//authhttp = NULL;
	//}
	//if(authhttprealm != NULL) {
	//
	//delete authhttprealm;
	//authhttprealm = NULL;
	//}
	//if(authurisuffix != NULL) {
	//
	//delete authurisuffix;
	//authurisuffix = NULL;
	//}
	//
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *osgihttpwhiteboardcontextselectKey = "osgi.http.whiteboard.context.select";
	node = json_object_get_member(pJsonObject, osgihttpwhiteboardcontextselectKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&osgihttpwhiteboardcontextselect, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&osgihttpwhiteboardcontextselect);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *osgihttpwhiteboardlistenerKey = "osgi.http.whiteboard.listener";
	node = json_object_get_member(pJsonObject, osgihttpwhiteboardlistenerKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&osgihttpwhiteboardlistener, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&osgihttpwhiteboardlistener);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authsudocookieKey = "auth.sudo.cookie";
	node = json_object_get_member(pJsonObject, authsudocookieKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authsudocookie, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authsudocookie);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authsudoparameterKey = "auth.sudo.parameter";
	node = json_object_get_member(pJsonObject, authsudoparameterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authsudoparameter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authsudoparameter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authannonymousKey = "auth.annonymous";
	node = json_object_get_member(pJsonObject, authannonymousKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&authannonymous, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&authannonymous);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingauthrequirementsKey = "sling.auth.requirements";
	node = json_object_get_member(pJsonObject, slingauthrequirementsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingauthrequirements, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingauthrequirements);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingauthanonymoususerKey = "sling.auth.anonymous.user";
	node = json_object_get_member(pJsonObject, slingauthanonymoususerKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingauthanonymoususer, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingauthanonymoususer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingauthanonymouspasswordKey = "sling.auth.anonymous.password";
	node = json_object_get_member(pJsonObject, slingauthanonymouspasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingauthanonymouspassword, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingauthanonymouspassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authhttpKey = "auth.http";
	node = json_object_get_member(pJsonObject, authhttpKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&authhttp, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&authhttp);
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
	const gchar *authurisuffixKey = "auth.uri.suffix";
	node = json_object_get_member(pJsonObject, authurisuffixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&authurisuffix, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&authurisuffix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOsgihttpwhiteboardcontextselect();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOsgihttpwhiteboardcontextselect());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *osgihttpwhiteboardcontextselectKey = "osgi.http.whiteboard.context.select";
	json_object_set_member(pJsonObject, osgihttpwhiteboardcontextselectKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOsgihttpwhiteboardlistener();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOsgihttpwhiteboardlistener());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *osgihttpwhiteboardlistenerKey = "osgi.http.whiteboard.listener";
	json_object_set_member(pJsonObject, osgihttpwhiteboardlistenerKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthsudocookie();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthsudocookie());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authsudocookieKey = "auth.sudo.cookie";
	json_object_set_member(pJsonObject, authsudocookieKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthsudoparameter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthsudoparameter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authsudoparameterKey = "auth.sudo.parameter";
	json_object_set_member(pJsonObject, authsudoparameterKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAuthannonymous();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAuthannonymous());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authannonymousKey = "auth.annonymous";
	json_object_set_member(pJsonObject, authannonymousKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingauthrequirements();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingauthrequirements());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingauthrequirementsKey = "sling.auth.requirements";
	json_object_set_member(pJsonObject, slingauthrequirementsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingauthanonymoususer();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingauthanonymoususer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingauthanonymoususerKey = "sling.auth.anonymous.user";
	json_object_set_member(pJsonObject, slingauthanonymoususerKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingauthanonymouspassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingauthanonymouspassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingauthanonymouspasswordKey = "sling.auth.anonymous.password";
	json_object_set_member(pJsonObject, slingauthanonymouspasswordKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getAuthhttp();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getAuthhttp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authhttpKey = "auth.http";
	json_object_set_member(pJsonObject, authhttpKey, node);
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAuthurisuffix();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAuthurisuffix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authurisuffixKey = "auth.uri.suffix";
	json_object_set_member(pJsonObject, authurisuffixKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getOsgihttpwhiteboardcontextselect()
{
	return osgihttpwhiteboardcontextselect;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString  osgihttpwhiteboardcontextselect)
{
	this->osgihttpwhiteboardcontextselect = osgihttpwhiteboardcontextselect;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getOsgihttpwhiteboardlistener()
{
	return osgihttpwhiteboardlistener;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setOsgihttpwhiteboardlistener(ConfigNodePropertyString  osgihttpwhiteboardlistener)
{
	this->osgihttpwhiteboardlistener = osgihttpwhiteboardlistener;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthsudocookie()
{
	return authsudocookie;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthsudocookie(ConfigNodePropertyString  authsudocookie)
{
	this->authsudocookie = authsudocookie;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthsudoparameter()
{
	return authsudoparameter;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthsudoparameter(ConfigNodePropertyString  authsudoparameter)
{
	this->authsudoparameter = authsudoparameter;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthannonymous()
{
	return authannonymous;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthannonymous(ConfigNodePropertyBoolean  authannonymous)
{
	this->authannonymous = authannonymous;
}

ConfigNodePropertyArray
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getSlingauthrequirements()
{
	return slingauthrequirements;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setSlingauthrequirements(ConfigNodePropertyArray  slingauthrequirements)
{
	this->slingauthrequirements = slingauthrequirements;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getSlingauthanonymoususer()
{
	return slingauthanonymoususer;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setSlingauthanonymoususer(ConfigNodePropertyString  slingauthanonymoususer)
{
	this->slingauthanonymoususer = slingauthanonymoususer;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getSlingauthanonymouspassword()
{
	return slingauthanonymouspassword;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setSlingauthanonymouspassword(ConfigNodePropertyString  slingauthanonymouspassword)
{
	this->slingauthanonymouspassword = slingauthanonymouspassword;
}

ConfigNodePropertyDropDown
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthhttp()
{
	return authhttp;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthhttp(ConfigNodePropertyDropDown  authhttp)
{
	this->authhttp = authhttp;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthhttprealm()
{
	return authhttprealm;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthhttprealm(ConfigNodePropertyString  authhttprealm)
{
	this->authhttprealm = authhttprealm;
}

ConfigNodePropertyArray
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthurisuffix()
{
	return authurisuffix;
}

void
OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthurisuffix(ConfigNodePropertyArray  authurisuffix)
{
	this->authurisuffix = authurisuffix;
}


