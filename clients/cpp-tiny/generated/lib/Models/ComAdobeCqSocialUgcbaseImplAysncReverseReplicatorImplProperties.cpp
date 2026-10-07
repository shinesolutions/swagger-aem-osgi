

#include "ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties()
{
	poolSize = ConfigNodePropertyInteger();
	maxPoolSize = ConfigNodePropertyInteger();
	queueSize = ConfigNodePropertyInteger();
	keepAliveTime = ConfigNodePropertyInteger();
}

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::~ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties()
{

}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *poolSizeKey = "poolSize";

    if(object.has_key(poolSizeKey))
    {
        bourne::json value = object[poolSizeKey];




        ConfigNodePropertyInteger* obj = &poolSize;
		obj->fromJson(value.dump());

    }

    const char *maxPoolSizeKey = "maxPoolSize";

    if(object.has_key(maxPoolSizeKey))
    {
        bourne::json value = object[maxPoolSizeKey];




        ConfigNodePropertyInteger* obj = &maxPoolSize;
		obj->fromJson(value.dump());

    }

    const char *queueSizeKey = "queueSize";

    if(object.has_key(queueSizeKey))
    {
        bourne::json value = object[queueSizeKey];




        ConfigNodePropertyInteger* obj = &queueSize;
		obj->fromJson(value.dump());

    }

    const char *keepAliveTimeKey = "keepAliveTime";

    if(object.has_key(keepAliveTimeKey))
    {
        bourne::json value = object[keepAliveTimeKey];




        ConfigNodePropertyInteger* obj = &keepAliveTime;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["poolSize"] = getPoolSize().toJson();






	object["maxPoolSize"] = getMaxPoolSize().toJson();






	object["queueSize"] = getQueueSize().toJson();






	object["keepAliveTime"] = getKeepAliveTime().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::getPoolSize()
{
	return poolSize;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::setPoolSize(ConfigNodePropertyInteger poolSize)
{
	this->poolSize = poolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::getMaxPoolSize()
{
	return maxPoolSize;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize)
{
	this->maxPoolSize = maxPoolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::getQueueSize()
{
	return queueSize;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::setQueueSize(ConfigNodePropertyInteger queueSize)
{
	this->queueSize = queueSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::getKeepAliveTime()
{
	return keepAliveTime;
}

void
ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties::setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime)
{
	this->keepAliveTime = keepAliveTime;
}



