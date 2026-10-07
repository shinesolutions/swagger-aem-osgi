#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties()
{
	//__init();
}

ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::~ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties()
{
	//__cleanup();
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::__init()
{
	//cqwcmmsmactionexcludednodetypes = new ConfigNodePropertyArray();
	//cqwcmmsmactionexcludedparagraphitems = new ConfigNodePropertyArray();
	//cqwcmmsmactionexcludedprops = new ConfigNodePropertyArray();
	//cqwcmmsmimplactionspagemoveprop_referenceUpdate = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::__cleanup()
{
	//if(cqwcmmsmactionexcludednodetypes != NULL) {
	//
	//delete cqwcmmsmactionexcludednodetypes;
	//cqwcmmsmactionexcludednodetypes = NULL;
	//}
	//if(cqwcmmsmactionexcludedparagraphitems != NULL) {
	//
	//delete cqwcmmsmactionexcludedparagraphitems;
	//cqwcmmsmactionexcludedparagraphitems = NULL;
	//}
	//if(cqwcmmsmactionexcludedprops != NULL) {
	//
	//delete cqwcmmsmactionexcludedprops;
	//cqwcmmsmactionexcludedprops = NULL;
	//}
	//if(cqwcmmsmimplactionspagemoveprop_referenceUpdate != NULL) {
	//
	//delete cqwcmmsmimplactionspagemoveprop_referenceUpdate;
	//cqwcmmsmimplactionspagemoveprop_referenceUpdate = NULL;
	//}
	//
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqwcmmsmactionexcludednodetypesKey = "cq.wcm.msm.action.excludednodetypes";
	node = json_object_get_member(pJsonObject, cqwcmmsmactionexcludednodetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqwcmmsmactionexcludednodetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqwcmmsmactionexcludednodetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmmsmactionexcludedparagraphitemsKey = "cq.wcm.msm.action.excludedparagraphitems";
	node = json_object_get_member(pJsonObject, cqwcmmsmactionexcludedparagraphitemsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqwcmmsmactionexcludedparagraphitems, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqwcmmsmactionexcludedparagraphitems);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmmsmactionexcludedpropsKey = "cq.wcm.msm.action.excludedprops";
	node = json_object_get_member(pJsonObject, cqwcmmsmactionexcludedpropsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqwcmmsmactionexcludedprops, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqwcmmsmactionexcludedprops);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmmsmimplactionspagemoveprop_referenceUpdateKey = "cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate";
	node = json_object_get_member(pJsonObject, cqwcmmsmimplactionspagemoveprop_referenceUpdateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqwcmmsmimplactionspagemoveprop_referenceUpdate, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqwcmmsmimplactionspagemoveprop_referenceUpdate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqwcmmsmactionexcludednodetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqwcmmsmactionexcludednodetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmmsmactionexcludednodetypesKey = "cq.wcm.msm.action.excludednodetypes";
	json_object_set_member(pJsonObject, cqwcmmsmactionexcludednodetypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqwcmmsmactionexcludedparagraphitems();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqwcmmsmactionexcludedparagraphitems());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmmsmactionexcludedparagraphitemsKey = "cq.wcm.msm.action.excludedparagraphitems";
	json_object_set_member(pJsonObject, cqwcmmsmactionexcludedparagraphitemsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqwcmmsmactionexcludedprops();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqwcmmsmactionexcludedprops());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmmsmactionexcludedpropsKey = "cq.wcm.msm.action.excludedprops";
	json_object_set_member(pJsonObject, cqwcmmsmactionexcludedpropsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqwcmmsmimplactionspagemovepropReferenceUpdate();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqwcmmsmimplactionspagemovepropReferenceUpdate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmmsmimplactionspagemoveprop_referenceUpdateKey = "cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate";
	json_object_set_member(pJsonObject, cqwcmmsmimplactionspagemoveprop_referenceUpdateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::getCqwcmmsmactionexcludednodetypes()
{
	return cqwcmmsmactionexcludednodetypes;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::setCqwcmmsmactionexcludednodetypes(ConfigNodePropertyArray  cqwcmmsmactionexcludednodetypes)
{
	this->cqwcmmsmactionexcludednodetypes = cqwcmmsmactionexcludednodetypes;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::getCqwcmmsmactionexcludedparagraphitems()
{
	return cqwcmmsmactionexcludedparagraphitems;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::setCqwcmmsmactionexcludedparagraphitems(ConfigNodePropertyArray  cqwcmmsmactionexcludedparagraphitems)
{
	this->cqwcmmsmactionexcludedparagraphitems = cqwcmmsmactionexcludedparagraphitems;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::getCqwcmmsmactionexcludedprops()
{
	return cqwcmmsmactionexcludedprops;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::setCqwcmmsmactionexcludedprops(ConfigNodePropertyArray  cqwcmmsmactionexcludedprops)
{
	this->cqwcmmsmactionexcludedprops = cqwcmmsmactionexcludedprops;
}

ConfigNodePropertyBoolean
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::getCqwcmmsmimplactionspagemovepropReferenceUpdate()
{
	return cqwcmmsmimplactionspagemoveprop_referenceUpdate;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::setCqwcmmsmimplactionspagemovepropReferenceUpdate(ConfigNodePropertyBoolean  cqwcmmsmimplactionspagemoveprop_referenceUpdate)
{
	this->cqwcmmsmimplactionspagemoveprop_referenceUpdate = cqwcmmsmimplactionspagemoveprop_referenceUpdate;
}


