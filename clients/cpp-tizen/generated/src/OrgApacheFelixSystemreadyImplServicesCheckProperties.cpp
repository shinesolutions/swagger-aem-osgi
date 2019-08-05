#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixSystemreadyImplServicesCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixSystemreadyImplServicesCheckProperties::OrgApacheFelixSystemreadyImplServicesCheckProperties()
{
	//__init();
}

OrgApacheFelixSystemreadyImplServicesCheckProperties::~OrgApacheFelixSystemreadyImplServicesCheckProperties()
{
	//__cleanup();
}

void
OrgApacheFelixSystemreadyImplServicesCheckProperties::__init()
{
	//serviceslist = new ConfigNodePropertyArray();
	//type = new ConfigNodePropertyDropDown();
}

void
OrgApacheFelixSystemreadyImplServicesCheckProperties::__cleanup()
{
	//if(serviceslist != NULL) {
	//
	//delete serviceslist;
	//serviceslist = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
OrgApacheFelixSystemreadyImplServicesCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *serviceslistKey = "services.list";
	node = json_object_get_member(pJsonObject, serviceslistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&serviceslist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&serviceslist);
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

OrgApacheFelixSystemreadyImplServicesCheckProperties::OrgApacheFelixSystemreadyImplServicesCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixSystemreadyImplServicesCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getServiceslist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getServiceslist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceslistKey = "services.list";
	json_object_set_member(pJsonObject, serviceslistKey, node);
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
OrgApacheFelixSystemreadyImplServicesCheckProperties::getServiceslist()
{
	return serviceslist;
}

void
OrgApacheFelixSystemreadyImplServicesCheckProperties::setServiceslist(ConfigNodePropertyArray  serviceslist)
{
	this->serviceslist = serviceslist;
}

ConfigNodePropertyDropDown
OrgApacheFelixSystemreadyImplServicesCheckProperties::getType()
{
	return type;
}

void
OrgApacheFelixSystemreadyImplServicesCheckProperties::setType(ConfigNodePropertyDropDown  type)
{
	this->type = type;
}


