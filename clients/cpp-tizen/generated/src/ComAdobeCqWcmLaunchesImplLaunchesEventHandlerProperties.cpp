#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties()
{
	//__init();
}

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::~ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::__init()
{
	//eventfilter = new ConfigNodePropertyString();
	//launcheseventhandlerthreadpoolmaxsize = new ConfigNodePropertyInteger();
	//launcheseventhandlerthreadpoolpriority = new ConfigNodePropertyDropDown();
	//launcheseventhandlerupdatelastmodification = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::__cleanup()
{
	//if(eventfilter != NULL) {
	//
	//delete eventfilter;
	//eventfilter = NULL;
	//}
	//if(launcheseventhandlerthreadpoolmaxsize != NULL) {
	//
	//delete launcheseventhandlerthreadpoolmaxsize;
	//launcheseventhandlerthreadpoolmaxsize = NULL;
	//}
	//if(launcheseventhandlerthreadpoolpriority != NULL) {
	//
	//delete launcheseventhandlerthreadpoolpriority;
	//launcheseventhandlerthreadpoolpriority = NULL;
	//}
	//if(launcheseventhandlerupdatelastmodification != NULL) {
	//
	//delete launcheseventhandlerupdatelastmodification;
	//launcheseventhandlerupdatelastmodification = NULL;
	//}
	//
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eventfilterKey = "event.filter";
	node = json_object_get_member(pJsonObject, eventfilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&eventfilter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&eventfilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *launcheseventhandlerthreadpoolmaxsizeKey = "launches.eventhandler.threadpool.maxsize";
	node = json_object_get_member(pJsonObject, launcheseventhandlerthreadpoolmaxsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&launcheseventhandlerthreadpoolmaxsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&launcheseventhandlerthreadpoolmaxsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *launcheseventhandlerthreadpoolpriorityKey = "launches.eventhandler.threadpool.priority";
	node = json_object_get_member(pJsonObject, launcheseventhandlerthreadpoolpriorityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&launcheseventhandlerthreadpoolpriority, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&launcheseventhandlerthreadpoolpriority);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *launcheseventhandlerupdatelastmodificationKey = "launches.eventhandler.updatelastmodification";
	node = json_object_get_member(pJsonObject, launcheseventhandlerupdatelastmodificationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&launcheseventhandlerupdatelastmodification, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&launcheseventhandlerupdatelastmodification);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEventfilter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEventfilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventfilterKey = "event.filter";
	json_object_set_member(pJsonObject, eventfilterKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLauncheseventhandlerthreadpoolmaxsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLauncheseventhandlerthreadpoolmaxsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *launcheseventhandlerthreadpoolmaxsizeKey = "launches.eventhandler.threadpool.maxsize";
	json_object_set_member(pJsonObject, launcheseventhandlerthreadpoolmaxsizeKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getLauncheseventhandlerthreadpoolpriority();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getLauncheseventhandlerthreadpoolpriority());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *launcheseventhandlerthreadpoolpriorityKey = "launches.eventhandler.threadpool.priority";
	json_object_set_member(pJsonObject, launcheseventhandlerthreadpoolpriorityKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLauncheseventhandlerupdatelastmodification();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLauncheseventhandlerupdatelastmodification());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *launcheseventhandlerupdatelastmodificationKey = "launches.eventhandler.updatelastmodification";
	json_object_set_member(pJsonObject, launcheseventhandlerupdatelastmodificationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::setEventfilter(ConfigNodePropertyString  eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyInteger
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::getLauncheseventhandlerthreadpoolmaxsize()
{
	return launcheseventhandlerthreadpoolmaxsize;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::setLauncheseventhandlerthreadpoolmaxsize(ConfigNodePropertyInteger  launcheseventhandlerthreadpoolmaxsize)
{
	this->launcheseventhandlerthreadpoolmaxsize = launcheseventhandlerthreadpoolmaxsize;
}

ConfigNodePropertyDropDown
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::getLauncheseventhandlerthreadpoolpriority()
{
	return launcheseventhandlerthreadpoolpriority;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::setLauncheseventhandlerthreadpoolpriority(ConfigNodePropertyDropDown  launcheseventhandlerthreadpoolpriority)
{
	this->launcheseventhandlerthreadpoolpriority = launcheseventhandlerthreadpoolpriority;
}

ConfigNodePropertyBoolean
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::getLauncheseventhandlerupdatelastmodification()
{
	return launcheseventhandlerupdatelastmodification;
}

void
ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties::setLauncheseventhandlerupdatelastmodification(ConfigNodePropertyBoolean  launcheseventhandlerupdatelastmodification)
{
	this->launcheseventhandlerupdatelastmodification = launcheseventhandlerupdatelastmodification;
}


