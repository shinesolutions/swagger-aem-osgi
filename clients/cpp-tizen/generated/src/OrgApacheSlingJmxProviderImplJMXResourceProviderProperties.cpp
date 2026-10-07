#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::OrgApacheSlingJmxProviderImplJMXResourceProviderProperties()
{
	//__init();
}

OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::~OrgApacheSlingJmxProviderImplJMXResourceProviderProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::__init()
{
	//providerroots = new ConfigNodePropertyString();
}

void
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::__cleanup()
{
	//if(providerroots != NULL) {
	//
	//delete providerroots;
	//providerroots = NULL;
	//}
	//
}

void
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::fromJson(char* jsonStr)
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
}

OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::OrgApacheSlingJmxProviderImplJMXResourceProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::getProviderroots()
{
	return providerroots;
}

void
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::setProviderroots(ConfigNodePropertyString  providerroots)
{
	this->providerroots = providerroots;
}


