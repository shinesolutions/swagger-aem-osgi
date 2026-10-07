#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixSystemreadyImplComponentsCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixSystemreadyImplComponentsCheckProperties::OrgApacheFelixSystemreadyImplComponentsCheckProperties()
{
	//__init();
}

OrgApacheFelixSystemreadyImplComponentsCheckProperties::~OrgApacheFelixSystemreadyImplComponentsCheckProperties()
{
	//__cleanup();
}

void
OrgApacheFelixSystemreadyImplComponentsCheckProperties::__init()
{
	//componentslist = new ConfigNodePropertyArray();
	//type = new ConfigNodePropertyDropDown();
}

void
OrgApacheFelixSystemreadyImplComponentsCheckProperties::__cleanup()
{
	//if(componentslist != NULL) {
	//
	//delete componentslist;
	//componentslist = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
OrgApacheFelixSystemreadyImplComponentsCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *componentslistKey = "components.list";
	node = json_object_get_member(pJsonObject, componentslistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&componentslist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&componentslist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&type, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixSystemreadyImplComponentsCheckProperties::OrgApacheFelixSystemreadyImplComponentsCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixSystemreadyImplComponentsCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComponentslist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComponentslist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *componentslistKey = "components.list";
	json_object_set_member(pJsonObject, componentslistKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getType();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheFelixSystemreadyImplComponentsCheckProperties::getComponentslist()
{
	return componentslist;
}

void
OrgApacheFelixSystemreadyImplComponentsCheckProperties::setComponentslist(ConfigNodePropertyArray  componentslist)
{
	this->componentslist = componentslist;
}

ConfigNodePropertyDropDown
OrgApacheFelixSystemreadyImplComponentsCheckProperties::getType()
{
	return type;
}

void
OrgApacheFelixSystemreadyImplComponentsCheckProperties::setType(ConfigNodePropertyDropDown  type)
{
	this->type = type;
}


