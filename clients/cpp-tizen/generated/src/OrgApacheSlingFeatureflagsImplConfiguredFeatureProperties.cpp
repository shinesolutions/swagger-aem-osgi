#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties()
{
	//__init();
}

OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::~OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties()
{
	//__cleanup();
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//description = new ConfigNodePropertyString();
	//enabled = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::fromJson(char* jsonStr)
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
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&description, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&description);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::toJson()
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
		ConfigNodePropertyString obj = getDescription();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDescription());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
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

ConfigNodePropertyString
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::getName()
{
	return name;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::getDescription()
{
	return description;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::setDescription(ConfigNodePropertyString  description)
{
	this->description = description;
}

ConfigNodePropertyBoolean
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}


