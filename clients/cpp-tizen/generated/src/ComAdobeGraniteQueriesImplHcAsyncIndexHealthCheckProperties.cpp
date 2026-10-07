#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::~ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::__init()
{
	//indexingcriticalthreshold = new ConfigNodePropertyInteger();
	//indexingwarnthreshold = new ConfigNodePropertyInteger();
	//hctags = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::__cleanup()
{
	//if(indexingcriticalthreshold != NULL) {
	//
	//delete indexingcriticalthreshold;
	//indexingcriticalthreshold = NULL;
	//}
	//if(indexingwarnthreshold != NULL) {
	//
	//delete indexingwarnthreshold;
	//indexingwarnthreshold = NULL;
	//}
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *indexingcriticalthresholdKey = "indexing.critical.threshold";
	node = json_object_get_member(pJsonObject, indexingcriticalthresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&indexingcriticalthreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&indexingcriticalthreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *indexingwarnthresholdKey = "indexing.warn.threshold";
	node = json_object_get_member(pJsonObject, indexingwarnthresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&indexingwarnthreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&indexingwarnthreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hctagsKey = "hc.tags";
	node = json_object_get_member(pJsonObject, hctagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&hctags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&hctags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getIndexingcriticalthreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getIndexingcriticalthreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *indexingcriticalthresholdKey = "indexing.critical.threshold";
	json_object_set_member(pJsonObject, indexingcriticalthresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getIndexingwarnthreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getIndexingwarnthreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *indexingwarnthresholdKey = "indexing.warn.threshold";
	json_object_set_member(pJsonObject, indexingwarnthresholdKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHctags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHctags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hctagsKey = "hc.tags";
	json_object_set_member(pJsonObject, hctagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::getIndexingcriticalthreshold()
{
	return indexingcriticalthreshold;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::setIndexingcriticalthreshold(ConfigNodePropertyInteger  indexingcriticalthreshold)
{
	this->indexingcriticalthreshold = indexingcriticalthreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::getIndexingwarnthreshold()
{
	return indexingwarnthreshold;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::setIndexingwarnthreshold(ConfigNodePropertyInteger  indexingwarnthreshold)
{
	this->indexingwarnthreshold = indexingwarnthreshold;
}

ConfigNodePropertyArray
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}


