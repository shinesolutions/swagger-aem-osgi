#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::~OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::__init()
{
	//persistentCacheIncludes = new ConfigNodePropertyArray();
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::__cleanup()
{
	//if(persistentCacheIncludes != NULL) {
	//
	//delete persistentCacheIncludes;
	//persistentCacheIncludes = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *persistentCacheIncludesKey = "persistentCacheIncludes";
	node = json_object_get_member(pJsonObject, persistentCacheIncludesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&persistentCacheIncludes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&persistentCacheIncludes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPersistentCacheIncludes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPersistentCacheIncludes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *persistentCacheIncludesKey = "persistentCacheIncludes";
	json_object_set_member(pJsonObject, persistentCacheIncludesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::getPersistentCacheIncludes()
{
	return persistentCacheIncludes;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::setPersistentCacheIncludes(ConfigNodePropertyArray  persistentCacheIncludes)
{
	this->persistentCacheIncludes = persistentCacheIncludes;
}


