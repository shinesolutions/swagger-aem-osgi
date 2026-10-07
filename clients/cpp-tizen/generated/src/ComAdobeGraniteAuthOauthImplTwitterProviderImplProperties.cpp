#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties()
{
	//__init();
}

ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::~ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::__init()
{
	//oauthproviderid = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::__cleanup()
{
	//if(oauthproviderid != NULL) {
	//
	//delete oauthproviderid;
	//oauthproviderid = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *oauthprovideridKey = "oauth.provider.id";
	node = json_object_get_member(pJsonObject, oauthprovideridKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&oauthproviderid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&oauthproviderid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOauthproviderid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOauthproviderid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oauthprovideridKey = "oauth.provider.id";
	json_object_set_member(pJsonObject, oauthprovideridKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::setOauthproviderid(ConfigNodePropertyString  oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}


