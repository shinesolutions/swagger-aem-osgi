#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties()
{
	//__init();
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::__init()
{
	//whitelistname = new ConfigNodePropertyString();
	//whitelistbundles = new ConfigNodePropertyArray();
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::__cleanup()
{
	//if(whitelistname != NULL) {
	//
	//delete whitelistname;
	//whitelistname = NULL;
	//}
	//if(whitelistbundles != NULL) {
	//
	//delete whitelistbundles;
	//whitelistbundles = NULL;
	//}
	//
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *whitelistnameKey = "whitelist.name";
	node = json_object_get_member(pJsonObject, whitelistnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&whitelistname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&whitelistname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *whitelistbundlesKey = "whitelist.bundles";
	node = json_object_get_member(pJsonObject, whitelistbundlesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&whitelistbundles, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&whitelistbundles);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getWhitelistname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getWhitelistname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *whitelistnameKey = "whitelist.name";
	json_object_set_member(pJsonObject, whitelistnameKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getWhitelistbundles();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getWhitelistbundles());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *whitelistbundlesKey = "whitelist.bundles";
	json_object_set_member(pJsonObject, whitelistbundlesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::getWhitelistname()
{
	return whitelistname;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::setWhitelistname(ConfigNodePropertyString  whitelistname)
{
	this->whitelistname = whitelistname;
}

ConfigNodePropertyArray
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::getWhitelistbundles()
{
	return whitelistbundles;
}

void
OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties::setWhitelistbundles(ConfigNodePropertyArray  whitelistbundles)
{
	this->whitelistbundles = whitelistbundles;
}


