

#include "ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties()
{
	operation = ConfigNodePropertyString();
	emailEnabled = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::~ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties()
{

}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];




        ConfigNodePropertyString* obj = &operation;
		obj->fromJson(value.dump());

    }

    const char *emailEnabledKey = "emailEnabled";

    if(object.has_key(emailEnabledKey))
    {
        bourne::json value = object[emailEnabledKey];




        ConfigNodePropertyBoolean* obj = &emailEnabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["operation"] = getOperation().toJson();






	object["emailEnabled"] = getEmailEnabled().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::getOperation()
{
	return operation;
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::setOperation(ConfigNodePropertyString operation)
{
	this->operation = operation;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::getEmailEnabled()
{
	return emailEnabled;
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::setEmailEnabled(ConfigNodePropertyBoolean emailEnabled)
{
	this->emailEnabled = emailEnabled;
}



