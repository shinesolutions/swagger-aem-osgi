

#include "ComDayCqDamIdsImplIDSPoolManagerImplProperties.h"

using namespace Tiny;

ComDayCqDamIdsImplIDSPoolManagerImplProperties::ComDayCqDamIdsImplIDSPoolManagerImplProperties()
{
	maxerrorstoblacklist = ConfigNodePropertyInteger();
	retryintervaltowhitelist = ConfigNodePropertyInteger();
	connecttimeout = ConfigNodePropertyInteger();
	sockettimeout = ConfigNodePropertyInteger();
	processlabel = ConfigNodePropertyString();
	connectionusemax = ConfigNodePropertyInteger();
}

ComDayCqDamIdsImplIDSPoolManagerImplProperties::ComDayCqDamIdsImplIDSPoolManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamIdsImplIDSPoolManagerImplProperties::~ComDayCqDamIdsImplIDSPoolManagerImplProperties()
{

}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxerrorstoblacklistKey = "max.errors.to.blacklist";

    if(object.has_key(maxerrorstoblacklistKey))
    {
        bourne::json value = object[maxerrorstoblacklistKey];




        ConfigNodePropertyInteger* obj = &maxerrorstoblacklist;
		obj->fromJson(value.dump());

    }

    const char *retryintervaltowhitelistKey = "retry.interval.to.whitelist";

    if(object.has_key(retryintervaltowhitelistKey))
    {
        bourne::json value = object[retryintervaltowhitelistKey];




        ConfigNodePropertyInteger* obj = &retryintervaltowhitelist;
		obj->fromJson(value.dump());

    }

    const char *connecttimeoutKey = "connect.timeout";

    if(object.has_key(connecttimeoutKey))
    {
        bourne::json value = object[connecttimeoutKey];




        ConfigNodePropertyInteger* obj = &connecttimeout;
		obj->fromJson(value.dump());

    }

    const char *sockettimeoutKey = "socket.timeout";

    if(object.has_key(sockettimeoutKey))
    {
        bourne::json value = object[sockettimeoutKey];




        ConfigNodePropertyInteger* obj = &sockettimeout;
		obj->fromJson(value.dump());

    }

    const char *processlabelKey = "process.label";

    if(object.has_key(processlabelKey))
    {
        bourne::json value = object[processlabelKey];




        ConfigNodePropertyString* obj = &processlabel;
		obj->fromJson(value.dump());

    }

    const char *connectionusemaxKey = "connection.use.max";

    if(object.has_key(connectionusemaxKey))
    {
        bourne::json value = object[connectionusemaxKey];




        ConfigNodePropertyInteger* obj = &connectionusemax;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamIdsImplIDSPoolManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxerrorstoblacklist"] = getMaxerrorstoblacklist().toJson();






	object["retryintervaltowhitelist"] = getRetryintervaltowhitelist().toJson();






	object["connecttimeout"] = getConnecttimeout().toJson();






	object["sockettimeout"] = getSockettimeout().toJson();






	object["processlabel"] = getProcesslabel().toJson();






	object["connectionusemax"] = getConnectionusemax().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getMaxerrorstoblacklist()
{
	return maxerrorstoblacklist;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setMaxerrorstoblacklist(ConfigNodePropertyInteger maxerrorstoblacklist)
{
	this->maxerrorstoblacklist = maxerrorstoblacklist;
}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getRetryintervaltowhitelist()
{
	return retryintervaltowhitelist;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setRetryintervaltowhitelist(ConfigNodePropertyInteger retryintervaltowhitelist)
{
	this->retryintervaltowhitelist = retryintervaltowhitelist;
}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getConnecttimeout()
{
	return connecttimeout;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setConnecttimeout(ConfigNodePropertyInteger connecttimeout)
{
	this->connecttimeout = connecttimeout;
}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getSockettimeout()
{
	return sockettimeout;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setSockettimeout(ConfigNodePropertyInteger sockettimeout)
{
	this->sockettimeout = sockettimeout;
}

ConfigNodePropertyString
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setProcesslabel(ConfigNodePropertyString processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getConnectionusemax()
{
	return connectionusemax;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setConnectionusemax(ConfigNodePropertyInteger connectionusemax)
{
	this->connectionusemax = connectionusemax;
}



