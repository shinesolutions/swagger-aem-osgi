#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqTaggingImplTagGarbageCollectorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqTaggingImplTagGarbageCollectorProperties::ComDayCqTaggingImplTagGarbageCollectorProperties()
{
	//__init();
}

ComDayCqTaggingImplTagGarbageCollectorProperties::~ComDayCqTaggingImplTagGarbageCollectorProperties()
{
	//__cleanup();
}

void
ComDayCqTaggingImplTagGarbageCollectorProperties::__init()
{
	//schedulerexpression = new ConfigNodePropertyString();
}

void
ComDayCqTaggingImplTagGarbageCollectorProperties::__cleanup()
{
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//
}

void
ComDayCqTaggingImplTagGarbageCollectorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerexpressionKey = "scheduler.expression";
	node = json_object_get_member(pJsonObject, schedulerexpressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&schedulerexpression, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&schedulerexpression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqTaggingImplTagGarbageCollectorProperties::ComDayCqTaggingImplTagGarbageCollectorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqTaggingImplTagGarbageCollectorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSchedulerexpression();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSchedulerexpression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerexpressionKey = "scheduler.expression";
	json_object_set_member(pJsonObject, schedulerexpressionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqTaggingImplTagGarbageCollectorProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqTaggingImplTagGarbageCollectorProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}


