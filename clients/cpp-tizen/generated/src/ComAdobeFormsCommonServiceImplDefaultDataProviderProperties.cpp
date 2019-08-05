#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::ComAdobeFormsCommonServiceImplDefaultDataProviderProperties()
{
	//__init();
}

ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::~ComAdobeFormsCommonServiceImplDefaultDataProviderProperties()
{
	//__cleanup();
}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::__init()
{
	//alloweddataFileLocations = new ConfigNodePropertyArray();
}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::__cleanup()
{
	//if(alloweddataFileLocations != NULL) {
	//
	//delete alloweddataFileLocations;
	//alloweddataFileLocations = NULL;
	//}
	//
}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *alloweddataFileLocationsKey = "alloweddataFileLocations";
	node = json_object_get_member(pJsonObject, alloweddataFileLocationsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&alloweddataFileLocations, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&alloweddataFileLocations);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::ComAdobeFormsCommonServiceImplDefaultDataProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAlloweddataFileLocations();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAlloweddataFileLocations());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *alloweddataFileLocationsKey = "alloweddataFileLocations";
	json_object_set_member(pJsonObject, alloweddataFileLocationsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::getAlloweddataFileLocations()
{
	return alloweddataFileLocations;
}

void
ComAdobeFormsCommonServiceImplDefaultDataProviderProperties::setAlloweddataFileLocations(ConfigNodePropertyArray  alloweddataFileLocations)
{
	this->alloweddataFileLocations = alloweddataFileLocations;
}


