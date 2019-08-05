#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties()
{
	//__init();
}

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::~ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::__init()
{
	//path = new ConfigNodePropertyString();
	//serviceranking = new ConfigNodePropertyInteger();
	//jaascontrolFlag = new ConfigNodePropertyString();
	//jaasrealmName = new ConfigNodePropertyString();
	//jaasranking = new ConfigNodePropertyInteger();
	//headers = new ConfigNodePropertyArray();
	//cookies = new ConfigNodePropertyArray();
	//parameters = new ConfigNodePropertyArray();
	//usermap = new ConfigNodePropertyArray();
	//format = new ConfigNodePropertyString();
	//trustedCredentialsAttribute = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
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
	//if(headers != NULL) {
	//
	//delete headers;
	//headers = NULL;
	//}
	//if(cookies != NULL) {
	//
	//delete cookies;
	//cookies = NULL;
	//}
	//if(parameters != NULL) {
	//
	//delete parameters;
	//parameters = NULL;
	//}
	//if(usermap != NULL) {
	//
	//delete usermap;
	//usermap = NULL;
	//}
	//if(format != NULL) {
	//
	//delete format;
	//format = NULL;
	//}
	//if(trustedCredentialsAttribute != NULL) {
	//
	//delete trustedCredentialsAttribute;
	//trustedCredentialsAttribute = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::fromJson(char* jsonStr)
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
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
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
	const gchar *headersKey = "headers";
	node = json_object_get_member(pJsonObject, headersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&headers, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&headers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cookiesKey = "cookies";
	node = json_object_get_member(pJsonObject, cookiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cookies, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cookies);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parametersKey = "parameters";
	node = json_object_get_member(pJsonObject, parametersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&parameters, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&parameters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *usermapKey = "usermap";
	node = json_object_get_member(pJsonObject, usermapKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&usermap, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&usermap);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *formatKey = "format";
	node = json_object_get_member(pJsonObject, formatKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&format, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&format);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *trustedCredentialsAttributeKey = "trustedCredentialsAttribute";
	node = json_object_get_member(pJsonObject, trustedCredentialsAttributeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&trustedCredentialsAttribute, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&trustedCredentialsAttribute);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHeaders();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHeaders());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *headersKey = "headers";
	json_object_set_member(pJsonObject, headersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCookies();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCookies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cookiesKey = "cookies";
	json_object_set_member(pJsonObject, cookiesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getParameters();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getParameters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parametersKey = "parameters";
	json_object_set_member(pJsonObject, parametersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getUsermap();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUsermap());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usermapKey = "usermap";
	json_object_set_member(pJsonObject, usermapKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFormat();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *formatKey = "format";
	json_object_set_member(pJsonObject, formatKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTrustedCredentialsAttribute();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTrustedCredentialsAttribute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *trustedCredentialsAttributeKey = "trustedCredentialsAttribute";
	json_object_set_member(pJsonObject, trustedCredentialsAttributeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getJaascontrolFlag()
{
	return jaascontrolFlag;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setJaascontrolFlag(ConfigNodePropertyString  jaascontrolFlag)
{
	this->jaascontrolFlag = jaascontrolFlag;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getJaasrealmName()
{
	return jaasrealmName;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setJaasrealmName(ConfigNodePropertyString  jaasrealmName)
{
	this->jaasrealmName = jaasrealmName;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getJaasranking()
{
	return jaasranking;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setJaasranking(ConfigNodePropertyInteger  jaasranking)
{
	this->jaasranking = jaasranking;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getHeaders()
{
	return headers;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setHeaders(ConfigNodePropertyArray  headers)
{
	this->headers = headers;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getCookies()
{
	return cookies;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setCookies(ConfigNodePropertyArray  cookies)
{
	this->cookies = cookies;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getParameters()
{
	return parameters;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setParameters(ConfigNodePropertyArray  parameters)
{
	this->parameters = parameters;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getUsermap()
{
	return usermap;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setUsermap(ConfigNodePropertyArray  usermap)
{
	this->usermap = usermap;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getFormat()
{
	return format;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setFormat(ConfigNodePropertyString  format)
{
	this->format = format;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getTrustedCredentialsAttribute()
{
	return trustedCredentialsAttribute;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setTrustedCredentialsAttribute(ConfigNodePropertyString  trustedCredentialsAttribute)
{
	this->trustedCredentialsAttribute = trustedCredentialsAttribute;
}


