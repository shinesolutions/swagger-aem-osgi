#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixJaasConfigurationFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixJaasConfigurationFactoryProperties::OrgApacheFelixJaasConfigurationFactoryProperties()
{
	//__init();
}

OrgApacheFelixJaasConfigurationFactoryProperties::~OrgApacheFelixJaasConfigurationFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::__init()
{
	//jaascontrolFlag = new ConfigNodePropertyDropDown();
	//jaasranking = new ConfigNodePropertyInteger();
	//jaasrealmName = new ConfigNodePropertyString();
	//jaasclassname = new ConfigNodePropertyString();
	//jaasoptions = new ConfigNodePropertyArray();
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::__cleanup()
{
	//if(jaascontrolFlag != NULL) {
	//
	//delete jaascontrolFlag;
	//jaascontrolFlag = NULL;
	//}
	//if(jaasranking != NULL) {
	//
	//delete jaasranking;
	//jaasranking = NULL;
	//}
	//if(jaasrealmName != NULL) {
	//
	//delete jaasrealmName;
	//jaasrealmName = NULL;
	//}
	//if(jaasclassname != NULL) {
	//
	//delete jaasclassname;
	//jaasclassname = NULL;
	//}
	//if(jaasoptions != NULL) {
	//
	//delete jaasoptions;
	//jaasoptions = NULL;
	//}
	//
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jaascontrolFlagKey = "jaas.controlFlag";
	node = json_object_get_member(pJsonObject, jaascontrolFlagKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&jaascontrolFlag, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&jaascontrolFlag);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaasrankingKey = "jaas.ranking";
	node = json_object_get_member(pJsonObject, jaasrankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&jaasranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&jaasranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaasrealmNameKey = "jaas.realmName";
	node = json_object_get_member(pJsonObject, jaasrealmNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jaasrealmName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jaasrealmName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaasclassnameKey = "jaas.classname";
	node = json_object_get_member(pJsonObject, jaasclassnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jaasclassname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jaasclassname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaasoptionsKey = "jaas.options";
	node = json_object_get_member(pJsonObject, jaasoptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&jaasoptions, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&jaasoptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixJaasConfigurationFactoryProperties::OrgApacheFelixJaasConfigurationFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixJaasConfigurationFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getJaascontrolFlag();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getJaascontrolFlag());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaascontrolFlagKey = "jaas.controlFlag";
	json_object_set_member(pJsonObject, jaascontrolFlagKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getJaasranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getJaasranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaasrankingKey = "jaas.ranking";
	json_object_set_member(pJsonObject, jaasrankingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJaasrealmName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJaasrealmName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaasrealmNameKey = "jaas.realmName";
	json_object_set_member(pJsonObject, jaasrealmNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJaasclassname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJaasclassname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaasclassnameKey = "jaas.classname";
	json_object_set_member(pJsonObject, jaasclassnameKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getJaasoptions();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getJaasoptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaasoptionsKey = "jaas.options";
	json_object_set_member(pJsonObject, jaasoptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
OrgApacheFelixJaasConfigurationFactoryProperties::getJaascontrolFlag()
{
	return jaascontrolFlag;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaascontrolFlag(ConfigNodePropertyDropDown  jaascontrolFlag)
{
	this->jaascontrolFlag = jaascontrolFlag;
}

ConfigNodePropertyInteger
OrgApacheFelixJaasConfigurationFactoryProperties::getJaasranking()
{
	return jaasranking;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaasranking(ConfigNodePropertyInteger  jaasranking)
{
	this->jaasranking = jaasranking;
}

ConfigNodePropertyString
OrgApacheFelixJaasConfigurationFactoryProperties::getJaasrealmName()
{
	return jaasrealmName;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaasrealmName(ConfigNodePropertyString  jaasrealmName)
{
	this->jaasrealmName = jaasrealmName;
}

ConfigNodePropertyString
OrgApacheFelixJaasConfigurationFactoryProperties::getJaasclassname()
{
	return jaasclassname;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaasclassname(ConfigNodePropertyString  jaasclassname)
{
	this->jaasclassname = jaasclassname;
}

ConfigNodePropertyArray
OrgApacheFelixJaasConfigurationFactoryProperties::getJaasoptions()
{
	return jaasoptions;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaasoptions(ConfigNodePropertyArray  jaasoptions)
{
	this->jaasoptions = jaasoptions;
}


