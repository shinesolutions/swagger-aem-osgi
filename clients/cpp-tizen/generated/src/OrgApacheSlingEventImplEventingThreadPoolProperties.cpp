#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEventImplEventingThreadPoolProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEventImplEventingThreadPoolProperties::OrgApacheSlingEventImplEventingThreadPoolProperties()
{
	//__init();
}

OrgApacheSlingEventImplEventingThreadPoolProperties::~OrgApacheSlingEventImplEventingThreadPoolProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEventImplEventingThreadPoolProperties::__init()
{
	//minPoolSize = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingEventImplEventingThreadPoolProperties::__cleanup()
{
	//if(minPoolSize != NULL) {
	//
	//delete minPoolSize;
	//minPoolSize = NULL;
	//}
	//
}

void
OrgApacheSlingEventImplEventingThreadPoolProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *minPoolSizeKey = "minPoolSize";
	node = json_object_get_member(pJsonObject, minPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEventImplEventingThreadPoolProperties::OrgApacheSlingEventImplEventingThreadPoolProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEventImplEventingThreadPoolProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minPoolSizeKey = "minPoolSize";
	json_object_set_member(pJsonObject, minPoolSizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplEventingThreadPoolProperties::getMinPoolSize()
{
	return minPoolSize;
}

void
OrgApacheSlingEventImplEventingThreadPoolProperties::setMinPoolSize(ConfigNodePropertyInteger  minPoolSize)
{
	this->minPoolSize = minPoolSize;
}


