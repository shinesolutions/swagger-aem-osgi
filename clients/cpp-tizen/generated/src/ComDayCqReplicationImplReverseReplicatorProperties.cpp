#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationImplReverseReplicatorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationImplReverseReplicatorProperties::ComDayCqReplicationImplReverseReplicatorProperties()
{
	//__init();
}

ComDayCqReplicationImplReverseReplicatorProperties::~ComDayCqReplicationImplReverseReplicatorProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationImplReverseReplicatorProperties::__init()
{
	//schedulerperiod = new ConfigNodePropertyInteger();
}

void
ComDayCqReplicationImplReverseReplicatorProperties::__cleanup()
{
	//if(schedulerperiod != NULL) {
	//
	//delete schedulerperiod;
	//schedulerperiod = NULL;
	//}
	//
}

void
ComDayCqReplicationImplReverseReplicatorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerperiodKey = "scheduler.period";
	node = json_object_get_member(pJsonObject, schedulerperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&schedulerperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&schedulerperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReplicationImplReverseReplicatorProperties::ComDayCqReplicationImplReverseReplicatorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationImplReverseReplicatorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSchedulerperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSchedulerperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerperiodKey = "scheduler.period";
	json_object_set_member(pJsonObject, schedulerperiodKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqReplicationImplReverseReplicatorProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComDayCqReplicationImplReverseReplicatorProperties::setSchedulerperiod(ConfigNodePropertyInteger  schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}


