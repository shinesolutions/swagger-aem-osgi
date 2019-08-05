#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties()
{
	//__init();
}

ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::~ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::__init()
{
	//defaultConnectorName = new ConfigNodePropertyString();
	//defaultCategory = new ConfigNodePropertyString();
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::__cleanup()
{
	//if(defaultConnectorName != NULL) {
	//
	//delete defaultConnectorName;
	//defaultConnectorName = NULL;
	//}
	//if(defaultCategory != NULL) {
	//
	//delete defaultCategory;
	//defaultCategory = NULL;
	//}
	//
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *defaultConnectorNameKey = "defaultConnectorName";
	node = json_object_get_member(pJsonObject, defaultConnectorNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultConnectorName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultConnectorName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultCategoryKey = "defaultCategory";
	node = json_object_get_member(pJsonObject, defaultCategoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultCategory, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultCategory);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultConnectorName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultConnectorName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultConnectorNameKey = "defaultConnectorName";
	json_object_set_member(pJsonObject, defaultConnectorNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultCategory();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultCategory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultCategoryKey = "defaultCategory";
	json_object_set_member(pJsonObject, defaultCategoryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::getDefaultConnectorName()
{
	return defaultConnectorName;
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::setDefaultConnectorName(ConfigNodePropertyString  defaultConnectorName)
{
	this->defaultConnectorName = defaultConnectorName;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::getDefaultCategory()
{
	return defaultCategory;
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::setDefaultCategory(ConfigNodePropertyString  defaultCategory)
{
	this->defaultCategory = defaultCategory;
}


