#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties()
{
	//__init();
}

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::~ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::__init()
{
	//oauthtokenrevocationactive = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::__cleanup()
{
	//if(oauthtokenrevocationactive != NULL) {
	//
	//delete oauthtokenrevocationactive;
	//oauthtokenrevocationactive = NULL;
	//}
	//
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *oauthtokenrevocationactiveKey = "oauth.token.revocation.active";
	node = json_object_get_member(pJsonObject, oauthtokenrevocationactiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&oauthtokenrevocationactive, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&oauthtokenrevocationactive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOauthtokenrevocationactive();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOauthtokenrevocationactive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthtokenrevocationactiveKey = "oauth.token.revocation.active";
	json_object_set_member(pJsonObject, oauthtokenrevocationactiveKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::getOauthtokenrevocationactive()
{
	return oauthtokenrevocationactive;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::setOauthtokenrevocationactive(ConfigNodePropertyBoolean  oauthtokenrevocationactive)
{
	this->oauthtokenrevocationactive = oauthtokenrevocationactive;
}


