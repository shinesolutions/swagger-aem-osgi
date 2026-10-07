#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties()
{
	//__init();
}

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::~ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::__init()
{
	//oauthissuer = new ConfigNodePropertyString();
	//oauthaccesstokenexpiresin = new ConfigNodePropertyString();
	//osgihttpwhiteboardservletpattern = new ConfigNodePropertyString();
	//osgihttpwhiteboardcontextselect = new ConfigNodePropertyString();
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::__cleanup()
{
	//if(oauthissuer != NULL) {
	//
	//delete oauthissuer;
	//oauthissuer = NULL;
	//}
	//if(oauthaccesstokenexpiresin != NULL) {
	//
	//delete oauthaccesstokenexpiresin;
	//oauthaccesstokenexpiresin = NULL;
	//}
	//if(osgihttpwhiteboardservletpattern != NULL) {
	//
	//delete osgihttpwhiteboardservletpattern;
	//osgihttpwhiteboardservletpattern = NULL;
	//}
	//if(osgihttpwhiteboardcontextselect != NULL) {
	//
	//delete osgihttpwhiteboardcontextselect;
	//osgihttpwhiteboardcontextselect = NULL;
	//}
	//
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *oauthissuerKey = "oauth.issuer";
	node = json_object_get_member(pJsonObject, oauthissuerKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthissuer, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthissuer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthaccesstokenexpiresinKey = "oauth.access.token.expires.in";
	node = json_object_get_member(pJsonObject, oauthaccesstokenexpiresinKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthaccesstokenexpiresin, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthaccesstokenexpiresin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *osgihttpwhiteboardservletpatternKey = "osgi.http.whiteboard.servlet.pattern";
	node = json_object_get_member(pJsonObject, osgihttpwhiteboardservletpatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&osgihttpwhiteboardservletpattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&osgihttpwhiteboardservletpattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
}

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthissuer();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthissuer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthissuerKey = "oauth.issuer";
	json_object_set_member(pJsonObject, oauthissuerKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthaccesstokenexpiresin();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthaccesstokenexpiresin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthaccesstokenexpiresinKey = "oauth.access.token.expires.in";
	json_object_set_member(pJsonObject, oauthaccesstokenexpiresinKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOsgihttpwhiteboardservletpattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOsgihttpwhiteboardservletpattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *osgihttpwhiteboardservletpatternKey = "osgi.http.whiteboard.servlet.pattern";
	json_object_set_member(pJsonObject, osgihttpwhiteboardservletpatternKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOauthissuer()
{
	return oauthissuer;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOauthissuer(ConfigNodePropertyString  oauthissuer)
{
	this->oauthissuer = oauthissuer;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOauthaccesstokenexpiresin()
{
	return oauthaccesstokenexpiresin;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOauthaccesstokenexpiresin(ConfigNodePropertyString  oauthaccesstokenexpiresin)
{
	this->oauthaccesstokenexpiresin = oauthaccesstokenexpiresin;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOsgihttpwhiteboardservletpattern()
{
	return osgihttpwhiteboardservletpattern;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOsgihttpwhiteboardservletpattern(ConfigNodePropertyString  osgihttpwhiteboardservletpattern)
{
	this->osgihttpwhiteboardservletpattern = osgihttpwhiteboardservletpattern;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOsgihttpwhiteboardcontextselect()
{
	return osgihttpwhiteboardcontextselect;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString  osgihttpwhiteboardcontextselect)
{
	this->osgihttpwhiteboardcontextselect = osgihttpwhiteboardcontextselect;
}


