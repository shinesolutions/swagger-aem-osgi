#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConfigNodePropertyString.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConfigNodePropertyString::ConfigNodePropertyString()
{
	//__init();
}

ConfigNodePropertyString::~ConfigNodePropertyString()
{
	//__cleanup();
}

void
ConfigNodePropertyString::__init()
{
	//name = std::string();
	//optional = bool(false);
	//is_set = bool(false);
	//type = int(0);
	//value = std::string();
	//description = std::string();
}

void
ConfigNodePropertyString::__cleanup()
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
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//
}

void
ConfigNodePropertyString::fromJson(char* jsonStr)
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
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
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

ConfigNodePropertyString::ConfigNodePropertyString(char* json)
{
	this->fromJson(json);
}

char*
ConfigNodePropertyString::toJson()
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
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
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
ConfigNodePropertyString::getName()
{
	return name;
}

void
ConfigNodePropertyString::setName(std::string  name)
{
	this->name = name;
}

bool
ConfigNodePropertyString::getOptional()
{
	return optional;
}

void
ConfigNodePropertyString::setOptional(bool  optional)
{
	this->optional = optional;
}

bool
ConfigNodePropertyString::getIsSet()
{
	return is_set;
}

void
ConfigNodePropertyString::setIsSet(bool  is_set)
{
	this->is_set = is_set;
}

int
ConfigNodePropertyString::getType()
{
	return type;
}

void
ConfigNodePropertyString::setType(int  type)
{
	this->type = type;
}

std::string
ConfigNodePropertyString::getValue()
{
	return value;
}

void
ConfigNodePropertyString::setValue(std::string  value)
{
	this->value = value;
}

std::string
ConfigNodePropertyString::getDescription()
{
	return description;
}

void
ConfigNodePropertyString::setDescription(std::string  description)
{
	this->description = description;
}


