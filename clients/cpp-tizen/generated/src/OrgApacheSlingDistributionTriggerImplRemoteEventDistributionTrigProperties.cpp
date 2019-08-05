#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties()
{
	//__init();
}

OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::~OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//endpoint = new ConfigNodePropertyString();
	//transportSecretProvidertarget = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(endpoint != NULL) {
	//
	//delete endpoint;
	//endpoint = NULL;
	//}
	//if(transportSecretProvidertarget != NULL) {
	//
	//delete transportSecretProvidertarget;
	//transportSecretProvidertarget = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::fromJson(char* jsonStr)
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
	const gchar *endpointKey = "endpoint";
	node = json_object_get_member(pJsonObject, endpointKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&endpoint, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&endpoint);
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
}

OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::toJson()
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
		ConfigNodePropertyString obj = getEndpoint();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEndpoint());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *endpointKey = "endpoint";
	json_object_set_member(pJsonObject, endpointKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::getEndpoint()
{
	return endpoint;
}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::setEndpoint(ConfigNodePropertyString  endpoint)
{
	this->endpoint = endpoint;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties::setTransportSecretProvidertarget(ConfigNodePropertyString  transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}


