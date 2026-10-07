#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamIdsImplIDSPoolManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamIdsImplIDSPoolManagerImplProperties::ComDayCqDamIdsImplIDSPoolManagerImplProperties()
{
	//__init();
}

ComDayCqDamIdsImplIDSPoolManagerImplProperties::~ComDayCqDamIdsImplIDSPoolManagerImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::__init()
{
	//maxerrorstoblacklist = new ConfigNodePropertyInteger();
	//retryintervaltowhitelist = new ConfigNodePropertyInteger();
	//connecttimeout = new ConfigNodePropertyInteger();
	//sockettimeout = new ConfigNodePropertyInteger();
	//processlabel = new ConfigNodePropertyString();
	//connectionusemax = new ConfigNodePropertyInteger();
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::__cleanup()
{
	//if(maxerrorstoblacklist != NULL) {
	//
	//delete maxerrorstoblacklist;
	//maxerrorstoblacklist = NULL;
	//}
	//if(retryintervaltowhitelist != NULL) {
	//
	//delete retryintervaltowhitelist;
	//retryintervaltowhitelist = NULL;
	//}
	//if(connecttimeout != NULL) {
	//
	//delete connecttimeout;
	//connecttimeout = NULL;
	//}
	//if(sockettimeout != NULL) {
	//
	//delete sockettimeout;
	//sockettimeout = NULL;
	//}
	//if(processlabel != NULL) {
	//
	//delete processlabel;
	//processlabel = NULL;
	//}
	//if(connectionusemax != NULL) {
	//
	//delete connectionusemax;
	//connectionusemax = NULL;
	//}
	//
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxerrorstoblacklistKey = "max.errors.to.blacklist";
	node = json_object_get_member(pJsonObject, maxerrorstoblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxerrorstoblacklist, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxerrorstoblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *retryintervaltowhitelistKey = "retry.interval.to.whitelist";
	node = json_object_get_member(pJsonObject, retryintervaltowhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&retryintervaltowhitelist, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&retryintervaltowhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *connecttimeoutKey = "connect.timeout";
	node = json_object_get_member(pJsonObject, connecttimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&connecttimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&connecttimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sockettimeoutKey = "socket.timeout";
	node = json_object_get_member(pJsonObject, sockettimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&sockettimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&sockettimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *processlabelKey = "process.label";
	node = json_object_get_member(pJsonObject, processlabelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&processlabel, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&processlabel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *connectionusemaxKey = "connection.use.max";
	node = json_object_get_member(pJsonObject, connectionusemaxKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&connectionusemax, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&connectionusemax);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamIdsImplIDSPoolManagerImplProperties::ComDayCqDamIdsImplIDSPoolManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamIdsImplIDSPoolManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxerrorstoblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxerrorstoblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxerrorstoblacklistKey = "max.errors.to.blacklist";
	json_object_set_member(pJsonObject, maxerrorstoblacklistKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRetryintervaltowhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRetryintervaltowhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *retryintervaltowhitelistKey = "retry.interval.to.whitelist";
	json_object_set_member(pJsonObject, retryintervaltowhitelistKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConnecttimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConnecttimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connecttimeoutKey = "connect.timeout";
	json_object_set_member(pJsonObject, connecttimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSockettimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSockettimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sockettimeoutKey = "socket.timeout";
	json_object_set_member(pJsonObject, sockettimeoutKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProcesslabel();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProcesslabel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *processlabelKey = "process.label";
	json_object_set_member(pJsonObject, processlabelKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConnectionusemax();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConnectionusemax());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connectionusemaxKey = "connection.use.max";
	json_object_set_member(pJsonObject, connectionusemaxKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getMaxerrorstoblacklist()
{
	return maxerrorstoblacklist;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setMaxerrorstoblacklist(ConfigNodePropertyInteger  maxerrorstoblacklist)
{
	this->maxerrorstoblacklist = maxerrorstoblacklist;
}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getRetryintervaltowhitelist()
{
	return retryintervaltowhitelist;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setRetryintervaltowhitelist(ConfigNodePropertyInteger  retryintervaltowhitelist)
{
	this->retryintervaltowhitelist = retryintervaltowhitelist;
}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getConnecttimeout()
{
	return connecttimeout;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setConnecttimeout(ConfigNodePropertyInteger  connecttimeout)
{
	this->connecttimeout = connecttimeout;
}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getSockettimeout()
{
	return sockettimeout;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setSockettimeout(ConfigNodePropertyInteger  sockettimeout)
{
	this->sockettimeout = sockettimeout;
}

ConfigNodePropertyString
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setProcesslabel(ConfigNodePropertyString  processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyInteger
ComDayCqDamIdsImplIDSPoolManagerImplProperties::getConnectionusemax()
{
	return connectionusemax;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplProperties::setConnectionusemax(ConfigNodePropertyInteger  connectionusemax)
{
	this->connectionusemax = connectionusemax;
}


