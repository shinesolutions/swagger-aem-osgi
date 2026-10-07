

#include "OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties()
{
	asyncConfigs = ConfigNodePropertyArray();
	leaseTimeOutMinutes = ConfigNodePropertyInteger();
	failingIndexTimeoutSeconds = ConfigNodePropertyInteger();
	errorWarnIntervalSeconds = ConfigNodePropertyInteger();
}

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::~OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties()
{

}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asyncConfigsKey = "asyncConfigs";

    if(object.has_key(asyncConfigsKey))
    {
        bourne::json value = object[asyncConfigsKey];




        ConfigNodePropertyArray* obj = &asyncConfigs;
		obj->fromJson(value.dump());

    }

    const char *leaseTimeOutMinutesKey = "leaseTimeOutMinutes";

    if(object.has_key(leaseTimeOutMinutesKey))
    {
        bourne::json value = object[leaseTimeOutMinutesKey];




        ConfigNodePropertyInteger* obj = &leaseTimeOutMinutes;
		obj->fromJson(value.dump());

    }

    const char *failingIndexTimeoutSecondsKey = "failingIndexTimeoutSeconds";

    if(object.has_key(failingIndexTimeoutSecondsKey))
    {
        bourne::json value = object[failingIndexTimeoutSecondsKey];




        ConfigNodePropertyInteger* obj = &failingIndexTimeoutSeconds;
		obj->fromJson(value.dump());

    }

    const char *errorWarnIntervalSecondsKey = "errorWarnIntervalSeconds";

    if(object.has_key(errorWarnIntervalSecondsKey))
    {
        bourne::json value = object[errorWarnIntervalSecondsKey];




        ConfigNodePropertyInteger* obj = &errorWarnIntervalSeconds;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["asyncConfigs"] = getAsyncConfigs().toJson();






	object["leaseTimeOutMinutes"] = getLeaseTimeOutMinutes().toJson();






	object["failingIndexTimeoutSeconds"] = getFailingIndexTimeoutSeconds().toJson();






	object["errorWarnIntervalSeconds"] = getErrorWarnIntervalSeconds().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getAsyncConfigs()
{
	return asyncConfigs;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setAsyncConfigs(ConfigNodePropertyArray asyncConfigs)
{
	this->asyncConfigs = asyncConfigs;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getLeaseTimeOutMinutes()
{
	return leaseTimeOutMinutes;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setLeaseTimeOutMinutes(ConfigNodePropertyInteger leaseTimeOutMinutes)
{
	this->leaseTimeOutMinutes = leaseTimeOutMinutes;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getFailingIndexTimeoutSeconds()
{
	return failingIndexTimeoutSeconds;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setFailingIndexTimeoutSeconds(ConfigNodePropertyInteger failingIndexTimeoutSeconds)
{
	this->failingIndexTimeoutSeconds = failingIndexTimeoutSeconds;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getErrorWarnIntervalSeconds()
{
	return errorWarnIntervalSeconds;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setErrorWarnIntervalSeconds(ConfigNodePropertyInteger errorWarnIntervalSeconds)
{
	this->errorWarnIntervalSeconds = errorWarnIntervalSeconds;
}



