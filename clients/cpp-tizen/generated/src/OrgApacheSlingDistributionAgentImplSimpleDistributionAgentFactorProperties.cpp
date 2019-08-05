#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties()
{
	//__init();
}

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::~OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//title = new ConfigNodePropertyString();
	//details = new ConfigNodePropertyString();
	//enabled = new ConfigNodePropertyBoolean();
	//serviceName = new ConfigNodePropertyString();
	//loglevel = new ConfigNodePropertyDropDown();
	//queueprocessingenabled = new ConfigNodePropertyBoolean();
	//packageExportertarget = new ConfigNodePropertyString();
	//packageImportertarget = new ConfigNodePropertyString();
	//requestAuthorizationStrategytarget = new ConfigNodePropertyString();
	//triggerstarget = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::__cleanup()
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
	//if(packageExportertarget != NULL) {
	//
	//delete packageExportertarget;
	//packageExportertarget = NULL;
	//}
	//if(packageImportertarget != NULL) {
	//
	//delete packageImportertarget;
	//packageImportertarget = NULL;
	//}
	//if(requestAuthorizationStrategytarget != NULL) {
	//
	//delete requestAuthorizationStrategytarget;
	//requestAuthorizationStrategytarget = NULL;
	//}
	//if(triggerstarget != NULL) {
	//
	//delete triggerstarget;
	//triggerstarget = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::fromJson(char* jsonStr)
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
	const gchar *packageExportertargetKey = "packageExporter.target";
	node = json_object_get_member(pJsonObject, packageExportertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&packageExportertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&packageExportertarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *packageImportertargetKey = "packageImporter.target";
	node = json_object_get_member(pJsonObject, packageImportertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&packageImportertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&packageImportertarget);
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

OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPackageExportertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPackageExportertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *packageExportertargetKey = "packageExporter.target";
	json_object_set_member(pJsonObject, packageExportertargetKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPackageImportertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPackageImportertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *packageImportertargetKey = "packageImporter.target";
	json_object_set_member(pJsonObject, packageImportertargetKey, node);
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
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setTitle(ConfigNodePropertyString  title)
{
	this->title = title;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getDetails()
{
	return details;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setDetails(ConfigNodePropertyString  details)
{
	this->details = details;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setServiceName(ConfigNodePropertyString  serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setLoglevel(ConfigNodePropertyDropDown  loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getQueueprocessingenabled()
{
	return queueprocessingenabled;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setQueueprocessingenabled(ConfigNodePropertyBoolean  queueprocessingenabled)
{
	this->queueprocessingenabled = queueprocessingenabled;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getPackageExportertarget()
{
	return packageExportertarget;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setPackageExportertarget(ConfigNodePropertyString  packageExportertarget)
{
	this->packageExportertarget = packageExportertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getPackageImportertarget()
{
	return packageImportertarget;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setPackageImportertarget(ConfigNodePropertyString  packageImportertarget)
{
	this->packageImportertarget = packageImportertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getRequestAuthorizationStrategytarget()
{
	return requestAuthorizationStrategytarget;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setRequestAuthorizationStrategytarget(ConfigNodePropertyString  requestAuthorizationStrategytarget)
{
	this->requestAuthorizationStrategytarget = requestAuthorizationStrategytarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::getTriggerstarget()
{
	return triggerstarget;
}

void
OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties::setTriggerstarget(ConfigNodePropertyString  triggerstarget)
{
	this->triggerstarget = triggerstarget;
}


