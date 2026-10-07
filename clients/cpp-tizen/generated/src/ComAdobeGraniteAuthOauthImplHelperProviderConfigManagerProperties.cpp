#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties()
{
	//__init();
}

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::~ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::__init()
{
	//oauthcookielogintimeout = new ConfigNodePropertyString();
	//oauthcookiemaxage = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::__cleanup()
{
	//if(oauthcookielogintimeout != NULL) {
	//
	//delete oauthcookielogintimeout;
	//oauthcookielogintimeout = NULL;
	//}
	//if(oauthcookiemaxage != NULL) {
	//
	//delete oauthcookiemaxage;
	//oauthcookiemaxage = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *oauthcookielogintimeoutKey = "oauth.cookie.login.timeout";
	node = json_object_get_member(pJsonObject, oauthcookielogintimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthcookielogintimeout, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthcookielogintimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oauthcookiemaxageKey = "oauth.cookie.max.age";
	node = json_object_get_member(pJsonObject, oauthcookiemaxageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthcookiemaxage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthcookiemaxage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthcookielogintimeout();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthcookielogintimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthcookielogintimeoutKey = "oauth.cookie.login.timeout";
	json_object_set_member(pJsonObject, oauthcookielogintimeoutKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthcookiemaxage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthcookiemaxage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthcookiemaxageKey = "oauth.cookie.max.age";
	json_object_set_member(pJsonObject, oauthcookiemaxageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::getOauthcookielogintimeout()
{
	return oauthcookielogintimeout;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::setOauthcookielogintimeout(ConfigNodePropertyString  oauthcookielogintimeout)
{
	this->oauthcookielogintimeout = oauthcookielogintimeout;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::getOauthcookiemaxage()
{
	return oauthcookiemaxage;
}

void
ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties::setOauthcookiemaxage(ConfigNodePropertyString  oauthcookiemaxage)
{
	this->oauthcookiemaxage = oauthcookiemaxage;
}


