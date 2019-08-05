#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::~OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::__init()
{
	//dir = new ConfigNodePropertyString();
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::__cleanup()
{
	//if(dir != NULL) {
	//
	//delete dir;
	//dir = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dirKey = "dir";
	node = json_object_get_member(pJsonObject, dirKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&dir, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&dir);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDir();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDir());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dirKey = "dir";
	json_object_set_member(pJsonObject, dirKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::getDir()
{
	return dir;
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::setDir(ConfigNodePropertyString  dir)
{
	this->dir = dir;
}


