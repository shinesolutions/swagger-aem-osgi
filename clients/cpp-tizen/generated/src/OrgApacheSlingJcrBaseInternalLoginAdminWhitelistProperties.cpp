#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties()
{
	//__init();
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::__init()
{
	//whitelistbypass = new ConfigNodePropertyBoolean();
	//whitelistbundlesregexp = new ConfigNodePropertyString();
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::__cleanup()
{
	//if(whitelistbypass != NULL) {
	//
	//delete whitelistbypass;
	//whitelistbypass = NULL;
	//}
	//if(whitelistbundlesregexp != NULL) {
	//
	//delete whitelistbundlesregexp;
	//whitelistbundlesregexp = NULL;
	//}
	//
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *whitelistbypassKey = "whitelist.bypass";
	node = json_object_get_member(pJsonObject, whitelistbypassKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&whitelistbypass, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&whitelistbypass);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *whitelistbundlesregexpKey = "whitelist.bundles.regexp";
	node = json_object_get_member(pJsonObject, whitelistbundlesregexpKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&whitelistbundlesregexp, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&whitelistbundlesregexp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getWhitelistbypass();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getWhitelistbypass());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *whitelistbypassKey = "whitelist.bypass";
	json_object_set_member(pJsonObject, whitelistbypassKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getWhitelistbundlesregexp();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getWhitelistbundlesregexp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *whitelistbundlesregexpKey = "whitelist.bundles.regexp";
	json_object_set_member(pJsonObject, whitelistbundlesregexpKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::getWhitelistbypass()
{
	return whitelistbypass;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::setWhitelistbypass(ConfigNodePropertyBoolean  whitelistbypass)
{
	this->whitelistbypass = whitelistbypass;
}

ConfigNodePropertyString
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::getWhitelistbundlesregexp()
{
	return whitelistbundlesregexp;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties::setWhitelistbundlesregexp(ConfigNodePropertyString  whitelistbundlesregexp)
{
	this->whitelistbundlesregexp = whitelistbundlesregexp;
}


