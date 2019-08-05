#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::ComDayCqWcmCoreStatsPageViewStatisticsImplProperties()
{
	//__init();
}

ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::~ComDayCqWcmCoreStatsPageViewStatisticsImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::__init()
{
	//pageviewstatisticstrackingurl = new ConfigNodePropertyString();
	//pageviewstatisticstrackingscriptenabled = new ConfigNodePropertyString();
}

void
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::__cleanup()
{
	//if(pageviewstatisticstrackingurl != NULL) {
	//
	//delete pageviewstatisticstrackingurl;
	//pageviewstatisticstrackingurl = NULL;
	//}
	//if(pageviewstatisticstrackingscriptenabled != NULL) {
	//
	//delete pageviewstatisticstrackingscriptenabled;
	//pageviewstatisticstrackingscriptenabled = NULL;
	//}
	//
}

void
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pageviewstatisticstrackingurlKey = "pageviewstatistics.trackingurl";
	node = json_object_get_member(pJsonObject, pageviewstatisticstrackingurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pageviewstatisticstrackingurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pageviewstatisticstrackingurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pageviewstatisticstrackingscriptenabledKey = "pageviewstatistics.trackingscript.enabled";
	node = json_object_get_member(pJsonObject, pageviewstatisticstrackingscriptenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pageviewstatisticstrackingscriptenabled, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pageviewstatisticstrackingscriptenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPageviewstatisticstrackingurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPageviewstatisticstrackingurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pageviewstatisticstrackingurlKey = "pageviewstatistics.trackingurl";
	json_object_set_member(pJsonObject, pageviewstatisticstrackingurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPageviewstatisticstrackingscriptenabled();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPageviewstatisticstrackingscriptenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pageviewstatisticstrackingscriptenabledKey = "pageviewstatistics.trackingscript.enabled";
	json_object_set_member(pJsonObject, pageviewstatisticstrackingscriptenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::getPageviewstatisticstrackingurl()
{
	return pageviewstatisticstrackingurl;
}

void
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::setPageviewstatisticstrackingurl(ConfigNodePropertyString  pageviewstatisticstrackingurl)
{
	this->pageviewstatisticstrackingurl = pageviewstatisticstrackingurl;
}

ConfigNodePropertyString
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::getPageviewstatisticstrackingscriptenabled()
{
	return pageviewstatisticstrackingscriptenabled;
}

void
ComDayCqWcmCoreStatsPageViewStatisticsImplProperties::setPageviewstatisticstrackingscriptenabled(ConfigNodePropertyString  pageviewstatisticstrackingscriptenabled)
{
	this->pageviewstatisticstrackingscriptenabled = pageviewstatisticstrackingscriptenabled;
}


