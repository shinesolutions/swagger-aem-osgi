#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixSystemreadySystemReadyMonitorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixSystemreadySystemReadyMonitorProperties::OrgApacheFelixSystemreadySystemReadyMonitorProperties()
{
	//__init();
}

OrgApacheFelixSystemreadySystemReadyMonitorProperties::~OrgApacheFelixSystemreadySystemReadyMonitorProperties()
{
	//__cleanup();
}

void
OrgApacheFelixSystemreadySystemReadyMonitorProperties::__init()
{
	//pollinterval = new ConfigNodePropertyInteger();
}

void
OrgApacheFelixSystemreadySystemReadyMonitorProperties::__cleanup()
{
	//if(pollinterval != NULL) {
	//
	//delete pollinterval;
	//pollinterval = NULL;
	//}
	//
}

void
OrgApacheFelixSystemreadySystemReadyMonitorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pollintervalKey = "poll.interval";
	node = json_object_get_member(pJsonObject, pollintervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&pollinterval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&pollinterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixSystemreadySystemReadyMonitorProperties::OrgApacheFelixSystemreadySystemReadyMonitorProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixSystemreadySystemReadyMonitorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPollinterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPollinterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pollintervalKey = "poll.interval";
	json_object_set_member(pJsonObject, pollintervalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheFelixSystemreadySystemReadyMonitorProperties::getPollinterval()
{
	return pollinterval;
}

void
OrgApacheFelixSystemreadySystemReadyMonitorProperties::setPollinterval(ConfigNodePropertyInteger  pollinterval)
{
	this->pollinterval = pollinterval;
}


