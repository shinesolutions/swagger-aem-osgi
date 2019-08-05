#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::ComAdobeCqDamCfmImplConfFeatureConfigImplProperties()
{
	//__init();
}

ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::~ComAdobeCqDamCfmImplConfFeatureConfigImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::__init()
{
	//damcfmresourceTypes = new ConfigNodePropertyArray();
	//damcfmreferenceProperties = new ConfigNodePropertyArray();
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::__cleanup()
{
	//if(damcfmresourceTypes != NULL) {
	//
	//delete damcfmresourceTypes;
	//damcfmresourceTypes = NULL;
	//}
	//if(damcfmreferenceProperties != NULL) {
	//
	//delete damcfmreferenceProperties;
	//damcfmreferenceProperties = NULL;
	//}
	//
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *damcfmresourceTypesKey = "dam.cfm.resourceTypes";
	node = json_object_get_member(pJsonObject, damcfmresourceTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&damcfmresourceTypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&damcfmresourceTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *damcfmreferencePropertiesKey = "dam.cfm.referenceProperties";
	node = json_object_get_member(pJsonObject, damcfmreferencePropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&damcfmreferenceProperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&damcfmreferenceProperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDamcfmresourceTypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDamcfmresourceTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damcfmresourceTypesKey = "dam.cfm.resourceTypes";
	json_object_set_member(pJsonObject, damcfmresourceTypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDamcfmreferenceProperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDamcfmreferenceProperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damcfmreferencePropertiesKey = "dam.cfm.referenceProperties";
	json_object_set_member(pJsonObject, damcfmreferencePropertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::getDamcfmresourceTypes()
{
	return damcfmresourceTypes;
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::setDamcfmresourceTypes(ConfigNodePropertyArray  damcfmresourceTypes)
{
	this->damcfmresourceTypes = damcfmresourceTypes;
}

ConfigNodePropertyArray
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::getDamcfmreferenceProperties()
{
	return damcfmreferenceProperties;
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::setDamcfmreferenceProperties(ConfigNodePropertyArray  damcfmreferenceProperties)
{
	this->damcfmreferenceProperties = damcfmreferenceProperties;
}


