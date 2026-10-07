#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties()
{
	//__init();
}

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::~ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::__init()
{
	//operation = new ConfigNodePropertyString();
	//operationIcon = new ConfigNodePropertyString();
	//topicName = new ConfigNodePropertyString();
	//emailEnabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::__cleanup()
{
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(operationIcon != NULL) {
	//
	//delete operationIcon;
	//operationIcon = NULL;
	//}
	//if(topicName != NULL) {
	//
	//delete topicName;
	//topicName = NULL;
	//}
	//if(emailEnabled != NULL) {
	//
	//delete emailEnabled;
	//emailEnabled = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&operation, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&operation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *operationIconKey = "operationIcon";
	node = json_object_get_member(pJsonObject, operationIconKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&operationIcon, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&operationIcon);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *topicNameKey = "topicName";
	node = json_object_get_member(pJsonObject, topicNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&topicName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&topicName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailEnabledKey = "emailEnabled";
	node = json_object_get_member(pJsonObject, emailEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&emailEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&emailEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOperation();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOperation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOperationIcon();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOperationIcon());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationIconKey = "operationIcon";
	json_object_set_member(pJsonObject, operationIconKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTopicName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTopicName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *topicNameKey = "topicName";
	json_object_set_member(pJsonObject, topicNameKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEmailEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEmailEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailEnabledKey = "emailEnabled";
	json_object_set_member(pJsonObject, emailEnabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::getOperation()
{
	return operation;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::setOperation(ConfigNodePropertyString  operation)
{
	this->operation = operation;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::getOperationIcon()
{
	return operationIcon;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::setOperationIcon(ConfigNodePropertyString  operationIcon)
{
	this->operationIcon = operationIcon;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::getTopicName()
{
	return topicName;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::setTopicName(ConfigNodePropertyString  topicName)
{
	this->topicName = topicName;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::getEmailEnabled()
{
	return emailEnabled;
}

void
ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties::setEmailEnabled(ConfigNodePropertyBoolean  emailEnabled)
{
	this->emailEnabled = emailEnabled;
}


