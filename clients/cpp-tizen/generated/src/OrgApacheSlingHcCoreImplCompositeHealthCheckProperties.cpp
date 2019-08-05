#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::OrgApacheSlingHcCoreImplCompositeHealthCheckProperties()
{
	//__init();
}

OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::~OrgApacheSlingHcCoreImplCompositeHealthCheckProperties()
{
	//__cleanup();
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::__init()
{
	//hcname = new ConfigNodePropertyString();
	//hctags = new ConfigNodePropertyArray();
	//hcmbeanname = new ConfigNodePropertyString();
	//filtertags = new ConfigNodePropertyArray();
	//filtercombineTagsWithOr = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::__cleanup()
{
	//if(hcname != NULL) {
	//
	//delete hcname;
	//hcname = NULL;
	//}
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(hcmbeanname != NULL) {
	//
	//delete hcmbeanname;
	//hcmbeanname = NULL;
	//}
	//if(filtertags != NULL) {
	//
	//delete filtertags;
	//filtertags = NULL;
	//}
	//if(filtercombineTagsWithOr != NULL) {
	//
	//delete filtercombineTagsWithOr;
	//filtercombineTagsWithOr = NULL;
	//}
	//
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hcnameKey = "hc.name";
	node = json_object_get_member(pJsonObject, hcnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&hcname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&hcname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hctagsKey = "hc.tags";
	node = json_object_get_member(pJsonObject, hctagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&hctags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&hctags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hcmbeannameKey = "hc.mbean.name";
	node = json_object_get_member(pJsonObject, hcmbeannameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&hcmbeanname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&hcmbeanname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filtertagsKey = "filter.tags";
	node = json_object_get_member(pJsonObject, filtertagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&filtertags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&filtertags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filtercombineTagsWithOrKey = "filter.combineTagsWithOr";
	node = json_object_get_member(pJsonObject, filtercombineTagsWithOrKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&filtercombineTagsWithOr, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&filtercombineTagsWithOr);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHcname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHcname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hcnameKey = "hc.name";
	json_object_set_member(pJsonObject, hcnameKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHctags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHctags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hctagsKey = "hc.tags";
	json_object_set_member(pJsonObject, hctagsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHcmbeanname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHcmbeanname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hcmbeannameKey = "hc.mbean.name";
	json_object_set_member(pJsonObject, hcmbeannameKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFiltertags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFiltertags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtertagsKey = "filter.tags";
	json_object_set_member(pJsonObject, filtertagsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getFiltercombineTagsWithOr();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getFiltercombineTagsWithOr());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtercombineTagsWithOrKey = "filter.combineTagsWithOr";
	json_object_set_member(pJsonObject, filtercombineTagsWithOrKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getHcname()
{
	return hcname;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setHcname(ConfigNodePropertyString  hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getHctags()
{
	return hctags;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setHcmbeanname(ConfigNodePropertyString  hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}

ConfigNodePropertyArray
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getFiltertags()
{
	return filtertags;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setFiltertags(ConfigNodePropertyArray  filtertags)
{
	this->filtertags = filtertags;
}

ConfigNodePropertyBoolean
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::getFiltercombineTagsWithOr()
{
	return filtercombineTagsWithOr;
}

void
OrgApacheSlingHcCoreImplCompositeHealthCheckProperties::setFiltercombineTagsWithOr(ConfigNodePropertyBoolean  filtercombineTagsWithOr)
{
	this->filtercombineTagsWithOr = filtercombineTagsWithOr;
}


