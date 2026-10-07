#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::~ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::__init()
{
	//bucketSize = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::__cleanup()
{
	//if(bucketSize != NULL) {
	//
	//delete bucketSize;
	//bucketSize = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bucketSizeKey = "bucketSize";
	node = json_object_get_member(pJsonObject, bucketSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&bucketSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&bucketSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getBucketSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getBucketSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bucketSizeKey = "bucketSize";
	json_object_set_member(pJsonObject, bucketSizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::getBucketSize()
{
	return bucketSize;
}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties::setBucketSize(ConfigNodePropertyInteger  bucketSize)
{
	this->bucketSize = bucketSize;
}


