

#include "ComDayCqDamCoreImplExpiryNotificationJobImplProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplExpiryNotificationJobImplProperties::ComDayCqDamCoreImplExpiryNotificationJobImplProperties()
{
	cqdamexpirynotificationscheduleristimebased = ConfigNodePropertyBoolean();
	cqdamexpirynotificationschedulertimebasedrule = ConfigNodePropertyString();
	cqdamexpirynotificationschedulerperiodrule = ConfigNodePropertyInteger();
	send_email = ConfigNodePropertyBoolean();
	asset_expired_limit = ConfigNodePropertyInteger();
	prior_notification_seconds = ConfigNodePropertyInteger();
	cqdamexpirynotificationurlprotocol = ConfigNodePropertyString();
}

ComDayCqDamCoreImplExpiryNotificationJobImplProperties::ComDayCqDamCoreImplExpiryNotificationJobImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplExpiryNotificationJobImplProperties::~ComDayCqDamCoreImplExpiryNotificationJobImplProperties()
{

}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamexpirynotificationscheduleristimebasedKey = "cq.dam.expiry.notification.scheduler.istimebased";

    if(object.has_key(cqdamexpirynotificationscheduleristimebasedKey))
    {
        bourne::json value = object[cqdamexpirynotificationscheduleristimebasedKey];




        ConfigNodePropertyBoolean* obj = &cqdamexpirynotificationscheduleristimebased;
		obj->fromJson(value.dump());

    }

    const char *cqdamexpirynotificationschedulertimebasedruleKey = "cq.dam.expiry.notification.scheduler.timebased.rule";

    if(object.has_key(cqdamexpirynotificationschedulertimebasedruleKey))
    {
        bourne::json value = object[cqdamexpirynotificationschedulertimebasedruleKey];




        ConfigNodePropertyString* obj = &cqdamexpirynotificationschedulertimebasedrule;
		obj->fromJson(value.dump());

    }

    const char *cqdamexpirynotificationschedulerperiodruleKey = "cq.dam.expiry.notification.scheduler.period.rule";

    if(object.has_key(cqdamexpirynotificationschedulerperiodruleKey))
    {
        bourne::json value = object[cqdamexpirynotificationschedulerperiodruleKey];




        ConfigNodePropertyInteger* obj = &cqdamexpirynotificationschedulerperiodrule;
		obj->fromJson(value.dump());

    }

    const char *send_emailKey = "send_email";

    if(object.has_key(send_emailKey))
    {
        bourne::json value = object[send_emailKey];




        ConfigNodePropertyBoolean* obj = &send_email;
		obj->fromJson(value.dump());

    }

    const char *asset_expired_limitKey = "asset_expired_limit";

    if(object.has_key(asset_expired_limitKey))
    {
        bourne::json value = object[asset_expired_limitKey];




        ConfigNodePropertyInteger* obj = &asset_expired_limit;
		obj->fromJson(value.dump());

    }

    const char *prior_notification_secondsKey = "prior_notification_seconds";

    if(object.has_key(prior_notification_secondsKey))
    {
        bourne::json value = object[prior_notification_secondsKey];




        ConfigNodePropertyInteger* obj = &prior_notification_seconds;
		obj->fromJson(value.dump());

    }

    const char *cqdamexpirynotificationurlprotocolKey = "cq.dam.expiry.notification.url.protocol";

    if(object.has_key(cqdamexpirynotificationurlprotocolKey))
    {
        bourne::json value = object[cqdamexpirynotificationurlprotocolKey];




        ConfigNodePropertyString* obj = &cqdamexpirynotificationurlprotocol;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamexpirynotificationscheduleristimebased"] = getCqdamexpirynotificationscheduleristimebased().toJson();






	object["cqdamexpirynotificationschedulertimebasedrule"] = getCqdamexpirynotificationschedulertimebasedrule().toJson();






	object["cqdamexpirynotificationschedulerperiodrule"] = getCqdamexpirynotificationschedulerperiodrule().toJson();






	object["send_email"] = getSendEmail().toJson();






	object["asset_expired_limit"] = getAssetExpiredLimit().toJson();






	object["prior_notification_seconds"] = getPriorNotificationSeconds().toJson();






	object["cqdamexpirynotificationurlprotocol"] = getCqdamexpirynotificationurlprotocol().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqdamexpirynotificationscheduleristimebased()
{
	return cqdamexpirynotificationscheduleristimebased;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqdamexpirynotificationscheduleristimebased(ConfigNodePropertyBoolean cqdamexpirynotificationscheduleristimebased)
{
	this->cqdamexpirynotificationscheduleristimebased = cqdamexpirynotificationscheduleristimebased;
}

ConfigNodePropertyString
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqdamexpirynotificationschedulertimebasedrule()
{
	return cqdamexpirynotificationschedulertimebasedrule;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqdamexpirynotificationschedulertimebasedrule(ConfigNodePropertyString cqdamexpirynotificationschedulertimebasedrule)
{
	this->cqdamexpirynotificationschedulertimebasedrule = cqdamexpirynotificationschedulertimebasedrule;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqdamexpirynotificationschedulerperiodrule()
{
	return cqdamexpirynotificationschedulerperiodrule;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqdamexpirynotificationschedulerperiodrule(ConfigNodePropertyInteger cqdamexpirynotificationschedulerperiodrule)
{
	this->cqdamexpirynotificationschedulerperiodrule = cqdamexpirynotificationschedulerperiodrule;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getSendEmail()
{
	return send_email;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setSendEmail(ConfigNodePropertyBoolean send_email)
{
	this->send_email = send_email;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getAssetExpiredLimit()
{
	return asset_expired_limit;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setAssetExpiredLimit(ConfigNodePropertyInteger asset_expired_limit)
{
	this->asset_expired_limit = asset_expired_limit;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getPriorNotificationSeconds()
{
	return prior_notification_seconds;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setPriorNotificationSeconds(ConfigNodePropertyInteger prior_notification_seconds)
{
	this->prior_notification_seconds = prior_notification_seconds;
}

ConfigNodePropertyString
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::getCqdamexpirynotificationurlprotocol()
{
	return cqdamexpirynotificationurlprotocol;
}

void
ComDayCqDamCoreImplExpiryNotificationJobImplProperties::setCqdamexpirynotificationurlprotocol(ConfigNodePropertyString cqdamexpirynotificationurlprotocol)
{
	this->cqdamexpirynotificationurlprotocol = cqdamexpirynotificationurlprotocol;
}



