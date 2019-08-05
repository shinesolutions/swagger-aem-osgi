#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmUndoUndoConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmUndoUndoConfigProperties::ComDayCqWcmUndoUndoConfigProperties()
{
	//__init();
}

ComDayCqWcmUndoUndoConfigProperties::~ComDayCqWcmUndoUndoConfigProperties()
{
	//__cleanup();
}

void
ComDayCqWcmUndoUndoConfigProperties::__init()
{
	//cqwcmundoenabled = new ConfigNodePropertyBoolean();
	//cqwcmundopath = new ConfigNodePropertyString();
	//cqwcmundovalidity = new ConfigNodePropertyInteger();
	//cqwcmundosteps = new ConfigNodePropertyInteger();
	//cqwcmundopersistence = new ConfigNodePropertyString();
	//cqwcmundopersistencemode = new ConfigNodePropertyBoolean();
	//cqwcmundomarkermode = new ConfigNodePropertyString();
	//cqwcmundowhitelist = new ConfigNodePropertyArray();
	//cqwcmundoblacklist = new ConfigNodePropertyArray();
}

void
ComDayCqWcmUndoUndoConfigProperties::__cleanup()
{
	//if(cqwcmundoenabled != NULL) {
	//
	//delete cqwcmundoenabled;
	//cqwcmundoenabled = NULL;
	//}
	//if(cqwcmundopath != NULL) {
	//
	//delete cqwcmundopath;
	//cqwcmundopath = NULL;
	//}
	//if(cqwcmundovalidity != NULL) {
	//
	//delete cqwcmundovalidity;
	//cqwcmundovalidity = NULL;
	//}
	//if(cqwcmundosteps != NULL) {
	//
	//delete cqwcmundosteps;
	//cqwcmundosteps = NULL;
	//}
	//if(cqwcmundopersistence != NULL) {
	//
	//delete cqwcmundopersistence;
	//cqwcmundopersistence = NULL;
	//}
	//if(cqwcmundopersistencemode != NULL) {
	//
	//delete cqwcmundopersistencemode;
	//cqwcmundopersistencemode = NULL;
	//}
	//if(cqwcmundomarkermode != NULL) {
	//
	//delete cqwcmundomarkermode;
	//cqwcmundomarkermode = NULL;
	//}
	//if(cqwcmundowhitelist != NULL) {
	//
	//delete cqwcmundowhitelist;
	//cqwcmundowhitelist = NULL;
	//}
	//if(cqwcmundoblacklist != NULL) {
	//
	//delete cqwcmundoblacklist;
	//cqwcmundoblacklist = NULL;
	//}
	//
}

void
ComDayCqWcmUndoUndoConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqwcmundoenabledKey = "cq.wcm.undo.enabled";
	node = json_object_get_member(pJsonObject, cqwcmundoenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqwcmundoenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqwcmundoenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmundopathKey = "cq.wcm.undo.path";
	node = json_object_get_member(pJsonObject, cqwcmundopathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqwcmundopath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqwcmundopath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmundovalidityKey = "cq.wcm.undo.validity";
	node = json_object_get_member(pJsonObject, cqwcmundovalidityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqwcmundovalidity, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqwcmundovalidity);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmundostepsKey = "cq.wcm.undo.steps";
	node = json_object_get_member(pJsonObject, cqwcmundostepsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqwcmundosteps, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqwcmundosteps);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmundopersistenceKey = "cq.wcm.undo.persistence";
	node = json_object_get_member(pJsonObject, cqwcmundopersistenceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqwcmundopersistence, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqwcmundopersistence);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmundopersistencemodeKey = "cq.wcm.undo.persistence.mode";
	node = json_object_get_member(pJsonObject, cqwcmundopersistencemodeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqwcmundopersistencemode, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqwcmundopersistencemode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmundomarkermodeKey = "cq.wcm.undo.markermode";
	node = json_object_get_member(pJsonObject, cqwcmundomarkermodeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqwcmundomarkermode, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqwcmundomarkermode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmundowhitelistKey = "cq.wcm.undo.whitelist";
	node = json_object_get_member(pJsonObject, cqwcmundowhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqwcmundowhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqwcmundowhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmundoblacklistKey = "cq.wcm.undo.blacklist";
	node = json_object_get_member(pJsonObject, cqwcmundoblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqwcmundoblacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqwcmundoblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmUndoUndoConfigProperties::ComDayCqWcmUndoUndoConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmUndoUndoConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqwcmundoenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqwcmundoenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmundoenabledKey = "cq.wcm.undo.enabled";
	json_object_set_member(pJsonObject, cqwcmundoenabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqwcmundopath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqwcmundopath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmundopathKey = "cq.wcm.undo.path";
	json_object_set_member(pJsonObject, cqwcmundopathKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqwcmundovalidity();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqwcmundovalidity());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmundovalidityKey = "cq.wcm.undo.validity";
	json_object_set_member(pJsonObject, cqwcmundovalidityKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqwcmundosteps();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqwcmundosteps());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmundostepsKey = "cq.wcm.undo.steps";
	json_object_set_member(pJsonObject, cqwcmundostepsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqwcmundopersistence();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqwcmundopersistence());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmundopersistenceKey = "cq.wcm.undo.persistence";
	json_object_set_member(pJsonObject, cqwcmundopersistenceKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqwcmundopersistencemode();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqwcmundopersistencemode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmundopersistencemodeKey = "cq.wcm.undo.persistence.mode";
	json_object_set_member(pJsonObject, cqwcmundopersistencemodeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqwcmundomarkermode();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqwcmundomarkermode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmundomarkermodeKey = "cq.wcm.undo.markermode";
	json_object_set_member(pJsonObject, cqwcmundomarkermodeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqwcmundowhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqwcmundowhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmundowhitelistKey = "cq.wcm.undo.whitelist";
	json_object_set_member(pJsonObject, cqwcmundowhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqwcmundoblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqwcmundoblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmundoblacklistKey = "cq.wcm.undo.blacklist";
	json_object_set_member(pJsonObject, cqwcmundoblacklistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundoenabled()
{
	return cqwcmundoenabled;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundoenabled(ConfigNodePropertyBoolean  cqwcmundoenabled)
{
	this->cqwcmundoenabled = cqwcmundoenabled;
}

ConfigNodePropertyString
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundopath()
{
	return cqwcmundopath;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundopath(ConfigNodePropertyString  cqwcmundopath)
{
	this->cqwcmundopath = cqwcmundopath;
}

ConfigNodePropertyInteger
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundovalidity()
{
	return cqwcmundovalidity;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundovalidity(ConfigNodePropertyInteger  cqwcmundovalidity)
{
	this->cqwcmundovalidity = cqwcmundovalidity;
}

ConfigNodePropertyInteger
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundosteps()
{
	return cqwcmundosteps;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundosteps(ConfigNodePropertyInteger  cqwcmundosteps)
{
	this->cqwcmundosteps = cqwcmundosteps;
}

ConfigNodePropertyString
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundopersistence()
{
	return cqwcmundopersistence;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundopersistence(ConfigNodePropertyString  cqwcmundopersistence)
{
	this->cqwcmundopersistence = cqwcmundopersistence;
}

ConfigNodePropertyBoolean
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundopersistencemode()
{
	return cqwcmundopersistencemode;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundopersistencemode(ConfigNodePropertyBoolean  cqwcmundopersistencemode)
{
	this->cqwcmundopersistencemode = cqwcmundopersistencemode;
}

ConfigNodePropertyString
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundomarkermode()
{
	return cqwcmundomarkermode;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundomarkermode(ConfigNodePropertyString  cqwcmundomarkermode)
{
	this->cqwcmundomarkermode = cqwcmundomarkermode;
}

ConfigNodePropertyArray
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundowhitelist()
{
	return cqwcmundowhitelist;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundowhitelist(ConfigNodePropertyArray  cqwcmundowhitelist)
{
	this->cqwcmundowhitelist = cqwcmundowhitelist;
}

ConfigNodePropertyArray
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundoblacklist()
{
	return cqwcmundoblacklist;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundoblacklist(ConfigNodePropertyArray  cqwcmundoblacklist)
{
	this->cqwcmundoblacklist = cqwcmundoblacklist;
}


