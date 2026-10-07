#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::OrgApacheSlingCaconfigImplConfigurationResolverImplProperties()
{
	//__init();
}

OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::~OrgApacheSlingCaconfigImplConfigurationResolverImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::__init()
{
	//configBucketNames = new ConfigNodePropertyArray();
}

void
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::__cleanup()
{
	//if(configBucketNames != NULL) {
	//
	//delete configBucketNames;
	//configBucketNames = NULL;
	//}
	//
}

void
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *configBucketNamesKey = "configBucketNames";
	node = json_object_get_member(pJsonObject, configBucketNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&configBucketNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&configBucketNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::OrgApacheSlingCaconfigImplConfigurationResolverImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getConfigBucketNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getConfigBucketNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configBucketNamesKey = "configBucketNames";
	json_object_set_member(pJsonObject, configBucketNamesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::getConfigBucketNames()
{
	return configBucketNames;
}

void
OrgApacheSlingCaconfigImplConfigurationResolverImplProperties::setConfigBucketNames(ConfigNodePropertyArray  configBucketNames)
{
	this->configBucketNames = configBucketNames;
}


