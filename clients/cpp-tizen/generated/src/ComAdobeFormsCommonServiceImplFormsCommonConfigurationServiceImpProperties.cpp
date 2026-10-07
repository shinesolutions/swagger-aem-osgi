#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties()
{
	//__init();
}

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::~ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties()
{
	//__cleanup();
}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::__init()
{
	//tempStorageConfig = new ConfigNodePropertyDropDown();
}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::__cleanup()
{
	//if(tempStorageConfig != NULL) {
	//
	//delete tempStorageConfig;
	//tempStorageConfig = NULL;
	//}
	//
}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tempStorageConfigKey = "tempStorageConfig";
	node = json_object_get_member(pJsonObject, tempStorageConfigKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&tempStorageConfig, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&tempStorageConfig);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getTempStorageConfig();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getTempStorageConfig());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tempStorageConfigKey = "tempStorageConfig";
	json_object_set_member(pJsonObject, tempStorageConfigKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::getTempStorageConfig()
{
	return tempStorageConfig;
}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::setTempStorageConfig(ConfigNodePropertyDropDown  tempStorageConfig)
{
	this->tempStorageConfig = tempStorageConfig;
}


