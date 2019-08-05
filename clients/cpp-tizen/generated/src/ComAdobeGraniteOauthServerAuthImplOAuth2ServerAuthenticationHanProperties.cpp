#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties()
{
	//__init();
}

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::~ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::__init()
{
	//path = new ConfigNodePropertyString();
	//jaascontrolFlag = new ConfigNodePropertyString();
	//jaasrealmName = new ConfigNodePropertyString();
	//jaasranking = new ConfigNodePropertyInteger();
	//oauthofflinevalidation = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
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
	//if(jaasranking != NULL) {
	//
	//delete jaasranking;
	//jaasranking = NULL;
	//}
	//if(oauthofflinevalidation != NULL) {
	//
	//delete oauthofflinevalidation;
	//oauthofflinevalidation = NULL;
	//}
	//
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::fromJson(char* jsonStr)
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
	const gchar *oauthofflinevalidationKey = "oauth.offline.validation";
	node = json_object_get_member(pJsonObject, oauthofflinevalidationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthofflinevalidation, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthofflinevalidation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthofflinevalidation();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthofflinevalidation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthofflinevalidationKey = "oauth.offline.validation";
	json_object_set_member(pJsonObject, oauthofflinevalidationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getJaascontrolFlag()
{
	return jaascontrolFlag;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setJaascontrolFlag(ConfigNodePropertyString  jaascontrolFlag)
{
	this->jaascontrolFlag = jaascontrolFlag;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getJaasrealmName()
{
	return jaasrealmName;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setJaasrealmName(ConfigNodePropertyString  jaasrealmName)
{
	this->jaasrealmName = jaasrealmName;
}

ConfigNodePropertyInteger
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getJaasranking()
{
	return jaasranking;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setJaasranking(ConfigNodePropertyInteger  jaasranking)
{
	this->jaasranking = jaasranking;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::getOauthofflinevalidation()
{
	return oauthofflinevalidation;
}

void
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties::setOauthofflinevalidation(ConfigNodePropertyBoolean  oauthofflinevalidation)
{
	this->oauthofflinevalidation = oauthofflinevalidation;
}


