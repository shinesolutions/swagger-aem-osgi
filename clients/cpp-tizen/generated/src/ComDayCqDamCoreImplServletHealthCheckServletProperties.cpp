#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletHealthCheckServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletHealthCheckServletProperties::ComDayCqDamCoreImplServletHealthCheckServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletHealthCheckServletProperties::~ComDayCqDamCoreImplServletHealthCheckServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletHealthCheckServletProperties::__init()
{
	//cqdamsyncworkflowid = new ConfigNodePropertyString();
	//cqdamsyncfoldertypes = new ConfigNodePropertyArray();
}

void
ComDayCqDamCoreImplServletHealthCheckServletProperties::__cleanup()
{
	//if(cqdamsyncworkflowid != NULL) {
	//
	//delete cqdamsyncworkflowid;
	//cqdamsyncworkflowid = NULL;
	//}
	//if(cqdamsyncfoldertypes != NULL) {
	//
	//delete cqdamsyncfoldertypes;
	//cqdamsyncfoldertypes = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletHealthCheckServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamsyncworkflowidKey = "cq.dam.sync.workflow.id";
	node = json_object_get_member(pJsonObject, cqdamsyncworkflowidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamsyncworkflowid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamsyncworkflowid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamsyncfoldertypesKey = "cq.dam.sync.folder.types";
	node = json_object_get_member(pJsonObject, cqdamsyncfoldertypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqdamsyncfoldertypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqdamsyncfoldertypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletHealthCheckServletProperties::ComDayCqDamCoreImplServletHealthCheckServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletHealthCheckServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamsyncworkflowid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamsyncworkflowid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamsyncworkflowidKey = "cq.dam.sync.workflow.id";
	json_object_set_member(pJsonObject, cqdamsyncworkflowidKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqdamsyncfoldertypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqdamsyncfoldertypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamsyncfoldertypesKey = "cq.dam.sync.folder.types";
	json_object_set_member(pJsonObject, cqdamsyncfoldertypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletHealthCheckServletProperties::getCqdamsyncworkflowid()
{
	return cqdamsyncworkflowid;
}

void
ComDayCqDamCoreImplServletHealthCheckServletProperties::setCqdamsyncworkflowid(ConfigNodePropertyString  cqdamsyncworkflowid)
{
	this->cqdamsyncworkflowid = cqdamsyncworkflowid;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletHealthCheckServletProperties::getCqdamsyncfoldertypes()
{
	return cqdamsyncfoldertypes;
}

void
ComDayCqDamCoreImplServletHealthCheckServletProperties::setCqdamsyncfoldertypes(ConfigNodePropertyArray  cqdamsyncfoldertypes)
{
	this->cqdamsyncfoldertypes = cqdamsyncfoldertypes;
}


