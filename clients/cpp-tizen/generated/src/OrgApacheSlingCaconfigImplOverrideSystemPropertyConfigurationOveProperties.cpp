#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties()
{
	//__init();
}

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::~OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
	//serviceranking = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::fromJson(char* jsonStr)
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
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyInteger
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}


