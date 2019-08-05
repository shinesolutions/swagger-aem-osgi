#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties()
{
	//__init();
}

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::~OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//title = new ConfigNodePropertyString();
	//details = new ConfigNodePropertyString();
	//enabled = new ConfigNodePropertyBoolean();
	//serviceName = new ConfigNodePropertyString();
	//loglevel = new ConfigNodePropertyDropDown();
	//allowedroots = new ConfigNodePropertyArray();
	//queueprocessingenabled = new ConfigNodePropertyBoolean();
	//packageImporterendpoints = new ConfigNodePropertyArray();
	//passiveQueues = new ConfigNodePropertyArray();
	//priorityQueues = new ConfigNodePropertyArray();
	//retrystrategy = new ConfigNodePropertyDropDown();
	//retryattempts = new ConfigNodePropertyInteger();
	//requestAuthorizationStrategytarget = new ConfigNodePropertyString();
	//transportSecretProvidertarget = new ConfigNodePropertyString();
	//packageBuildertarget = new ConfigNodePropertyString();
	//triggerstarget = new ConfigNodePropertyString();
	//queueprovider = new ConfigNodePropertyDropDown();
	//asyncdelivery = new ConfigNodePropertyBoolean();
	//httpconntimeout = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(details != NULL) {
	//
	//delete details;
	//details = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(serviceName != NULL) {
	//
	//delete serviceName;
	//serviceName = NULL;
	//}
	//if(loglevel != NULL) {
	//
	//delete loglevel;
	//loglevel = NULL;
	//}
	//if(allowedroots != NULL) {
	//
	//delete allowedroots;
	//allowedroots = NULL;
	//}
	//if(queueprocessingenabled != NULL) {
	//
	//delete queueprocessingenabled;
	//queueprocessingenabled = NULL;
	//}
	//if(packageImporterendpoints != NULL) {
	//
	//delete packageImporterendpoints;
	//packageImporterendpoints = NULL;
	//}
	//if(passiveQueues != NULL) {
	//
	//delete passiveQueues;
	//passiveQueues = NULL;
	//}
	//if(priorityQueues != NULL) {
	//
	//delete priorityQueues;
	//priorityQueues = NULL;
	//}
	//if(retrystrategy != NULL) {
	//
	//delete retrystrategy;
	//retrystrategy = NULL;
	//}
	//if(retryattempts != NULL) {
	//
	//delete retryattempts;
	//retryattempts = NULL;
	//}
	//if(requestAuthorizationStrategytarget != NULL) {
	//
	//delete requestAuthorizationStrategytarget;
	//requestAuthorizationStrategytarget = NULL;
	//}
	//if(transportSecretProvidertarget != NULL) {
	//
	//delete transportSecretProvidertarget;
	//transportSecretProvidertarget = NULL;
	//}
	//if(packageBuildertarget != NULL) {
	//
	//delete packageBuildertarget;
	//packageBuildertarget = NULL;
	//}
	//if(triggerstarget != NULL) {
	//
	//delete triggerstarget;
	//triggerstarget = NULL;
	//}
	//if(queueprovider != NULL) {
	//
	//delete queueprovider;
	//queueprovider = NULL;
	//}
	//if(asyncdelivery != NULL) {
	//
	//delete asyncdelivery;
	//asyncdelivery = NULL;
	//}
	//if(httpconntimeout != NULL) {
	//
	//delete httpconntimeout;
	//httpconntimeout = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::fromJson(char* jsonStr)
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
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&title, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&title);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *detailsKey = "details";
	node = json_object_get_member(pJsonObject, detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&details, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceNameKey = "serviceName";
	node = json_object_get_member(pJsonObject, serviceNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&serviceName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&serviceName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *loglevelKey = "log.level";
	node = json_object_get_member(pJsonObject, loglevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&loglevel, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&loglevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *allowedrootsKey = "allowed.roots";
	node = json_object_get_member(pJsonObject, allowedrootsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&allowedroots, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&allowedroots);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queueprocessingenabledKey = "queue.processing.enabled";
	node = json_object_get_member(pJsonObject, queueprocessingenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&queueprocessingenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&queueprocessingenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *packageImporterendpointsKey = "packageImporter.endpoints";
	node = json_object_get_member(pJsonObject, packageImporterendpointsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&packageImporterendpoints, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&packageImporterendpoints);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passiveQueuesKey = "passiveQueues";
	node = json_object_get_member(pJsonObject, passiveQueuesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&passiveQueues, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&passiveQueues);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *priorityQueuesKey = "priorityQueues";
	node = json_object_get_member(pJsonObject, priorityQueuesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&priorityQueues, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&priorityQueues);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *retrystrategyKey = "retry.strategy";
	node = json_object_get_member(pJsonObject, retrystrategyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&retrystrategy, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&retrystrategy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *retryattemptsKey = "retry.attempts";
	node = json_object_get_member(pJsonObject, retryattemptsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&retryattempts, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&retryattempts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestAuthorizationStrategytargetKey = "requestAuthorizationStrategy.target";
	node = json_object_get_member(pJsonObject, requestAuthorizationStrategytargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&requestAuthorizationStrategytarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&requestAuthorizationStrategytarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *transportSecretProvidertargetKey = "transportSecretProvider.target";
	node = json_object_get_member(pJsonObject, transportSecretProvidertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&transportSecretProvidertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&transportSecretProvidertarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *packageBuildertargetKey = "packageBuilder.target";
	node = json_object_get_member(pJsonObject, packageBuildertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&packageBuildertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&packageBuildertarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *triggerstargetKey = "triggers.target";
	node = json_object_get_member(pJsonObject, triggerstargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&triggerstarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&triggerstarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *queueproviderKey = "queue.provider";
	node = json_object_get_member(pJsonObject, queueproviderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&queueprovider, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&queueprovider);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *asyncdeliveryKey = "async.delivery";
	node = json_object_get_member(pJsonObject, asyncdeliveryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&asyncdelivery, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&asyncdelivery);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpconntimeoutKey = "http.conn.timeout";
	node = json_object_get_member(pJsonObject, httpconntimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&httpconntimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&httpconntimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTitle();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTitle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDetails();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *detailsKey = "details";
	json_object_set_member(pJsonObject, detailsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServiceName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServiceName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceNameKey = "serviceName";
	json_object_set_member(pJsonObject, serviceNameKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getLoglevel();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getLoglevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *loglevelKey = "log.level";
	json_object_set_member(pJsonObject, loglevelKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAllowedroots();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAllowedroots());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowedrootsKey = "allowed.roots";
	json_object_set_member(pJsonObject, allowedrootsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getQueueprocessingenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getQueueprocessingenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queueprocessingenabledKey = "queue.processing.enabled";
	json_object_set_member(pJsonObject, queueprocessingenabledKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPackageImporterendpoints();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPackageImporterendpoints());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *packageImporterendpointsKey = "packageImporter.endpoints";
	json_object_set_member(pJsonObject, packageImporterendpointsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPassiveQueues();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPassiveQueues());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passiveQueuesKey = "passiveQueues";
	json_object_set_member(pJsonObject, passiveQueuesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPriorityQueues();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPriorityQueues());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priorityQueuesKey = "priorityQueues";
	json_object_set_member(pJsonObject, priorityQueuesKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getRetrystrategy();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getRetrystrategy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *retrystrategyKey = "retry.strategy";
	json_object_set_member(pJsonObject, retrystrategyKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRetryattempts();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRetryattempts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *retryattemptsKey = "retry.attempts";
	json_object_set_member(pJsonObject, retryattemptsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRequestAuthorizationStrategytarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRequestAuthorizationStrategytarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestAuthorizationStrategytargetKey = "requestAuthorizationStrategy.target";
	json_object_set_member(pJsonObject, requestAuthorizationStrategytargetKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTransportSecretProvidertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTransportSecretProvidertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *transportSecretProvidertargetKey = "transportSecretProvider.target";
	json_object_set_member(pJsonObject, transportSecretProvidertargetKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPackageBuildertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPackageBuildertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *packageBuildertargetKey = "packageBuilder.target";
	json_object_set_member(pJsonObject, packageBuildertargetKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTriggerstarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTriggerstarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *triggerstargetKey = "triggers.target";
	json_object_set_member(pJsonObject, triggerstargetKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getQueueprovider();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getQueueprovider());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queueproviderKey = "queue.provider";
	json_object_set_member(pJsonObject, queueproviderKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAsyncdelivery();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAsyncdelivery());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *asyncdeliveryKey = "async.delivery";
	json_object_set_member(pJsonObject, asyncdeliveryKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getHttpconntimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getHttpconntimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpconntimeoutKey = "http.conn.timeout";
	json_object_set_member(pJsonObject, httpconntimeoutKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setTitle(ConfigNodePropertyString  title)
{
	this->title = title;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getDetails()
{
	return details;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setDetails(ConfigNodePropertyString  details)
{
	this->details = details;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setServiceName(ConfigNodePropertyString  serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setLoglevel(ConfigNodePropertyDropDown  loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getAllowedroots()
{
	return allowedroots;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setAllowedroots(ConfigNodePropertyArray  allowedroots)
{
	this->allowedroots = allowedroots;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getQueueprocessingenabled()
{
	return queueprocessingenabled;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setQueueprocessingenabled(ConfigNodePropertyBoolean  queueprocessingenabled)
{
	this->queueprocessingenabled = queueprocessingenabled;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getPackageImporterendpoints()
{
	return packageImporterendpoints;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setPackageImporterendpoints(ConfigNodePropertyArray  packageImporterendpoints)
{
	this->packageImporterendpoints = packageImporterendpoints;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getPassiveQueues()
{
	return passiveQueues;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setPassiveQueues(ConfigNodePropertyArray  passiveQueues)
{
	this->passiveQueues = passiveQueues;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getPriorityQueues()
{
	return priorityQueues;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setPriorityQueues(ConfigNodePropertyArray  priorityQueues)
{
	this->priorityQueues = priorityQueues;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getRetrystrategy()
{
	return retrystrategy;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setRetrystrategy(ConfigNodePropertyDropDown  retrystrategy)
{
	this->retrystrategy = retrystrategy;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getRetryattempts()
{
	return retryattempts;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setRetryattempts(ConfigNodePropertyInteger  retryattempts)
{
	this->retryattempts = retryattempts;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getRequestAuthorizationStrategytarget()
{
	return requestAuthorizationStrategytarget;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setRequestAuthorizationStrategytarget(ConfigNodePropertyString  requestAuthorizationStrategytarget)
{
	this->requestAuthorizationStrategytarget = requestAuthorizationStrategytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setTransportSecretProvidertarget(ConfigNodePropertyString  transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setPackageBuildertarget(ConfigNodePropertyString  packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getTriggerstarget()
{
	return triggerstarget;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setTriggerstarget(ConfigNodePropertyString  triggerstarget)
{
	this->triggerstarget = triggerstarget;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getQueueprovider()
{
	return queueprovider;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setQueueprovider(ConfigNodePropertyDropDown  queueprovider)
{
	this->queueprovider = queueprovider;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getAsyncdelivery()
{
	return asyncdelivery;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setAsyncdelivery(ConfigNodePropertyBoolean  asyncdelivery)
{
	this->asyncdelivery = asyncdelivery;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::getHttpconntimeout()
{
	return httpconntimeout;
}

void
OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties::setHttpconntimeout(ConfigNodePropertyInteger  httpconntimeout)
{
	this->httpconntimeout = httpconntimeout;
}


