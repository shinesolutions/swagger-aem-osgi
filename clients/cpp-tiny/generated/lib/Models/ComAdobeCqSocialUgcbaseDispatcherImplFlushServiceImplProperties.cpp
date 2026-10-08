

#include "ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties()
{
	threadPoolSize = ConfigNodePropertyInteger();
	delayTime = ConfigNodePropertyInteger();
	workerSleepTime = ConfigNodePropertyInteger();
}

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::~ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties()
{

}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *threadPoolSizeKey = "threadPoolSize";

    if(object.has_key(threadPoolSizeKey))
    {
        bourne::json value = object[threadPoolSizeKey];




        ConfigNodePropertyInteger* obj = &threadPoolSize;
		obj->fromJson(value.dump());

    }

    const char *delayTimeKey = "delayTime";

    if(object.has_key(delayTimeKey))
    {
        bourne::json value = object[delayTimeKey];




        ConfigNodePropertyInteger* obj = &delayTime;
		obj->fromJson(value.dump());

    }

    const char *workerSleepTimeKey = "workerSleepTime";

    if(object.has_key(workerSleepTimeKey))
    {
        bourne::json value = object[workerSleepTimeKey];




        ConfigNodePropertyInteger* obj = &workerSleepTime;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["threadPoolSize"] = getThreadPoolSize().toJson();






	object["delayTime"] = getDelayTime().toJson();






	object["workerSleepTime"] = getWorkerSleepTime().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::getThreadPoolSize()
{
	return threadPoolSize;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize)
{
	this->threadPoolSize = threadPoolSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::getDelayTime()
{
	return delayTime;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::setDelayTime(ConfigNodePropertyInteger delayTime)
{
	this->delayTime = delayTime;
}

ConfigNodePropertyInteger
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::getWorkerSleepTime()
{
	return workerSleepTime;
}

void
ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties::setWorkerSleepTime(ConfigNodePropertyInteger workerSleepTime)
{
	this->workerSleepTime = workerSleepTime;
}



