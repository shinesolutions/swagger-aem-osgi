#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties()
{
	//__init();
}

OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::~OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::__init()
{
	//maxquartzJobdurationacceptable = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::__cleanup()
{
	//if(maxquartzJobdurationacceptable != NULL) {
	//
	//delete maxquartzJobdurationacceptable;
	//maxquartzJobdurationacceptable = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxquartzJobdurationacceptableKey = "max.quartzJob.duration.acceptable";
	node = json_object_get_member(pJsonObject, maxquartzJobdurationacceptableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxquartzJobdurationacceptable, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxquartzJobdurationacceptable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxquartzJobdurationacceptable();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxquartzJobdurationacceptable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxquartzJobdurationacceptableKey = "max.quartzJob.duration.acceptable";
	json_object_set_member(pJsonObject, maxquartzJobdurationacceptableKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::getMaxquartzJobdurationacceptable()
{
	return maxquartzJobdurationacceptable;
}

void
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::setMaxquartzJobdurationacceptable(ConfigNodePropertyInteger  maxquartzJobdurationacceptable)
{
	this->maxquartzJobdurationacceptable = maxquartzJobdurationacceptable;
}


