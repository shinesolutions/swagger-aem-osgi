#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties()
{
	//__init();
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::~ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties()
{
	//__cleanup();
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::__init()
{
	//schedulerperiod = new ConfigNodePropertyInteger();
	//schedulerconcurrent = new ConfigNodePropertyBoolean();
	//good_link_test_interval = new ConfigNodePropertyInteger();
	//bad_link_test_interval = new ConfigNodePropertyInteger();
	//link_unused_interval = new ConfigNodePropertyInteger();
	//connectiontimeout = new ConfigNodePropertyInteger();
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::__cleanup()
{
	//if(schedulerperiod != NULL) {
	//
	//delete schedulerperiod;
	//schedulerperiod = NULL;
	//}
	//if(schedulerconcurrent != NULL) {
	//
	//delete schedulerconcurrent;
	//schedulerconcurrent = NULL;
	//}
	//if(good_link_test_interval != NULL) {
	//
	//delete good_link_test_interval;
	//good_link_test_interval = NULL;
	//}
	//if(bad_link_test_interval != NULL) {
	//
	//delete bad_link_test_interval;
	//bad_link_test_interval = NULL;
	//}
	//if(link_unused_interval != NULL) {
	//
	//delete link_unused_interval;
	//link_unused_interval = NULL;
	//}
	//if(connectiontimeout != NULL) {
	//
	//delete connectiontimeout;
	//connectiontimeout = NULL;
	//}
	//
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerperiodKey = "scheduler.period";
	node = json_object_get_member(pJsonObject, schedulerperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&schedulerperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&schedulerperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *schedulerconcurrentKey = "scheduler.concurrent";
	node = json_object_get_member(pJsonObject, schedulerconcurrentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&schedulerconcurrent, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&schedulerconcurrent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *good_link_test_intervalKey = "good_link_test_interval";
	node = json_object_get_member(pJsonObject, good_link_test_intervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&good_link_test_interval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&good_link_test_interval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bad_link_test_intervalKey = "bad_link_test_interval";
	node = json_object_get_member(pJsonObject, bad_link_test_intervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&bad_link_test_interval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&bad_link_test_interval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *link_unused_intervalKey = "link_unused_interval";
	node = json_object_get_member(pJsonObject, link_unused_intervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&link_unused_interval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&link_unused_interval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *connectiontimeoutKey = "connection.timeout";
	node = json_object_get_member(pJsonObject, connectiontimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&connectiontimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&connectiontimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSchedulerperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSchedulerperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerperiodKey = "scheduler.period";
	json_object_set_member(pJsonObject, schedulerperiodKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSchedulerconcurrent();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSchedulerconcurrent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerconcurrentKey = "scheduler.concurrent";
	json_object_set_member(pJsonObject, schedulerconcurrentKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getGoodLinkTestInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getGoodLinkTestInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *good_link_test_intervalKey = "good_link_test_interval";
	json_object_set_member(pJsonObject, good_link_test_intervalKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getBadLinkTestInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getBadLinkTestInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bad_link_test_intervalKey = "bad_link_test_interval";
	json_object_set_member(pJsonObject, bad_link_test_intervalKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLinkUnusedInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLinkUnusedInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *link_unused_intervalKey = "link_unused_interval";
	json_object_set_member(pJsonObject, link_unused_intervalKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConnectiontimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConnectiontimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connectiontimeoutKey = "connection.timeout";
	json_object_set_member(pJsonObject, connectiontimeoutKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setSchedulerperiod(ConfigNodePropertyInteger  schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getSchedulerconcurrent()
{
	return schedulerconcurrent;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setSchedulerconcurrent(ConfigNodePropertyBoolean  schedulerconcurrent)
{
	this->schedulerconcurrent = schedulerconcurrent;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getGoodLinkTestInterval()
{
	return good_link_test_interval;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setGoodLinkTestInterval(ConfigNodePropertyInteger  good_link_test_interval)
{
	this->good_link_test_interval = good_link_test_interval;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getBadLinkTestInterval()
{
	return bad_link_test_interval;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setBadLinkTestInterval(ConfigNodePropertyInteger  bad_link_test_interval)
{
	this->bad_link_test_interval = bad_link_test_interval;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getLinkUnusedInterval()
{
	return link_unused_interval;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setLinkUnusedInterval(ConfigNodePropertyInteger  link_unused_interval)
{
	this->link_unused_interval = link_unused_interval;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::getConnectiontimeout()
{
	return connectiontimeout;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties::setConnectiontimeout(ConfigNodePropertyInteger  connectiontimeout)
{
	this->connectiontimeout = connectiontimeout;
}


