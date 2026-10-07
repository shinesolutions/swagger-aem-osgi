#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties()
{
	//__init();
}

OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::~OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//endpoints = new ConfigNodePropertyArray();
	//pullitems = new ConfigNodePropertyInteger();
	//packageBuildertarget = new ConfigNodePropertyString();
	//transportSecretProvidertarget = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::__cleanup()
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
	//if(pullitems != NULL) {
	//
	//delete pullitems;
	//pullitems = NULL;
	//}
	//if(packageBuildertarget != NULL) {
	//
	//delete packageBuildertarget;
	//packageBuildertarget = NULL;
	//}
	//if(transportSecretProvidertarget != NULL) {
	//
	//delete transportSecretProvidertarget;
	//transportSecretProvidertarget = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::fromJson(char* jsonStr)
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

OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::toJson()
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
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getEndpoints()
{
	return endpoints;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setEndpoints(ConfigNodePropertyArray  endpoints)
{
	this->endpoints = endpoints;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getPullitems()
{
	return pullitems;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setPullitems(ConfigNodePropertyInteger  pullitems)
{
	this->pullitems = pullitems;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setPackageBuildertarget(ConfigNodePropertyString  packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::getTransportSecretProvidertarget()
{
	return transportSecretProvidertarget;
}

void
OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties::setTransportSecretProvidertarget(ConfigNodePropertyString  transportSecretProvidertarget)
{
	this->transportSecretProvidertarget = transportSecretProvidertarget;
}


