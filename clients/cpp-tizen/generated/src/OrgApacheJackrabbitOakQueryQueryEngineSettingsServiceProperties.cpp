#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties()
{
	//__init();
}

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::~OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::__init()
{
	//queryLimitInMemory = new ConfigNodePropertyInteger();
	//queryLimitReads = new ConfigNodePropertyInteger();
	//queryFailTraversal = new ConfigNodePropertyBoolean();
	//fastQuerySize = new ConfigNodePropertyBoolean();
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::__cleanup()
{
	//if(queryLimitInMemory != NULL) {
	//
	//delete queryLimitInMemory;
	//queryLimitInMemory = NULL;
	//}
	//if(queryLimitReads != NULL) {
	//
	//delete queryLimitReads;
	//queryLimitReads = NULL;
	//}
	//if(queryFailTraversal != NULL) {
	//
	//delete queryFailTraversal;
	//queryFailTraversal = NULL;
	//}
	//if(fastQuerySize != NULL) {
	//
	//delete fastQuerySize;
	//fastQuerySize = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *queryLimitInMemoryKey = "queryLimitInMemory";
	node = json_object_get_member(pJsonObject, queryLimitInMemoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queryLimitInMemory, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queryLimitInMemory);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queryLimitReadsKey = "queryLimitReads";
	node = json_object_get_member(pJsonObject, queryLimitReadsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queryLimitReads, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queryLimitReads);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queryFailTraversalKey = "queryFailTraversal";
	node = json_object_get_member(pJsonObject, queryFailTraversalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&queryFailTraversal, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&queryFailTraversal);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fastQuerySizeKey = "fastQuerySize";
	node = json_object_get_member(pJsonObject, fastQuerySizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&fastQuerySize, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&fastQuerySize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueryLimitInMemory();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueryLimitInMemory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queryLimitInMemoryKey = "queryLimitInMemory";
	json_object_set_member(pJsonObject, queryLimitInMemoryKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueryLimitReads();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueryLimitReads());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queryLimitReadsKey = "queryLimitReads";
	json_object_set_member(pJsonObject, queryLimitReadsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getQueryFailTraversal();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getQueryFailTraversal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queryFailTraversalKey = "queryFailTraversal";
	json_object_set_member(pJsonObject, queryFailTraversalKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getFastQuerySize();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getFastQuerySize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fastQuerySizeKey = "fastQuerySize";
	json_object_set_member(pJsonObject, fastQuerySizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::getQueryLimitInMemory()
{
	return queryLimitInMemory;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::setQueryLimitInMemory(ConfigNodePropertyInteger  queryLimitInMemory)
{
	this->queryLimitInMemory = queryLimitInMemory;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::getQueryLimitReads()
{
	return queryLimitReads;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::setQueryLimitReads(ConfigNodePropertyInteger  queryLimitReads)
{
	this->queryLimitReads = queryLimitReads;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::getQueryFailTraversal()
{
	return queryFailTraversal;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::setQueryFailTraversal(ConfigNodePropertyBoolean  queryFailTraversal)
{
	this->queryFailTraversal = queryFailTraversal;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::getFastQuerySize()
{
	return fastQuerySize;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::setFastQuerySize(ConfigNodePropertyBoolean  fastQuerySize)
{
	this->fastQuerySize = fastQuerySize;
}


