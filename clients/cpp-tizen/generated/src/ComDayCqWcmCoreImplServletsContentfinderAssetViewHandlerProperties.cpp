#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties()
{
	//__init();
}

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::~ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::__init()
{
	//damshowexpired = new ConfigNodePropertyBoolean();
	//damshowhidden = new ConfigNodePropertyBoolean();
	//tagTitleSearch = new ConfigNodePropertyBoolean();
	//guessTotal = new ConfigNodePropertyString();
	//damexpiryProperty = new ConfigNodePropertyString();
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::__cleanup()
{
	//if(damshowexpired != NULL) {
	//
	//delete damshowexpired;
	//damshowexpired = NULL;
	//}
	//if(damshowhidden != NULL) {
	//
	//delete damshowhidden;
	//damshowhidden = NULL;
	//}
	//if(tagTitleSearch != NULL) {
	//
	//delete tagTitleSearch;
	//tagTitleSearch = NULL;
	//}
	//if(guessTotal != NULL) {
	//
	//delete guessTotal;
	//guessTotal = NULL;
	//}
	//if(damexpiryProperty != NULL) {
	//
	//delete damexpiryProperty;
	//damexpiryProperty = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *damshowexpiredKey = "dam.showexpired";
	node = json_object_get_member(pJsonObject, damshowexpiredKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&damshowexpired, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&damshowexpired);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *damshowhiddenKey = "dam.showhidden";
	node = json_object_get_member(pJsonObject, damshowhiddenKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&damshowhidden, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&damshowhidden);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tagTitleSearchKey = "tagTitleSearch";
	node = json_object_get_member(pJsonObject, tagTitleSearchKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&tagTitleSearch, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&tagTitleSearch);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *guessTotalKey = "guessTotal";
	node = json_object_get_member(pJsonObject, guessTotalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&guessTotal, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&guessTotal);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *damexpiryPropertyKey = "dam.expiryProperty";
	node = json_object_get_member(pJsonObject, damexpiryPropertyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&damexpiryProperty, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&damexpiryProperty);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDamshowexpired();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDamshowexpired());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damshowexpiredKey = "dam.showexpired";
	json_object_set_member(pJsonObject, damshowexpiredKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDamshowhidden();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDamshowhidden());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damshowhiddenKey = "dam.showhidden";
	json_object_set_member(pJsonObject, damshowhiddenKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getTagTitleSearch();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getTagTitleSearch());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tagTitleSearchKey = "tagTitleSearch";
	json_object_set_member(pJsonObject, tagTitleSearchKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGuessTotal();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGuessTotal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *guessTotalKey = "guessTotal";
	json_object_set_member(pJsonObject, guessTotalKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDamexpiryProperty();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDamexpiryProperty());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damexpiryPropertyKey = "dam.expiryProperty";
	json_object_set_member(pJsonObject, damexpiryPropertyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getDamshowexpired()
{
	return damshowexpired;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setDamshowexpired(ConfigNodePropertyBoolean  damshowexpired)
{
	this->damshowexpired = damshowexpired;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getDamshowhidden()
{
	return damshowhidden;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setDamshowhidden(ConfigNodePropertyBoolean  damshowhidden)
{
	this->damshowhidden = damshowhidden;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getTagTitleSearch()
{
	return tagTitleSearch;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setTagTitleSearch(ConfigNodePropertyBoolean  tagTitleSearch)
{
	this->tagTitleSearch = tagTitleSearch;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getGuessTotal()
{
	return guessTotal;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setGuessTotal(ConfigNodePropertyString  guessTotal)
{
	this->guessTotal = guessTotal;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getDamexpiryProperty()
{
	return damexpiryProperty;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setDamexpiryProperty(ConfigNodePropertyString  damexpiryProperty)
{
	this->damexpiryProperty = damexpiryProperty;
}


