#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties()
{
	//__init();
}

ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::~ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//types = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(types != NULL) {
	//
	//delete types;
	//types = NULL;
	//}
	//
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::fromJson(char* jsonStr)
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
	const gchar *typesKey = "types";
	node = json_object_get_member(pJsonObject, typesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&types, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&types);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typesKey = "types";
	json_object_set_member(pJsonObject, typesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::getName()
{
	return name;
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyArray
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::getTypes()
{
	return types;
}

void
ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties::setTypes(ConfigNodePropertyArray  types)
{
	this->types = types;
}


