#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties()
{
	//__init();
}

ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::~ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::__init()
{
	//cqstorelisteneradditionalStorePaths = new ConfigNodePropertyArray();
}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::__cleanup()
{
	//if(cqstorelisteneradditionalStorePaths != NULL) {
	//
	//delete cqstorelisteneradditionalStorePaths;
	//cqstorelisteneradditionalStorePaths = NULL;
	//}
	//
}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqstorelisteneradditionalStorePathsKey = "cq.store.listener.additionalStorePaths";
	node = json_object_get_member(pJsonObject, cqstorelisteneradditionalStorePathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqstorelisteneradditionalStorePaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqstorelisteneradditionalStorePaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqstorelisteneradditionalStorePaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqstorelisteneradditionalStorePaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqstorelisteneradditionalStorePathsKey = "cq.store.listener.additionalStorePaths";
	json_object_set_member(pJsonObject, cqstorelisteneradditionalStorePathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::getCqstorelisteneradditionalStorePaths()
{
	return cqstorelisteneradditionalStorePaths;
}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::setCqstorelisteneradditionalStorePaths(ConfigNodePropertyArray  cqstorelisteneradditionalStorePaths)
{
	this->cqstorelisteneradditionalStorePaths = cqstorelisteneradditionalStorePaths;
}


