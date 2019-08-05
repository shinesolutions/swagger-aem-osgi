#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GuideLocalizationServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GuideLocalizationServiceProperties::GuideLocalizationServiceProperties()
{
	//__init();
}

GuideLocalizationServiceProperties::~GuideLocalizationServiceProperties()
{
	//__cleanup();
}

void
GuideLocalizationServiceProperties::__init()
{
	//supportedLocales = new ConfigNodePropertyArray();
	//localizableProperties = new ConfigNodePropertyArray();
}

void
GuideLocalizationServiceProperties::__cleanup()
{
	//if(supportedLocales != NULL) {
	//
	//delete supportedLocales;
	//supportedLocales = NULL;
	//}
	//if(localizableProperties != NULL) {
	//
	//delete localizableProperties;
	//localizableProperties = NULL;
	//}
	//
}

void
GuideLocalizationServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *supportedLocalesKey = "supportedLocales";
	node = json_object_get_member(pJsonObject, supportedLocalesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&supportedLocales, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&supportedLocales);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *localizablePropertiesKey = "Localizable Properties";
	node = json_object_get_member(pJsonObject, localizablePropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&localizableProperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&localizableProperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GuideLocalizationServiceProperties::GuideLocalizationServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
GuideLocalizationServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSupportedLocales();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSupportedLocales());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportedLocalesKey = "supportedLocales";
	json_object_set_member(pJsonObject, supportedLocalesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getLocalizableProperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getLocalizableProperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *localizablePropertiesKey = "Localizable Properties";
	json_object_set_member(pJsonObject, localizablePropertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
GuideLocalizationServiceProperties::getSupportedLocales()
{
	return supportedLocales;
}

void
GuideLocalizationServiceProperties::setSupportedLocales(ConfigNodePropertyArray  supportedLocales)
{
	this->supportedLocales = supportedLocales;
}

ConfigNodePropertyArray
GuideLocalizationServiceProperties::getLocalizableProperties()
{
	return localizableProperties;
}

void
GuideLocalizationServiceProperties::setLocalizableProperties(ConfigNodePropertyArray  localizableProperties)
{
	this->localizableProperties = localizableProperties;
}


