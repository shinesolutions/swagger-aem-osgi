#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties()
{
	//__init();
}

ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::~ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::__init()
{
	//processlabel = new ConfigNodePropertyString();
	//cqdamenablesha1 = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::__cleanup()
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
	//
}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::fromJson(char* jsonStr)
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
}

ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::setProcesslabel(ConfigNodePropertyString  processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::getCqdamenablesha1()
{
	return cqdamenablesha1;
}

void
ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties::setCqdamenablesha1(ConfigNodePropertyBoolean  cqdamenablesha1)
{
	this->cqdamenablesha1 = cqdamenablesha1;
}


