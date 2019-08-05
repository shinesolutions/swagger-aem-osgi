#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties()
{
	//__init();
}

OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::~OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties()
{
	//__cleanup();
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::__init()
{
	//timeout = new ConfigNodePropertyInteger();
	//targetstartlevel = new ConfigNodePropertyInteger();
	//targetstartlevelpropname = new ConfigNodePropertyString();
	//type = new ConfigNodePropertyDropDown();
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::__cleanup()
{
	//if(timeout != NULL) {
	//
	//delete timeout;
	//timeout = NULL;
	//}
	//if(targetstartlevel != NULL) {
	//
	//delete targetstartlevel;
	//targetstartlevel = NULL;
	//}
	//if(targetstartlevelpropname != NULL) {
	//
	//delete targetstartlevelpropname;
	//targetstartlevelpropname = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *timeoutKey = "timeout";
	node = json_object_get_member(pJsonObject, timeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&timeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&timeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *targetstartlevelKey = "target.start.level";
	node = json_object_get_member(pJsonObject, targetstartlevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&targetstartlevel, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&targetstartlevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *targetstartlevelpropnameKey = "target.start.level.prop.name";
	node = json_object_get_member(pJsonObject, targetstartlevelpropnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&targetstartlevelpropname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&targetstartlevelpropname);
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

OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timeoutKey = "timeout";
	json_object_set_member(pJsonObject, timeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTargetstartlevel();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTargetstartlevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targetstartlevelKey = "target.start.level";
	json_object_set_member(pJsonObject, targetstartlevelKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTargetstartlevelpropname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTargetstartlevelpropname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targetstartlevelpropnameKey = "target.start.level.prop.name";
	json_object_set_member(pJsonObject, targetstartlevelpropnameKey, node);
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

ConfigNodePropertyInteger
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::getTimeout()
{
	return timeout;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::setTimeout(ConfigNodePropertyInteger  timeout)
{
	this->timeout = timeout;
}

ConfigNodePropertyInteger
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::getTargetstartlevel()
{
	return targetstartlevel;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::setTargetstartlevel(ConfigNodePropertyInteger  targetstartlevel)
{
	this->targetstartlevel = targetstartlevel;
}

ConfigNodePropertyString
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::getTargetstartlevelpropname()
{
	return targetstartlevelpropname;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::setTargetstartlevelpropname(ConfigNodePropertyString  targetstartlevelpropname)
{
	this->targetstartlevelpropname = targetstartlevelpropname;
}

ConfigNodePropertyDropDown
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::getType()
{
	return type;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties::setType(ConfigNodePropertyDropDown  type)
{
	this->type = type;
}


