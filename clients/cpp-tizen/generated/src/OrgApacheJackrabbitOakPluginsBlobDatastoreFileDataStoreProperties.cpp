#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::~OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::__init()
{
	//path = new ConfigNodePropertyString();
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::fromJson(char* jsonStr)
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

OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::toJson()
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
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::getPath()
{
	return path;
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}


