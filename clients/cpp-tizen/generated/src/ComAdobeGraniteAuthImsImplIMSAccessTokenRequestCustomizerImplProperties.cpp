#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties()
{
	//__init();
}

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::~ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::__init()
{
	//authimsclientsecret = new ConfigNodePropertyString();
	//customizertype = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::__cleanup()
{
	//if(authimsclientsecret != NULL) {
	//
	//delete authimsclientsecret;
	//authimsclientsecret = NULL;
	//}
	//if(customizertype != NULL) {
	//
	//delete customizertype;
	//customizertype = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *authimsclientsecretKey = "auth.ims.client.secret";
	node = json_object_get_member(pJsonObject, authimsclientsecretKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authimsclientsecret, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authimsclientsecret);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *customizertypeKey = "customizer.type";
	node = json_object_get_member(pJsonObject, customizertypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&customizertype, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&customizertype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthimsclientsecret();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthimsclientsecret());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authimsclientsecretKey = "auth.ims.client.secret";
	json_object_set_member(pJsonObject, authimsclientsecretKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCustomizertype();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCustomizertype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *customizertypeKey = "customizer.type";
	json_object_set_member(pJsonObject, customizertypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::getAuthimsclientsecret()
{
	return authimsclientsecret;
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::setAuthimsclientsecret(ConfigNodePropertyString  authimsclientsecret)
{
	this->authimsclientsecret = authimsclientsecret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::getCustomizertype()
{
	return customizertype;
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::setCustomizertype(ConfigNodePropertyString  customizertype)
{
	this->customizertype = customizertype;
}


