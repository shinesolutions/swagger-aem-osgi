#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties()
{
	//__init();
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::~ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::__init()
{
	//slingservletpaths = new ConfigNodePropertyString();
	//oauthrevocationactive = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::__cleanup()
{
	//if(slingservletpaths != NULL) {
	//
	//delete slingservletpaths;
	//slingservletpaths = NULL;
	//}
	//if(oauthrevocationactive != NULL) {
	//
	//delete oauthrevocationactive;
	//oauthrevocationactive = NULL;
	//}
	//
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingservletpathsKey = "sling.servlet.paths";
	node = json_object_get_member(pJsonObject, slingservletpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletpaths, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthrevocationactiveKey = "oauth.revocation.active";
	node = json_object_get_member(pJsonObject, oauthrevocationactiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthrevocationactive, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthrevocationactive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletpaths();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletpathsKey = "sling.servlet.paths";
	json_object_set_member(pJsonObject, slingservletpathsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthrevocationactive();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthrevocationactive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthrevocationactiveKey = "oauth.revocation.active";
	json_object_set_member(pJsonObject, oauthrevocationactiveKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::getSlingservletpaths()
{
	return slingservletpaths;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::setSlingservletpaths(ConfigNodePropertyString  slingservletpaths)
{
	this->slingservletpaths = slingservletpaths;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::getOauthrevocationactive()
{
	return oauthrevocationactive;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::setOauthrevocationactive(ConfigNodePropertyBoolean  oauthrevocationactive)
{
	this->oauthrevocationactive = oauthrevocationactive;
}


