

#include "ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.h"

using namespace Tiny;

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties()
{
	eventfilter = ConfigNodePropertyString();
	launcheseventhandlerthreadpoolmaxsize = ConfigNodePropertyInteger();
	launcheseventhandlerthreadpoolpriority = ConfigNodePropertyDropDown();
	launcheseventhandlerupdatelastmodification = ConfigNodePropertyBoolean();
}

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::~ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties()
{

}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventfilterKey = "event.filter";

    if(object.has_key(eventfilterKey))
    {
        bourne::json value = object[eventfilterKey];




        ConfigNodePropertyString* obj = &eventfilter;
		obj->fromJson(value.dump());

    }

    const char *launcheseventhandlerthreadpoolmaxsizeKey = "launches.eventhandler.threadpool.maxsize";

    if(object.has_key(launcheseventhandlerthreadpoolmaxsizeKey))
    {
        bourne::json value = object[launcheseventhandlerthreadpoolmaxsizeKey];




        ConfigNodePropertyInteger* obj = &launcheseventhandlerthreadpoolmaxsize;
		obj->fromJson(value.dump());

    }

    const char *launcheseventhandlerthreadpoolpriorityKey = "launches.eventhandler.threadpool.priority";

    if(object.has_key(launcheseventhandlerthreadpoolpriorityKey))
    {
        bourne::json value = object[launcheseventhandlerthreadpoolpriorityKey];




        ConfigNodePropertyDropDown* obj = &launcheseventhandlerthreadpoolpriority;
		obj->fromJson(value.dump());

    }

    const char *launcheseventhandlerupdatelastmodificationKey = "launches.eventhandler.updatelastmodification";

    if(object.has_key(launcheseventhandlerupdatelastmodificationKey))
    {
        bourne::json value = object[launcheseventhandlerupdatelastmodificationKey];




        ConfigNodePropertyBoolean* obj = &launcheseventhandlerupdatelastmodification;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventfilter"] = getEventfilter().toJson();






	object["launcheseventhandlerthreadpoolmaxsize"] = getLauncheseventhandlerthreadpoolmaxsize().toJson();






	object["launcheseventhandlerthreadpoolpriority"] = getLauncheseventhandlerthreadpoolpriority().toJson();






	object["launcheseventhandlerupdatelastmodification"] = getLauncheseventhandlerupdatelastmodification().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyInteger
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::getLauncheseventhandlerthreadpoolmaxsize()
{
	return launcheseventhandlerthreadpoolmaxsize;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::setLauncheseventhandlerthreadpoolmaxsize(ConfigNodePropertyInteger launcheseventhandlerthreadpoolmaxsize)
{
	this->launcheseventhandlerthreadpoolmaxsize = launcheseventhandlerthreadpoolmaxsize;
}

ConfigNodePropertyDropDown
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::getLauncheseventhandlerthreadpoolpriority()
{
	return launcheseventhandlerthreadpoolpriority;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::setLauncheseventhandlerthreadpoolpriority(ConfigNodePropertyDropDown launcheseventhandlerthreadpoolpriority)
{
	this->launcheseventhandlerthreadpoolpriority = launcheseventhandlerthreadpoolpriority;
}

ConfigNodePropertyBoolean
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::getLauncheseventhandlerupdatelastmodification()
{
	return launcheseventhandlerupdatelastmodification;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::setLauncheseventhandlerupdatelastmodification(ConfigNodePropertyBoolean launcheseventhandlerupdatelastmodification)
{
	this->launcheseventhandlerupdatelastmodification = launcheseventhandlerupdatelastmodification;
}



