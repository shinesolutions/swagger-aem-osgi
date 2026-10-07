#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEventImplJobsDefaultJobManagerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEventImplJobsDefaultJobManagerProperties::OrgApacheSlingEventImplJobsDefaultJobManagerProperties()
{
	//__init();
}

OrgApacheSlingEventImplJobsDefaultJobManagerProperties::~OrgApacheSlingEventImplJobsDefaultJobManagerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::__init()
{
	//queuepriority = new ConfigNodePropertyDropDown();
	//queueretries = new ConfigNodePropertyInteger();
	//queueretrydelay = new ConfigNodePropertyInteger();
	//queuemaxparallel = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::__cleanup()
{
	//if(queuepriority != NULL) {
	//
	//delete queuepriority;
	//queuepriority = NULL;
	//}
	//if(queueretries != NULL) {
	//
	//delete queueretries;
	//queueretries = NULL;
	//}
	//if(queueretrydelay != NULL) {
	//
	//delete queueretrydelay;
	//queueretrydelay = NULL;
	//}
	//if(queuemaxparallel != NULL) {
	//
	//delete queuemaxparallel;
	//queuemaxparallel = NULL;
	//}
	//
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *queuepriorityKey = "queue.priority";
	node = json_object_get_member(pJsonObject, queuepriorityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&queuepriority, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&queuepriority);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queueretriesKey = "queue.retries";
	node = json_object_get_member(pJsonObject, queueretriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queueretries, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queueretries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queueretrydelayKey = "queue.retrydelay";
	node = json_object_get_member(pJsonObject, queueretrydelayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queueretrydelay, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queueretrydelay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queuemaxparallelKey = "queue.maxparallel";
	node = json_object_get_member(pJsonObject, queuemaxparallelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queuemaxparallel, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queuemaxparallel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEventImplJobsDefaultJobManagerProperties::OrgApacheSlingEventImplJobsDefaultJobManagerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getQueuepriority();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getQueuepriority());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queuepriorityKey = "queue.priority";
	json_object_set_member(pJsonObject, queuepriorityKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueueretries();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueueretries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queueretriesKey = "queue.retries";
	json_object_set_member(pJsonObject, queueretriesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueueretrydelay();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueueretrydelay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queueretrydelayKey = "queue.retrydelay";
	json_object_set_member(pJsonObject, queueretrydelayKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueuemaxparallel();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueuemaxparallel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queuemaxparallelKey = "queue.maxparallel";
	json_object_set_member(pJsonObject, queuemaxparallelKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::getQueuepriority()
{
	return queuepriority;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::setQueuepriority(ConfigNodePropertyDropDown  queuepriority)
{
	this->queuepriority = queuepriority;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::getQueueretries()
{
	return queueretries;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::setQueueretries(ConfigNodePropertyInteger  queueretries)
{
	this->queueretries = queueretries;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::getQueueretrydelay()
{
	return queueretrydelay;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::setQueueretrydelay(ConfigNodePropertyInteger  queueretrydelay)
{
	this->queueretrydelay = queueretrydelay;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::getQueuemaxparallel()
{
	return queuemaxparallel;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::setQueuemaxparallel(ConfigNodePropertyInteger  queuemaxparallel)
{
	this->queuemaxparallel = queuemaxparallel;
}


