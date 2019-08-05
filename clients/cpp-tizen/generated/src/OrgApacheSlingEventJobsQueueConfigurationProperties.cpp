#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEventJobsQueueConfigurationProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEventJobsQueueConfigurationProperties::OrgApacheSlingEventJobsQueueConfigurationProperties()
{
	//__init();
}

OrgApacheSlingEventJobsQueueConfigurationProperties::~OrgApacheSlingEventJobsQueueConfigurationProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::__init()
{
	//queuename = new ConfigNodePropertyString();
	//queuetopics = new ConfigNodePropertyArray();
	//queuetype = new ConfigNodePropertyDropDown();
	//queuepriority = new ConfigNodePropertyDropDown();
	//queueretries = new ConfigNodePropertyInteger();
	//queueretrydelay = new ConfigNodePropertyInteger();
	//queuemaxparallel = new ConfigNodePropertyFloat();
	//queuekeepJobs = new ConfigNodePropertyBoolean();
	//queuepreferRunOnCreationInstance = new ConfigNodePropertyBoolean();
	//queuethreadPoolSize = new ConfigNodePropertyInteger();
	//serviceranking = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::__cleanup()
{
	//if(queuename != NULL) {
	//
	//delete queuename;
	//queuename = NULL;
	//}
	//if(queuetopics != NULL) {
	//
	//delete queuetopics;
	//queuetopics = NULL;
	//}
	//if(queuetype != NULL) {
	//
	//delete queuetype;
	//queuetype = NULL;
	//}
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
	//if(queuekeepJobs != NULL) {
	//
	//delete queuekeepJobs;
	//queuekeepJobs = NULL;
	//}
	//if(queuepreferRunOnCreationInstance != NULL) {
	//
	//delete queuepreferRunOnCreationInstance;
	//queuepreferRunOnCreationInstance = NULL;
	//}
	//if(queuethreadPoolSize != NULL) {
	//
	//delete queuethreadPoolSize;
	//queuethreadPoolSize = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *queuenameKey = "queue.name";
	node = json_object_get_member(pJsonObject, queuenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&queuename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&queuename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queuetopicsKey = "queue.topics";
	node = json_object_get_member(pJsonObject, queuetopicsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&queuetopics, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&queuetopics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queuetypeKey = "queue.type";
	node = json_object_get_member(pJsonObject, queuetypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&queuetype, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&queuetype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
	

		if (isprimitive("ConfigNodePropertyFloat")) {
			jsonToValue(&queuemaxparallel, node, "ConfigNodePropertyFloat", "ConfigNodePropertyFloat");
		} else {
			
			ConfigNodePropertyFloat* obj = static_cast<ConfigNodePropertyFloat*> (&queuemaxparallel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queuekeepJobsKey = "queue.keepJobs";
	node = json_object_get_member(pJsonObject, queuekeepJobsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&queuekeepJobs, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&queuekeepJobs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queuepreferRunOnCreationInstanceKey = "queue.preferRunOnCreationInstance";
	node = json_object_get_member(pJsonObject, queuepreferRunOnCreationInstanceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&queuepreferRunOnCreationInstance, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&queuepreferRunOnCreationInstance);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queuethreadPoolSizeKey = "queue.threadPoolSize";
	node = json_object_get_member(pJsonObject, queuethreadPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queuethreadPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queuethreadPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEventJobsQueueConfigurationProperties::OrgApacheSlingEventJobsQueueConfigurationProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEventJobsQueueConfigurationProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getQueuename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getQueuename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queuenameKey = "queue.name";
	json_object_set_member(pJsonObject, queuenameKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getQueuetopics();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getQueuetopics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queuetopicsKey = "queue.topics";
	json_object_set_member(pJsonObject, queuetopicsKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getQueuetype();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getQueuetype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queuetypeKey = "queue.type";
	json_object_set_member(pJsonObject, queuetypeKey, node);
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
	if (isprimitive("ConfigNodePropertyFloat")) {
		ConfigNodePropertyFloat obj = getQueuemaxparallel();
		node = converttoJson(&obj, "ConfigNodePropertyFloat", "");
	}
	else {
		
		ConfigNodePropertyFloat obj = static_cast<ConfigNodePropertyFloat> (getQueuemaxparallel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queuemaxparallelKey = "queue.maxparallel";
	json_object_set_member(pJsonObject, queuemaxparallelKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getQueuekeepJobs();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getQueuekeepJobs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queuekeepJobsKey = "queue.keepJobs";
	json_object_set_member(pJsonObject, queuekeepJobsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getQueuepreferRunOnCreationInstance();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getQueuepreferRunOnCreationInstance());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queuepreferRunOnCreationInstanceKey = "queue.preferRunOnCreationInstance";
	json_object_set_member(pJsonObject, queuepreferRunOnCreationInstanceKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueuethreadPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueuethreadPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queuethreadPoolSizeKey = "queue.threadPoolSize";
	json_object_set_member(pJsonObject, queuethreadPoolSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuename()
{
	return queuename;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuename(ConfigNodePropertyString  queuename)
{
	this->queuename = queuename;
}

ConfigNodePropertyArray
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuetopics()
{
	return queuetopics;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuetopics(ConfigNodePropertyArray  queuetopics)
{
	this->queuetopics = queuetopics;
}

ConfigNodePropertyDropDown
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuetype()
{
	return queuetype;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuetype(ConfigNodePropertyDropDown  queuetype)
{
	this->queuetype = queuetype;
}

ConfigNodePropertyDropDown
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuepriority()
{
	return queuepriority;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuepriority(ConfigNodePropertyDropDown  queuepriority)
{
	this->queuepriority = queuepriority;
}

ConfigNodePropertyInteger
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueueretries()
{
	return queueretries;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueueretries(ConfigNodePropertyInteger  queueretries)
{
	this->queueretries = queueretries;
}

ConfigNodePropertyInteger
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueueretrydelay()
{
	return queueretrydelay;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueueretrydelay(ConfigNodePropertyInteger  queueretrydelay)
{
	this->queueretrydelay = queueretrydelay;
}

ConfigNodePropertyFloat
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuemaxparallel()
{
	return queuemaxparallel;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuemaxparallel(ConfigNodePropertyFloat  queuemaxparallel)
{
	this->queuemaxparallel = queuemaxparallel;
}

ConfigNodePropertyBoolean
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuekeepJobs()
{
	return queuekeepJobs;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuekeepJobs(ConfigNodePropertyBoolean  queuekeepJobs)
{
	this->queuekeepJobs = queuekeepJobs;
}

ConfigNodePropertyBoolean
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuepreferRunOnCreationInstance()
{
	return queuepreferRunOnCreationInstance;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuepreferRunOnCreationInstance(ConfigNodePropertyBoolean  queuepreferRunOnCreationInstance)
{
	this->queuepreferRunOnCreationInstance = queuepreferRunOnCreationInstance;
}

ConfigNodePropertyInteger
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuethreadPoolSize()
{
	return queuethreadPoolSize;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuethreadPoolSize(ConfigNodePropertyInteger  queuethreadPoolSize)
{
	this->queuethreadPoolSize = queuethreadPoolSize;
}

ConfigNodePropertyInteger
OrgApacheSlingEventJobsQueueConfigurationProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}


