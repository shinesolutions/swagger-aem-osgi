#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties()
{
	//__init();
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::~OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}


