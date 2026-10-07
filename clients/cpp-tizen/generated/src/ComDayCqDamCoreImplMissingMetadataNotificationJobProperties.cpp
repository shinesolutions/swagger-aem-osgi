#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::ComDayCqDamCoreImplMissingMetadataNotificationJobProperties()
{
	//__init();
}

ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::~ComDayCqDamCoreImplMissingMetadataNotificationJobProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::__init()
{
	//cqdammissingmetadatanotificationscheduleristimebased = new ConfigNodePropertyBoolean();
	//cqdammissingmetadatanotificationschedulertimebasedrule = new ConfigNodePropertyString();
	//cqdammissingmetadatanotificationschedulerperiodrule = new ConfigNodePropertyInteger();
	//cqdammissingmetadatanotificationrecipient = new ConfigNodePropertyString();
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::__cleanup()
{
	//if(cqdammissingmetadatanotificationscheduleristimebased != NULL) {
	//
	//delete cqdammissingmetadatanotificationscheduleristimebased;
	//cqdammissingmetadatanotificationscheduleristimebased = NULL;
	//}
	//if(cqdammissingmetadatanotificationschedulertimebasedrule != NULL) {
	//
	//delete cqdammissingmetadatanotificationschedulertimebasedrule;
	//cqdammissingmetadatanotificationschedulertimebasedrule = NULL;
	//}
	//if(cqdammissingmetadatanotificationschedulerperiodrule != NULL) {
	//
	//delete cqdammissingmetadatanotificationschedulerperiodrule;
	//cqdammissingmetadatanotificationschedulerperiodrule = NULL;
	//}
	//if(cqdammissingmetadatanotificationrecipient != NULL) {
	//
	//delete cqdammissingmetadatanotificationrecipient;
	//cqdammissingmetadatanotificationrecipient = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdammissingmetadatanotificationscheduleristimebasedKey = "cq.dam.missingmetadata.notification.scheduler.istimebased";
	node = json_object_get_member(pJsonObject, cqdammissingmetadatanotificationscheduleristimebasedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdammissingmetadatanotificationscheduleristimebased, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdammissingmetadatanotificationscheduleristimebased);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdammissingmetadatanotificationschedulertimebasedruleKey = "cq.dam.missingmetadata.notification.scheduler.timebased.rule";
	node = json_object_get_member(pJsonObject, cqdammissingmetadatanotificationschedulertimebasedruleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdammissingmetadatanotificationschedulertimebasedrule, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdammissingmetadatanotificationschedulertimebasedrule);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdammissingmetadatanotificationschedulerperiodruleKey = "cq.dam.missingmetadata.notification.scheduler.period.rule";
	node = json_object_get_member(pJsonObject, cqdammissingmetadatanotificationschedulerperiodruleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdammissingmetadatanotificationschedulerperiodrule, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdammissingmetadatanotificationschedulerperiodrule);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdammissingmetadatanotificationrecipientKey = "cq.dam.missingmetadata.notification.recipient";
	node = json_object_get_member(pJsonObject, cqdammissingmetadatanotificationrecipientKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdammissingmetadatanotificationrecipient, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdammissingmetadatanotificationrecipient);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdammissingmetadatanotificationscheduleristimebased();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdammissingmetadatanotificationscheduleristimebased());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdammissingmetadatanotificationscheduleristimebasedKey = "cq.dam.missingmetadata.notification.scheduler.istimebased";
	json_object_set_member(pJsonObject, cqdammissingmetadatanotificationscheduleristimebasedKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdammissingmetadatanotificationschedulertimebasedrule();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdammissingmetadatanotificationschedulertimebasedrule());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdammissingmetadatanotificationschedulertimebasedruleKey = "cq.dam.missingmetadata.notification.scheduler.timebased.rule";
	json_object_set_member(pJsonObject, cqdammissingmetadatanotificationschedulertimebasedruleKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdammissingmetadatanotificationschedulerperiodrule();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdammissingmetadatanotificationschedulerperiodrule());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdammissingmetadatanotificationschedulerperiodruleKey = "cq.dam.missingmetadata.notification.scheduler.period.rule";
	json_object_set_member(pJsonObject, cqdammissingmetadatanotificationschedulerperiodruleKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdammissingmetadatanotificationrecipient();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdammissingmetadatanotificationrecipient());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdammissingmetadatanotificationrecipientKey = "cq.dam.missingmetadata.notification.recipient";
	json_object_set_member(pJsonObject, cqdammissingmetadatanotificationrecipientKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::getCqdammissingmetadatanotificationscheduleristimebased()
{
	return cqdammissingmetadatanotificationscheduleristimebased;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::setCqdammissingmetadatanotificationscheduleristimebased(ConfigNodePropertyBoolean  cqdammissingmetadatanotificationscheduleristimebased)
{
	this->cqdammissingmetadatanotificationscheduleristimebased = cqdammissingmetadatanotificationscheduleristimebased;
}

ConfigNodePropertyString
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::getCqdammissingmetadatanotificationschedulertimebasedrule()
{
	return cqdammissingmetadatanotificationschedulertimebasedrule;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::setCqdammissingmetadatanotificationschedulertimebasedrule(ConfigNodePropertyString  cqdammissingmetadatanotificationschedulertimebasedrule)
{
	this->cqdammissingmetadatanotificationschedulertimebasedrule = cqdammissingmetadatanotificationschedulertimebasedrule;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::getCqdammissingmetadatanotificationschedulerperiodrule()
{
	return cqdammissingmetadatanotificationschedulerperiodrule;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::setCqdammissingmetadatanotificationschedulerperiodrule(ConfigNodePropertyInteger  cqdammissingmetadatanotificationschedulerperiodrule)
{
	this->cqdammissingmetadatanotificationschedulerperiodrule = cqdammissingmetadatanotificationschedulerperiodrule;
}

ConfigNodePropertyString
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::getCqdammissingmetadatanotificationrecipient()
{
	return cqdammissingmetadatanotificationrecipient;
}

void
ComDayCqDamCoreImplMissingMetadataNotificationJobProperties::setCqdammissingmetadatanotificationrecipient(ConfigNodePropertyString  cqdammissingmetadatanotificationrecipient)
{
	this->cqdammissingmetadatanotificationrecipient = cqdammissingmetadatanotificationrecipient;
}


