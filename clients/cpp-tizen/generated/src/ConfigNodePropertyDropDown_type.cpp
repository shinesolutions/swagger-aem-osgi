#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConfigNodePropertyDropDown_type.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConfigNodePropertyDropDown_type::ConfigNodePropertyDropDown_type()
{
	//__init();
}

ConfigNodePropertyDropDown_type::~ConfigNodePropertyDropDown_type()
{
	//__cleanup();
}

void
ConfigNodePropertyDropDown_type::__init()
{
	//labels = null;
	//values = null;
}

void
ConfigNodePropertyDropDown_type::__cleanup()
{
	//if(labels != NULL) {
	//
	//delete labels;
	//labels = NULL;
	//}
	//if(values != NULL) {
	//
	//delete values;
	//values = NULL;
	//}
	//
}

void
ConfigNodePropertyDropDown_type::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *labelsKey = "labels";
	node = json_object_get_member(pJsonObject, labelsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&labels, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&labels);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&values, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&values);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ConfigNodePropertyDropDown_type::ConfigNodePropertyDropDown_type(char* json)
{
	this->fromJson(json);
}

char*
ConfigNodePropertyDropDown_type::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getLabels();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getLabels());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *labelsKey = "labels";
	json_object_set_member(pJsonObject, labelsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValues();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getValues());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConfigNodePropertyDropDown_type::getLabels()
{
	return labels;
}

void
ConfigNodePropertyDropDown_type::setLabels(std::string  labels)
{
	this->labels = labels;
}

std::string
ConfigNodePropertyDropDown_type::getValues()
{
	return values;
}

void
ConfigNodePropertyDropDown_type::setValues(std::string  values)
{
	this->values = values;
}


