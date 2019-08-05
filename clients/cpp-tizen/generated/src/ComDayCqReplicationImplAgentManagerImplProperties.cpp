#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationImplAgentManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationImplAgentManagerImplProperties::ComDayCqReplicationImplAgentManagerImplProperties()
{
	//__init();
}

ComDayCqReplicationImplAgentManagerImplProperties::~ComDayCqReplicationImplAgentManagerImplProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationImplAgentManagerImplProperties::__init()
{
	//jobtopics = new ConfigNodePropertyString();
	//serviceUsertarget = new ConfigNodePropertyString();
	//agentProvidertarget = new ConfigNodePropertyString();
}

void
ComDayCqReplicationImplAgentManagerImplProperties::__cleanup()
{
	//if(jobtopics != NULL) {
	//
	//delete jobtopics;
	//jobtopics = NULL;
	//}
	//if(serviceUsertarget != NULL) {
	//
	//delete serviceUsertarget;
	//serviceUsertarget = NULL;
	//}
	//if(agentProvidertarget != NULL) {
	//
	//delete agentProvidertarget;
	//agentProvidertarget = NULL;
	//}
	//
}

void
ComDayCqReplicationImplAgentManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jobtopicsKey = "job.topics";
	node = json_object_get_member(pJsonObject, jobtopicsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jobtopics, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jobtopics);
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
	const gchar *agentProvidertargetKey = "agentProvider.target";
	node = json_object_get_member(pJsonObject, agentProvidertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&agentProvidertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&agentProvidertarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReplicationImplAgentManagerImplProperties::ComDayCqReplicationImplAgentManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationImplAgentManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJobtopics();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJobtopics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jobtopicsKey = "job.topics";
	json_object_set_member(pJsonObject, jobtopicsKey, node);
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAgentProvidertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAgentProvidertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *agentProvidertargetKey = "agentProvider.target";
	json_object_set_member(pJsonObject, agentProvidertargetKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqReplicationImplAgentManagerImplProperties::getJobtopics()
{
	return jobtopics;
}

void
ComDayCqReplicationImplAgentManagerImplProperties::setJobtopics(ConfigNodePropertyString  jobtopics)
{
	this->jobtopics = jobtopics;
}

ConfigNodePropertyString
ComDayCqReplicationImplAgentManagerImplProperties::getServiceUsertarget()
{
	return serviceUsertarget;
}

void
ComDayCqReplicationImplAgentManagerImplProperties::setServiceUsertarget(ConfigNodePropertyString  serviceUsertarget)
{
	this->serviceUsertarget = serviceUsertarget;
}

ConfigNodePropertyString
ComDayCqReplicationImplAgentManagerImplProperties::getAgentProvidertarget()
{
	return agentProvidertarget;
}

void
ComDayCqReplicationImplAgentManagerImplProperties::setAgentProvidertarget(ConfigNodePropertyString  agentProvidertarget)
{
	this->agentProvidertarget = agentProvidertarget;
}


