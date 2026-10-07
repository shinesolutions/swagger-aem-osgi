#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties()
{
	//__init();
}

ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::~ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::__init()
{
	//flushagents = new ConfigNodePropertyArray();
}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::__cleanup()
{
	//if(flushagents != NULL) {
	//
	//delete flushagents;
	//flushagents = NULL;
	//}
	//
}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *flushagentsKey = "Flush agents";
	node = json_object_get_member(pJsonObject, flushagentsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&flushagents, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&flushagents);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFlushagents();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFlushagents());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *flushagentsKey = "Flush agents";
	json_object_set_member(pJsonObject, flushagentsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::getFlushagents()
{
	return flushagents;
}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::setFlushagents(ConfigNodePropertyArray  flushagents)
{
	this->flushagents = flushagents;
}


