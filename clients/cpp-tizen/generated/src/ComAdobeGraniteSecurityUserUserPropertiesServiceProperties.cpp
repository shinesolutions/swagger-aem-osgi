#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::ComAdobeGraniteSecurityUserUserPropertiesServiceProperties()
{
	//__init();
}

ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::~ComAdobeGraniteSecurityUserUserPropertiesServiceProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::__init()
{
	//adaptercondition = new ConfigNodePropertyString();
	//graniteuserpropertiesnodetypes = new ConfigNodePropertyArray();
	//graniteuserpropertiesresourcetypes = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::__cleanup()
{
	//if(adaptercondition != NULL) {
	//
	//delete adaptercondition;
	//adaptercondition = NULL;
	//}
	//if(graniteuserpropertiesnodetypes != NULL) {
	//
	//delete graniteuserpropertiesnodetypes;
	//graniteuserpropertiesnodetypes = NULL;
	//}
	//if(graniteuserpropertiesresourcetypes != NULL) {
	//
	//delete graniteuserpropertiesresourcetypes;
	//graniteuserpropertiesresourcetypes = NULL;
	//}
	//
}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *adapterconditionKey = "adapter.condition";
	node = json_object_get_member(pJsonObject, adapterconditionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&adaptercondition, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&adaptercondition);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteuserpropertiesnodetypesKey = "granite.userproperties.nodetypes";
	node = json_object_get_member(pJsonObject, graniteuserpropertiesnodetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&graniteuserpropertiesnodetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&graniteuserpropertiesnodetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteuserpropertiesresourcetypesKey = "granite.userproperties.resourcetypes";
	node = json_object_get_member(pJsonObject, graniteuserpropertiesresourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&graniteuserpropertiesresourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&graniteuserpropertiesresourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAdaptercondition();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAdaptercondition());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *adapterconditionKey = "adapter.condition";
	json_object_set_member(pJsonObject, adapterconditionKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGraniteuserpropertiesnodetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGraniteuserpropertiesnodetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteuserpropertiesnodetypesKey = "granite.userproperties.nodetypes";
	json_object_set_member(pJsonObject, graniteuserpropertiesnodetypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGraniteuserpropertiesresourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGraniteuserpropertiesresourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteuserpropertiesresourcetypesKey = "granite.userproperties.resourcetypes";
	json_object_set_member(pJsonObject, graniteuserpropertiesresourcetypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::getAdaptercondition()
{
	return adaptercondition;
}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::setAdaptercondition(ConfigNodePropertyString  adaptercondition)
{
	this->adaptercondition = adaptercondition;
}

ConfigNodePropertyArray
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::getGraniteuserpropertiesnodetypes()
{
	return graniteuserpropertiesnodetypes;
}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::setGraniteuserpropertiesnodetypes(ConfigNodePropertyArray  graniteuserpropertiesnodetypes)
{
	this->graniteuserpropertiesnodetypes = graniteuserpropertiesnodetypes;
}

ConfigNodePropertyArray
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::getGraniteuserpropertiesresourcetypes()
{
	return graniteuserpropertiesresourcetypes;
}

void
ComAdobeGraniteSecurityUserUserPropertiesServiceProperties::setGraniteuserpropertiesresourcetypes(ConfigNodePropertyArray  graniteuserpropertiesresourcetypes)
{
	this->graniteuserpropertiesresourcetypes = graniteuserpropertiesresourcetypes;
}


