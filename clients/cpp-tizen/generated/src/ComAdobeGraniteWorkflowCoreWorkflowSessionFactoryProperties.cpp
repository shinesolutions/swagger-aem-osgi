#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::~ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::__init()
{
	//graniteworkflowinboxsortpropertyName = new ConfigNodePropertyDropDown();
	//graniteworkflowinboxsortorder = new ConfigNodePropertyString();
	//cqworkflowjobretry = new ConfigNodePropertyInteger();
	//cqworkflowsuperuser = new ConfigNodePropertyArray();
	//graniteworkflowinboxQuerySize = new ConfigNodePropertyInteger();
	//graniteworkflowadminUserGroupFilter = new ConfigNodePropertyBoolean();
	//graniteworkflowenforceWorkitemAssigneePermissions = new ConfigNodePropertyBoolean();
	//graniteworkflowenforceWorkflowInitiatorPermissions = new ConfigNodePropertyBoolean();
	//graniteworkflowinjectTenantIdInJobTopics = new ConfigNodePropertyBoolean();
	//graniteworkflowmaxPurgeSaveThreshold = new ConfigNodePropertyInteger();
	//graniteworkflowmaxPurgeQueryCount = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::__cleanup()
{
	//if(graniteworkflowinboxsortpropertyName != NULL) {
	//
	//delete graniteworkflowinboxsortpropertyName;
	//graniteworkflowinboxsortpropertyName = NULL;
	//}
	//if(graniteworkflowinboxsortorder != NULL) {
	//
	//delete graniteworkflowinboxsortorder;
	//graniteworkflowinboxsortorder = NULL;
	//}
	//if(cqworkflowjobretry != NULL) {
	//
	//delete cqworkflowjobretry;
	//cqworkflowjobretry = NULL;
	//}
	//if(cqworkflowsuperuser != NULL) {
	//
	//delete cqworkflowsuperuser;
	//cqworkflowsuperuser = NULL;
	//}
	//if(graniteworkflowinboxQuerySize != NULL) {
	//
	//delete graniteworkflowinboxQuerySize;
	//graniteworkflowinboxQuerySize = NULL;
	//}
	//if(graniteworkflowadminUserGroupFilter != NULL) {
	//
	//delete graniteworkflowadminUserGroupFilter;
	//graniteworkflowadminUserGroupFilter = NULL;
	//}
	//if(graniteworkflowenforceWorkitemAssigneePermissions != NULL) {
	//
	//delete graniteworkflowenforceWorkitemAssigneePermissions;
	//graniteworkflowenforceWorkitemAssigneePermissions = NULL;
	//}
	//if(graniteworkflowenforceWorkflowInitiatorPermissions != NULL) {
	//
	//delete graniteworkflowenforceWorkflowInitiatorPermissions;
	//graniteworkflowenforceWorkflowInitiatorPermissions = NULL;
	//}
	//if(graniteworkflowinjectTenantIdInJobTopics != NULL) {
	//
	//delete graniteworkflowinjectTenantIdInJobTopics;
	//graniteworkflowinjectTenantIdInJobTopics = NULL;
	//}
	//if(graniteworkflowmaxPurgeSaveThreshold != NULL) {
	//
	//delete graniteworkflowmaxPurgeSaveThreshold;
	//graniteworkflowmaxPurgeSaveThreshold = NULL;
	//}
	//if(graniteworkflowmaxPurgeQueryCount != NULL) {
	//
	//delete graniteworkflowmaxPurgeQueryCount;
	//graniteworkflowmaxPurgeQueryCount = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *graniteworkflowinboxsortpropertyNameKey = "granite.workflowinbox.sort.propertyName";
	node = json_object_get_member(pJsonObject, graniteworkflowinboxsortpropertyNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&graniteworkflowinboxsortpropertyName, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&graniteworkflowinboxsortpropertyName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteworkflowinboxsortorderKey = "granite.workflowinbox.sort.order";
	node = json_object_get_member(pJsonObject, graniteworkflowinboxsortorderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&graniteworkflowinboxsortorder, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&graniteworkflowinboxsortorder);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqworkflowjobretryKey = "cq.workflow.job.retry";
	node = json_object_get_member(pJsonObject, cqworkflowjobretryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqworkflowjobretry, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqworkflowjobretry);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqworkflowsuperuserKey = "cq.workflow.superuser";
	node = json_object_get_member(pJsonObject, cqworkflowsuperuserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqworkflowsuperuser, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqworkflowsuperuser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteworkflowinboxQuerySizeKey = "granite.workflow.inboxQuerySize";
	node = json_object_get_member(pJsonObject, graniteworkflowinboxQuerySizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&graniteworkflowinboxQuerySize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&graniteworkflowinboxQuerySize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteworkflowadminUserGroupFilterKey = "granite.workflow.adminUserGroupFilter";
	node = json_object_get_member(pJsonObject, graniteworkflowadminUserGroupFilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&graniteworkflowadminUserGroupFilter, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&graniteworkflowadminUserGroupFilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteworkflowenforceWorkitemAssigneePermissionsKey = "granite.workflow.enforceWorkitemAssigneePermissions";
	node = json_object_get_member(pJsonObject, graniteworkflowenforceWorkitemAssigneePermissionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&graniteworkflowenforceWorkitemAssigneePermissions, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&graniteworkflowenforceWorkitemAssigneePermissions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteworkflowenforceWorkflowInitiatorPermissionsKey = "granite.workflow.enforceWorkflowInitiatorPermissions";
	node = json_object_get_member(pJsonObject, graniteworkflowenforceWorkflowInitiatorPermissionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&graniteworkflowenforceWorkflowInitiatorPermissions, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&graniteworkflowenforceWorkflowInitiatorPermissions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteworkflowinjectTenantIdInJobTopicsKey = "granite.workflow.injectTenantIdInJobTopics";
	node = json_object_get_member(pJsonObject, graniteworkflowinjectTenantIdInJobTopicsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&graniteworkflowinjectTenantIdInJobTopics, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&graniteworkflowinjectTenantIdInJobTopics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteworkflowmaxPurgeSaveThresholdKey = "granite.workflow.maxPurgeSaveThreshold";
	node = json_object_get_member(pJsonObject, graniteworkflowmaxPurgeSaveThresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&graniteworkflowmaxPurgeSaveThreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&graniteworkflowmaxPurgeSaveThreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteworkflowmaxPurgeQueryCountKey = "granite.workflow.maxPurgeQueryCount";
	node = json_object_get_member(pJsonObject, graniteworkflowmaxPurgeQueryCountKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&graniteworkflowmaxPurgeQueryCount, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&graniteworkflowmaxPurgeQueryCount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getGraniteworkflowinboxsortpropertyName();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getGraniteworkflowinboxsortpropertyName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowinboxsortpropertyNameKey = "granite.workflowinbox.sort.propertyName";
	json_object_set_member(pJsonObject, graniteworkflowinboxsortpropertyNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGraniteworkflowinboxsortorder();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGraniteworkflowinboxsortorder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowinboxsortorderKey = "granite.workflowinbox.sort.order";
	json_object_set_member(pJsonObject, graniteworkflowinboxsortorderKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqworkflowjobretry();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqworkflowjobretry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqworkflowjobretryKey = "cq.workflow.job.retry";
	json_object_set_member(pJsonObject, cqworkflowjobretryKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqworkflowsuperuser();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqworkflowsuperuser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqworkflowsuperuserKey = "cq.workflow.superuser";
	json_object_set_member(pJsonObject, cqworkflowsuperuserKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getGraniteworkflowinboxQuerySize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getGraniteworkflowinboxQuerySize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowinboxQuerySizeKey = "granite.workflow.inboxQuerySize";
	json_object_set_member(pJsonObject, graniteworkflowinboxQuerySizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGraniteworkflowadminUserGroupFilter();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGraniteworkflowadminUserGroupFilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowadminUserGroupFilterKey = "granite.workflow.adminUserGroupFilter";
	json_object_set_member(pJsonObject, graniteworkflowadminUserGroupFilterKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGraniteworkflowenforceWorkitemAssigneePermissions();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGraniteworkflowenforceWorkitemAssigneePermissions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowenforceWorkitemAssigneePermissionsKey = "granite.workflow.enforceWorkitemAssigneePermissions";
	json_object_set_member(pJsonObject, graniteworkflowenforceWorkitemAssigneePermissionsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGraniteworkflowenforceWorkflowInitiatorPermissions();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGraniteworkflowenforceWorkflowInitiatorPermissions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowenforceWorkflowInitiatorPermissionsKey = "granite.workflow.enforceWorkflowInitiatorPermissions";
	json_object_set_member(pJsonObject, graniteworkflowenforceWorkflowInitiatorPermissionsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGraniteworkflowinjectTenantIdInJobTopics();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGraniteworkflowinjectTenantIdInJobTopics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowinjectTenantIdInJobTopicsKey = "granite.workflow.injectTenantIdInJobTopics";
	json_object_set_member(pJsonObject, graniteworkflowinjectTenantIdInJobTopicsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getGraniteworkflowmaxPurgeSaveThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getGraniteworkflowmaxPurgeSaveThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowmaxPurgeSaveThresholdKey = "granite.workflow.maxPurgeSaveThreshold";
	json_object_set_member(pJsonObject, graniteworkflowmaxPurgeSaveThresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getGraniteworkflowmaxPurgeQueryCount();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getGraniteworkflowmaxPurgeQueryCount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowmaxPurgeQueryCountKey = "granite.workflow.maxPurgeQueryCount";
	json_object_set_member(pJsonObject, graniteworkflowmaxPurgeQueryCountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowinboxsortpropertyName()
{
	return graniteworkflowinboxsortpropertyName;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowinboxsortpropertyName(ConfigNodePropertyDropDown  graniteworkflowinboxsortpropertyName)
{
	this->graniteworkflowinboxsortpropertyName = graniteworkflowinboxsortpropertyName;
}

ConfigNodePropertyString
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowinboxsortorder()
{
	return graniteworkflowinboxsortorder;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowinboxsortorder(ConfigNodePropertyString  graniteworkflowinboxsortorder)
{
	this->graniteworkflowinboxsortorder = graniteworkflowinboxsortorder;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getCqworkflowjobretry()
{
	return cqworkflowjobretry;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setCqworkflowjobretry(ConfigNodePropertyInteger  cqworkflowjobretry)
{
	this->cqworkflowjobretry = cqworkflowjobretry;
}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getCqworkflowsuperuser()
{
	return cqworkflowsuperuser;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setCqworkflowsuperuser(ConfigNodePropertyArray  cqworkflowsuperuser)
{
	this->cqworkflowsuperuser = cqworkflowsuperuser;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowinboxQuerySize()
{
	return graniteworkflowinboxQuerySize;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowinboxQuerySize(ConfigNodePropertyInteger  graniteworkflowinboxQuerySize)
{
	this->graniteworkflowinboxQuerySize = graniteworkflowinboxQuerySize;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowadminUserGroupFilter()
{
	return graniteworkflowadminUserGroupFilter;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowadminUserGroupFilter(ConfigNodePropertyBoolean  graniteworkflowadminUserGroupFilter)
{
	this->graniteworkflowadminUserGroupFilter = graniteworkflowadminUserGroupFilter;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowenforceWorkitemAssigneePermissions()
{
	return graniteworkflowenforceWorkitemAssigneePermissions;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowenforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean  graniteworkflowenforceWorkitemAssigneePermissions)
{
	this->graniteworkflowenforceWorkitemAssigneePermissions = graniteworkflowenforceWorkitemAssigneePermissions;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowenforceWorkflowInitiatorPermissions()
{
	return graniteworkflowenforceWorkflowInitiatorPermissions;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowenforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean  graniteworkflowenforceWorkflowInitiatorPermissions)
{
	this->graniteworkflowenforceWorkflowInitiatorPermissions = graniteworkflowenforceWorkflowInitiatorPermissions;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowinjectTenantIdInJobTopics()
{
	return graniteworkflowinjectTenantIdInJobTopics;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowinjectTenantIdInJobTopics(ConfigNodePropertyBoolean  graniteworkflowinjectTenantIdInJobTopics)
{
	this->graniteworkflowinjectTenantIdInJobTopics = graniteworkflowinjectTenantIdInJobTopics;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowmaxPurgeSaveThreshold()
{
	return graniteworkflowmaxPurgeSaveThreshold;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowmaxPurgeSaveThreshold(ConfigNodePropertyInteger  graniteworkflowmaxPurgeSaveThreshold)
{
	this->graniteworkflowmaxPurgeSaveThreshold = graniteworkflowmaxPurgeSaveThreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowmaxPurgeQueryCount()
{
	return graniteworkflowmaxPurgeQueryCount;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowmaxPurgeQueryCount(ConfigNodePropertyInteger  graniteworkflowmaxPurgeQueryCount)
{
	this->graniteworkflowmaxPurgeQueryCount = graniteworkflowmaxPurgeQueryCount;
}


