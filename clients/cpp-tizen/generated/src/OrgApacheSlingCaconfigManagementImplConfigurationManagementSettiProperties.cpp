#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties()
{
	//__init();
}

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::~OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::__init()
{
	//ignorePropertyNameRegex = new ConfigNodePropertyArray();
	//configCollectionPropertiesResourceNames = new ConfigNodePropertyArray();
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::__cleanup()
{
	//if(ignorePropertyNameRegex != NULL) {
	//
	//delete ignorePropertyNameRegex;
	//ignorePropertyNameRegex = NULL;
	//}
	//if(configCollectionPropertiesResourceNames != NULL) {
	//
	//delete configCollectionPropertiesResourceNames;
	//configCollectionPropertiesResourceNames = NULL;
	//}
	//
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ignorePropertyNameRegexKey = "ignorePropertyNameRegex";
	node = json_object_get_member(pJsonObject, ignorePropertyNameRegexKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&ignorePropertyNameRegex, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&ignorePropertyNameRegex);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *configCollectionPropertiesResourceNamesKey = "configCollectionPropertiesResourceNames";
	node = json_object_get_member(pJsonObject, configCollectionPropertiesResourceNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&configCollectionPropertiesResourceNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&configCollectionPropertiesResourceNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIgnorePropertyNameRegex();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIgnorePropertyNameRegex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ignorePropertyNameRegexKey = "ignorePropertyNameRegex";
	json_object_set_member(pJsonObject, ignorePropertyNameRegexKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getConfigCollectionPropertiesResourceNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getConfigCollectionPropertiesResourceNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configCollectionPropertiesResourceNamesKey = "configCollectionPropertiesResourceNames";
	json_object_set_member(pJsonObject, configCollectionPropertiesResourceNamesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::getIgnorePropertyNameRegex()
{
	return ignorePropertyNameRegex;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::setIgnorePropertyNameRegex(ConfigNodePropertyArray  ignorePropertyNameRegex)
{
	this->ignorePropertyNameRegex = ignorePropertyNameRegex;
}

ConfigNodePropertyArray
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::getConfigCollectionPropertiesResourceNames()
{
	return configCollectionPropertiesResourceNames;
}

void
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties::setConfigCollectionPropertiesResourceNames(ConfigNodePropertyArray  configCollectionPropertiesResourceNames)
{
	this->configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
}


