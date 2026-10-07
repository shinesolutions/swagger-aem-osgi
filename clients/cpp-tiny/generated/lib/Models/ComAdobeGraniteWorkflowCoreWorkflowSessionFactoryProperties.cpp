

#include "ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties()
{
	graniteworkflowinboxsortpropertyName = ConfigNodePropertyDropDown();
	graniteworkflowinboxsortorder = ConfigNodePropertyString();
	cqworkflowjobretry = ConfigNodePropertyInteger();
	cqworkflowsuperuser = ConfigNodePropertyArray();
	graniteworkflowinboxQuerySize = ConfigNodePropertyInteger();
	graniteworkflowadminUserGroupFilter = ConfigNodePropertyBoolean();
	graniteworkflowenforceWorkitemAssigneePermissions = ConfigNodePropertyBoolean();
	graniteworkflowenforceWorkflowInitiatorPermissions = ConfigNodePropertyBoolean();
	graniteworkflowinjectTenantIdInJobTopics = ConfigNodePropertyBoolean();
	graniteworkflowmaxPurgeSaveThreshold = ConfigNodePropertyInteger();
	graniteworkflowmaxPurgeQueryCount = ConfigNodePropertyInteger();
}

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::~ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties()
{

}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *graniteworkflowinboxsortpropertyNameKey = "granite.workflowinbox.sort.propertyName";

    if(object.has_key(graniteworkflowinboxsortpropertyNameKey))
    {
        bourne::json value = object[graniteworkflowinboxsortpropertyNameKey];




        ConfigNodePropertyDropDown* obj = &graniteworkflowinboxsortpropertyName;
		obj->fromJson(value.dump());

    }

    const char *graniteworkflowinboxsortorderKey = "granite.workflowinbox.sort.order";

    if(object.has_key(graniteworkflowinboxsortorderKey))
    {
        bourne::json value = object[graniteworkflowinboxsortorderKey];




        ConfigNodePropertyString* obj = &graniteworkflowinboxsortorder;
		obj->fromJson(value.dump());

    }

    const char *cqworkflowjobretryKey = "cq.workflow.job.retry";

    if(object.has_key(cqworkflowjobretryKey))
    {
        bourne::json value = object[cqworkflowjobretryKey];




        ConfigNodePropertyInteger* obj = &cqworkflowjobretry;
		obj->fromJson(value.dump());

    }

    const char *cqworkflowsuperuserKey = "cq.workflow.superuser";

    if(object.has_key(cqworkflowsuperuserKey))
    {
        bourne::json value = object[cqworkflowsuperuserKey];




        ConfigNodePropertyArray* obj = &cqworkflowsuperuser;
		obj->fromJson(value.dump());

    }

    const char *graniteworkflowinboxQuerySizeKey = "granite.workflow.inboxQuerySize";

    if(object.has_key(graniteworkflowinboxQuerySizeKey))
    {
        bourne::json value = object[graniteworkflowinboxQuerySizeKey];




        ConfigNodePropertyInteger* obj = &graniteworkflowinboxQuerySize;
		obj->fromJson(value.dump());

    }

    const char *graniteworkflowadminUserGroupFilterKey = "granite.workflow.adminUserGroupFilter";

    if(object.has_key(graniteworkflowadminUserGroupFilterKey))
    {
        bourne::json value = object[graniteworkflowadminUserGroupFilterKey];




        ConfigNodePropertyBoolean* obj = &graniteworkflowadminUserGroupFilter;
		obj->fromJson(value.dump());

    }

    const char *graniteworkflowenforceWorkitemAssigneePermissionsKey = "granite.workflow.enforceWorkitemAssigneePermissions";

    if(object.has_key(graniteworkflowenforceWorkitemAssigneePermissionsKey))
    {
        bourne::json value = object[graniteworkflowenforceWorkitemAssigneePermissionsKey];




        ConfigNodePropertyBoolean* obj = &graniteworkflowenforceWorkitemAssigneePermissions;
		obj->fromJson(value.dump());

    }

    const char *graniteworkflowenforceWorkflowInitiatorPermissionsKey = "granite.workflow.enforceWorkflowInitiatorPermissions";

    if(object.has_key(graniteworkflowenforceWorkflowInitiatorPermissionsKey))
    {
        bourne::json value = object[graniteworkflowenforceWorkflowInitiatorPermissionsKey];




        ConfigNodePropertyBoolean* obj = &graniteworkflowenforceWorkflowInitiatorPermissions;
		obj->fromJson(value.dump());

    }

    const char *graniteworkflowinjectTenantIdInJobTopicsKey = "granite.workflow.injectTenantIdInJobTopics";

    if(object.has_key(graniteworkflowinjectTenantIdInJobTopicsKey))
    {
        bourne::json value = object[graniteworkflowinjectTenantIdInJobTopicsKey];




        ConfigNodePropertyBoolean* obj = &graniteworkflowinjectTenantIdInJobTopics;
		obj->fromJson(value.dump());

    }

    const char *graniteworkflowmaxPurgeSaveThresholdKey = "granite.workflow.maxPurgeSaveThreshold";

    if(object.has_key(graniteworkflowmaxPurgeSaveThresholdKey))
    {
        bourne::json value = object[graniteworkflowmaxPurgeSaveThresholdKey];




        ConfigNodePropertyInteger* obj = &graniteworkflowmaxPurgeSaveThreshold;
		obj->fromJson(value.dump());

    }

    const char *graniteworkflowmaxPurgeQueryCountKey = "granite.workflow.maxPurgeQueryCount";

    if(object.has_key(graniteworkflowmaxPurgeQueryCountKey))
    {
        bourne::json value = object[graniteworkflowmaxPurgeQueryCountKey];




        ConfigNodePropertyInteger* obj = &graniteworkflowmaxPurgeQueryCount;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["graniteworkflowinboxsortpropertyName"] = getGraniteworkflowinboxsortpropertyName().toJson();






	object["graniteworkflowinboxsortorder"] = getGraniteworkflowinboxsortorder().toJson();






	object["cqworkflowjobretry"] = getCqworkflowjobretry().toJson();






	object["cqworkflowsuperuser"] = getCqworkflowsuperuser().toJson();






	object["graniteworkflowinboxQuerySize"] = getGraniteworkflowinboxQuerySize().toJson();






	object["graniteworkflowadminUserGroupFilter"] = getGraniteworkflowadminUserGroupFilter().toJson();






	object["graniteworkflowenforceWorkitemAssigneePermissions"] = getGraniteworkflowenforceWorkitemAssigneePermissions().toJson();






	object["graniteworkflowenforceWorkflowInitiatorPermissions"] = getGraniteworkflowenforceWorkflowInitiatorPermissions().toJson();






	object["graniteworkflowinjectTenantIdInJobTopics"] = getGraniteworkflowinjectTenantIdInJobTopics().toJson();






	object["graniteworkflowmaxPurgeSaveThreshold"] = getGraniteworkflowmaxPurgeSaveThreshold().toJson();






	object["graniteworkflowmaxPurgeQueryCount"] = getGraniteworkflowmaxPurgeQueryCount().toJson();


    return object;

}

ConfigNodePropertyDropDown
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowinboxsortpropertyName()
{
	return graniteworkflowinboxsortpropertyName;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowinboxsortpropertyName(ConfigNodePropertyDropDown graniteworkflowinboxsortpropertyName)
{
	this->graniteworkflowinboxsortpropertyName = graniteworkflowinboxsortpropertyName;
}

ConfigNodePropertyString
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowinboxsortorder()
{
	return graniteworkflowinboxsortorder;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowinboxsortorder(ConfigNodePropertyString graniteworkflowinboxsortorder)
{
	this->graniteworkflowinboxsortorder = graniteworkflowinboxsortorder;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getCqworkflowjobretry()
{
	return cqworkflowjobretry;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setCqworkflowjobretry(ConfigNodePropertyInteger cqworkflowjobretry)
{
	this->cqworkflowjobretry = cqworkflowjobretry;
}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getCqworkflowsuperuser()
{
	return cqworkflowsuperuser;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setCqworkflowsuperuser(ConfigNodePropertyArray cqworkflowsuperuser)
{
	this->cqworkflowsuperuser = cqworkflowsuperuser;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowinboxQuerySize()
{
	return graniteworkflowinboxQuerySize;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowinboxQuerySize(ConfigNodePropertyInteger graniteworkflowinboxQuerySize)
{
	this->graniteworkflowinboxQuerySize = graniteworkflowinboxQuerySize;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowadminUserGroupFilter()
{
	return graniteworkflowadminUserGroupFilter;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowadminUserGroupFilter(ConfigNodePropertyBoolean graniteworkflowadminUserGroupFilter)
{
	this->graniteworkflowadminUserGroupFilter = graniteworkflowadminUserGroupFilter;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowenforceWorkitemAssigneePermissions()
{
	return graniteworkflowenforceWorkitemAssigneePermissions;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowenforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean graniteworkflowenforceWorkitemAssigneePermissions)
{
	this->graniteworkflowenforceWorkitemAssigneePermissions = graniteworkflowenforceWorkitemAssigneePermissions;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowenforceWorkflowInitiatorPermissions()
{
	return graniteworkflowenforceWorkflowInitiatorPermissions;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowenforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean graniteworkflowenforceWorkflowInitiatorPermissions)
{
	this->graniteworkflowenforceWorkflowInitiatorPermissions = graniteworkflowenforceWorkflowInitiatorPermissions;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowinjectTenantIdInJobTopics()
{
	return graniteworkflowinjectTenantIdInJobTopics;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowinjectTenantIdInJobTopics(ConfigNodePropertyBoolean graniteworkflowinjectTenantIdInJobTopics)
{
	this->graniteworkflowinjectTenantIdInJobTopics = graniteworkflowinjectTenantIdInJobTopics;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowmaxPurgeSaveThreshold()
{
	return graniteworkflowmaxPurgeSaveThreshold;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowmaxPurgeSaveThreshold(ConfigNodePropertyInteger graniteworkflowmaxPurgeSaveThreshold)
{
	this->graniteworkflowmaxPurgeSaveThreshold = graniteworkflowmaxPurgeSaveThreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::getGraniteworkflowmaxPurgeQueryCount()
{
	return graniteworkflowmaxPurgeQueryCount;
}

void
ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties::setGraniteworkflowmaxPurgeQueryCount(ConfigNodePropertyInteger graniteworkflowmaxPurgeQueryCount)
{
	this->graniteworkflowmaxPurgeQueryCount = graniteworkflowmaxPurgeQueryCount;
}



