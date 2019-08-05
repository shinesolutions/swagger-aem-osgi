#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties()
{
	//__init();
}

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::~OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties()
{
	//__cleanup();
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::__init()
{
	//hcname = new ConfigNodePropertyString();
	//hctags = new ConfigNodePropertyArray();
	//hcmbeanname = new ConfigNodePropertyString();
	//mbeanname = new ConfigNodePropertyString();
	//attributename = new ConfigNodePropertyString();
	//attributevalueconstraint = new ConfigNodePropertyString();
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::__cleanup()
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
	//if(mbeanname != NULL) {
	//
	//delete mbeanname;
	//mbeanname = NULL;
	//}
	//if(attributename != NULL) {
	//
	//delete attributename;
	//attributename = NULL;
	//}
	//if(attributevalueconstraint != NULL) {
	//
	//delete attributevalueconstraint;
	//attributevalueconstraint = NULL;
	//}
	//
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::fromJson(char* jsonStr)
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
	const gchar *mbeannameKey = "mbean.name";
	node = json_object_get_member(pJsonObject, mbeannameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&mbeanname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&mbeanname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *attributenameKey = "attribute.name";
	node = json_object_get_member(pJsonObject, attributenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&attributename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&attributename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *attributevalueconstraintKey = "attribute.value.constraint";
	node = json_object_get_member(pJsonObject, attributevalueconstraintKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&attributevalueconstraint, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&attributevalueconstraint);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMbeanname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMbeanname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mbeannameKey = "mbean.name";
	json_object_set_member(pJsonObject, mbeannameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAttributename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAttributename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attributenameKey = "attribute.name";
	json_object_set_member(pJsonObject, attributenameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAttributevalueconstraint();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAttributevalueconstraint());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attributevalueconstraintKey = "attribute.value.constraint";
	json_object_set_member(pJsonObject, attributevalueconstraintKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getHcname()
{
	return hcname;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setHcname(ConfigNodePropertyString  hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getHctags()
{
	return hctags;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setHcmbeanname(ConfigNodePropertyString  hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getMbeanname()
{
	return mbeanname;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setMbeanname(ConfigNodePropertyString  mbeanname)
{
	this->mbeanname = mbeanname;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getAttributename()
{
	return attributename;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setAttributename(ConfigNodePropertyString  attributename)
{
	this->attributename = attributename;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getAttributevalueconstraint()
{
	return attributevalueconstraint;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setAttributevalueconstraint(ConfigNodePropertyString  attributevalueconstraint)
{
	this->attributevalueconstraint = attributevalueconstraint;
}


