#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties()
{
	//__init();
}

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::~ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::__init()
{
	//testandtargetendpointurl = new ConfigNodePropertyString();
}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::__cleanup()
{
	//if(testandtargetendpointurl != NULL) {
	//
	//delete testandtargetendpointurl;
	//testandtargetendpointurl = NULL;
	//}
	//
}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *testandtargetendpointurlKey = "testandtarget.endpoint.url";
	node = json_object_get_member(pJsonObject, testandtargetendpointurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&testandtargetendpointurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&testandtargetendpointurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTestandtargetendpointurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTestandtargetendpointurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *testandtargetendpointurlKey = "testandtarget.endpoint.url";
	json_object_set_member(pJsonObject, testandtargetendpointurlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::getTestandtargetendpointurl()
{
	return testandtargetendpointurl;
}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties::setTestandtargetendpointurl(ConfigNodePropertyString  testandtargetendpointurl)
{
	this->testandtargetendpointurl = testandtargetendpointurl;
}


