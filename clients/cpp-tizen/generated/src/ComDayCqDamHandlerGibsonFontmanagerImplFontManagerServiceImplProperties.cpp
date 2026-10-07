#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties()
{
	//__init();
}

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::~ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::__init()
{
	//eventfilter = new ConfigNodePropertyString();
	//fontmgrsystemfontdir = new ConfigNodePropertyArray();
	//fontmgradobefontdir = new ConfigNodePropertyString();
	//fontmgrcustomerfontdir = new ConfigNodePropertyString();
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::__cleanup()
{
	//if(eventfilter != NULL) {
	//
	//delete eventfilter;
	//eventfilter = NULL;
	//}
	//if(fontmgrsystemfontdir != NULL) {
	//
	//delete fontmgrsystemfontdir;
	//fontmgrsystemfontdir = NULL;
	//}
	//if(fontmgradobefontdir != NULL) {
	//
	//delete fontmgradobefontdir;
	//fontmgradobefontdir = NULL;
	//}
	//if(fontmgrcustomerfontdir != NULL) {
	//
	//delete fontmgrcustomerfontdir;
	//fontmgrcustomerfontdir = NULL;
	//}
	//
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::fromJson(char* jsonStr)
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
	const gchar *fontmgrsystemfontdirKey = "fontmgr.system.font.dir";
	node = json_object_get_member(pJsonObject, fontmgrsystemfontdirKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&fontmgrsystemfontdir, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&fontmgrsystemfontdir);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fontmgradobefontdirKey = "fontmgr.adobe.font.dir";
	node = json_object_get_member(pJsonObject, fontmgradobefontdirKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&fontmgradobefontdir, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&fontmgradobefontdir);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fontmgrcustomerfontdirKey = "fontmgr.customer.font.dir";
	node = json_object_get_member(pJsonObject, fontmgrcustomerfontdirKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&fontmgrcustomerfontdir, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&fontmgrcustomerfontdir);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::toJson()
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
		ConfigNodePropertyArray obj = getFontmgrsystemfontdir();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFontmgrsystemfontdir());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fontmgrsystemfontdirKey = "fontmgr.system.font.dir";
	json_object_set_member(pJsonObject, fontmgrsystemfontdirKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFontmgradobefontdir();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFontmgradobefontdir());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fontmgradobefontdirKey = "fontmgr.adobe.font.dir";
	json_object_set_member(pJsonObject, fontmgradobefontdirKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFontmgrcustomerfontdir();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFontmgrcustomerfontdir());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fontmgrcustomerfontdirKey = "fontmgr.customer.font.dir";
	json_object_set_member(pJsonObject, fontmgrcustomerfontdirKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::setEventfilter(ConfigNodePropertyString  eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyArray
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::getFontmgrsystemfontdir()
{
	return fontmgrsystemfontdir;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::setFontmgrsystemfontdir(ConfigNodePropertyArray  fontmgrsystemfontdir)
{
	this->fontmgrsystemfontdir = fontmgrsystemfontdir;
}

ConfigNodePropertyString
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::getFontmgradobefontdir()
{
	return fontmgradobefontdir;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::setFontmgradobefontdir(ConfigNodePropertyString  fontmgradobefontdir)
{
	this->fontmgradobefontdir = fontmgradobefontdir;
}

ConfigNodePropertyString
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::getFontmgrcustomerfontdir()
{
	return fontmgrcustomerfontdir;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties::setFontmgrcustomerfontdir(ConfigNodePropertyString  fontmgrcustomerfontdir)
{
	this->fontmgrcustomerfontdir = fontmgrcustomerfontdir;
}


