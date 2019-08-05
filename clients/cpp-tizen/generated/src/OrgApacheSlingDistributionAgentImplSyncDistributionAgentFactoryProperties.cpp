#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties()
{
	//__init();
}

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::~OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//title = new ConfigNodePropertyString();
	//details = new ConfigNodePropertyString();
	//enabled = new ConfigNodePropertyBoolean();
	//serviceName = new ConfigNodePropertyString();
	//loglevel = new ConfigNodePropertyDropDown();
	//queueprocessingenabled = new ConfigNodePropertyBoolean();
	//passiveQueues = new ConfigNodePropertyArray();
	//packageExporterendpoints = new ConfigNodePropertyArray();
	//packageImporterendpoints = new ConfigNodePropertyArray();
	//retrystrategy = new ConfigNodePropertyDropDown();
	//retryattempts = new ConfigNodePropertyInteger();
	//pullitems = new ConfigNodePropertyInteger();
	//httpconntimeout = new ConfigNodePropertyInteger();
	//requestAuthorizationStrategytarget = new ConfigNodePropertyString();
	//transportSecretProvidertarget = new ConfigNodePropertyString();
	//packageBuildertarget = new ConfigNodePropertyString();
	//triggerstarget = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::__cleanup()
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
	//if(queueprocessingenabled != NULL) {
	//
	//delete queueprocessingenabled;
	//queueprocessingenabled = NULL;
	//}
	//if(passiveQueues != NULL) {
	//
	//delete passiveQueues;
	//passiveQueues = NULL;
	//}
	//if(packageExporterendpoints != NULL) {
	//
	//delete packageExporterendpoints;
	//packageExporterendpoints = NULL;
	//}
	//if(packageImporterendpoints != NULL) {
	//
	//delete packageImporterendpoints;
	//packageImporterendpoints = NULL;
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
	//if(pullitems != NULL) {
	//
	//delete pullitems;
	//pullitems = NULL;
	//}
	//if(httpconntimeout != NULL) {
	//
	//delete httpconntimeout;
	//httpconntimeout = NULL;
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
	//
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::fromJson(char* jsonStr)
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
	const gchar *packageExporterendpointsKey = "packageExporter.endpoints";
	node = json_object_get_member(pJsonObject, packageExporterendpointsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&packageExporterendpoints, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&packageExporterendpoints);
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
	const gchar *pullitemsKey = "pull.items";
	node = json_object_get_member(pJsonObject, pullitemsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&pullitems, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&pullitems);
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
}

OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::toJson()
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
		ConfigNodePropertyArray obj = getPackageExporterendpoints();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPackageExporterendpoints());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *packageExporterendpointsKey = "packageExporter.endpoints";
	json_object_set_member(pJsonObject, packageExporterendpointsKey, node);
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPullitems();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPullitems());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pullitemsKey = "pull.items";
	json_object_set_member(pJsonObject, pullitemsKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setTitle(ConfigNodePropertyString  title)
{
	this->title = title;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getDetails()
{
	return details;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setDetails(ConfigNodePropertyString  details)
{
	this->details = details;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setServiceName(ConfigNodePropertyString  serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setLoglevel(ConfigNodePropertyDropDown  loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getQueueprocessingenabled()
{
	return queueprocessingenabled;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setQueueprocessingenabled(ConfigNodePropertyBoolean  queueprocessingenabled)
{
	this->queueprocessingenabled = queueprocessingenabled;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPassiveQueues()
{
	return passiveQueues;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPassiveQueues(ConfigNodePropertyArray  passiveQueues)
{
	this->passiveQueues = passiveQueues;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPackageExporterendpoints()
{
	return packageExporterendpoints;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPackageExporterendpoints(ConfigNodePropertyArray  packageExporterendpoints)
{
	this->packageExporterendpoints = packageExporterendpoints;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPackageImporterendpoints()
{
	return packageImporterendpoints;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPackageImporterendpoints(ConfigNodePropertyArray  packageImporterendpoints)
{
	this->packageImporterendpoints = packageImporterendpoints;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getRetrystrategy()
{
	return retrystrategy;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setRetrystrategy(ConfigNodePropertyDropDown  retrystrategy)
{
	this->retrystrategy = retrystrategy;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getRetryattempts()
{
	return retryattempts;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setRetryattempts(ConfigNodePropertyInteger  retryattempts)
{
	this->retryattempts = retryattempts;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPullitems()
{
	return pullitems;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPullitems(ConfigNodePropertyInteger  pullitems)
{
	this->pullitems = pullitems;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getHttpconntimeout()
{
	return httpconntimeout;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setHttpconntimeout(ConfigNodePropertyInteger  httpconntimeout)
{
	this->httpconntimeout = httpconntimeout;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getRequestAuthorizationStrategytarget()
{
	return requestAuthorizationStrategytarget;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setRequestAuthorizationStrategytarget(ConfigNodePropertyString  requestAuthorizationStrategytarget)
{
	this->requestAuthorizationStrategytarget = requestAuthorizationStrategytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setTransportSecretProvidertarget(ConfigNodePropertyString  transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setPackageBuildertarget(ConfigNodePropertyString  packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::getTriggerstarget()
{
	return triggerstarget;
}

void
OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties::setTriggerstarget(ConfigNodePropertyString  triggerstarget)
{
	this->triggerstarget = triggerstarget;
}


