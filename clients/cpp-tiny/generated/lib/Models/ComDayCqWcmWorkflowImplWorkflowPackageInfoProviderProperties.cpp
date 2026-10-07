

#include "ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.h"

using namespace Tiny;

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties()
{
	workflowpackageinfoproviderfilter = ConfigNodePropertyArray();
	workflowpackageinfoproviderfilterrootpath = ConfigNodePropertyString();
}

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::~ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties()
{

}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *workflowpackageinfoproviderfilterKey = "workflowpackageinfoprovider.filter";

    if(object.has_key(workflowpackageinfoproviderfilterKey))
    {
        bourne::json value = object[workflowpackageinfoproviderfilterKey];




        ConfigNodePropertyArray* obj = &workflowpackageinfoproviderfilter;
		obj->fromJson(value.dump());

    }

    const char *workflowpackageinfoproviderfilterrootpathKey = "workflowpackageinfoprovider.filter.rootpath";

    if(object.has_key(workflowpackageinfoproviderfilterrootpathKey))
    {
        bourne::json value = object[workflowpackageinfoproviderfilterrootpathKey];




        ConfigNodePropertyString* obj = &workflowpackageinfoproviderfilterrootpath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["workflowpackageinfoproviderfilter"] = getWorkflowpackageinfoproviderfilter().toJson();






	object["workflowpackageinfoproviderfilterrootpath"] = getWorkflowpackageinfoproviderfilterrootpath().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::getWorkflowpackageinfoproviderfilter()
{
	return workflowpackageinfoproviderfilter;
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::setWorkflowpackageinfoproviderfilter(ConfigNodePropertyArray workflowpackageinfoproviderfilter)
{
	this->workflowpackageinfoproviderfilter = workflowpackageinfoproviderfilter;
}

ConfigNodePropertyString
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::getWorkflowpackageinfoproviderfilterrootpath()
{
	return workflowpackageinfoproviderfilterrootpath;
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties::setWorkflowpackageinfoproviderfilterrootpath(ConfigNodePropertyString workflowpackageinfoproviderfilterrootpath)
{
	this->workflowpackageinfoproviderfilterrootpath = workflowpackageinfoproviderfilterrootpath;
}



