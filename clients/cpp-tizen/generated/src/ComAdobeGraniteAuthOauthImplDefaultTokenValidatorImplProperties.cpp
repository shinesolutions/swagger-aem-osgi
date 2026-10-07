#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties()
{
	//__init();
}

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::~ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::__init()
{
	//authtokenvalidatortype = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::__cleanup()
{
	//if(authtokenvalidatortype != NULL) {
	//
	//delete authtokenvalidatortype;
	//authtokenvalidatortype = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *authtokenvalidatortypeKey = "auth.token.validator.type";
	node = json_object_get_member(pJsonObject, authtokenvalidatortypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authtokenvalidatortype, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authtokenvalidatortype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthtokenvalidatortype();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthtokenvalidatortype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authtokenvalidatortypeKey = "auth.token.validator.type";
	json_object_set_member(pJsonObject, authtokenvalidatortypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::getAuthtokenvalidatortype()
{
	return authtokenvalidatortype;
}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::setAuthtokenvalidatortype(ConfigNodePropertyString  authtokenvalidatortype)
{
	this->authtokenvalidatortype = authtokenvalidatortype;
}


