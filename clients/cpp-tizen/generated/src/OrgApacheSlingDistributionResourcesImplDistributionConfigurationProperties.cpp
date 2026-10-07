#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties()
{
	//__init();
}

OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::~OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::__init()
{
	//providerroots = new ConfigNodePropertyString();
	//kind = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::__cleanup()
{
	//if(providerroots != NULL) {
	//
	//delete providerroots;
	//providerroots = NULL;
	//}
	//if(kind != NULL) {
	//
	//delete kind;
	//kind = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *providerrootsKey = "provider.roots";
	node = json_object_get_member(pJsonObject, providerrootsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&providerroots, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&providerroots);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *kindKey = "kind";
	node = json_object_get_member(pJsonObject, kindKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&kind, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&kind);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProviderroots();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProviderroots());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerrootsKey = "provider.roots";
	json_object_set_member(pJsonObject, providerrootsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getKind();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getKind());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *kindKey = "kind";
	json_object_set_member(pJsonObject, kindKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::getProviderroots()
{
	return providerroots;
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::setProviderroots(ConfigNodePropertyString  providerroots)
{
	this->providerroots = providerroots;
}

ConfigNodePropertyString
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::getKind()
{
	return kind;
}

void
OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties::setKind(ConfigNodePropertyString  kind)
{
	this->kind = kind;
}


