#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::~OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::__init()
{
	//orgapacheslinginstallerconfigurationpersist = new ConfigNodePropertyBoolean();
	//mode = new ConfigNodePropertyDropDown();
	//port = new ConfigNodePropertyInteger();
	//primaryhost = new ConfigNodePropertyString();
	//interval = new ConfigNodePropertyInteger();
	//primaryallowedclientipranges = new ConfigNodePropertyArray();
	//secure = new ConfigNodePropertyBoolean();
	//standbyreadtimeout = new ConfigNodePropertyInteger();
	//standbyautoclean = new ConfigNodePropertyBoolean();
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::__cleanup()
{
	//if(orgapacheslinginstallerconfigurationpersist != NULL) {
	//
	//delete orgapacheslinginstallerconfigurationpersist;
	//orgapacheslinginstallerconfigurationpersist = NULL;
	//}
	//if(mode != NULL) {
	//
	//delete mode;
	//mode = NULL;
	//}
	//if(port != NULL) {
	//
	//delete port;
	//port = NULL;
	//}
	//if(primaryhost != NULL) {
	//
	//delete primaryhost;
	//primaryhost = NULL;
	//}
	//if(interval != NULL) {
	//
	//delete interval;
	//interval = NULL;
	//}
	//if(primaryallowedclientipranges != NULL) {
	//
	//delete primaryallowedclientipranges;
	//primaryallowedclientipranges = NULL;
	//}
	//if(secure != NULL) {
	//
	//delete secure;
	//secure = NULL;
	//}
	//if(standbyreadtimeout != NULL) {
	//
	//delete standbyreadtimeout;
	//standbyreadtimeout = NULL;
	//}
	//if(standbyautoclean != NULL) {
	//
	//delete standbyautoclean;
	//standbyautoclean = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapacheslinginstallerconfigurationpersistKey = "org.apache.sling.installer.configuration.persist";
	node = json_object_get_member(pJsonObject, orgapacheslinginstallerconfigurationpersistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&orgapacheslinginstallerconfigurationpersist, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&orgapacheslinginstallerconfigurationpersist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *modeKey = "mode";
	node = json_object_get_member(pJsonObject, modeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&mode, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&mode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *portKey = "port";
	node = json_object_get_member(pJsonObject, portKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&port, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&port);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *primaryhostKey = "primary.host";
	node = json_object_get_member(pJsonObject, primaryhostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&primaryhost, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&primaryhost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *intervalKey = "interval";
	node = json_object_get_member(pJsonObject, intervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&interval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&interval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *primaryallowedclientiprangesKey = "primary.allowed-client-ip-ranges";
	node = json_object_get_member(pJsonObject, primaryallowedclientiprangesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&primaryallowedclientipranges, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&primaryallowedclientipranges);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *secureKey = "secure";
	node = json_object_get_member(pJsonObject, secureKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&secure, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&secure);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *standbyreadtimeoutKey = "standby.readtimeout";
	node = json_object_get_member(pJsonObject, standbyreadtimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&standbyreadtimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&standbyreadtimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *standbyautocleanKey = "standby.autoclean";
	node = json_object_get_member(pJsonObject, standbyautocleanKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&standbyautoclean, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&standbyautoclean);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOrgapacheslinginstallerconfigurationpersist();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOrgapacheslinginstallerconfigurationpersist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslinginstallerconfigurationpersistKey = "org.apache.sling.installer.configuration.persist";
	json_object_set_member(pJsonObject, orgapacheslinginstallerconfigurationpersistKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getMode();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getMode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modeKey = "mode";
	json_object_set_member(pJsonObject, modeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPort();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPort());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *portKey = "port";
	json_object_set_member(pJsonObject, portKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPrimaryhost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPrimaryhost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *primaryhostKey = "primary.host";
	json_object_set_member(pJsonObject, primaryhostKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *intervalKey = "interval";
	json_object_set_member(pJsonObject, intervalKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPrimaryallowedclientipranges();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPrimaryallowedclientipranges());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *primaryallowedclientiprangesKey = "primary.allowed-client-ip-ranges";
	json_object_set_member(pJsonObject, primaryallowedclientiprangesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSecure();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSecure());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *secureKey = "secure";
	json_object_set_member(pJsonObject, secureKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getStandbyreadtimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getStandbyreadtimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *standbyreadtimeoutKey = "standby.readtimeout";
	json_object_set_member(pJsonObject, standbyreadtimeoutKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getStandbyautoclean();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getStandbyautoclean());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *standbyautocleanKey = "standby.autoclean";
	json_object_set_member(pJsonObject, standbyautocleanKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getOrgapacheslinginstallerconfigurationpersist()
{
	return orgapacheslinginstallerconfigurationpersist;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setOrgapacheslinginstallerconfigurationpersist(ConfigNodePropertyBoolean  orgapacheslinginstallerconfigurationpersist)
{
	this->orgapacheslinginstallerconfigurationpersist = orgapacheslinginstallerconfigurationpersist;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getMode()
{
	return mode;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setMode(ConfigNodePropertyDropDown  mode)
{
	this->mode = mode;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getPort()
{
	return port;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setPort(ConfigNodePropertyInteger  port)
{
	this->port = port;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getPrimaryhost()
{
	return primaryhost;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setPrimaryhost(ConfigNodePropertyString  primaryhost)
{
	this->primaryhost = primaryhost;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getInterval()
{
	return interval;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setInterval(ConfigNodePropertyInteger  interval)
{
	this->interval = interval;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getPrimaryallowedclientipranges()
{
	return primaryallowedclientipranges;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setPrimaryallowedclientipranges(ConfigNodePropertyArray  primaryallowedclientipranges)
{
	this->primaryallowedclientipranges = primaryallowedclientipranges;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getSecure()
{
	return secure;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setSecure(ConfigNodePropertyBoolean  secure)
{
	this->secure = secure;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getStandbyreadtimeout()
{
	return standbyreadtimeout;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setStandbyreadtimeout(ConfigNodePropertyInteger  standbyreadtimeout)
{
	this->standbyreadtimeout = standbyreadtimeout;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::getStandbyautoclean()
{
	return standbyautoclean;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties::setStandbyautoclean(ConfigNodePropertyBoolean  standbyautoclean)
{
	this->standbyautoclean = standbyautoclean;
}


