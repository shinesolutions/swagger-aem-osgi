#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties()
{
	//__init();
}

ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::~ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::__init()
{
	//syncTranslationStateschedulingFormat = new ConfigNodePropertyString();
	//schedulingRepeatTranslationschedulingFormat = new ConfigNodePropertyString();
	//syncTranslationStatelockTimeoutInMinutes = new ConfigNodePropertyString();
	//exportformat = new ConfigNodePropertyDropDown();
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::__cleanup()
{
	//if(syncTranslationStateschedulingFormat != NULL) {
	//
	//delete syncTranslationStateschedulingFormat;
	//syncTranslationStateschedulingFormat = NULL;
	//}
	//if(schedulingRepeatTranslationschedulingFormat != NULL) {
	//
	//delete schedulingRepeatTranslationschedulingFormat;
	//schedulingRepeatTranslationschedulingFormat = NULL;
	//}
	//if(syncTranslationStatelockTimeoutInMinutes != NULL) {
	//
	//delete syncTranslationStatelockTimeoutInMinutes;
	//syncTranslationStatelockTimeoutInMinutes = NULL;
	//}
	//if(exportformat != NULL) {
	//
	//delete exportformat;
	//exportformat = NULL;
	//}
	//
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *syncTranslationStateschedulingFormatKey = "syncTranslationState.schedulingFormat";
	node = json_object_get_member(pJsonObject, syncTranslationStateschedulingFormatKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&syncTranslationStateschedulingFormat, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&syncTranslationStateschedulingFormat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *schedulingRepeatTranslationschedulingFormatKey = "schedulingRepeatTranslation.schedulingFormat";
	node = json_object_get_member(pJsonObject, schedulingRepeatTranslationschedulingFormatKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&schedulingRepeatTranslationschedulingFormat, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&schedulingRepeatTranslationschedulingFormat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *syncTranslationStatelockTimeoutInMinutesKey = "syncTranslationState.lockTimeoutInMinutes";
	node = json_object_get_member(pJsonObject, syncTranslationStatelockTimeoutInMinutesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&syncTranslationStatelockTimeoutInMinutes, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&syncTranslationStatelockTimeoutInMinutes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exportformatKey = "export.format";
	node = json_object_get_member(pJsonObject, exportformatKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&exportformat, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&exportformat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSyncTranslationStateschedulingFormat();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSyncTranslationStateschedulingFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *syncTranslationStateschedulingFormatKey = "syncTranslationState.schedulingFormat";
	json_object_set_member(pJsonObject, syncTranslationStateschedulingFormatKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSchedulingRepeatTranslationschedulingFormat();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSchedulingRepeatTranslationschedulingFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulingRepeatTranslationschedulingFormatKey = "schedulingRepeatTranslation.schedulingFormat";
	json_object_set_member(pJsonObject, schedulingRepeatTranslationschedulingFormatKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSyncTranslationStatelockTimeoutInMinutes();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSyncTranslationStatelockTimeoutInMinutes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *syncTranslationStatelockTimeoutInMinutesKey = "syncTranslationState.lockTimeoutInMinutes";
	json_object_set_member(pJsonObject, syncTranslationStatelockTimeoutInMinutesKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getExportformat();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getExportformat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exportformatKey = "export.format";
	json_object_set_member(pJsonObject, exportformatKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::getSyncTranslationStateschedulingFormat()
{
	return syncTranslationStateschedulingFormat;
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::setSyncTranslationStateschedulingFormat(ConfigNodePropertyString  syncTranslationStateschedulingFormat)
{
	this->syncTranslationStateschedulingFormat = syncTranslationStateschedulingFormat;
}

ConfigNodePropertyString
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::getSchedulingRepeatTranslationschedulingFormat()
{
	return schedulingRepeatTranslationschedulingFormat;
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::setSchedulingRepeatTranslationschedulingFormat(ConfigNodePropertyString  schedulingRepeatTranslationschedulingFormat)
{
	this->schedulingRepeatTranslationschedulingFormat = schedulingRepeatTranslationschedulingFormat;
}

ConfigNodePropertyString
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::getSyncTranslationStatelockTimeoutInMinutes()
{
	return syncTranslationStatelockTimeoutInMinutes;
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::setSyncTranslationStatelockTimeoutInMinutes(ConfigNodePropertyString  syncTranslationStatelockTimeoutInMinutes)
{
	this->syncTranslationStatelockTimeoutInMinutes = syncTranslationStatelockTimeoutInMinutes;
}

ConfigNodePropertyDropDown
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::getExportformat()
{
	return exportformat;
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::setExportformat(ConfigNodePropertyDropDown  exportformat)
{
	this->exportformat = exportformat;
}


