#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties()
{
	//__init();
}

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::~OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties()
{
	//__cleanup();
}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::__init()
{
	//maxrecursionlevels = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::__cleanup()
{
	//if(maxrecursionlevels != NULL) {
	//
	//delete maxrecursionlevels;
	//maxrecursionlevels = NULL;
	//}
	//
}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxrecursionlevelsKey = "max.recursion.levels";
	node = json_object_get_member(pJsonObject, maxrecursionlevelsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxrecursionlevels, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxrecursionlevels);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxrecursionlevels();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxrecursionlevels());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxrecursionlevelsKey = "max.recursion.levels";
	json_object_set_member(pJsonObject, maxrecursionlevelsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::getMaxrecursionlevels()
{
	return maxrecursionlevels;
}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::setMaxrecursionlevels(ConfigNodePropertyInteger  maxrecursionlevels)
{
	this->maxrecursionlevels = maxrecursionlevels;
}


