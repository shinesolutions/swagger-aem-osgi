#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties()
{
	//__init();
}

ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::~ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties()
{
	//__cleanup();
}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//locale = new ConfigNodePropertyString();
	//imsConfig = new ConfigNodePropertyString();
}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(locale != NULL) {
	//
	//delete locale;
	//locale = NULL;
	//}
	//if(imsConfig != NULL) {
	//
	//delete imsConfig;
	//imsConfig = NULL;
	//}
	//
}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::fromJson(char* jsonStr)
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
	const gchar *localeKey = "locale";
	node = json_object_get_member(pJsonObject, localeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&locale, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&locale);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *imsConfigKey = "imsConfig";
	node = json_object_get_member(pJsonObject, imsConfigKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&imsConfig, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&imsConfig);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::toJson()
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
		ConfigNodePropertyString obj = getLocale();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLocale());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *localeKey = "locale";
	json_object_set_member(pJsonObject, localeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getImsConfig();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getImsConfig());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imsConfigKey = "imsConfig";
	json_object_set_member(pJsonObject, imsConfigKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::getName()
{
	return name;
}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::getLocale()
{
	return locale;
}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::setLocale(ConfigNodePropertyString  locale)
{
	this->locale = locale;
}

ConfigNodePropertyString
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::getImsConfig()
{
	return imsConfig;
}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::setImsConfig(ConfigNodePropertyString  imsConfig)
{
	this->imsConfig = imsConfig;
}


