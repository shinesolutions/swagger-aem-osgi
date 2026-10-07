#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreProcessMetadataProcessorProcessProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreProcessMetadataProcessorProcessProperties::ComDayCqDamCoreProcessMetadataProcessorProcessProperties()
{
	//__init();
}

ComDayCqDamCoreProcessMetadataProcessorProcessProperties::~ComDayCqDamCoreProcessMetadataProcessorProcessProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::__init()
{
	//processlabel = new ConfigNodePropertyString();
	//cqdamenablesha1 = new ConfigNodePropertyBoolean();
	//cqdammetadataxssprotectedproperties = new ConfigNodePropertyArray();
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::__cleanup()
{
	//if(processlabel != NULL) {
	//
	//delete processlabel;
	//processlabel = NULL;
	//}
	//if(cqdamenablesha1 != NULL) {
	//
	//delete cqdamenablesha1;
	//cqdamenablesha1 = NULL;
	//}
	//if(cqdammetadataxssprotectedproperties != NULL) {
	//
	//delete cqdammetadataxssprotectedproperties;
	//cqdammetadataxssprotectedproperties = NULL;
	//}
	//
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *processlabelKey = "process.label";
	node = json_object_get_member(pJsonObject, processlabelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&processlabel, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&processlabel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamenablesha1Key = "cq.dam.enable.sha1";
	node = json_object_get_member(pJsonObject, cqdamenablesha1Key);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamenablesha1, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamenablesha1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdammetadataxssprotectedpropertiesKey = "cq.dam.metadata.xssprotected.properties";
	node = json_object_get_member(pJsonObject, cqdammetadataxssprotectedpropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqdammetadataxssprotectedproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqdammetadataxssprotectedproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreProcessMetadataProcessorProcessProperties::ComDayCqDamCoreProcessMetadataProcessorProcessProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProcesslabel();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProcesslabel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *processlabelKey = "process.label";
	json_object_set_member(pJsonObject, processlabelKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamenablesha1();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamenablesha1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamenablesha1Key = "cq.dam.enable.sha1";
	json_object_set_member(pJsonObject, cqdamenablesha1Key, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqdammetadataxssprotectedproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqdammetadataxssprotectedproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdammetadataxssprotectedpropertiesKey = "cq.dam.metadata.xssprotected.properties";
	json_object_set_member(pJsonObject, cqdammetadataxssprotectedpropertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::setProcesslabel(ConfigNodePropertyString  processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::getCqdamenablesha1()
{
	return cqdamenablesha1;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::setCqdamenablesha1(ConfigNodePropertyBoolean  cqdamenablesha1)
{
	this->cqdamenablesha1 = cqdamenablesha1;
}

ConfigNodePropertyArray
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::getCqdammetadataxssprotectedproperties()
{
	return cqdammetadataxssprotectedproperties;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::setCqdammetadataxssprotectedproperties(ConfigNodePropertyArray  cqdammetadataxssprotectedproperties)
{
	this->cqdammetadataxssprotectedproperties = cqdammetadataxssprotectedproperties;
}


