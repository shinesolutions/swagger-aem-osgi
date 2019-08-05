#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmMsmImplRolloutManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmMsmImplRolloutManagerImplProperties::ComDayCqWcmMsmImplRolloutManagerImplProperties()
{
	//__init();
}

ComDayCqWcmMsmImplRolloutManagerImplProperties::~ComDayCqWcmMsmImplRolloutManagerImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::__init()
{
	//eventfilter = new ConfigNodePropertyString();
	//rolloutmgrexcludedpropsdefault = new ConfigNodePropertyArray();
	//rolloutmgrexcludedparagraphpropsdefault = new ConfigNodePropertyArray();
	//rolloutmgrexcludednodetypesdefault = new ConfigNodePropertyArray();
	//rolloutmgrthreadpoolmaxsize = new ConfigNodePropertyInteger();
	//rolloutmgrthreadpoolmaxshutdowntime = new ConfigNodePropertyInteger();
	//rolloutmgrthreadpoolpriority = new ConfigNodePropertyDropDown();
	//rolloutmgrcommitsize = new ConfigNodePropertyInteger();
	//rolloutmgrconflicthandlingenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::__cleanup()
{
	//if(eventfilter != NULL) {
	//
	//delete eventfilter;
	//eventfilter = NULL;
	//}
	//if(rolloutmgrexcludedpropsdefault != NULL) {
	//
	//delete rolloutmgrexcludedpropsdefault;
	//rolloutmgrexcludedpropsdefault = NULL;
	//}
	//if(rolloutmgrexcludedparagraphpropsdefault != NULL) {
	//
	//delete rolloutmgrexcludedparagraphpropsdefault;
	//rolloutmgrexcludedparagraphpropsdefault = NULL;
	//}
	//if(rolloutmgrexcludednodetypesdefault != NULL) {
	//
	//delete rolloutmgrexcludednodetypesdefault;
	//rolloutmgrexcludednodetypesdefault = NULL;
	//}
	//if(rolloutmgrthreadpoolmaxsize != NULL) {
	//
	//delete rolloutmgrthreadpoolmaxsize;
	//rolloutmgrthreadpoolmaxsize = NULL;
	//}
	//if(rolloutmgrthreadpoolmaxshutdowntime != NULL) {
	//
	//delete rolloutmgrthreadpoolmaxshutdowntime;
	//rolloutmgrthreadpoolmaxshutdowntime = NULL;
	//}
	//if(rolloutmgrthreadpoolpriority != NULL) {
	//
	//delete rolloutmgrthreadpoolpriority;
	//rolloutmgrthreadpoolpriority = NULL;
	//}
	//if(rolloutmgrcommitsize != NULL) {
	//
	//delete rolloutmgrcommitsize;
	//rolloutmgrcommitsize = NULL;
	//}
	//if(rolloutmgrconflicthandlingenabled != NULL) {
	//
	//delete rolloutmgrconflicthandlingenabled;
	//rolloutmgrconflicthandlingenabled = NULL;
	//}
	//
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::fromJson(char* jsonStr)
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
	const gchar *rolloutmgrexcludedpropsdefaultKey = "rolloutmgr.excludedprops.default";
	node = json_object_get_member(pJsonObject, rolloutmgrexcludedpropsdefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&rolloutmgrexcludedpropsdefault, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&rolloutmgrexcludedpropsdefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rolloutmgrexcludedparagraphpropsdefaultKey = "rolloutmgr.excludedparagraphprops.default";
	node = json_object_get_member(pJsonObject, rolloutmgrexcludedparagraphpropsdefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&rolloutmgrexcludedparagraphpropsdefault, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&rolloutmgrexcludedparagraphpropsdefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rolloutmgrexcludednodetypesdefaultKey = "rolloutmgr.excludednodetypes.default";
	node = json_object_get_member(pJsonObject, rolloutmgrexcludednodetypesdefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&rolloutmgrexcludednodetypesdefault, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&rolloutmgrexcludednodetypesdefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rolloutmgrthreadpoolmaxsizeKey = "rolloutmgr.threadpool.maxsize";
	node = json_object_get_member(pJsonObject, rolloutmgrthreadpoolmaxsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&rolloutmgrthreadpoolmaxsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&rolloutmgrthreadpoolmaxsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rolloutmgrthreadpoolmaxshutdowntimeKey = "rolloutmgr.threadpool.maxshutdowntime";
	node = json_object_get_member(pJsonObject, rolloutmgrthreadpoolmaxshutdowntimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&rolloutmgrthreadpoolmaxshutdowntime, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&rolloutmgrthreadpoolmaxshutdowntime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rolloutmgrthreadpoolpriorityKey = "rolloutmgr.threadpool.priority";
	node = json_object_get_member(pJsonObject, rolloutmgrthreadpoolpriorityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&rolloutmgrthreadpoolpriority, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&rolloutmgrthreadpoolpriority);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rolloutmgrcommitsizeKey = "rolloutmgr.commit.size";
	node = json_object_get_member(pJsonObject, rolloutmgrcommitsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&rolloutmgrcommitsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&rolloutmgrcommitsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rolloutmgrconflicthandlingenabledKey = "rolloutmgr.conflicthandling.enabled";
	node = json_object_get_member(pJsonObject, rolloutmgrconflicthandlingenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&rolloutmgrconflicthandlingenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&rolloutmgrconflicthandlingenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmMsmImplRolloutManagerImplProperties::ComDayCqWcmMsmImplRolloutManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmMsmImplRolloutManagerImplProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getRolloutmgrexcludedpropsdefault();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getRolloutmgrexcludedpropsdefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rolloutmgrexcludedpropsdefaultKey = "rolloutmgr.excludedprops.default";
	json_object_set_member(pJsonObject, rolloutmgrexcludedpropsdefaultKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getRolloutmgrexcludedparagraphpropsdefault();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getRolloutmgrexcludedparagraphpropsdefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rolloutmgrexcludedparagraphpropsdefaultKey = "rolloutmgr.excludedparagraphprops.default";
	json_object_set_member(pJsonObject, rolloutmgrexcludedparagraphpropsdefaultKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getRolloutmgrexcludednodetypesdefault();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getRolloutmgrexcludednodetypesdefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rolloutmgrexcludednodetypesdefaultKey = "rolloutmgr.excludednodetypes.default";
	json_object_set_member(pJsonObject, rolloutmgrexcludednodetypesdefaultKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRolloutmgrthreadpoolmaxsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRolloutmgrthreadpoolmaxsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rolloutmgrthreadpoolmaxsizeKey = "rolloutmgr.threadpool.maxsize";
	json_object_set_member(pJsonObject, rolloutmgrthreadpoolmaxsizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRolloutmgrthreadpoolmaxshutdowntime();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRolloutmgrthreadpoolmaxshutdowntime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rolloutmgrthreadpoolmaxshutdowntimeKey = "rolloutmgr.threadpool.maxshutdowntime";
	json_object_set_member(pJsonObject, rolloutmgrthreadpoolmaxshutdowntimeKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getRolloutmgrthreadpoolpriority();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getRolloutmgrthreadpoolpriority());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rolloutmgrthreadpoolpriorityKey = "rolloutmgr.threadpool.priority";
	json_object_set_member(pJsonObject, rolloutmgrthreadpoolpriorityKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRolloutmgrcommitsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRolloutmgrcommitsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rolloutmgrcommitsizeKey = "rolloutmgr.commit.size";
	json_object_set_member(pJsonObject, rolloutmgrcommitsizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRolloutmgrconflicthandlingenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRolloutmgrconflicthandlingenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rolloutmgrconflicthandlingenabledKey = "rolloutmgr.conflicthandling.enabled";
	json_object_set_member(pJsonObject, rolloutmgrconflicthandlingenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmMsmImplRolloutManagerImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setEventfilter(ConfigNodePropertyString  eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrexcludedpropsdefault()
{
	return rolloutmgrexcludedpropsdefault;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrexcludedpropsdefault(ConfigNodePropertyArray  rolloutmgrexcludedpropsdefault)
{
	this->rolloutmgrexcludedpropsdefault = rolloutmgrexcludedpropsdefault;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrexcludedparagraphpropsdefault()
{
	return rolloutmgrexcludedparagraphpropsdefault;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrexcludedparagraphpropsdefault(ConfigNodePropertyArray  rolloutmgrexcludedparagraphpropsdefault)
{
	this->rolloutmgrexcludedparagraphpropsdefault = rolloutmgrexcludedparagraphpropsdefault;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrexcludednodetypesdefault()
{
	return rolloutmgrexcludednodetypesdefault;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrexcludednodetypesdefault(ConfigNodePropertyArray  rolloutmgrexcludednodetypesdefault)
{
	this->rolloutmgrexcludednodetypesdefault = rolloutmgrexcludednodetypesdefault;
}

ConfigNodePropertyInteger
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrthreadpoolmaxsize()
{
	return rolloutmgrthreadpoolmaxsize;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrthreadpoolmaxsize(ConfigNodePropertyInteger  rolloutmgrthreadpoolmaxsize)
{
	this->rolloutmgrthreadpoolmaxsize = rolloutmgrthreadpoolmaxsize;
}

ConfigNodePropertyInteger
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrthreadpoolmaxshutdowntime()
{
	return rolloutmgrthreadpoolmaxshutdowntime;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrthreadpoolmaxshutdowntime(ConfigNodePropertyInteger  rolloutmgrthreadpoolmaxshutdowntime)
{
	this->rolloutmgrthreadpoolmaxshutdowntime = rolloutmgrthreadpoolmaxshutdowntime;
}

ConfigNodePropertyDropDown
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrthreadpoolpriority()
{
	return rolloutmgrthreadpoolpriority;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrthreadpoolpriority(ConfigNodePropertyDropDown  rolloutmgrthreadpoolpriority)
{
	this->rolloutmgrthreadpoolpriority = rolloutmgrthreadpoolpriority;
}

ConfigNodePropertyInteger
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrcommitsize()
{
	return rolloutmgrcommitsize;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrcommitsize(ConfigNodePropertyInteger  rolloutmgrcommitsize)
{
	this->rolloutmgrcommitsize = rolloutmgrcommitsize;
}

ConfigNodePropertyBoolean
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrconflicthandlingenabled()
{
	return rolloutmgrconflicthandlingenabled;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrconflicthandlingenabled(ConfigNodePropertyBoolean  rolloutmgrconflicthandlingenabled)
{
	this->rolloutmgrconflicthandlingenabled = rolloutmgrconflicthandlingenabled;
}


