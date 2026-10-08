

#include "ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::ComAdobeGraniteWorkflowCoreWorkflowConfigProperties()
{
	cqworkflowconfigworkflowpackagesrootpath = ConfigNodePropertyArray();
	cqworkflowconfigworkflowprocesslegacymode = ConfigNodePropertyBoolean();
	cqworkflowconfigallowlocking = ConfigNodePropertyBoolean();
}

ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::~ComAdobeGraniteWorkflowCoreWorkflowConfigProperties()
{

}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqworkflowconfigworkflowpackagesrootpathKey = "cq.workflow.config.workflow.packages.root.path";

    if(object.has_key(cqworkflowconfigworkflowpackagesrootpathKey))
    {
        bourne::json value = object[cqworkflowconfigworkflowpackagesrootpathKey];




        ConfigNodePropertyArray* obj = &cqworkflowconfigworkflowpackagesrootpath;
		obj->fromJson(value.dump());

    }

    const char *cqworkflowconfigworkflowprocesslegacymodeKey = "cq.workflow.config.workflow.process.legacy.mode";

    if(object.has_key(cqworkflowconfigworkflowprocesslegacymodeKey))
    {
        bourne::json value = object[cqworkflowconfigworkflowprocesslegacymodeKey];




        ConfigNodePropertyBoolean* obj = &cqworkflowconfigworkflowprocesslegacymode;
		obj->fromJson(value.dump());

    }

    const char *cqworkflowconfigallowlockingKey = "cq.workflow.config.allow.locking";

    if(object.has_key(cqworkflowconfigallowlockingKey))
    {
        bourne::json value = object[cqworkflowconfigallowlockingKey];




        ConfigNodePropertyBoolean* obj = &cqworkflowconfigallowlocking;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqworkflowconfigworkflowpackagesrootpath"] = getCqworkflowconfigworkflowpackagesrootpath().toJson();






	object["cqworkflowconfigworkflowprocesslegacymode"] = getCqworkflowconfigworkflowprocesslegacymode().toJson();






	object["cqworkflowconfigallowlocking"] = getCqworkflowconfigallowlocking().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::getCqworkflowconfigworkflowpackagesrootpath()
{
	return cqworkflowconfigworkflowpackagesrootpath;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::setCqworkflowconfigworkflowpackagesrootpath(ConfigNodePropertyArray cqworkflowconfigworkflowpackagesrootpath)
{
	this->cqworkflowconfigworkflowpackagesrootpath = cqworkflowconfigworkflowpackagesrootpath;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::getCqworkflowconfigworkflowprocesslegacymode()
{
	return cqworkflowconfigworkflowprocesslegacymode;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::setCqworkflowconfigworkflowprocesslegacymode(ConfigNodePropertyBoolean cqworkflowconfigworkflowprocesslegacymode)
{
	this->cqworkflowconfigworkflowprocesslegacymode = cqworkflowconfigworkflowprocesslegacymode;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::getCqworkflowconfigallowlocking()
{
	return cqworkflowconfigallowlocking;
}

void
ComAdobeGraniteWorkflowCoreWorkflowConfigProperties::setCqworkflowconfigallowlocking(ConfigNodePropertyBoolean cqworkflowconfigallowlocking)
{
	this->cqworkflowconfigallowlocking = cqworkflowconfigallowlocking;
}



