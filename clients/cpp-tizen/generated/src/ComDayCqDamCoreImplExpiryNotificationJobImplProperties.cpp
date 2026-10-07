#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplExpiryNotificationJobImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplExpiryNotificationJobImplProperties::ComDayCqDamCoreImplExpiryNotificationJobImplProperties()
{
	//__init();
}

ComDayCqDamCoreImplExpiryNotificationJobImplProperties::~ComDayCqDamCoreImplExpiryNotificationJobImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::__init()
{
	//cqdamexpirynotificationscheduleristimebased = new ConfigNodePropertyBoolean();
	//cqdamexpirynotificationschedulertimebasedrule = new ConfigNodePropertyString();
	//cqdamexpirynotificationschedulerperiodrule = new ConfigNodePropertyInteger();
	//send_email = new ConfigNodePropertyBoolean();
	//asset_expired_limit = new ConfigNodePropertyInteger();
	//prior_notification_seconds = new ConfigNodePropertyInteger();
	//cqdamexpirynotificationurlprotocol = new ConfigNodePropertyString();
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::__cleanup()
{
	//if(cqdamexpirynotificationscheduleristimebased != NULL) {
	//
	//delete cqdamexpirynotificationscheduleristimebased;
	//cqdamexpirynotificationscheduleristimebased = NULL;
	//}
	//if(cqdamexpirynotificationschedulertimebasedrule != NULL) {
	//
	//delete cqdamexpirynotificationschedulertimebasedrule;
	//cqdamexpirynotificationschedulertimebasedrule = NULL;
	//}
	//if(cqdamexpirynotificationschedulerperiodrule != NULL) {
	//
	//delete cqdamexpirynotificationschedulerperiodrule;
	//cqdamexpirynotificationschedulerperiodrule = NULL;
	//}
	//if(send_email != NULL) {
	//
	//delete send_email;
	//send_email = NULL;
	//}
	//if(asset_expired_limit != NULL) {
	//
	//delete asset_expired_limit;
	//asset_expired_limit = NULL;
	//}
	//if(prior_notification_seconds != NULL) {
	//
	//delete prior_notification_seconds;
	//prior_notification_seconds = NULL;
	//}
	//if(cqdamexpirynotificationurlprotocol != NULL) {
	//
	//delete cqdamexpirynotificationurlprotocol;
	//cqdamexpirynotificationurlprotocol = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamexpirynotificationscheduleristimebasedKey = "cq.dam.expiry.notification.scheduler.istimebased";
	node = json_object_get_member(pJsonObject, cqdamexpirynotificationscheduleristimebasedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamexpirynotificationscheduleristimebased, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamexpirynotificationscheduleristimebased);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamexpirynotificationschedulertimebasedruleKey = "cq.dam.expiry.notification.scheduler.timebased.rule";
	node = json_object_get_member(pJsonObject, cqdamexpirynotificationschedulertimebasedruleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamexpirynotificationschedulertimebasedrule, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamexpirynotificationschedulertimebasedrule);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamexpirynotificationschedulerperiodruleKey = "cq.dam.expiry.notification.scheduler.period.rule";
	node = json_object_get_member(pJsonObject, cqdamexpirynotificationschedulerperiodruleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamexpirynotificationschedulerperiodrule, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamexpirynotificationschedulerperiodrule);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *send_emailKey = "send_email";
	node = json_object_get_member(pJsonObject, send_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&send_email, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&send_email);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *asset_expired_limitKey = "asset_expired_limit";
	node = json_object_get_member(pJsonObject, asset_expired_limitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&asset_expired_limit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&asset_expired_limit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *prior_notification_secondsKey = "prior_notification_seconds";
	node = json_object_get_member(pJsonObject, prior_notification_secondsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&prior_notification_seconds, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&prior_notification_seconds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamexpirynotificationurlprotocolKey = "cq.dam.expiry.notification.url.protocol";
	node = json_object_get_member(pJsonObject, cqdamexpirynotificationurlprotocolKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamexpirynotificationurlprotocol, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamexpirynotificationurlprotocol);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplExpiryNotificationJobImplProperties::ComDayCqDamCoreImplExpiryNotificationJobImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamexpirynotificationscheduleristimebased();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamexpirynotificationscheduleristimebased());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamexpirynotificationscheduleristimebasedKey = "cq.dam.expiry.notification.scheduler.istimebased";
	json_object_set_member(pJsonObject, cqdamexpirynotificationscheduleristimebasedKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamexpirynotificationschedulertimebasedrule();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamexpirynotificationschedulertimebasedrule());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamexpirynotificationschedulertimebasedruleKey = "cq.dam.expiry.notification.scheduler.timebased.rule";
	json_object_set_member(pJsonObject, cqdamexpirynotificationschedulertimebasedruleKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamexpirynotificationschedulerperiodrule();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamexpirynotificationschedulerperiodrule());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamexpirynotificationschedulerperiodruleKey = "cq.dam.expiry.notification.scheduler.period.rule";
	json_object_set_member(pJsonObject, cqdamexpirynotificationschedulerperiodruleKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSendEmail();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSendEmail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *send_emailKey = "send_email";
	json_object_set_member(pJsonObject, send_emailKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getAssetExpiredLimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getAssetExpiredLimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *asset_expired_limitKey = "asset_expired_limit";
	json_object_set_member(pJsonObject, asset_expired_limitKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPriorNotificationSeconds();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPriorNotificationSeconds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *prior_notification_secondsKey = "prior_notification_seconds";
	json_object_set_member(pJsonObject, prior_notification_secondsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamexpirynotificationurlprotocol();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamexpirynotificationurlprotocol());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamexpirynotificationurlprotocolKey = "cq.dam.expiry.notification.url.protocol";
	json_object_set_member(pJsonObject, cqdamexpirynotificationurlprotocolKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqdamexpirynotificationscheduleristimebased()
{
	return cqdamexpirynotificationscheduleristimebased;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqdamexpirynotificationscheduleristimebased(ConfigNodePropertyBoolean  cqdamexpirynotificationscheduleristimebased)
{
	this->cqdamexpirynotificationscheduleristimebased = cqdamexpirynotificationscheduleristimebased;
}

ConfigNodePropertyString
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqdamexpirynotificationschedulertimebasedrule()
{
	return cqdamexpirynotificationschedulertimebasedrule;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqdamexpirynotificationschedulertimebasedrule(ConfigNodePropertyString  cqdamexpirynotificationschedulertimebasedrule)
{
	this->cqdamexpirynotificationschedulertimebasedrule = cqdamexpirynotificationschedulertimebasedrule;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqdamexpirynotificationschedulerperiodrule()
{
	return cqdamexpirynotificationschedulerperiodrule;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqdamexpirynotificationschedulerperiodrule(ConfigNodePropertyInteger  cqdamexpirynotificationschedulerperiodrule)
{
	this->cqdamexpirynotificationschedulerperiodrule = cqdamexpirynotificationschedulerperiodrule;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getSendEmail()
{
	return send_email;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setSendEmail(ConfigNodePropertyBoolean  send_email)
{
	this->send_email = send_email;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getAssetExpiredLimit()
{
	return asset_expired_limit;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setAssetExpiredLimit(ConfigNodePropertyInteger  asset_expired_limit)
{
	this->asset_expired_limit = asset_expired_limit;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getPriorNotificationSeconds()
{
	return prior_notification_seconds;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setPriorNotificationSeconds(ConfigNodePropertyInteger  prior_notification_seconds)
{
	this->prior_notification_seconds = prior_notification_seconds;
}

ConfigNodePropertyString
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqdamexpirynotificationurlprotocol()
{
	return cqdamexpirynotificationurlprotocol;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqdamexpirynotificationurlprotocol(ConfigNodePropertyString  cqdamexpirynotificationurlprotocol)
{
	this->cqdamexpirynotificationurlprotocol = cqdamexpirynotificationurlprotocol;
}


