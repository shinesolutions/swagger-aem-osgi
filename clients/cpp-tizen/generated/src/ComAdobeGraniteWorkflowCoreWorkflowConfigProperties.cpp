#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::ComAdobeGraniteWorkflowCoreWorkflowConfigProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::~ComAdobeGraniteWorkflowCoreWorkflowConfigProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::__init()
{
	//cqworkflowconfigworkflowpackagesrootpath = new ConfigNodePropertyArray();
	//cqworkflowconfigworkflowprocesslegacymode = new ConfigNodePropertyBoolean();
	//cqworkflowconfigallowlocking = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::__cleanup()
{
	//if(cqworkflowconfigworkflowpackagesrootpath != NULL) {
	//
	//delete cqworkflowconfigworkflowpackagesrootpath;
	//cqworkflowconfigworkflowpackagesrootpath = NULL;
	//}
	//if(cqworkflowconfigworkflowprocesslegacymode != NULL) {
	//
	//delete cqworkflowconfigworkflowprocesslegacymode;
	//cqworkflowconfigworkflowprocesslegacymode = NULL;
	//}
	//if(cqworkflowconfigallowlocking != NULL) {
	//
	//delete cqworkflowconfigallowlocking;
	//cqworkflowconfigallowlocking = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqworkflowconfigworkflowpackagesrootpathKey = "cq.workflow.config.workflow.packages.root.path";
	node = json_object_get_member(pJsonObject, cqworkflowconfigworkflowpackagesrootpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqworkflowconfigworkflowpackagesrootpath, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqworkflowconfigworkflowpackagesrootpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqworkflowconfigworkflowprocesslegacymodeKey = "cq.workflow.config.workflow.process.legacy.mode";
	node = json_object_get_member(pJsonObject, cqworkflowconfigworkflowprocesslegacymodeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqworkflowconfigworkflowprocesslegacymode, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqworkflowconfigworkflowprocesslegacymode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqworkflowconfigallowlockingKey = "cq.workflow.config.allow.locking";
	node = json_object_get_member(pJsonObject, cqworkflowconfigallowlockingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqworkflowconfigallowlocking, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqworkflowconfigallowlocking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqworkflowconfigworkflowpackagesrootpath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqworkflowconfigworkflowpackagesrootpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqworkflowconfigworkflowpackagesrootpathKey = "cq.workflow.config.workflow.packages.root.path";
	json_object_set_member(pJsonObject, cqworkflowconfigworkflowpackagesrootpathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqworkflowconfigworkflowprocesslegacymode();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqworkflowconfigworkflowprocesslegacymode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqworkflowconfigworkflowprocesslegacymodeKey = "cq.workflow.config.workflow.process.legacy.mode";
	json_object_set_member(pJsonObject, cqworkflowconfigworkflowprocesslegacymodeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqworkflowconfigallowlocking();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqworkflowconfigallowlocking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqworkflowconfigallowlockingKey = "cq.workflow.config.allow.locking";
	json_object_set_member(pJsonObject, cqworkflowconfigallowlockingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::getCqworkflowconfigworkflowpackagesrootpath()
{
	return cqworkflowconfigworkflowpackagesrootpath;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::setCqworkflowconfigworkflowpackagesrootpath(ConfigNodePropertyArray  cqworkflowconfigworkflowpackagesrootpath)
{
	this->cqworkflowconfigworkflowpackagesrootpath = cqworkflowconfigworkflowpackagesrootpath;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::getCqworkflowconfigworkflowprocesslegacymode()
{
	return cqworkflowconfigworkflowprocesslegacymode;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::setCqworkflowconfigworkflowprocesslegacymode(ConfigNodePropertyBoolean  cqworkflowconfigworkflowprocesslegacymode)
{
	this->cqworkflowconfigworkflowprocesslegacymode = cqworkflowconfigworkflowprocesslegacymode;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::getCqworkflowconfigallowlocking()
{
	return cqworkflowconfigallowlocking;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::setCqworkflowconfigallowlocking(ConfigNodePropertyBoolean  cqworkflowconfigallowlocking)
{
	this->cqworkflowconfigallowlocking = cqworkflowconfigallowlocking;
}


