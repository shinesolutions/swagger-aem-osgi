#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixEventadminImplEventAdminProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixEventadminImplEventAdminProperties::OrgApacheFelixEventadminImplEventAdminProperties()
{
	//__init();
}

OrgApacheFelixEventadminImplEventAdminProperties::~OrgApacheFelixEventadminImplEventAdminProperties()
{
	//__cleanup();
}

void
OrgApacheFelixEventadminImplEventAdminProperties::__init()
{
	//orgapachefelixeventadminThreadPoolSize = new ConfigNodePropertyInteger();
	//orgapachefelixeventadminAsyncToSyncThreadRatio = new ConfigNodePropertyFloat();
	//orgapachefelixeventadminTimeout = new ConfigNodePropertyInteger();
	//orgapachefelixeventadminRequireTopic = new ConfigNodePropertyBoolean();
	//orgapachefelixeventadminIgnoreTimeout = new ConfigNodePropertyArray();
	//orgapachefelixeventadminIgnoreTopic = new ConfigNodePropertyArray();
}

void
OrgApacheFelixEventadminImplEventAdminProperties::__cleanup()
{
	//if(orgapachefelixeventadminThreadPoolSize != NULL) {
	//
	//delete orgapachefelixeventadminThreadPoolSize;
	//orgapachefelixeventadminThreadPoolSize = NULL;
	//}
	//if(orgapachefelixeventadminAsyncToSyncThreadRatio != NULL) {
	//
	//delete orgapachefelixeventadminAsyncToSyncThreadRatio;
	//orgapachefelixeventadminAsyncToSyncThreadRatio = NULL;
	//}
	//if(orgapachefelixeventadminTimeout != NULL) {
	//
	//delete orgapachefelixeventadminTimeout;
	//orgapachefelixeventadminTimeout = NULL;
	//}
	//if(orgapachefelixeventadminRequireTopic != NULL) {
	//
	//delete orgapachefelixeventadminRequireTopic;
	//orgapachefelixeventadminRequireTopic = NULL;
	//}
	//if(orgapachefelixeventadminIgnoreTimeout != NULL) {
	//
	//delete orgapachefelixeventadminIgnoreTimeout;
	//orgapachefelixeventadminIgnoreTimeout = NULL;
	//}
	//if(orgapachefelixeventadminIgnoreTopic != NULL) {
	//
	//delete orgapachefelixeventadminIgnoreTopic;
	//orgapachefelixeventadminIgnoreTopic = NULL;
	//}
	//
}

void
OrgApacheFelixEventadminImplEventAdminProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapachefelixeventadminThreadPoolSizeKey = "org.apache.felix.eventadmin.ThreadPoolSize";
	node = json_object_get_member(pJsonObject, orgapachefelixeventadminThreadPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&orgapachefelixeventadminThreadPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&orgapachefelixeventadminThreadPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapachefelixeventadminAsyncToSyncThreadRatioKey = "org.apache.felix.eventadmin.AsyncToSyncThreadRatio";
	node = json_object_get_member(pJsonObject, orgapachefelixeventadminAsyncToSyncThreadRatioKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyFloat")) {
			jsonToValue(&orgapachefelixeventadminAsyncToSyncThreadRatio, node, "ConfigNodePropertyFloat", "ConfigNodePropertyFloat");
		} else {
			
			ConfigNodePropertyFloat* obj = static_cast<ConfigNodePropertyFloat*> (&orgapachefelixeventadminAsyncToSyncThreadRatio);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapachefelixeventadminTimeoutKey = "org.apache.felix.eventadmin.Timeout";
	node = json_object_get_member(pJsonObject, orgapachefelixeventadminTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&orgapachefelixeventadminTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&orgapachefelixeventadminTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapachefelixeventadminRequireTopicKey = "org.apache.felix.eventadmin.RequireTopic";
	node = json_object_get_member(pJsonObject, orgapachefelixeventadminRequireTopicKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&orgapachefelixeventadminRequireTopic, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&orgapachefelixeventadminRequireTopic);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapachefelixeventadminIgnoreTimeoutKey = "org.apache.felix.eventadmin.IgnoreTimeout";
	node = json_object_get_member(pJsonObject, orgapachefelixeventadminIgnoreTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&orgapachefelixeventadminIgnoreTimeout, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&orgapachefelixeventadminIgnoreTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapachefelixeventadminIgnoreTopicKey = "org.apache.felix.eventadmin.IgnoreTopic";
	node = json_object_get_member(pJsonObject, orgapachefelixeventadminIgnoreTopicKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&orgapachefelixeventadminIgnoreTopic, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&orgapachefelixeventadminIgnoreTopic);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixEventadminImplEventAdminProperties::OrgApacheFelixEventadminImplEventAdminProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixEventadminImplEventAdminProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOrgapachefelixeventadminThreadPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOrgapachefelixeventadminThreadPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapachefelixeventadminThreadPoolSizeKey = "org.apache.felix.eventadmin.ThreadPoolSize";
	json_object_set_member(pJsonObject, orgapachefelixeventadminThreadPoolSizeKey, node);
	if (isprimitive("ConfigNodePropertyFloat")) {
		ConfigNodePropertyFloat obj = getOrgapachefelixeventadminAsyncToSyncThreadRatio();
		node = converttoJson(&obj, "ConfigNodePropertyFloat", "");
	}
	else {
		
		ConfigNodePropertyFloat obj = static_cast<ConfigNodePropertyFloat> (getOrgapachefelixeventadminAsyncToSyncThreadRatio());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapachefelixeventadminAsyncToSyncThreadRatioKey = "org.apache.felix.eventadmin.AsyncToSyncThreadRatio";
	json_object_set_member(pJsonObject, orgapachefelixeventadminAsyncToSyncThreadRatioKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOrgapachefelixeventadminTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOrgapachefelixeventadminTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapachefelixeventadminTimeoutKey = "org.apache.felix.eventadmin.Timeout";
	json_object_set_member(pJsonObject, orgapachefelixeventadminTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOrgapachefelixeventadminRequireTopic();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOrgapachefelixeventadminRequireTopic());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapachefelixeventadminRequireTopicKey = "org.apache.felix.eventadmin.RequireTopic";
	json_object_set_member(pJsonObject, orgapachefelixeventadminRequireTopicKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOrgapachefelixeventadminIgnoreTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOrgapachefelixeventadminIgnoreTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapachefelixeventadminIgnoreTimeoutKey = "org.apache.felix.eventadmin.IgnoreTimeout";
	json_object_set_member(pJsonObject, orgapachefelixeventadminIgnoreTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOrgapachefelixeventadminIgnoreTopic();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOrgapachefelixeventadminIgnoreTopic());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapachefelixeventadminIgnoreTopicKey = "org.apache.felix.eventadmin.IgnoreTopic";
	json_object_set_member(pJsonObject, orgapachefelixeventadminIgnoreTopicKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminThreadPoolSize()
{
	return orgapachefelixeventadminThreadPoolSize;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminThreadPoolSize(ConfigNodePropertyInteger  orgapachefelixeventadminThreadPoolSize)
{
	this->orgapachefelixeventadminThreadPoolSize = orgapachefelixeventadminThreadPoolSize;
}

ConfigNodePropertyFloat
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminAsyncToSyncThreadRatio()
{
	return orgapachefelixeventadminAsyncToSyncThreadRatio;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat  orgapachefelixeventadminAsyncToSyncThreadRatio)
{
	this->orgapachefelixeventadminAsyncToSyncThreadRatio = orgapachefelixeventadminAsyncToSyncThreadRatio;
}

ConfigNodePropertyInteger
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminTimeout()
{
	return orgapachefelixeventadminTimeout;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminTimeout(ConfigNodePropertyInteger  orgapachefelixeventadminTimeout)
{
	this->orgapachefelixeventadminTimeout = orgapachefelixeventadminTimeout;
}

ConfigNodePropertyBoolean
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminRequireTopic()
{
	return orgapachefelixeventadminRequireTopic;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminRequireTopic(ConfigNodePropertyBoolean  orgapachefelixeventadminRequireTopic)
{
	this->orgapachefelixeventadminRequireTopic = orgapachefelixeventadminRequireTopic;
}

ConfigNodePropertyArray
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminIgnoreTimeout()
{
	return orgapachefelixeventadminIgnoreTimeout;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminIgnoreTimeout(ConfigNodePropertyArray  orgapachefelixeventadminIgnoreTimeout)
{
	this->orgapachefelixeventadminIgnoreTimeout = orgapachefelixeventadminIgnoreTimeout;
}

ConfigNodePropertyArray
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminIgnoreTopic()
{
	return orgapachefelixeventadminIgnoreTopic;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminIgnoreTopic(ConfigNodePropertyArray  orgapachefelixeventadminIgnoreTopic)
{
	this->orgapachefelixeventadminIgnoreTopic = orgapachefelixeventadminIgnoreTopic;
}


