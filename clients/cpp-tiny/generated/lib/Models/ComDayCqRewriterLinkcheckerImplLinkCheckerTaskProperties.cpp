

#include "ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.h"

using namespace Tiny;

ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties()
{
	schedulerperiod = ConfigNodePropertyInteger();
	schedulerconcurrent = ConfigNodePropertyBoolean();
	good_link_test_interval = ConfigNodePropertyInteger();
	bad_link_test_interval = ConfigNodePropertyInteger();
	link_unused_interval = ConfigNodePropertyInteger();
	connectiontimeout = ConfigNodePropertyInteger();
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::~ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties()
{

}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerperiodKey = "scheduler.period";

    if(object.has_key(schedulerperiodKey))
    {
        bourne::json value = object[schedulerperiodKey];




        ConfigNodePropertyInteger* obj = &schedulerperiod;
		obj->fromJson(value.dump());

    }

    const char *schedulerconcurrentKey = "scheduler.concurrent";

    if(object.has_key(schedulerconcurrentKey))
    {
        bourne::json value = object[schedulerconcurrentKey];




        ConfigNodePropertyBoolean* obj = &schedulerconcurrent;
		obj->fromJson(value.dump());

    }

    const char *good_link_test_intervalKey = "good_link_test_interval";

    if(object.has_key(good_link_test_intervalKey))
    {
        bourne::json value = object[good_link_test_intervalKey];




        ConfigNodePropertyInteger* obj = &good_link_test_interval;
		obj->fromJson(value.dump());

    }

    const char *bad_link_test_intervalKey = "bad_link_test_interval";

    if(object.has_key(bad_link_test_intervalKey))
    {
        bourne::json value = object[bad_link_test_intervalKey];




        ConfigNodePropertyInteger* obj = &bad_link_test_interval;
		obj->fromJson(value.dump());

    }

    const char *link_unused_intervalKey = "link_unused_interval";

    if(object.has_key(link_unused_intervalKey))
    {
        bourne::json value = object[link_unused_intervalKey];




        ConfigNodePropertyInteger* obj = &link_unused_interval;
		obj->fromJson(value.dump());

    }

    const char *connectiontimeoutKey = "connection.timeout";

    if(object.has_key(connectiontimeoutKey))
    {
        bourne::json value = object[connectiontimeoutKey];




        ConfigNodePropertyInteger* obj = &connectiontimeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerperiod"] = getSchedulerperiod().toJson();






	object["schedulerconcurrent"] = getSchedulerconcurrent().toJson();






	object["good_link_test_interval"] = getGoodLinkTestInterval().toJson();






	object["bad_link_test_interval"] = getBadLinkTestInterval().toJson();






	object["link_unused_interval"] = getLinkUnusedInterval().toJson();






	object["connectiontimeout"] = getConnectiontimeout().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setSchedulerperiod(ConfigNodePropertyInteger schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getSchedulerconcurrent()
{
	return schedulerconcurrent;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setSchedulerconcurrent(ConfigNodePropertyBoolean schedulerconcurrent)
{
	this->schedulerconcurrent = schedulerconcurrent;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getGoodLinkTestInterval()
{
	return good_link_test_interval;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setGoodLinkTestInterval(ConfigNodePropertyInteger good_link_test_interval)
{
	this->good_link_test_interval = good_link_test_interval;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getBadLinkTestInterval()
{
	return bad_link_test_interval;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setBadLinkTestInterval(ConfigNodePropertyInteger bad_link_test_interval)
{
	this->bad_link_test_interval = bad_link_test_interval;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getLinkUnusedInterval()
{
	return link_unused_interval;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setLinkUnusedInterval(ConfigNodePropertyInteger link_unused_interval)
{
	this->link_unused_interval = link_unused_interval;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getConnectiontimeout()
{
	return connectiontimeout;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setConnectiontimeout(ConfigNodePropertyInteger connectiontimeout)
{
	this->connectiontimeout = connectiontimeout;
}



