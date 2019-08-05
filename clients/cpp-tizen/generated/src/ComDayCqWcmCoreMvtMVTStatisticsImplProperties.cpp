#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreMvtMVTStatisticsImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreMvtMVTStatisticsImplProperties::ComDayCqWcmCoreMvtMVTStatisticsImplProperties()
{
	//__init();
}

ComDayCqWcmCoreMvtMVTStatisticsImplProperties::~ComDayCqWcmCoreMvtMVTStatisticsImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::__init()
{
	//mvtstatisticstrackingurl = new ConfigNodePropertyString();
}

void
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::__cleanup()
{
	//if(mvtstatisticstrackingurl != NULL) {
	//
	//delete mvtstatisticstrackingurl;
	//mvtstatisticstrackingurl = NULL;
	//}
	//
}

void
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mvtstatisticstrackingurlKey = "mvtstatistics.trackingurl";
	node = json_object_get_member(pJsonObject, mvtstatisticstrackingurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&mvtstatisticstrackingurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&mvtstatisticstrackingurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreMvtMVTStatisticsImplProperties::ComDayCqWcmCoreMvtMVTStatisticsImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMvtstatisticstrackingurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMvtstatisticstrackingurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mvtstatisticstrackingurlKey = "mvtstatistics.trackingurl";
	json_object_set_member(pJsonObject, mvtstatisticstrackingurlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::getMvtstatisticstrackingurl()
{
	return mvtstatisticstrackingurl;
}

void
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::setMvtstatisticstrackingurl(ConfigNodePropertyString  mvtstatisticstrackingurl)
{
	this->mvtstatisticstrackingurl = mvtstatisticstrackingurl;
}


