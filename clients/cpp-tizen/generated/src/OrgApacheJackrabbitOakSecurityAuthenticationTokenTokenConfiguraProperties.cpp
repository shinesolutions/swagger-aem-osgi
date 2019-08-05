#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::~OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::__init()
{
	//tokenExpiration = new ConfigNodePropertyString();
	//tokenLength = new ConfigNodePropertyString();
	//tokenRefresh = new ConfigNodePropertyBoolean();
	//tokenCleanupThreshold = new ConfigNodePropertyInteger();
	//passwordHashAlgorithm = new ConfigNodePropertyString();
	//passwordHashIterations = new ConfigNodePropertyInteger();
	//passwordSaltSize = new ConfigNodePropertyInteger();
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::__cleanup()
{
	//if(tokenExpiration != NULL) {
	//
	//delete tokenExpiration;
	//tokenExpiration = NULL;
	//}
	//if(tokenLength != NULL) {
	//
	//delete tokenLength;
	//tokenLength = NULL;
	//}
	//if(tokenRefresh != NULL) {
	//
	//delete tokenRefresh;
	//tokenRefresh = NULL;
	//}
	//if(tokenCleanupThreshold != NULL) {
	//
	//delete tokenCleanupThreshold;
	//tokenCleanupThreshold = NULL;
	//}
	//if(passwordHashAlgorithm != NULL) {
	//
	//delete passwordHashAlgorithm;
	//passwordHashAlgorithm = NULL;
	//}
	//if(passwordHashIterations != NULL) {
	//
	//delete passwordHashIterations;
	//passwordHashIterations = NULL;
	//}
	//if(passwordSaltSize != NULL) {
	//
	//delete passwordSaltSize;
	//passwordSaltSize = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tokenExpirationKey = "tokenExpiration";
	node = json_object_get_member(pJsonObject, tokenExpirationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&tokenExpiration, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&tokenExpiration);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tokenLengthKey = "tokenLength";
	node = json_object_get_member(pJsonObject, tokenLengthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&tokenLength, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&tokenLength);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tokenRefreshKey = "tokenRefresh";
	node = json_object_get_member(pJsonObject, tokenRefreshKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&tokenRefresh, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&tokenRefresh);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tokenCleanupThresholdKey = "tokenCleanupThreshold";
	node = json_object_get_member(pJsonObject, tokenCleanupThresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&tokenCleanupThreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&tokenCleanupThreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordHashAlgorithmKey = "passwordHashAlgorithm";
	node = json_object_get_member(pJsonObject, passwordHashAlgorithmKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&passwordHashAlgorithm, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&passwordHashAlgorithm);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordHashIterationsKey = "passwordHashIterations";
	node = json_object_get_member(pJsonObject, passwordHashIterationsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&passwordHashIterations, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&passwordHashIterations);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordSaltSizeKey = "passwordSaltSize";
	node = json_object_get_member(pJsonObject, passwordSaltSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&passwordSaltSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&passwordSaltSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTokenExpiration();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTokenExpiration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tokenExpirationKey = "tokenExpiration";
	json_object_set_member(pJsonObject, tokenExpirationKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTokenLength();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTokenLength());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tokenLengthKey = "tokenLength";
	json_object_set_member(pJsonObject, tokenLengthKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getTokenRefresh();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getTokenRefresh());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tokenRefreshKey = "tokenRefresh";
	json_object_set_member(pJsonObject, tokenRefreshKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTokenCleanupThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTokenCleanupThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tokenCleanupThresholdKey = "tokenCleanupThreshold";
	json_object_set_member(pJsonObject, tokenCleanupThresholdKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPasswordHashAlgorithm();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPasswordHashAlgorithm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordHashAlgorithmKey = "passwordHashAlgorithm";
	json_object_set_member(pJsonObject, passwordHashAlgorithmKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPasswordHashIterations();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPasswordHashIterations());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordHashIterationsKey = "passwordHashIterations";
	json_object_set_member(pJsonObject, passwordHashIterationsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPasswordSaltSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPasswordSaltSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordSaltSizeKey = "passwordSaltSize";
	json_object_set_member(pJsonObject, passwordSaltSizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getTokenExpiration()
{
	return tokenExpiration;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setTokenExpiration(ConfigNodePropertyString  tokenExpiration)
{
	this->tokenExpiration = tokenExpiration;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getTokenLength()
{
	return tokenLength;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setTokenLength(ConfigNodePropertyString  tokenLength)
{
	this->tokenLength = tokenLength;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getTokenRefresh()
{
	return tokenRefresh;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setTokenRefresh(ConfigNodePropertyBoolean  tokenRefresh)
{
	this->tokenRefresh = tokenRefresh;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getTokenCleanupThreshold()
{
	return tokenCleanupThreshold;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setTokenCleanupThreshold(ConfigNodePropertyInteger  tokenCleanupThreshold)
{
	this->tokenCleanupThreshold = tokenCleanupThreshold;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getPasswordHashAlgorithm()
{
	return passwordHashAlgorithm;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setPasswordHashAlgorithm(ConfigNodePropertyString  passwordHashAlgorithm)
{
	this->passwordHashAlgorithm = passwordHashAlgorithm;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getPasswordHashIterations()
{
	return passwordHashIterations;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setPasswordHashIterations(ConfigNodePropertyInteger  passwordHashIterations)
{
	this->passwordHashIterations = passwordHashIterations;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::getPasswordSaltSize()
{
	return passwordSaltSize;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties::setPasswordSaltSize(ConfigNodePropertyInteger  passwordSaltSize)
{
	this->passwordSaltSize = passwordSaltSize;
}


