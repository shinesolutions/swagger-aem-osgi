#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties()
{
	//__init();
}

ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::~ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::__init()
{
	//defaultexternalizerdomain = new ConfigNodePropertyString();
}

void
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::__cleanup()
{
	//if(defaultexternalizerdomain != NULL) {
	//
	//delete defaultexternalizerdomain;
	//defaultexternalizerdomain = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *defaultexternalizerdomainKey = "default.externalizer.domain";
	node = json_object_get_member(pJsonObject, defaultexternalizerdomainKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultexternalizerdomain, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultexternalizerdomain);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultexternalizerdomain();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultexternalizerdomain());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultexternalizerdomainKey = "default.externalizer.domain";
	json_object_set_member(pJsonObject, defaultexternalizerdomainKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::getDefaultexternalizerdomain()
{
	return defaultexternalizerdomain;
}

void
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::setDefaultexternalizerdomain(ConfigNodePropertyString  defaultexternalizerdomain)
{
	this->defaultexternalizerdomain = defaultexternalizerdomain;
}


