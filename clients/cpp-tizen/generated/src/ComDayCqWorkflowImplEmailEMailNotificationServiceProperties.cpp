#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::ComDayCqWorkflowImplEmailEMailNotificationServiceProperties()
{
	//__init();
}

ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::~ComDayCqWorkflowImplEmailEMailNotificationServiceProperties()
{
	//__cleanup();
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::__init()
{
	//fromaddress = new ConfigNodePropertyString();
	//hostprefix = new ConfigNodePropertyString();
	//notifyonabort = new ConfigNodePropertyBoolean();
	//notifyoncomplete = new ConfigNodePropertyBoolean();
	//notifyoncontainercomplete = new ConfigNodePropertyBoolean();
	//notifyuseronly = new ConfigNodePropertyBoolean();
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::__cleanup()
{
	//if(fromaddress != NULL) {
	//
	//delete fromaddress;
	//fromaddress = NULL;
	//}
	//if(hostprefix != NULL) {
	//
	//delete hostprefix;
	//hostprefix = NULL;
	//}
	//if(notifyonabort != NULL) {
	//
	//delete notifyonabort;
	//notifyonabort = NULL;
	//}
	//if(notifyoncomplete != NULL) {
	//
	//delete notifyoncomplete;
	//notifyoncomplete = NULL;
	//}
	//if(notifyoncontainercomplete != NULL) {
	//
	//delete notifyoncontainercomplete;
	//notifyoncontainercomplete = NULL;
	//}
	//if(notifyuseronly != NULL) {
	//
	//delete notifyuseronly;
	//notifyuseronly = NULL;
	//}
	//
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fromaddressKey = "from.address";
	node = json_object_get_member(pJsonObject, fromaddressKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&fromaddress, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&fromaddress);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hostprefixKey = "host.prefix";
	node = json_object_get_member(pJsonObject, hostprefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&hostprefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&hostprefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *notifyonabortKey = "notify.onabort";
	node = json_object_get_member(pJsonObject, notifyonabortKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&notifyonabort, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&notifyonabort);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *notifyoncompleteKey = "notify.oncomplete";
	node = json_object_get_member(pJsonObject, notifyoncompleteKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&notifyoncomplete, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&notifyoncomplete);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *notifyoncontainercompleteKey = "notify.oncontainercomplete";
	node = json_object_get_member(pJsonObject, notifyoncontainercompleteKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&notifyoncontainercomplete, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&notifyoncontainercomplete);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *notifyuseronlyKey = "notify.useronly";
	node = json_object_get_member(pJsonObject, notifyuseronlyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&notifyuseronly, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&notifyuseronly);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFromaddress();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFromaddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fromaddressKey = "from.address";
	json_object_set_member(pJsonObject, fromaddressKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHostprefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHostprefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hostprefixKey = "host.prefix";
	json_object_set_member(pJsonObject, hostprefixKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getNotifyonabort();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getNotifyonabort());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *notifyonabortKey = "notify.onabort";
	json_object_set_member(pJsonObject, notifyonabortKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getNotifyoncomplete();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getNotifyoncomplete());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *notifyoncompleteKey = "notify.oncomplete";
	json_object_set_member(pJsonObject, notifyoncompleteKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getNotifyoncontainercomplete();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getNotifyoncontainercomplete());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *notifyoncontainercompleteKey = "notify.oncontainercomplete";
	json_object_set_member(pJsonObject, notifyoncontainercompleteKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getNotifyuseronly();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getNotifyuseronly());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *notifyuseronlyKey = "notify.useronly";
	json_object_set_member(pJsonObject, notifyuseronlyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getFromaddress()
{
	return fromaddress;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setFromaddress(ConfigNodePropertyString  fromaddress)
{
	this->fromaddress = fromaddress;
}

ConfigNodePropertyString
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getHostprefix()
{
	return hostprefix;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setHostprefix(ConfigNodePropertyString  hostprefix)
{
	this->hostprefix = hostprefix;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyonabort()
{
	return notifyonabort;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyonabort(ConfigNodePropertyBoolean  notifyonabort)
{
	this->notifyonabort = notifyonabort;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyoncomplete()
{
	return notifyoncomplete;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyoncomplete(ConfigNodePropertyBoolean  notifyoncomplete)
{
	this->notifyoncomplete = notifyoncomplete;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyoncontainercomplete()
{
	return notifyoncontainercomplete;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyoncontainercomplete(ConfigNodePropertyBoolean  notifyoncontainercomplete)
{
	this->notifyoncontainercomplete = notifyoncontainercomplete;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyuseronly()
{
	return notifyuseronly;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyuseronly(ConfigNodePropertyBoolean  notifyuseronly)
{
	this->notifyuseronly = notifyuseronly;
}


