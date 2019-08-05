#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties()
{
	//__init();
}

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::~ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::__init()
{
	//getPeriod = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::__cleanup()
{
	//if(getPeriod != NULL) {
	//
	//delete getPeriod;
	//getPeriod = NULL;
	//}
	//
}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *getPeriodKey = "getPeriod";
	node = json_object_get_member(pJsonObject, getPeriodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&getPeriod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&getPeriod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getGetPeriod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getGetPeriod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *getPeriodKey = "getPeriod";
	json_object_set_member(pJsonObject, getPeriodKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::getGetPeriod()
{
	return getPeriod;
}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::setGetPeriod(ConfigNodePropertyInteger  getPeriod)
{
	this->getPeriod = getPeriod;
}


