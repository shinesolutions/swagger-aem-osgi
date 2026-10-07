

#include "OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties()
{
	orgapacheslinginstallerconfigurationpersist = ConfigNodePropertyBoolean();
	mode = ConfigNodePropertyDropDown();
	port = ConfigNodePropertyInteger();
	primaryhost = ConfigNodePropertyString();
	interval = ConfigNodePropertyInteger();
	primaryallowedclientipranges = ConfigNodePropertyArray();
	secure = ConfigNodePropertyBoolean();
	standbyreadtimeout = ConfigNodePropertyInteger();
	standbyautoclean = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::~OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties()
{

}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapacheslinginstallerconfigurationpersistKey = "org.apache.sling.installer.configuration.persist";

    if(object.has_key(orgapacheslinginstallerconfigurationpersistKey))
    {
        bourne::json value = object[orgapacheslinginstallerconfigurationpersistKey];




        ConfigNodePropertyBoolean* obj = &orgapacheslinginstallerconfigurationpersist;
		obj->fromJson(value.dump());

    }

    const char *modeKey = "mode";

    if(object.has_key(modeKey))
    {
        bourne::json value = object[modeKey];




        ConfigNodePropertyDropDown* obj = &mode;
		obj->fromJson(value.dump());

    }

    const char *portKey = "port";

    if(object.has_key(portKey))
    {
        bourne::json value = object[portKey];




        ConfigNodePropertyInteger* obj = &port;
		obj->fromJson(value.dump());

    }

    const char *primaryhostKey = "primary.host";

    if(object.has_key(primaryhostKey))
    {
        bourne::json value = object[primaryhostKey];




        ConfigNodePropertyString* obj = &primaryhost;
		obj->fromJson(value.dump());

    }

    const char *intervalKey = "interval";

    if(object.has_key(intervalKey))
    {
        bourne::json value = object[intervalKey];




        ConfigNodePropertyInteger* obj = &interval;
		obj->fromJson(value.dump());

    }

    const char *primaryallowedclientiprangesKey = "primary.allowed-client-ip-ranges";

    if(object.has_key(primaryallowedclientiprangesKey))
    {
        bourne::json value = object[primaryallowedclientiprangesKey];




        ConfigNodePropertyArray* obj = &primaryallowedclientipranges;
		obj->fromJson(value.dump());

    }

    const char *secureKey = "secure";

    if(object.has_key(secureKey))
    {
        bourne::json value = object[secureKey];




        ConfigNodePropertyBoolean* obj = &secure;
		obj->fromJson(value.dump());

    }

    const char *standbyreadtimeoutKey = "standby.readtimeout";

    if(object.has_key(standbyreadtimeoutKey))
    {
        bourne::json value = object[standbyreadtimeoutKey];




        ConfigNodePropertyInteger* obj = &standbyreadtimeout;
		obj->fromJson(value.dump());

    }

    const char *standbyautocleanKey = "standby.autoclean";

    if(object.has_key(standbyautocleanKey))
    {
        bourne::json value = object[standbyautocleanKey];




        ConfigNodePropertyBoolean* obj = &standbyautoclean;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapacheslinginstallerconfigurationpersist"] = getOrgapacheslinginstallerconfigurationpersist().toJson();






	object["mode"] = getMode().toJson();






	object["port"] = getPort().toJson();






	object["primaryhost"] = getPrimaryhost().toJson();






	object["interval"] = getInterval().toJson();






	object["primaryallowedclientipranges"] = getPrimaryallowedclientipranges().toJson();






	object["secure"] = getSecure().toJson();






	object["standbyreadtimeout"] = getStandbyreadtimeout().toJson();






	object["standbyautoclean"] = getStandbyautoclean().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getOrgapacheslinginstallerconfigurationpersist()
{
	return orgapacheslinginstallerconfigurationpersist;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setOrgapacheslinginstallerconfigurationpersist(ConfigNodePropertyBoolean orgapacheslinginstallerconfigurationpersist)
{
	this->orgapacheslinginstallerconfigurationpersist = orgapacheslinginstallerconfigurationpersist;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getMode()
{
	return mode;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setMode(ConfigNodePropertyDropDown mode)
{
	this->mode = mode;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getPort()
{
	return port;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setPort(ConfigNodePropertyInteger port)
{
	this->port = port;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getPrimaryhost()
{
	return primaryhost;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setPrimaryhost(ConfigNodePropertyString primaryhost)
{
	this->primaryhost = primaryhost;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getInterval()
{
	return interval;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setInterval(ConfigNodePropertyInteger interval)
{
	this->interval = interval;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getPrimaryallowedclientipranges()
{
	return primaryallowedclientipranges;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setPrimaryallowedclientipranges(ConfigNodePropertyArray primaryallowedclientipranges)
{
	this->primaryallowedclientipranges = primaryallowedclientipranges;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getSecure()
{
	return secure;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setSecure(ConfigNodePropertyBoolean secure)
{
	this->secure = secure;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getStandbyreadtimeout()
{
	return standbyreadtimeout;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setStandbyreadtimeout(ConfigNodePropertyInteger standbyreadtimeout)
{
	this->standbyreadtimeout = standbyreadtimeout;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getStandbyautoclean()
{
	return standbyautoclean;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setStandbyautoclean(ConfigNodePropertyBoolean standbyautoclean)
{
	this->standbyautoclean = standbyautoclean;
}



