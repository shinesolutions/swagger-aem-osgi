#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties()
{
	//__init();
}

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::~ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::__init()
{
	//jmxobjectname = new ConfigNodePropertyString();
	//active = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::__cleanup()
{
	//if(jmxobjectname != NULL) {
	//
	//delete jmxobjectname;
	//jmxobjectname = NULL;
	//}
	//if(active != NULL) {
	//
	//delete active;
	//active = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jmxobjectnameKey = "jmx.objectname";
	node = json_object_get_member(pJsonObject, jmxobjectnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jmxobjectname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jmxobjectname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *activeKey = "active";
	node = json_object_get_member(pJsonObject, activeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&active, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&active);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJmxobjectname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJmxobjectname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jmxobjectnameKey = "jmx.objectname";
	json_object_set_member(pJsonObject, jmxobjectnameKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getActive();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getActive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *activeKey = "active";
	json_object_set_member(pJsonObject, activeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::getJmxobjectname()
{
	return jmxobjectname;
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::setJmxobjectname(ConfigNodePropertyString  jmxobjectname)
{
	this->jmxobjectname = jmxobjectname;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::getActive()
{
	return active;
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::setActive(ConfigNodePropertyBoolean  active)
{
	this->active = active;
}


