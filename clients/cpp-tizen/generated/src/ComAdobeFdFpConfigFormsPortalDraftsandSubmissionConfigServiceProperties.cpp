#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties()
{
	//__init();
}

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::~ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties()
{
	//__cleanup();
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::__init()
{
	//portaloutboxes = new ConfigNodePropertyArray();
	//draftdataservice = new ConfigNodePropertyString();
	//draftmetadataservice = new ConfigNodePropertyString();
	//submitdataservice = new ConfigNodePropertyString();
	//submitmetadataservice = new ConfigNodePropertyString();
	//pendingSigndataservice = new ConfigNodePropertyString();
	//pendingSignmetadataservice = new ConfigNodePropertyString();
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::__cleanup()
{
	//if(portaloutboxes != NULL) {
	//
	//delete portaloutboxes;
	//portaloutboxes = NULL;
	//}
	//if(draftdataservice != NULL) {
	//
	//delete draftdataservice;
	//draftdataservice = NULL;
	//}
	//if(draftmetadataservice != NULL) {
	//
	//delete draftmetadataservice;
	//draftmetadataservice = NULL;
	//}
	//if(submitdataservice != NULL) {
	//
	//delete submitdataservice;
	//submitdataservice = NULL;
	//}
	//if(submitmetadataservice != NULL) {
	//
	//delete submitmetadataservice;
	//submitmetadataservice = NULL;
	//}
	//if(pendingSigndataservice != NULL) {
	//
	//delete pendingSigndataservice;
	//pendingSigndataservice = NULL;
	//}
	//if(pendingSignmetadataservice != NULL) {
	//
	//delete pendingSignmetadataservice;
	//pendingSignmetadataservice = NULL;
	//}
	//
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *portaloutboxesKey = "portal.outboxes";
	node = json_object_get_member(pJsonObject, portaloutboxesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&portaloutboxes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&portaloutboxes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *draftdataserviceKey = "draft.data.service";
	node = json_object_get_member(pJsonObject, draftdataserviceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&draftdataservice, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&draftdataservice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *draftmetadataserviceKey = "draft.metadata.service";
	node = json_object_get_member(pJsonObject, draftmetadataserviceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&draftmetadataservice, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&draftmetadataservice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *submitdataserviceKey = "submit.data.service";
	node = json_object_get_member(pJsonObject, submitdataserviceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&submitdataservice, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&submitdataservice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *submitmetadataserviceKey = "submit.metadata.service";
	node = json_object_get_member(pJsonObject, submitmetadataserviceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&submitmetadataservice, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&submitmetadataservice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pendingSigndataserviceKey = "pendingSign.data.service";
	node = json_object_get_member(pJsonObject, pendingSigndataserviceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pendingSigndataservice, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pendingSigndataservice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pendingSignmetadataserviceKey = "pendingSign.metadata.service";
	node = json_object_get_member(pJsonObject, pendingSignmetadataserviceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pendingSignmetadataservice, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pendingSignmetadataservice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPortaloutboxes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPortaloutboxes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *portaloutboxesKey = "portal.outboxes";
	json_object_set_member(pJsonObject, portaloutboxesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDraftdataservice();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDraftdataservice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *draftdataserviceKey = "draft.data.service";
	json_object_set_member(pJsonObject, draftdataserviceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDraftmetadataservice();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDraftmetadataservice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *draftmetadataserviceKey = "draft.metadata.service";
	json_object_set_member(pJsonObject, draftmetadataserviceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSubmitdataservice();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSubmitdataservice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *submitdataserviceKey = "submit.data.service";
	json_object_set_member(pJsonObject, submitdataserviceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSubmitmetadataservice();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSubmitmetadataservice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *submitmetadataserviceKey = "submit.metadata.service";
	json_object_set_member(pJsonObject, submitmetadataserviceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPendingSigndataservice();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPendingSigndataservice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pendingSigndataserviceKey = "pendingSign.data.service";
	json_object_set_member(pJsonObject, pendingSigndataserviceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPendingSignmetadataservice();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPendingSignmetadataservice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pendingSignmetadataserviceKey = "pendingSign.metadata.service";
	json_object_set_member(pJsonObject, pendingSignmetadataserviceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getPortaloutboxes()
{
	return portaloutboxes;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setPortaloutboxes(ConfigNodePropertyArray  portaloutboxes)
{
	this->portaloutboxes = portaloutboxes;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getDraftdataservice()
{
	return draftdataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setDraftdataservice(ConfigNodePropertyString  draftdataservice)
{
	this->draftdataservice = draftdataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getDraftmetadataservice()
{
	return draftmetadataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setDraftmetadataservice(ConfigNodePropertyString  draftmetadataservice)
{
	this->draftmetadataservice = draftmetadataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getSubmitdataservice()
{
	return submitdataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setSubmitdataservice(ConfigNodePropertyString  submitdataservice)
{
	this->submitdataservice = submitdataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getSubmitmetadataservice()
{
	return submitmetadataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setSubmitmetadataservice(ConfigNodePropertyString  submitmetadataservice)
{
	this->submitmetadataservice = submitmetadataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getPendingSigndataservice()
{
	return pendingSigndataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setPendingSigndataservice(ConfigNodePropertyString  pendingSigndataservice)
{
	this->pendingSigndataservice = pendingSigndataservice;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::getPendingSignmetadataservice()
{
	return pendingSignmetadataservice;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties::setPendingSignmetadataservice(ConfigNodePropertyString  pendingSignmetadataservice)
{
	this->pendingSignmetadataservice = pendingSignmetadataservice;
}


