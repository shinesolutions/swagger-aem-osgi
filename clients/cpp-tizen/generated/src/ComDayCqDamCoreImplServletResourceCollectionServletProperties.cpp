#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletResourceCollectionServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletResourceCollectionServletProperties::ComDayCqDamCoreImplServletResourceCollectionServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletResourceCollectionServletProperties::~ComDayCqDamCoreImplServletResourceCollectionServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::__init()
{
	//slingservletresourceTypes = new ConfigNodePropertyArray();
	//slingservletmethods = new ConfigNodePropertyString();
	//slingservletselectors = new ConfigNodePropertyString();
	//downloadconfig = new ConfigNodePropertyString();
	//viewselector = new ConfigNodePropertyString();
	//send_email = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::__cleanup()
{
	//if(slingservletresourceTypes != NULL) {
	//
	//delete slingservletresourceTypes;
	//slingservletresourceTypes = NULL;
	//}
	//if(slingservletmethods != NULL) {
	//
	//delete slingservletmethods;
	//slingservletmethods = NULL;
	//}
	//if(slingservletselectors != NULL) {
	//
	//delete slingservletselectors;
	//slingservletselectors = NULL;
	//}
	//if(downloadconfig != NULL) {
	//
	//delete downloadconfig;
	//downloadconfig = NULL;
	//}
	//if(viewselector != NULL) {
	//
	//delete viewselector;
	//viewselector = NULL;
	//}
	//if(send_email != NULL) {
	//
	//delete send_email;
	//send_email = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingservletresourceTypesKey = "sling.servlet.resourceTypes";
	node = json_object_get_member(pJsonObject, slingservletresourceTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingservletresourceTypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingservletresourceTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	node = json_object_get_member(pJsonObject, slingservletmethodsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletmethods, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletmethods);
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
	const gchar *downloadconfigKey = "download.config";
	node = json_object_get_member(pJsonObject, downloadconfigKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&downloadconfig, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&downloadconfig);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *viewselectorKey = "view.selector";
	node = json_object_get_member(pJsonObject, viewselectorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&viewselector, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&viewselector);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *send_emailKey = "send_email";
	node = json_object_get_member(pJsonObject, send_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&send_email, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&send_email);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletResourceCollectionServletProperties::ComDayCqDamCoreImplServletResourceCollectionServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletResourceCollectionServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingservletresourceTypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingservletresourceTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletresourceTypesKey = "sling.servlet.resourceTypes";
	json_object_set_member(pJsonObject, slingservletresourceTypesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletmethods();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletmethods());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	json_object_set_member(pJsonObject, slingservletmethodsKey, node);
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDownloadconfig();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDownloadconfig());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *downloadconfigKey = "download.config";
	json_object_set_member(pJsonObject, downloadconfigKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getViewselector();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getViewselector());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *viewselectorKey = "view.selector";
	json_object_set_member(pJsonObject, viewselectorKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSendEmail();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSendEmail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *send_emailKey = "send_email";
	json_object_set_member(pJsonObject, send_emailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setSlingservletresourceTypes(ConfigNodePropertyArray  slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setSlingservletmethods(ConfigNodePropertyString  slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setSlingservletselectors(ConfigNodePropertyString  slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getDownloadconfig()
{
	return downloadconfig;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setDownloadconfig(ConfigNodePropertyString  downloadconfig)
{
	this->downloadconfig = downloadconfig;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getViewselector()
{
	return viewselector;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setViewselector(ConfigNodePropertyString  viewselector)
{
	this->viewselector = viewselector;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletResourceCollectionServletProperties::getSendEmail()
{
	return send_email;
}

void
ComDayCqDamCoreImplServletResourceCollectionServletProperties::setSendEmail(ConfigNodePropertyBoolean  send_email)
{
	this->send_email = send_email;
}


