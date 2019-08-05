#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationImplReplicatorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationImplReplicatorImplProperties::ComDayCqReplicationImplReplicatorImplProperties()
{
	//__init();
}

ComDayCqReplicationImplReplicatorImplProperties::~ComDayCqReplicationImplReplicatorImplProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationImplReplicatorImplProperties::__init()
{
	//distribute_events = new ConfigNodePropertyBoolean();
}

void
ComDayCqReplicationImplReplicatorImplProperties::__cleanup()
{
	//if(distribute_events != NULL) {
	//
	//delete distribute_events;
	//distribute_events = NULL;
	//}
	//
}

void
ComDayCqReplicationImplReplicatorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *distribute_eventsKey = "distribute_events";
	node = json_object_get_member(pJsonObject, distribute_eventsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&distribute_events, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&distribute_events);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReplicationImplReplicatorImplProperties::ComDayCqReplicationImplReplicatorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationImplReplicatorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDistributeEvents();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDistributeEvents());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *distribute_eventsKey = "distribute_events";
	json_object_set_member(pJsonObject, distribute_eventsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplReplicatorImplProperties::getDistributeEvents()
{
	return distribute_events;
}

void
ComDayCqReplicationImplReplicatorImplProperties::setDistributeEvents(ConfigNodePropertyBoolean  distribute_events)
{
	this->distribute_events = distribute_events;
}


