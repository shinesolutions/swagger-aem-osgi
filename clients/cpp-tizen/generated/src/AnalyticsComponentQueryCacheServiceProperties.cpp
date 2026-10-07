#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AnalyticsComponentQueryCacheServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AnalyticsComponentQueryCacheServiceProperties::AnalyticsComponentQueryCacheServiceProperties()
{
	//__init();
}

AnalyticsComponentQueryCacheServiceProperties::~AnalyticsComponentQueryCacheServiceProperties()
{
	//__cleanup();
}

void
AnalyticsComponentQueryCacheServiceProperties::__init()
{
	//cqanalyticscomponentquerycachesize = new ConfigNodePropertyInteger();
}

void
AnalyticsComponentQueryCacheServiceProperties::__cleanup()
{
	//if(cqanalyticscomponentquerycachesize != NULL) {
	//
	//delete cqanalyticscomponentquerycachesize;
	//cqanalyticscomponentquerycachesize = NULL;
	//}
	//
}

void
AnalyticsComponentQueryCacheServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqanalyticscomponentquerycachesizeKey = "cq.analytics.component.query.cache.size";
	node = json_object_get_member(pJsonObject, cqanalyticscomponentquerycachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqanalyticscomponentquerycachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqanalyticscomponentquerycachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AnalyticsComponentQueryCacheServiceProperties::AnalyticsComponentQueryCacheServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
AnalyticsComponentQueryCacheServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqanalyticscomponentquerycachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqanalyticscomponentquerycachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqanalyticscomponentquerycachesizeKey = "cq.analytics.component.query.cache.size";
	json_object_set_member(pJsonObject, cqanalyticscomponentquerycachesizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
AnalyticsComponentQueryCacheServiceProperties::getCqanalyticscomponentquerycachesize()
{
	return cqanalyticscomponentquerycachesize;
}

void
AnalyticsComponentQueryCacheServiceProperties::setCqanalyticscomponentquerycachesize(ConfigNodePropertyInteger  cqanalyticscomponentquerycachesize)
{
	this->cqanalyticscomponentquerycachesize = cqanalyticscomponentquerycachesize;
}


