#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties()
{
	//__init();
}

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::~ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::__init()
{
	//guessTotal = new ConfigNodePropertyString();
	//tagTitleSearch = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::__cleanup()
{
	//if(guessTotal != NULL) {
	//
	//delete guessTotal;
	//guessTotal = NULL;
	//}
	//if(tagTitleSearch != NULL) {
	//
	//delete tagTitleSearch;
	//tagTitleSearch = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
}

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::getGuessTotal()
{
	return guessTotal;
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::setGuessTotal(ConfigNodePropertyString  guessTotal)
{
	this->guessTotal = guessTotal;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::getTagTitleSearch()
{
	return tagTitleSearch;
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::setTagTitleSearch(ConfigNodePropertyBoolean  tagTitleSearch)
{
	this->tagTitleSearch = tagTitleSearch;
}


