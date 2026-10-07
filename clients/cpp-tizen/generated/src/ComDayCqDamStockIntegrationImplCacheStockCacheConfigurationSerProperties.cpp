#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties()
{
	//__init();
}

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::~ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties()
{
	//__cleanup();
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::__init()
{
	//getCacheExpirationUnit = new ConfigNodePropertyDropDown();
	//getCacheExpirationValue = new ConfigNodePropertyInteger();
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::__cleanup()
{
	//if(getCacheExpirationUnit != NULL) {
	//
	//delete getCacheExpirationUnit;
	//getCacheExpirationUnit = NULL;
	//}
	//if(getCacheExpirationValue != NULL) {
	//
	//delete getCacheExpirationValue;
	//getCacheExpirationValue = NULL;
	//}
	//
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *getCacheExpirationUnitKey = "getCacheExpirationUnit";
	node = json_object_get_member(pJsonObject, getCacheExpirationUnitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&getCacheExpirationUnit, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&getCacheExpirationUnit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *getCacheExpirationValueKey = "getCacheExpirationValue";
	node = json_object_get_member(pJsonObject, getCacheExpirationValueKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&getCacheExpirationValue, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&getCacheExpirationValue);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getGetCacheExpirationUnit();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getGetCacheExpirationUnit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *getCacheExpirationUnitKey = "getCacheExpirationUnit";
	json_object_set_member(pJsonObject, getCacheExpirationUnitKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getGetCacheExpirationValue();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getGetCacheExpirationValue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *getCacheExpirationValueKey = "getCacheExpirationValue";
	json_object_set_member(pJsonObject, getCacheExpirationValueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::getGetCacheExpirationUnit()
{
	return getCacheExpirationUnit;
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::setGetCacheExpirationUnit(ConfigNodePropertyDropDown  getCacheExpirationUnit)
{
	this->getCacheExpirationUnit = getCacheExpirationUnit;
}

ConfigNodePropertyInteger
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::getGetCacheExpirationValue()
{
	return getCacheExpirationValue;
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::setGetCacheExpirationValue(ConfigNodePropertyInteger  getCacheExpirationValue)
{
	this->getCacheExpirationValue = getCacheExpirationValue;
}


