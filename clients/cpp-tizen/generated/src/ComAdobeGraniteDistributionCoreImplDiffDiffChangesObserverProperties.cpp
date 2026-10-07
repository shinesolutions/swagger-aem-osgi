#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties()
{
	//__init();
}

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::~ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
	//agentName = new ConfigNodePropertyString();
	//diffPath = new ConfigNodePropertyString();
	//observedPath = new ConfigNodePropertyString();
	//serviceName = new ConfigNodePropertyString();
	//propertyNames = new ConfigNodePropertyString();
	//distributionDelay = new ConfigNodePropertyInteger();
	//serviceUsertarget = new ConfigNodePropertyString();
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(agentName != NULL) {
	//
	//delete agentName;
	//agentName = NULL;
	//}
	//if(diffPath != NULL) {
	//
	//delete diffPath;
	//diffPath = NULL;
	//}
	//if(observedPath != NULL) {
	//
	//delete observedPath;
	//observedPath = NULL;
	//}
	//if(serviceName != NULL) {
	//
	//delete serviceName;
	//serviceName = NULL;
	//}
	//if(propertyNames != NULL) {
	//
	//delete propertyNames;
	//propertyNames = NULL;
	//}
	//if(distributionDelay != NULL) {
	//
	//delete distributionDelay;
	//distributionDelay = NULL;
	//}
	//if(serviceUsertarget != NULL) {
	//
	//delete serviceUsertarget;
	//serviceUsertarget = NULL;
	//}
	//
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *agentNameKey = "agentName";
	node = json_object_get_member(pJsonObject, agentNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&agentName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&agentName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *diffPathKey = "diffPath";
	node = json_object_get_member(pJsonObject, diffPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&diffPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&diffPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *observedPathKey = "observedPath";
	node = json_object_get_member(pJsonObject, observedPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&observedPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&observedPath);
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
	const gchar *propertyNamesKey = "propertyNames";
	node = json_object_get_member(pJsonObject, propertyNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&propertyNames, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&propertyNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *distributionDelayKey = "distributionDelay";
	node = json_object_get_member(pJsonObject, distributionDelayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&distributionDelay, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&distributionDelay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceUsertargetKey = "serviceUser.target";
	node = json_object_get_member(pJsonObject, serviceUsertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&serviceUsertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&serviceUsertarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
		ConfigNodePropertyString obj = getAgentName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAgentName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *agentNameKey = "agentName";
	json_object_set_member(pJsonObject, agentNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDiffPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDiffPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *diffPathKey = "diffPath";
	json_object_set_member(pJsonObject, diffPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getObservedPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getObservedPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *observedPathKey = "observedPath";
	json_object_set_member(pJsonObject, observedPathKey, node);
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPropertyNames();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPropertyNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertyNamesKey = "propertyNames";
	json_object_set_member(pJsonObject, propertyNamesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDistributionDelay();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDistributionDelay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *distributionDelayKey = "distributionDelay";
	json_object_set_member(pJsonObject, distributionDelayKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServiceUsertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServiceUsertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceUsertargetKey = "serviceUser.target";
	json_object_set_member(pJsonObject, serviceUsertargetKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getAgentName()
{
	return agentName;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setAgentName(ConfigNodePropertyString  agentName)
{
	this->agentName = agentName;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getDiffPath()
{
	return diffPath;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setDiffPath(ConfigNodePropertyString  diffPath)
{
	this->diffPath = diffPath;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getObservedPath()
{
	return observedPath;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setObservedPath(ConfigNodePropertyString  observedPath)
{
	this->observedPath = observedPath;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getServiceName()
{
	return serviceName;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setServiceName(ConfigNodePropertyString  serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getPropertyNames()
{
	return propertyNames;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setPropertyNames(ConfigNodePropertyString  propertyNames)
{
	this->propertyNames = propertyNames;
}

ConfigNodePropertyInteger
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getDistributionDelay()
{
	return distributionDelay;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setDistributionDelay(ConfigNodePropertyInteger  distributionDelay)
{
	this->distributionDelay = distributionDelay;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::getServiceUsertarget()
{
	return serviceUsertarget;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties::setServiceUsertarget(ConfigNodePropertyString  serviceUsertarget)
{
	this->serviceUsertarget = serviceUsertarget;
}


