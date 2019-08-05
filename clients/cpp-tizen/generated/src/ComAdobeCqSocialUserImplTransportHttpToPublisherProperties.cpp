#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::ComAdobeCqSocialUserImplTransportHttpToPublisherProperties()
{
	//__init();
}

ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::~ComAdobeCqSocialUserImplTransportHttpToPublisherProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::__init()
{
	//enable = new ConfigNodePropertyBoolean();
	//agentconfiguration = new ConfigNodePropertyArray();
	//contextpath = new ConfigNodePropertyString();
	//disabledciphersuites = new ConfigNodePropertyArray();
	//enabledciphersuites = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::__cleanup()
{
	//if(enable != NULL) {
	//
	//delete enable;
	//enable = NULL;
	//}
	//if(agentconfiguration != NULL) {
	//
	//delete agentconfiguration;
	//agentconfiguration = NULL;
	//}
	//if(contextpath != NULL) {
	//
	//delete contextpath;
	//contextpath = NULL;
	//}
	//if(disabledciphersuites != NULL) {
	//
	//delete disabledciphersuites;
	//disabledciphersuites = NULL;
	//}
	//if(enabledciphersuites != NULL) {
	//
	//delete enabledciphersuites;
	//enabledciphersuites = NULL;
	//}
	//
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enableKey = "enable";
	node = json_object_get_member(pJsonObject, enableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *agentconfigurationKey = "agent.configuration";
	node = json_object_get_member(pJsonObject, agentconfigurationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&agentconfiguration, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&agentconfiguration);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *contextpathKey = "context.path";
	node = json_object_get_member(pJsonObject, contextpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&contextpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&contextpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *disabledciphersuitesKey = "disabled.cipher.suites";
	node = json_object_get_member(pJsonObject, disabledciphersuitesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&disabledciphersuites, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&disabledciphersuites);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enabledciphersuitesKey = "enabled.cipher.suites";
	node = json_object_get_member(pJsonObject, enabledciphersuitesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&enabledciphersuites, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&enabledciphersuites);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableKey = "enable";
	json_object_set_member(pJsonObject, enableKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAgentconfiguration();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAgentconfiguration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *agentconfigurationKey = "agent.configuration";
	json_object_set_member(pJsonObject, agentconfigurationKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getContextpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getContextpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contextpathKey = "context.path";
	json_object_set_member(pJsonObject, contextpathKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDisabledciphersuites();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDisabledciphersuites());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *disabledciphersuitesKey = "disabled.cipher.suites";
	json_object_set_member(pJsonObject, disabledciphersuitesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getEnabledciphersuites();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getEnabledciphersuites());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledciphersuitesKey = "enabled.cipher.suites";
	json_object_set_member(pJsonObject, enabledciphersuitesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getEnable()
{
	return enable;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setEnable(ConfigNodePropertyBoolean  enable)
{
	this->enable = enable;
}

ConfigNodePropertyArray
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getAgentconfiguration()
{
	return agentconfiguration;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setAgentconfiguration(ConfigNodePropertyArray  agentconfiguration)
{
	this->agentconfiguration = agentconfiguration;
}

ConfigNodePropertyString
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getContextpath()
{
	return contextpath;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setContextpath(ConfigNodePropertyString  contextpath)
{
	this->contextpath = contextpath;
}

ConfigNodePropertyArray
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getDisabledciphersuites()
{
	return disabledciphersuites;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setDisabledciphersuites(ConfigNodePropertyArray  disabledciphersuites)
{
	this->disabledciphersuites = disabledciphersuites;
}

ConfigNodePropertyArray
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getEnabledciphersuites()
{
	return enabledciphersuites;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setEnabledciphersuites(ConfigNodePropertyArray  enabledciphersuites)
{
	this->enabledciphersuites = enabledciphersuites;
}


