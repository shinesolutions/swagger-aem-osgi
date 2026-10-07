#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingSecurityImplContentDispositionFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingSecurityImplContentDispositionFilterProperties::OrgApacheSlingSecurityImplContentDispositionFilterProperties()
{
	//__init();
}

OrgApacheSlingSecurityImplContentDispositionFilterProperties::~OrgApacheSlingSecurityImplContentDispositionFilterProperties()
{
	//__cleanup();
}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::__init()
{
	//slingcontentdispositionpaths = new ConfigNodePropertyArray();
	//slingcontentdispositionexcludedpaths = new ConfigNodePropertyArray();
	//slingcontentdispositionallpaths = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::__cleanup()
{
	//if(slingcontentdispositionpaths != NULL) {
	//
	//delete slingcontentdispositionpaths;
	//slingcontentdispositionpaths = NULL;
	//}
	//if(slingcontentdispositionexcludedpaths != NULL) {
	//
	//delete slingcontentdispositionexcludedpaths;
	//slingcontentdispositionexcludedpaths = NULL;
	//}
	//if(slingcontentdispositionallpaths != NULL) {
	//
	//delete slingcontentdispositionallpaths;
	//slingcontentdispositionallpaths = NULL;
	//}
	//
}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingcontentdispositionpathsKey = "sling.content.disposition.paths";
	node = json_object_get_member(pJsonObject, slingcontentdispositionpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingcontentdispositionpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingcontentdispositionpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingcontentdispositionexcludedpathsKey = "sling.content.disposition.excluded.paths";
	node = json_object_get_member(pJsonObject, slingcontentdispositionexcludedpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingcontentdispositionexcludedpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingcontentdispositionexcludedpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingcontentdispositionallpathsKey = "sling.content.disposition.all.paths";
	node = json_object_get_member(pJsonObject, slingcontentdispositionallpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&slingcontentdispositionallpaths, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&slingcontentdispositionallpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingSecurityImplContentDispositionFilterProperties::OrgApacheSlingSecurityImplContentDispositionFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingSecurityImplContentDispositionFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingcontentdispositionpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingcontentdispositionpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingcontentdispositionpathsKey = "sling.content.disposition.paths";
	json_object_set_member(pJsonObject, slingcontentdispositionpathsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingcontentdispositionexcludedpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingcontentdispositionexcludedpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingcontentdispositionexcludedpathsKey = "sling.content.disposition.excluded.paths";
	json_object_set_member(pJsonObject, slingcontentdispositionexcludedpathsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSlingcontentdispositionallpaths();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSlingcontentdispositionallpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingcontentdispositionallpathsKey = "sling.content.disposition.all.paths";
	json_object_set_member(pJsonObject, slingcontentdispositionallpathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplContentDispositionFilterProperties::getSlingcontentdispositionpaths()
{
	return slingcontentdispositionpaths;
}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::setSlingcontentdispositionpaths(ConfigNodePropertyArray  slingcontentdispositionpaths)
{
	this->slingcontentdispositionpaths = slingcontentdispositionpaths;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplContentDispositionFilterProperties::getSlingcontentdispositionexcludedpaths()
{
	return slingcontentdispositionexcludedpaths;
}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::setSlingcontentdispositionexcludedpaths(ConfigNodePropertyArray  slingcontentdispositionexcludedpaths)
{
	this->slingcontentdispositionexcludedpaths = slingcontentdispositionexcludedpaths;
}

ConfigNodePropertyBoolean
OrgApacheSlingSecurityImplContentDispositionFilterProperties::getSlingcontentdispositionallpaths()
{
	return slingcontentdispositionallpaths;
}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::setSlingcontentdispositionallpaths(ConfigNodePropertyBoolean  slingcontentdispositionallpaths)
{
	this->slingcontentdispositionallpaths = slingcontentdispositionallpaths;
}


