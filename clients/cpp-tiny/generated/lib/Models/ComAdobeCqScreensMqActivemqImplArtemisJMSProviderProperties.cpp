

#include "ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.h"

using namespace Tiny;

ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	globalsize = ConfigNodePropertyInteger();
	maxdiskusage = ConfigNodePropertyInteger();
	persistenceenabled = ConfigNodePropertyBoolean();
	threadpoolmaxsize = ConfigNodePropertyInteger();
	scheduledthreadpoolmaxsize = ConfigNodePropertyInteger();
	gracefulshutdowntimeout = ConfigNodePropertyInteger();
	queues = ConfigNodePropertyArray();
	topics = ConfigNodePropertyArray();
	addressesmaxdeliveryattempts = ConfigNodePropertyInteger();
	addressesexpirydelay = ConfigNodePropertyInteger();
	addressesaddressfullmessagepolicy = ConfigNodePropertyDropDown();
	addressesmaxsizebytes = ConfigNodePropertyInteger();
	addressespagesizebytes = ConfigNodePropertyInteger();
	addressespagecachemaxsize = ConfigNodePropertyInteger();
	clusteruser = ConfigNodePropertyString();
	clusterpassword = ConfigNodePropertyString();
	clustercalltimeout = ConfigNodePropertyInteger();
	clustercallfailovertimeout = ConfigNodePropertyInteger();
	clusterclientfailurecheckperiod = ConfigNodePropertyInteger();
	clusternotificationattempts = ConfigNodePropertyInteger();
	clusternotificationinterval = ConfigNodePropertyInteger();
	idcachesize = ConfigNodePropertyInteger();
	clusterconfirmationwindowsize = ConfigNodePropertyInteger();
	clusterconnectionttl = ConfigNodePropertyInteger();
	clusterduplicatedetection = ConfigNodePropertyBoolean();
	clusterinitialconnectattempts = ConfigNodePropertyInteger();
	clustermaxretryinterval = ConfigNodePropertyInteger();
	clusterminlargemessagesize = ConfigNodePropertyInteger();
	clusterproducerwindowsize = ConfigNodePropertyInteger();
	clusterreconnectattempts = ConfigNodePropertyInteger();
	clusterretryinterval = ConfigNodePropertyInteger();
	clusterretryintervalmultiplier = ConfigNodePropertyFloat();
}

ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::~ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties()
{

}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *globalsizeKey = "global.size";

    if(object.has_key(globalsizeKey))
    {
        bourne::json value = object[globalsizeKey];




        ConfigNodePropertyInteger* obj = &globalsize;
		obj->fromJson(value.dump());

    }

    const char *maxdiskusageKey = "max.disk.usage";

    if(object.has_key(maxdiskusageKey))
    {
        bourne::json value = object[maxdiskusageKey];




        ConfigNodePropertyInteger* obj = &maxdiskusage;
		obj->fromJson(value.dump());

    }

    const char *persistenceenabledKey = "persistence.enabled";

    if(object.has_key(persistenceenabledKey))
    {
        bourne::json value = object[persistenceenabledKey];




        ConfigNodePropertyBoolean* obj = &persistenceenabled;
		obj->fromJson(value.dump());

    }

    const char *threadpoolmaxsizeKey = "thread.pool.max.size";

    if(object.has_key(threadpoolmaxsizeKey))
    {
        bourne::json value = object[threadpoolmaxsizeKey];




        ConfigNodePropertyInteger* obj = &threadpoolmaxsize;
		obj->fromJson(value.dump());

    }

    const char *scheduledthreadpoolmaxsizeKey = "scheduled.thread.pool.max.size";

    if(object.has_key(scheduledthreadpoolmaxsizeKey))
    {
        bourne::json value = object[scheduledthreadpoolmaxsizeKey];




        ConfigNodePropertyInteger* obj = &scheduledthreadpoolmaxsize;
		obj->fromJson(value.dump());

    }

    const char *gracefulshutdowntimeoutKey = "graceful.shutdown.timeout";

    if(object.has_key(gracefulshutdowntimeoutKey))
    {
        bourne::json value = object[gracefulshutdowntimeoutKey];




        ConfigNodePropertyInteger* obj = &gracefulshutdowntimeout;
		obj->fromJson(value.dump());

    }

    const char *queuesKey = "queues";

    if(object.has_key(queuesKey))
    {
        bourne::json value = object[queuesKey];




        ConfigNodePropertyArray* obj = &queues;
		obj->fromJson(value.dump());

    }

    const char *topicsKey = "topics";

    if(object.has_key(topicsKey))
    {
        bourne::json value = object[topicsKey];




        ConfigNodePropertyArray* obj = &topics;
		obj->fromJson(value.dump());

    }

    const char *addressesmaxdeliveryattemptsKey = "addresses.max.delivery.attempts";

    if(object.has_key(addressesmaxdeliveryattemptsKey))
    {
        bourne::json value = object[addressesmaxdeliveryattemptsKey];




        ConfigNodePropertyInteger* obj = &addressesmaxdeliveryattempts;
		obj->fromJson(value.dump());

    }

    const char *addressesexpirydelayKey = "addresses.expiry.delay";

    if(object.has_key(addressesexpirydelayKey))
    {
        bourne::json value = object[addressesexpirydelayKey];




        ConfigNodePropertyInteger* obj = &addressesexpirydelay;
		obj->fromJson(value.dump());

    }

    const char *addressesaddressfullmessagepolicyKey = "addresses.address.full.message.policy";

    if(object.has_key(addressesaddressfullmessagepolicyKey))
    {
        bourne::json value = object[addressesaddressfullmessagepolicyKey];




        ConfigNodePropertyDropDown* obj = &addressesaddressfullmessagepolicy;
		obj->fromJson(value.dump());

    }

    const char *addressesmaxsizebytesKey = "addresses.max.size.bytes";

    if(object.has_key(addressesmaxsizebytesKey))
    {
        bourne::json value = object[addressesmaxsizebytesKey];




        ConfigNodePropertyInteger* obj = &addressesmaxsizebytes;
		obj->fromJson(value.dump());

    }

    const char *addressespagesizebytesKey = "addresses.page.size.bytes";

    if(object.has_key(addressespagesizebytesKey))
    {
        bourne::json value = object[addressespagesizebytesKey];




        ConfigNodePropertyInteger* obj = &addressespagesizebytes;
		obj->fromJson(value.dump());

    }

    const char *addressespagecachemaxsizeKey = "addresses.page.cache.max.size";

    if(object.has_key(addressespagecachemaxsizeKey))
    {
        bourne::json value = object[addressespagecachemaxsizeKey];




        ConfigNodePropertyInteger* obj = &addressespagecachemaxsize;
		obj->fromJson(value.dump());

    }

    const char *clusteruserKey = "cluster.user";

    if(object.has_key(clusteruserKey))
    {
        bourne::json value = object[clusteruserKey];




        ConfigNodePropertyString* obj = &clusteruser;
		obj->fromJson(value.dump());

    }

    const char *clusterpasswordKey = "cluster.password";

    if(object.has_key(clusterpasswordKey))
    {
        bourne::json value = object[clusterpasswordKey];




        ConfigNodePropertyString* obj = &clusterpassword;
		obj->fromJson(value.dump());

    }

    const char *clustercalltimeoutKey = "cluster.call.timeout";

    if(object.has_key(clustercalltimeoutKey))
    {
        bourne::json value = object[clustercalltimeoutKey];




        ConfigNodePropertyInteger* obj = &clustercalltimeout;
		obj->fromJson(value.dump());

    }

    const char *clustercallfailovertimeoutKey = "cluster.call.failover.timeout";

    if(object.has_key(clustercallfailovertimeoutKey))
    {
        bourne::json value = object[clustercallfailovertimeoutKey];




        ConfigNodePropertyInteger* obj = &clustercallfailovertimeout;
		obj->fromJson(value.dump());

    }

    const char *clusterclientfailurecheckperiodKey = "cluster.client.failure.check.period";

    if(object.has_key(clusterclientfailurecheckperiodKey))
    {
        bourne::json value = object[clusterclientfailurecheckperiodKey];




        ConfigNodePropertyInteger* obj = &clusterclientfailurecheckperiod;
		obj->fromJson(value.dump());

    }

    const char *clusternotificationattemptsKey = "cluster.notification.attempts";

    if(object.has_key(clusternotificationattemptsKey))
    {
        bourne::json value = object[clusternotificationattemptsKey];




        ConfigNodePropertyInteger* obj = &clusternotificationattempts;
		obj->fromJson(value.dump());

    }

    const char *clusternotificationintervalKey = "cluster.notification.interval";

    if(object.has_key(clusternotificationintervalKey))
    {
        bourne::json value = object[clusternotificationintervalKey];




        ConfigNodePropertyInteger* obj = &clusternotificationinterval;
		obj->fromJson(value.dump());

    }

    const char *idcachesizeKey = "id.cache.size";

    if(object.has_key(idcachesizeKey))
    {
        bourne::json value = object[idcachesizeKey];




        ConfigNodePropertyInteger* obj = &idcachesize;
		obj->fromJson(value.dump());

    }

    const char *clusterconfirmationwindowsizeKey = "cluster.confirmation.window.size";

    if(object.has_key(clusterconfirmationwindowsizeKey))
    {
        bourne::json value = object[clusterconfirmationwindowsizeKey];




        ConfigNodePropertyInteger* obj = &clusterconfirmationwindowsize;
		obj->fromJson(value.dump());

    }

    const char *clusterconnectionttlKey = "cluster.connection.ttl";

    if(object.has_key(clusterconnectionttlKey))
    {
        bourne::json value = object[clusterconnectionttlKey];




        ConfigNodePropertyInteger* obj = &clusterconnectionttl;
		obj->fromJson(value.dump());

    }

    const char *clusterduplicatedetectionKey = "cluster.duplicate.detection";

    if(object.has_key(clusterduplicatedetectionKey))
    {
        bourne::json value = object[clusterduplicatedetectionKey];




        ConfigNodePropertyBoolean* obj = &clusterduplicatedetection;
		obj->fromJson(value.dump());

    }

    const char *clusterinitialconnectattemptsKey = "cluster.initial.connect.attempts";

    if(object.has_key(clusterinitialconnectattemptsKey))
    {
        bourne::json value = object[clusterinitialconnectattemptsKey];




        ConfigNodePropertyInteger* obj = &clusterinitialconnectattempts;
		obj->fromJson(value.dump());

    }

    const char *clustermaxretryintervalKey = "cluster.max.retry.interval";

    if(object.has_key(clustermaxretryintervalKey))
    {
        bourne::json value = object[clustermaxretryintervalKey];




        ConfigNodePropertyInteger* obj = &clustermaxretryinterval;
		obj->fromJson(value.dump());

    }

    const char *clusterminlargemessagesizeKey = "cluster.min.large.message.size";

    if(object.has_key(clusterminlargemessagesizeKey))
    {
        bourne::json value = object[clusterminlargemessagesizeKey];




        ConfigNodePropertyInteger* obj = &clusterminlargemessagesize;
		obj->fromJson(value.dump());

    }

    const char *clusterproducerwindowsizeKey = "cluster.producer.window.size";

    if(object.has_key(clusterproducerwindowsizeKey))
    {
        bourne::json value = object[clusterproducerwindowsizeKey];




        ConfigNodePropertyInteger* obj = &clusterproducerwindowsize;
		obj->fromJson(value.dump());

    }

    const char *clusterreconnectattemptsKey = "cluster.reconnect.attempts";

    if(object.has_key(clusterreconnectattemptsKey))
    {
        bourne::json value = object[clusterreconnectattemptsKey];




        ConfigNodePropertyInteger* obj = &clusterreconnectattempts;
		obj->fromJson(value.dump());

    }

    const char *clusterretryintervalKey = "cluster.retry.interval";

    if(object.has_key(clusterretryintervalKey))
    {
        bourne::json value = object[clusterretryintervalKey];




        ConfigNodePropertyInteger* obj = &clusterretryinterval;
		obj->fromJson(value.dump());

    }

    const char *clusterretryintervalmultiplierKey = "cluster.retry.interval.multiplier";

    if(object.has_key(clusterretryintervalmultiplierKey))
    {
        bourne::json value = object[clusterretryintervalmultiplierKey];




        ConfigNodePropertyFloat* obj = &clusterretryintervalmultiplier;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["globalsize"] = getGlobalsize().toJson();






	object["maxdiskusage"] = getMaxdiskusage().toJson();






	object["persistenceenabled"] = getPersistenceenabled().toJson();






	object["threadpoolmaxsize"] = getThreadpoolmaxsize().toJson();






	object["scheduledthreadpoolmaxsize"] = getScheduledthreadpoolmaxsize().toJson();






	object["gracefulshutdowntimeout"] = getGracefulshutdowntimeout().toJson();






	object["queues"] = getQueues().toJson();






	object["topics"] = getTopics().toJson();






	object["addressesmaxdeliveryattempts"] = getAddressesmaxdeliveryattempts().toJson();






	object["addressesexpirydelay"] = getAddressesexpirydelay().toJson();






	object["addressesaddressfullmessagepolicy"] = getAddressesaddressfullmessagepolicy().toJson();






	object["addressesmaxsizebytes"] = getAddressesmaxsizebytes().toJson();






	object["addressespagesizebytes"] = getAddressespagesizebytes().toJson();






	object["addressespagecachemaxsize"] = getAddressespagecachemaxsize().toJson();






	object["clusteruser"] = getClusteruser().toJson();






	object["clusterpassword"] = getClusterpassword().toJson();






	object["clustercalltimeout"] = getClustercalltimeout().toJson();






	object["clustercallfailovertimeout"] = getClustercallfailovertimeout().toJson();






	object["clusterclientfailurecheckperiod"] = getClusterclientfailurecheckperiod().toJson();






	object["clusternotificationattempts"] = getClusternotificationattempts().toJson();






	object["clusternotificationinterval"] = getClusternotificationinterval().toJson();






	object["idcachesize"] = getIdcachesize().toJson();






	object["clusterconfirmationwindowsize"] = getClusterconfirmationwindowsize().toJson();






	object["clusterconnectionttl"] = getClusterconnectionttl().toJson();






	object["clusterduplicatedetection"] = getClusterduplicatedetection().toJson();






	object["clusterinitialconnectattempts"] = getClusterinitialconnectattempts().toJson();






	object["clustermaxretryinterval"] = getClustermaxretryinterval().toJson();






	object["clusterminlargemessagesize"] = getClusterminlargemessagesize().toJson();






	object["clusterproducerwindowsize"] = getClusterproducerwindowsize().toJson();






	object["clusterreconnectattempts"] = getClusterreconnectattempts().toJson();






	object["clusterretryinterval"] = getClusterretryinterval().toJson();






	object["clusterretryintervalmultiplier"] = getClusterretryintervalmultiplier().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getGlobalsize()
{
	return globalsize;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setGlobalsize(ConfigNodePropertyInteger globalsize)
{
	this->globalsize = globalsize;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getMaxdiskusage()
{
	return maxdiskusage;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setMaxdiskusage(ConfigNodePropertyInteger maxdiskusage)
{
	this->maxdiskusage = maxdiskusage;
}

ConfigNodePropertyBoolean
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getPersistenceenabled()
{
	return persistenceenabled;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setPersistenceenabled(ConfigNodePropertyBoolean persistenceenabled)
{
	this->persistenceenabled = persistenceenabled;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getThreadpoolmaxsize()
{
	return threadpoolmaxsize;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setThreadpoolmaxsize(ConfigNodePropertyInteger threadpoolmaxsize)
{
	this->threadpoolmaxsize = threadpoolmaxsize;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getScheduledthreadpoolmaxsize()
{
	return scheduledthreadpoolmaxsize;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setScheduledthreadpoolmaxsize(ConfigNodePropertyInteger scheduledthreadpoolmaxsize)
{
	this->scheduledthreadpoolmaxsize = scheduledthreadpoolmaxsize;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getGracefulshutdowntimeout()
{
	return gracefulshutdowntimeout;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setGracefulshutdowntimeout(ConfigNodePropertyInteger gracefulshutdowntimeout)
{
	this->gracefulshutdowntimeout = gracefulshutdowntimeout;
}

ConfigNodePropertyArray
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getQueues()
{
	return queues;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setQueues(ConfigNodePropertyArray queues)
{
	this->queues = queues;
}

ConfigNodePropertyArray
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getTopics()
{
	return topics;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setTopics(ConfigNodePropertyArray topics)
{
	this->topics = topics;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesmaxdeliveryattempts()
{
	return addressesmaxdeliveryattempts;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesmaxdeliveryattempts(ConfigNodePropertyInteger addressesmaxdeliveryattempts)
{
	this->addressesmaxdeliveryattempts = addressesmaxdeliveryattempts;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesexpirydelay()
{
	return addressesexpirydelay;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesexpirydelay(ConfigNodePropertyInteger addressesexpirydelay)
{
	this->addressesexpirydelay = addressesexpirydelay;
}

ConfigNodePropertyDropDown
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesaddressfullmessagepolicy()
{
	return addressesaddressfullmessagepolicy;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesaddressfullmessagepolicy(ConfigNodePropertyDropDown addressesaddressfullmessagepolicy)
{
	this->addressesaddressfullmessagepolicy = addressesaddressfullmessagepolicy;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesmaxsizebytes()
{
	return addressesmaxsizebytes;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesmaxsizebytes(ConfigNodePropertyInteger addressesmaxsizebytes)
{
	this->addressesmaxsizebytes = addressesmaxsizebytes;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressespagesizebytes()
{
	return addressespagesizebytes;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressespagesizebytes(ConfigNodePropertyInteger addressespagesizebytes)
{
	this->addressespagesizebytes = addressespagesizebytes;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressespagecachemaxsize()
{
	return addressespagecachemaxsize;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressespagecachemaxsize(ConfigNodePropertyInteger addressespagecachemaxsize)
{
	this->addressespagecachemaxsize = addressespagecachemaxsize;
}

ConfigNodePropertyString
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusteruser()
{
	return clusteruser;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusteruser(ConfigNodePropertyString clusteruser)
{
	this->clusteruser = clusteruser;
}

ConfigNodePropertyString
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterpassword()
{
	return clusterpassword;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterpassword(ConfigNodePropertyString clusterpassword)
{
	this->clusterpassword = clusterpassword;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClustercalltimeout()
{
	return clustercalltimeout;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClustercalltimeout(ConfigNodePropertyInteger clustercalltimeout)
{
	this->clustercalltimeout = clustercalltimeout;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClustercallfailovertimeout()
{
	return clustercallfailovertimeout;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClustercallfailovertimeout(ConfigNodePropertyInteger clustercallfailovertimeout)
{
	this->clustercallfailovertimeout = clustercallfailovertimeout;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterclientfailurecheckperiod()
{
	return clusterclientfailurecheckperiod;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterclientfailurecheckperiod(ConfigNodePropertyInteger clusterclientfailurecheckperiod)
{
	this->clusterclientfailurecheckperiod = clusterclientfailurecheckperiod;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusternotificationattempts()
{
	return clusternotificationattempts;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusternotificationattempts(ConfigNodePropertyInteger clusternotificationattempts)
{
	this->clusternotificationattempts = clusternotificationattempts;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusternotificationinterval()
{
	return clusternotificationinterval;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusternotificationinterval(ConfigNodePropertyInteger clusternotificationinterval)
{
	this->clusternotificationinterval = clusternotificationinterval;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getIdcachesize()
{
	return idcachesize;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setIdcachesize(ConfigNodePropertyInteger idcachesize)
{
	this->idcachesize = idcachesize;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterconfirmationwindowsize()
{
	return clusterconfirmationwindowsize;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterconfirmationwindowsize(ConfigNodePropertyInteger clusterconfirmationwindowsize)
{
	this->clusterconfirmationwindowsize = clusterconfirmationwindowsize;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterconnectionttl()
{
	return clusterconnectionttl;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterconnectionttl(ConfigNodePropertyInteger clusterconnectionttl)
{
	this->clusterconnectionttl = clusterconnectionttl;
}

ConfigNodePropertyBoolean
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterduplicatedetection()
{
	return clusterduplicatedetection;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterduplicatedetection(ConfigNodePropertyBoolean clusterduplicatedetection)
{
	this->clusterduplicatedetection = clusterduplicatedetection;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterinitialconnectattempts()
{
	return clusterinitialconnectattempts;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterinitialconnectattempts(ConfigNodePropertyInteger clusterinitialconnectattempts)
{
	this->clusterinitialconnectattempts = clusterinitialconnectattempts;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClustermaxretryinterval()
{
	return clustermaxretryinterval;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClustermaxretryinterval(ConfigNodePropertyInteger clustermaxretryinterval)
{
	this->clustermaxretryinterval = clustermaxretryinterval;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterminlargemessagesize()
{
	return clusterminlargemessagesize;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterminlargemessagesize(ConfigNodePropertyInteger clusterminlargemessagesize)
{
	this->clusterminlargemessagesize = clusterminlargemessagesize;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterproducerwindowsize()
{
	return clusterproducerwindowsize;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterproducerwindowsize(ConfigNodePropertyInteger clusterproducerwindowsize)
{
	this->clusterproducerwindowsize = clusterproducerwindowsize;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterreconnectattempts()
{
	return clusterreconnectattempts;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterreconnectattempts(ConfigNodePropertyInteger clusterreconnectattempts)
{
	this->clusterreconnectattempts = clusterreconnectattempts;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterretryinterval()
{
	return clusterretryinterval;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterretryinterval(ConfigNodePropertyInteger clusterretryinterval)
{
	this->clusterretryinterval = clusterretryinterval;
}

ConfigNodePropertyFloat
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterretryintervalmultiplier()
{
	return clusterretryintervalmultiplier;
}

void
ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterretryintervalmultiplier(ConfigNodePropertyFloat clusterretryintervalmultiplier)
{
	this->clusterretryintervalmultiplier = clusterretryintervalmultiplier;
}



