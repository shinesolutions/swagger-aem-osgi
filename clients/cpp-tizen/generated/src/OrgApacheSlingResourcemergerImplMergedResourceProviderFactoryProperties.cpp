#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties()
{
	//__init();
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::~OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::__init()
{
	//mergeroot = new ConfigNodePropertyString();
	//mergereadOnly = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::__cleanup()
{
	//if(mergeroot != NULL) {
	//
	//delete mergeroot;
	//mergeroot = NULL;
	//}
	//if(mergereadOnly != NULL) {
	//
	//delete mergereadOnly;
	//mergereadOnly = NULL;
	//}
	//
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mergerootKey = "merge.root";
	node = json_object_get_member(pJsonObject, mergerootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&mergeroot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&mergeroot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mergereadOnlyKey = "merge.readOnly";
	node = json_object_get_member(pJsonObject, mergereadOnlyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&mergereadOnly, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&mergereadOnly);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMergeroot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMergeroot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mergerootKey = "merge.root";
	json_object_set_member(pJsonObject, mergerootKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getMergereadOnly();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getMergereadOnly());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mergereadOnlyKey = "merge.readOnly";
	json_object_set_member(pJsonObject, mergereadOnlyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::getMergeroot()
{
	return mergeroot;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::setMergeroot(ConfigNodePropertyString  mergeroot)
{
	this->mergeroot = mergeroot;
}

ConfigNodePropertyBoolean
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::getMergereadOnly()
{
	return mergereadOnly;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::setMergereadOnly(ConfigNodePropertyBoolean  mergereadOnly)
{
	this->mergereadOnly = mergereadOnly;
}


