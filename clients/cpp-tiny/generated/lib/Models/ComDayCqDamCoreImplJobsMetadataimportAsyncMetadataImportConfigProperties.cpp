

#include "ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties()
{
	operation = ConfigNodePropertyString();
	operationIcon = ConfigNodePropertyString();
	topicName = ConfigNodePropertyString();
	emailEnabled = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::~ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties()
{

}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];




        ConfigNodePropertyString* obj = &operation;
		obj->fromJson(value.dump());

    }

    const char *operationIconKey = "operationIcon";

    if(object.has_key(operationIconKey))
    {
        bourne::json value = object[operationIconKey];




        ConfigNodePropertyString* obj = &operationIcon;
		obj->fromJson(value.dump());

    }

    const char *topicNameKey = "topicName";

    if(object.has_key(topicNameKey))
    {
        bourne::json value = object[topicNameKey];




        ConfigNodePropertyString* obj = &topicName;
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
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["operation"] = getOperation().toJson();






	object["operationIcon"] = getOperationIcon().toJson();






	object["topicName"] = getTopicName().toJson();






	object["emailEnabled"] = getEmailEnabled().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::getOperation()
{
	return operation;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::setOperation(ConfigNodePropertyString operation)
{
	this->operation = operation;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::getOperationIcon()
{
	return operationIcon;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::setOperationIcon(ConfigNodePropertyString operationIcon)
{
	this->operationIcon = operationIcon;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::getTopicName()
{
	return topicName;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::setTopicName(ConfigNodePropertyString topicName)
{
	this->topicName = topicName;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::getEmailEnabled()
{
	return emailEnabled;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::setEmailEnabled(ConfigNodePropertyBoolean emailEnabled)
{
	this->emailEnabled = emailEnabled;
}



