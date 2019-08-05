#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties()
{
	//__init();
}

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::~ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::__init()
{
	//operation = new ConfigNodePropertyString();
	//emailEnabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::__cleanup()
{
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(emailEnabled != NULL) {
	//
	//delete emailEnabled;
	//emailEnabled = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::fromJson(char* jsonStr)
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

ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::toJson()
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
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::getOperation()
{
	return operation;
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::setOperation(ConfigNodePropertyString  operation)
{
	this->operation = operation;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::getEmailEnabled()
{
	return emailEnabled;
}

void
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties::setEmailEnabled(ConfigNodePropertyBoolean  emailEnabled)
{
	this->emailEnabled = emailEnabled;
}


