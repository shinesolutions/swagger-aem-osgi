#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties()
{
	//__init();
}

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::~ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::__init()
{
	//poolSize = new ConfigNodePropertyInteger();
	//maxPoolSize = new ConfigNodePropertyInteger();
	//queueSize = new ConfigNodePropertyInteger();
	//keepAliveTime = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::__cleanup()
{
	//if(poolSize != NULL) {
	//
	//delete poolSize;
	//poolSize = NULL;
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
	//if(keepAliveTime != NULL) {
	//
	//delete keepAliveTime;
	//keepAliveTime = NULL;
	//}
	//
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *poolSizeKey = "poolSize";
	node = json_object_get_member(pJsonObject, poolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&poolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&poolSize);
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
}

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *poolSizeKey = "poolSize";
	json_object_set_member(pJsonObject, poolSizeKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::getPoolSize()
{
	return poolSize;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::setPoolSize(ConfigNodePropertyInteger  poolSize)
{
	this->poolSize = poolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::getMaxPoolSize()
{
	return maxPoolSize;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::setMaxPoolSize(ConfigNodePropertyInteger  maxPoolSize)
{
	this->maxPoolSize = maxPoolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::getQueueSize()
{
	return queueSize;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::setQueueSize(ConfigNodePropertyInteger  queueSize)
{
	this->queueSize = queueSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::getKeepAliveTime()
{
	return keepAliveTime;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::setKeepAliveTime(ConfigNodePropertyInteger  keepAliveTime)
{
	this->keepAliveTime = keepAliveTime;
}


