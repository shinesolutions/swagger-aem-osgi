#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties()
{
	//__init();
}

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::~OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties()
{
	//__cleanup();
}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::__init()
{
	//logstacktraceonclose = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::__cleanup()
{
	//if(logstacktraceonclose != NULL) {
	//
	//delete logstacktraceonclose;
	//logstacktraceonclose = NULL;
	//}
	//
}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *logstacktraceoncloseKey = "log.stacktrace.onclose";
	node = json_object_get_member(pJsonObject, logstacktraceoncloseKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&logstacktraceonclose, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&logstacktraceonclose);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLogstacktraceonclose();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLogstacktraceonclose());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logstacktraceoncloseKey = "log.stacktrace.onclose";
	json_object_set_member(pJsonObject, logstacktraceoncloseKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::getLogstacktraceonclose()
{
	return logstacktraceonclose;
}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::setLogstacktraceonclose(ConfigNodePropertyBoolean  logstacktraceonclose)
{
	this->logstacktraceonclose = logstacktraceonclose;
}


