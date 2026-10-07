#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties()
{
	//__init();
}

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::~OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//title = new ConfigNodePropertyString();
	//details = new ConfigNodePropertyString();
	//enabled = new ConfigNodePropertyBoolean();
	//serviceName = new ConfigNodePropertyString();
	//loglevel = new ConfigNodePropertyDropDown();
	//allowedroots = new ConfigNodePropertyArray();
	//requestAuthorizationStrategytarget = new ConfigNodePropertyString();
	//queueProviderFactorytarget = new ConfigNodePropertyString();
	//packageBuildertarget = new ConfigNodePropertyString();
	//triggerstarget = new ConfigNodePropertyString();
	//priorityQueues = new ConfigNodePropertyArray();
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::__cleanup()
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
	//if(requestAuthorizationStrategytarget != NULL) {
	//
	//delete requestAuthorizationStrategytarget;
	//requestAuthorizationStrategytarget = NULL;
	//}
	//if(queueProviderFactorytarget != NULL) {
	//
	//delete queueProviderFactorytarget;
	//queueProviderFactorytarget = NULL;
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
	//if(priorityQueues != NULL) {
	//
	//delete priorityQueues;
	//priorityQueues = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::fromJson(char* jsonStr)
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
	const gchar *queueProviderFactorytargetKey = "queueProviderFactory.target";
	node = json_object_get_member(pJsonObject, queueProviderFactorytargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&queueProviderFactorytarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&queueProviderFactorytarget);
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
}

OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::toJson()
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
		ConfigNodePropertyString obj = getQueueProviderFactorytarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getQueueProviderFactorytarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *queueProviderFactorytargetKey = "queueProviderFactory.target";
	json_object_set_member(pJsonObject, queueProviderFactorytargetKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setTitle(ConfigNodePropertyString  title)
{
	this->title = title;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getDetails()
{
	return details;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setDetails(ConfigNodePropertyString  details)
{
	this->details = details;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setServiceName(ConfigNodePropertyString  serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setLoglevel(ConfigNodePropertyDropDown  loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getAllowedroots()
{
	return allowedroots;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setAllowedroots(ConfigNodePropertyArray  allowedroots)
{
	this->allowedroots = allowedroots;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getRequestAuthorizationStrategytarget()
{
	return requestAuthorizationStrategytarget;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setRequestAuthorizationStrategytarget(ConfigNodePropertyString  requestAuthorizationStrategytarget)
{
	this->requestAuthorizationStrategytarget = requestAuthorizationStrategytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getQueueProviderFactorytarget()
{
	return queueProviderFactorytarget;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setQueueProviderFactorytarget(ConfigNodePropertyString  queueProviderFactorytarget)
{
	this->queueProviderFactorytarget = queueProviderFactorytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setPackageBuildertarget(ConfigNodePropertyString  packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getTriggerstarget()
{
	return triggerstarget;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setTriggerstarget(ConfigNodePropertyString  triggerstarget)
{
	this->triggerstarget = triggerstarget;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::getPriorityQueues()
{
	return priorityQueues;
}

void
OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties::setPriorityQueues(ConfigNodePropertyArray  priorityQueues)
{
	this->priorityQueues = priorityQueues;
}


