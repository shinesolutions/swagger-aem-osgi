#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamInddProcessINDDMediaExtractProcessProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamInddProcessINDDMediaExtractProcessProperties::ComDayCqDamInddProcessINDDMediaExtractProcessProperties()
{
	//__init();
}

ComDayCqDamInddProcessINDDMediaExtractProcessProperties::~ComDayCqDamInddProcessINDDMediaExtractProcessProperties()
{
	//__cleanup();
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::__init()
{
	//processlabel = new ConfigNodePropertyString();
	//cqdaminddpagesregex = new ConfigNodePropertyString();
	//idsjobdecoupled = new ConfigNodePropertyBoolean();
	//idsjobworkflowmodel = new ConfigNodePropertyString();
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::__cleanup()
{
	//if(processlabel != NULL) {
	//
	//delete processlabel;
	//processlabel = NULL;
	//}
	//if(cqdaminddpagesregex != NULL) {
	//
	//delete cqdaminddpagesregex;
	//cqdaminddpagesregex = NULL;
	//}
	//if(idsjobdecoupled != NULL) {
	//
	//delete idsjobdecoupled;
	//idsjobdecoupled = NULL;
	//}
	//if(idsjobworkflowmodel != NULL) {
	//
	//delete idsjobworkflowmodel;
	//idsjobworkflowmodel = NULL;
	//}
	//
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::fromJson(char* jsonStr)
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
	const gchar *cqdaminddpagesregexKey = "cq.dam.indd.pages.regex";
	node = json_object_get_member(pJsonObject, cqdaminddpagesregexKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdaminddpagesregex, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdaminddpagesregex);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idsjobdecoupledKey = "ids.job.decoupled";
	node = json_object_get_member(pJsonObject, idsjobdecoupledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&idsjobdecoupled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&idsjobdecoupled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idsjobworkflowmodelKey = "ids.job.workflow.model";
	node = json_object_get_member(pJsonObject, idsjobworkflowmodelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&idsjobworkflowmodel, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&idsjobworkflowmodel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamInddProcessINDDMediaExtractProcessProperties::ComDayCqDamInddProcessINDDMediaExtractProcessProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdaminddpagesregex();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdaminddpagesregex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdaminddpagesregexKey = "cq.dam.indd.pages.regex";
	json_object_set_member(pJsonObject, cqdaminddpagesregexKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIdsjobdecoupled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIdsjobdecoupled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idsjobdecoupledKey = "ids.job.decoupled";
	json_object_set_member(pJsonObject, idsjobdecoupledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getIdsjobworkflowmodel();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getIdsjobworkflowmodel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idsjobworkflowmodelKey = "ids.job.workflow.model";
	json_object_set_member(pJsonObject, idsjobworkflowmodelKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setProcesslabel(ConfigNodePropertyString  processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyString
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getCqdaminddpagesregex()
{
	return cqdaminddpagesregex;
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setCqdaminddpagesregex(ConfigNodePropertyString  cqdaminddpagesregex)
{
	this->cqdaminddpagesregex = cqdaminddpagesregex;
}

ConfigNodePropertyBoolean
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getIdsjobdecoupled()
{
	return idsjobdecoupled;
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setIdsjobdecoupled(ConfigNodePropertyBoolean  idsjobdecoupled)
{
	this->idsjobdecoupled = idsjobdecoupled;
}

ConfigNodePropertyString
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getIdsjobworkflowmodel()
{
	return idsjobworkflowmodel;
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setIdsjobworkflowmodel(ConfigNodePropertyString  idsjobworkflowmodel)
{
	this->idsjobworkflowmodel = idsjobworkflowmodel;
}


