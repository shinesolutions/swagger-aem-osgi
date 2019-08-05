#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties()
{
	//__init();
}

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::~ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::__init()
{
	//binarythreshold = new ConfigNodePropertyInteger();
}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::__cleanup()
{
	//if(binarythreshold != NULL) {
	//
	//delete binarythreshold;
	//binarythreshold = NULL;
	//}
	//
}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *binarythresholdKey = "binary.threshold";
	node = json_object_get_member(pJsonObject, binarythresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&binarythreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&binarythreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getBinarythreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getBinarythreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *binarythresholdKey = "binary.threshold";
	json_object_set_member(pJsonObject, binarythresholdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::getBinarythreshold()
{
	return binarythreshold;
}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::setBinarythreshold(ConfigNodePropertyInteger  binarythreshold)
{
	this->binarythreshold = binarythreshold;
}


