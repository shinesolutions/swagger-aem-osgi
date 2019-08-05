#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties()
{
	//__init();
}

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::~ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::__init()
{
	//threadPoolSize = new ConfigNodePropertyInteger();
	//delayTime = new ConfigNodePropertyInteger();
	//workerSleepTime = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::__cleanup()
{
	//if(threadPoolSize != NULL) {
	//
	//delete threadPoolSize;
	//threadPoolSize = NULL;
	//}
	//if(delayTime != NULL) {
	//
	//delete delayTime;
	//delayTime = NULL;
	//}
	//if(workerSleepTime != NULL) {
	//
	//delete workerSleepTime;
	//workerSleepTime = NULL;
	//}
	//
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *threadPoolSizeKey = "threadPoolSize";
	node = json_object_get_member(pJsonObject, threadPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&threadPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&threadPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *delayTimeKey = "delayTime";
	node = json_object_get_member(pJsonObject, delayTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&delayTime, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&delayTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *workerSleepTimeKey = "workerSleepTime";
	node = json_object_get_member(pJsonObject, workerSleepTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&workerSleepTime, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&workerSleepTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getThreadPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getThreadPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *threadPoolSizeKey = "threadPoolSize";
	json_object_set_member(pJsonObject, threadPoolSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDelayTime();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDelayTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *delayTimeKey = "delayTime";
	json_object_set_member(pJsonObject, delayTimeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getWorkerSleepTime();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getWorkerSleepTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *workerSleepTimeKey = "workerSleepTime";
	json_object_set_member(pJsonObject, workerSleepTimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::getThreadPoolSize()
{
	return threadPoolSize;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::setThreadPoolSize(ConfigNodePropertyInteger  threadPoolSize)
{
	this->threadPoolSize = threadPoolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::getDelayTime()
{
	return delayTime;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::setDelayTime(ConfigNodePropertyInteger  delayTime)
{
	this->delayTime = delayTime;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::getWorkerSleepTime()
{
	return workerSleepTime;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::setWorkerSleepTime(ConfigNodePropertyInteger  workerSleepTime)
{
	this->workerSleepTime = workerSleepTime;
}


