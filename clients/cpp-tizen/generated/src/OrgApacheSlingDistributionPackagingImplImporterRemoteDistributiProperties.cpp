#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties()
{
	//__init();
}

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::~OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//endpoints = new ConfigNodePropertyArray();
	//transportSecretProvidertarget = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(endpoints != NULL) {
	//
	//delete endpoints;
	//endpoints = NULL;
	//}
	//if(transportSecretProvidertarget != NULL) {
	//
	//delete transportSecretProvidertarget;
	//transportSecretProvidertarget = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::fromJson(char* jsonStr)
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
	const gchar *endpointsKey = "endpoints";
	node = json_object_get_member(pJsonObject, endpointsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&endpoints, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&endpoints);
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

OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getEndpoints();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getEndpoints());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *endpointsKey = "endpoints";
	json_object_set_member(pJsonObject, endpointsKey, node);
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
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::getEndpoints()
{
	return endpoints;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::setEndpoints(ConfigNodePropertyArray  endpoints)
{
	this->endpoints = endpoints;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties::setTransportSecretProvidertarget(ConfigNodePropertyString  transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}


