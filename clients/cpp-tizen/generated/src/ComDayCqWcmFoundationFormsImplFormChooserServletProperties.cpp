#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationFormsImplFormChooserServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationFormsImplFormChooserServletProperties::ComDayCqWcmFoundationFormsImplFormChooserServletProperties()
{
	//__init();
}

ComDayCqWcmFoundationFormsImplFormChooserServletProperties::~ComDayCqWcmFoundationFormsImplFormChooserServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::__init()
{
	//servicename = new ConfigNodePropertyString();
	//slingservletresourceTypes = new ConfigNodePropertyString();
	//slingservletselectors = new ConfigNodePropertyString();
	//slingservletmethods = new ConfigNodePropertyArray();
	//formsformchooserservletadvansesearchrequire = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::__cleanup()
{
	//if(servicename != NULL) {
	//
	//delete servicename;
	//servicename = NULL;
	//}
	//if(slingservletresourceTypes != NULL) {
	//
	//delete slingservletresourceTypes;
	//slingservletresourceTypes = NULL;
	//}
	//if(slingservletselectors != NULL) {
	//
	//delete slingservletselectors;
	//slingservletselectors = NULL;
	//}
	//if(slingservletmethods != NULL) {
	//
	//delete slingservletmethods;
	//slingservletmethods = NULL;
	//}
	//if(formsformchooserservletadvansesearchrequire != NULL) {
	//
	//delete formsformchooserservletadvansesearchrequire;
	//formsformchooserservletadvansesearchrequire = NULL;
	//}
	//
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *servicenameKey = "service.name";
	node = json_object_get_member(pJsonObject, servicenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&servicename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&servicename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletresourceTypesKey = "sling.servlet.resourceTypes";
	node = json_object_get_member(pJsonObject, slingservletresourceTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletresourceTypes, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletresourceTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletselectorsKey = "sling.servlet.selectors";
	node = json_object_get_member(pJsonObject, slingservletselectorsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletselectors, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletselectors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	node = json_object_get_member(pJsonObject, slingservletmethodsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingservletmethods, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingservletmethods);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *formsformchooserservletadvansesearchrequireKey = "forms.formchooserservlet.advansesearch.require";
	node = json_object_get_member(pJsonObject, formsformchooserservletadvansesearchrequireKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&formsformchooserservletadvansesearchrequire, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&formsformchooserservletadvansesearchrequire);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationFormsImplFormChooserServletProperties::ComDayCqWcmFoundationFormsImplFormChooserServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServicename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServicename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicenameKey = "service.name";
	json_object_set_member(pJsonObject, servicenameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletresourceTypes();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletresourceTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletresourceTypesKey = "sling.servlet.resourceTypes";
	json_object_set_member(pJsonObject, slingservletresourceTypesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletselectors();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletselectors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletselectorsKey = "sling.servlet.selectors";
	json_object_set_member(pJsonObject, slingservletselectorsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingservletmethods();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingservletmethods());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	json_object_set_member(pJsonObject, slingservletmethodsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getFormsformchooserservletadvansesearchrequire();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getFormsformchooserservletadvansesearchrequire());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *formsformchooserservletadvansesearchrequireKey = "forms.formchooserservlet.advansesearch.require";
	json_object_set_member(pJsonObject, formsformchooserservletadvansesearchrequireKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getServicename()
{
	return servicename;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setServicename(ConfigNodePropertyString  servicename)
{
	this->servicename = servicename;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setSlingservletresourceTypes(ConfigNodePropertyString  slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setSlingservletselectors(ConfigNodePropertyString  slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setSlingservletmethods(ConfigNodePropertyArray  slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyBoolean
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::getFormsformchooserservletadvansesearchrequire()
{
	return formsformchooserservletadvansesearchrequire;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletProperties::setFormsformchooserservletadvansesearchrequire(ConfigNodePropertyBoolean  formsformchooserservletadvansesearchrequire)
{
	this->formsformchooserservletadvansesearchrequire = formsformchooserservletadvansesearchrequire;
}


