#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConfigNodePropertyArray.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConfigNodePropertyArray::ConfigNodePropertyArray()
{
	//__init();
}

ConfigNodePropertyArray::~ConfigNodePropertyArray()
{
	//__cleanup();
}

void
ConfigNodePropertyArray::__init()
{
	//name = std::string();
	//optional = bool(false);
	//is_set = bool(false);
	//type = int(0);
	//new std::list()std::list> values;
	//description = std::string();
}

void
ConfigNodePropertyArray::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(optional != NULL) {
	//
	//delete optional;
	//optional = NULL;
	//}
	//if(is_set != NULL) {
	//
	//delete is_set;
	//is_set = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//
}

void
ConfigNodePropertyArray::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *optionalKey = "optional";
	node = json_object_get_member(pJsonObject, optionalKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&optional, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_setKey = "is_set";
	node = json_object_get_member(pJsonObject, is_setKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_set, node, "bool", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&type, node, "int", "");
		} else {
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
}

ConfigNodePropertyArray::ConfigNodePropertyArray(char* json)
{
	this->fromJson(json);
}

char*
ConfigNodePropertyArray::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("bool")) {
		bool obj = getOptional();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *optionalKey = "optional";
	json_object_set_member(pJsonObject, optionalKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsSet();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_setKey = "is_set";
	json_object_set_member(pJsonObject, is_setKey, node);
	if (isprimitive("int")) {
		int obj = getType();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getValues());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConfigNodePropertyArray::getName()
{
	return name;
}

void
ConfigNodePropertyArray::setName(std::string  name)
{
	this->name = name;
}

bool
ConfigNodePropertyArray::getOptional()
{
	return optional;
}

void
ConfigNodePropertyArray::setOptional(bool  optional)
{
	this->optional = optional;
}

bool
ConfigNodePropertyArray::getIsSet()
{
	return is_set;
}

void
ConfigNodePropertyArray::setIsSet(bool  is_set)
{
	this->is_set = is_set;
}

int
ConfigNodePropertyArray::getType()
{
	return type;
}

void
ConfigNodePropertyArray::setType(int  type)
{
	this->type = type;
}

std::list<std::string>
ConfigNodePropertyArray::getValues()
{
	return values;
}

void
ConfigNodePropertyArray::setValues(std::list <std::string> values)
{
	this->values = values;
}

std::string
ConfigNodePropertyArray::getDescription()
{
	return description;
}

void
ConfigNodePropertyArray::setDescription(std::string  description)
{
	this->description = description;
}


