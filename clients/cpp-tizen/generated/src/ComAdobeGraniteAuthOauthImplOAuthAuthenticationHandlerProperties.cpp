#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties()
{
	//__init();
}

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::~ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::__init()
{
	//path = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::fromJson(char* jsonStr)
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
}

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}


