#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties()
{
	//__init();
}

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::~OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//minPoolSize = new ConfigNodePropertyInteger();
	//maxPoolSize = new ConfigNodePropertyInteger();
	//queueSize = new ConfigNodePropertyInteger();
	//maxThreadAge = new ConfigNodePropertyInteger();
	//keepAliveTime = new ConfigNodePropertyInteger();
	//blockPolicy = new ConfigNodePropertyDropDown();
	//shutdownGraceful = new ConfigNodePropertyBoolean();
	//daemon = new ConfigNodePropertyBoolean();
	//shutdownWaitTime = new ConfigNodePropertyInteger();
	//priority = new ConfigNodePropertyDropDown();
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(minPoolSize != NULL) {
	//
	//delete minPoolSize;
	//minPoolSize = NULL;
	//}
	//if(maxPoolSize != NULL) {
	//
	//delete maxPoolSize;
	//maxPoolSize = NULL;
	//}
	//if(queueSize != NULL) {
	//
	//delete queueSize;
	//queueSize = NULL;
	//}
	//if(maxThreadAge != NULL) {
	//
	//delete maxThreadAge;
	//maxThreadAge = NULL;
	//}
	//if(keepAliveTime != NULL) {
	//
	//delete keepAliveTime;
	//keepAliveTime = NULL;
	//}
	//if(blockPolicy != NULL) {
	//
	//delete blockPolicy;
	//blockPolicy = NULL;
	//}
	//if(shutdownGraceful != NULL) {
	//
	//delete shutdownGraceful;
	//shutdownGraceful = NULL;
	//}
	//if(daemon != NULL) {
	//
	//delete daemon;
	//daemon = NULL;
	//}
	//if(shutdownWaitTime != NULL) {
	//
	//delete shutdownWaitTime;
	//shutdownWaitTime = NULL;
	//}
	//if(priority != NULL) {
	//
	//delete priority;
	//priority = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&name, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *minPoolSizeKey = "minPoolSize";
	node = json_object_get_member(pJsonObject, minPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxPoolSizeKey = "maxPoolSize";
	node = json_object_get_member(pJsonObject, maxPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queueSizeKey = "queueSize";
	node = json_object_get_member(pJsonObject, queueSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&queueSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&queueSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxThreadAgeKey = "maxThreadAge";
	node = json_object_get_member(pJsonObject, maxThreadAgeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxThreadAge, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxThreadAge);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *keepAliveTimeKey = "keepAliveTime";
	node = json_object_get_member(pJsonObject, keepAliveTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&keepAliveTime, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&keepAliveTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *blockPolicyKey = "blockPolicy";
	node = json_object_get_member(pJsonObject, blockPolicyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&blockPolicy, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&blockPolicy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *shutdownGracefulKey = "shutdownGraceful";
	node = json_object_get_member(pJsonObject, shutdownGracefulKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&shutdownGraceful, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&shutdownGraceful);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *daemonKey = "daemon";
	node = json_object_get_member(pJsonObject, daemonKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&daemon, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&daemon);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *shutdownWaitTimeKey = "shutdownWaitTime";
	node = json_object_get_member(pJsonObject, shutdownWaitTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&shutdownWaitTime, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&shutdownWaitTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *priorityKey = "priority";
	node = json_object_get_member(pJsonObject, priorityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&priority, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&priority);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minPoolSizeKey = "minPoolSize";
	json_object_set_member(pJsonObject, minPoolSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxPoolSizeKey = "maxPoolSize";
	json_object_set_member(pJsonObject, maxPoolSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQueueSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQueueSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queueSizeKey = "queueSize";
	json_object_set_member(pJsonObject, queueSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxThreadAge();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxThreadAge());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxThreadAgeKey = "maxThreadAge";
	json_object_set_member(pJsonObject, maxThreadAgeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getKeepAliveTime();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getKeepAliveTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *keepAliveTimeKey = "keepAliveTime";
	json_object_set_member(pJsonObject, keepAliveTimeKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getBlockPolicy();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getBlockPolicy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *blockPolicyKey = "blockPolicy";
	json_object_set_member(pJsonObject, blockPolicyKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getShutdownGraceful();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getShutdownGraceful());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *shutdownGracefulKey = "shutdownGraceful";
	json_object_set_member(pJsonObject, shutdownGracefulKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDaemon();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDaemon());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *daemonKey = "daemon";
	json_object_set_member(pJsonObject, daemonKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getShutdownWaitTime();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getShutdownWaitTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *shutdownWaitTimeKey = "shutdownWaitTime";
	json_object_set_member(pJsonObject, shutdownWaitTimeKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getPriority();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getPriority());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priorityKey = "priority";
	json_object_set_member(pJsonObject, priorityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getName()
{
	return name;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getMinPoolSize()
{
	return minPoolSize;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setMinPoolSize(ConfigNodePropertyInteger  minPoolSize)
{
	this->minPoolSize = minPoolSize;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getMaxPoolSize()
{
	return maxPoolSize;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setMaxPoolSize(ConfigNodePropertyInteger  maxPoolSize)
{
	this->maxPoolSize = maxPoolSize;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getQueueSize()
{
	return queueSize;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setQueueSize(ConfigNodePropertyInteger  queueSize)
{
	this->queueSize = queueSize;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getMaxThreadAge()
{
	return maxThreadAge;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setMaxThreadAge(ConfigNodePropertyInteger  maxThreadAge)
{
	this->maxThreadAge = maxThreadAge;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getKeepAliveTime()
{
	return keepAliveTime;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setKeepAliveTime(ConfigNodePropertyInteger  keepAliveTime)
{
	this->keepAliveTime = keepAliveTime;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getBlockPolicy()
{
	return blockPolicy;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setBlockPolicy(ConfigNodePropertyDropDown  blockPolicy)
{
	this->blockPolicy = blockPolicy;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getShutdownGraceful()
{
	return shutdownGraceful;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setShutdownGraceful(ConfigNodePropertyBoolean  shutdownGraceful)
{
	this->shutdownGraceful = shutdownGraceful;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getDaemon()
{
	return daemon;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setDaemon(ConfigNodePropertyBoolean  daemon)
{
	this->daemon = daemon;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getShutdownWaitTime()
{
	return shutdownWaitTime;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setShutdownWaitTime(ConfigNodePropertyInteger  shutdownWaitTime)
{
	this->shutdownWaitTime = shutdownWaitTime;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getPriority()
{
	return priority;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setPriority(ConfigNodePropertyDropDown  priority)
{
	this->priority = priority;
}


