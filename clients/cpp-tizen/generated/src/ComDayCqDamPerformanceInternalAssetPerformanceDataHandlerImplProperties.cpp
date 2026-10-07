#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties()
{
	//__init();
}

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::~ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::__init()
{
	//batchcommitsize = new ConfigNodePropertyInteger();
}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::__cleanup()
{
	//if(batchcommitsize != NULL) {
	//
	//delete batchcommitsize;
	//batchcommitsize = NULL;
	//}
	//
}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *batchcommitsizeKey = "batch.commit.size";
	node = json_object_get_member(pJsonObject, batchcommitsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&batchcommitsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&batchcommitsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getBatchcommitsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getBatchcommitsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *batchcommitsizeKey = "batch.commit.size";
	json_object_set_member(pJsonObject, batchcommitsizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::getBatchcommitsize()
{
	return batchcommitsize;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties::setBatchcommitsize(ConfigNodePropertyInteger  batchcommitsize)
{
	this->batchcommitsize = batchcommitsize;
}


