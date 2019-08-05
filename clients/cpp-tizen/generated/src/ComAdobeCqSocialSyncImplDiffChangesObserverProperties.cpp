#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialSyncImplDiffChangesObserverProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialSyncImplDiffChangesObserverProperties::ComAdobeCqSocialSyncImplDiffChangesObserverProperties()
{
	//__init();
}

ComAdobeCqSocialSyncImplDiffChangesObserverProperties::~ComAdobeCqSocialSyncImplDiffChangesObserverProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
	//agentName = new ConfigNodePropertyString();
	//diffPath = new ConfigNodePropertyString();
	//propertyNames = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::__cleanup()
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
	//if(propertyNames != NULL) {
	//
	//delete propertyNames;
	//propertyNames = NULL;
	//}
	//
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::fromJson(char* jsonStr)
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
}

ComAdobeCqSocialSyncImplDiffChangesObserverProperties::ComAdobeCqSocialSyncImplDiffChangesObserverProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::getAgentName()
{
	return agentName;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::setAgentName(ConfigNodePropertyString  agentName)
{
	this->agentName = agentName;
}

ConfigNodePropertyString
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::getDiffPath()
{
	return diffPath;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::setDiffPath(ConfigNodePropertyString  diffPath)
{
	this->diffPath = diffPath;
}

ConfigNodePropertyString
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::getPropertyNames()
{
	return propertyNames;
}

void
ComAdobeCqSocialSyncImplDiffChangesObserverProperties::setPropertyNames(ConfigNodePropertyString  propertyNames)
{
	this->propertyNames = propertyNames;
}


