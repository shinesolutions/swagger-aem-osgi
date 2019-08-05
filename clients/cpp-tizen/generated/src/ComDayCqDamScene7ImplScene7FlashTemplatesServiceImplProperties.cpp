#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties()
{
	//__init();
}

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::~ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::__init()
{
	//scene7FlashTemplatesrti = new ConfigNodePropertyString();
	//scene7FlashTemplatesrsi = new ConfigNodePropertyString();
	//scene7FlashTemplatesrb = new ConfigNodePropertyString();
	//scene7FlashTemplatesrurl = new ConfigNodePropertyString();
	//scene7FlashTemplateurlFormatParameter = new ConfigNodePropertyString();
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::__cleanup()
{
	//if(scene7FlashTemplatesrti != NULL) {
	//
	//delete scene7FlashTemplatesrti;
	//scene7FlashTemplatesrti = NULL;
	//}
	//if(scene7FlashTemplatesrsi != NULL) {
	//
	//delete scene7FlashTemplatesrsi;
	//scene7FlashTemplatesrsi = NULL;
	//}
	//if(scene7FlashTemplatesrb != NULL) {
	//
	//delete scene7FlashTemplatesrb;
	//scene7FlashTemplatesrb = NULL;
	//}
	//if(scene7FlashTemplatesrurl != NULL) {
	//
	//delete scene7FlashTemplatesrurl;
	//scene7FlashTemplatesrurl = NULL;
	//}
	//if(scene7FlashTemplateurlFormatParameter != NULL) {
	//
	//delete scene7FlashTemplateurlFormatParameter;
	//scene7FlashTemplateurlFormatParameter = NULL;
	//}
	//
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scene7FlashTemplatesrtiKey = "scene7FlashTemplates.rti";
	node = json_object_get_member(pJsonObject, scene7FlashTemplatesrtiKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scene7FlashTemplatesrti, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scene7FlashTemplatesrti);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scene7FlashTemplatesrsiKey = "scene7FlashTemplates.rsi";
	node = json_object_get_member(pJsonObject, scene7FlashTemplatesrsiKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scene7FlashTemplatesrsi, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scene7FlashTemplatesrsi);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scene7FlashTemplatesrbKey = "scene7FlashTemplates.rb";
	node = json_object_get_member(pJsonObject, scene7FlashTemplatesrbKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scene7FlashTemplatesrb, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scene7FlashTemplatesrb);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scene7FlashTemplatesrurlKey = "scene7FlashTemplates.rurl";
	node = json_object_get_member(pJsonObject, scene7FlashTemplatesrurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scene7FlashTemplatesrurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scene7FlashTemplatesrurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scene7FlashTemplateurlFormatParameterKey = "scene7FlashTemplate.urlFormatParameter";
	node = json_object_get_member(pJsonObject, scene7FlashTemplateurlFormatParameterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scene7FlashTemplateurlFormatParameter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scene7FlashTemplateurlFormatParameter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScene7FlashTemplatesrti();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScene7FlashTemplatesrti());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scene7FlashTemplatesrtiKey = "scene7FlashTemplates.rti";
	json_object_set_member(pJsonObject, scene7FlashTemplatesrtiKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScene7FlashTemplatesrsi();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScene7FlashTemplatesrsi());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scene7FlashTemplatesrsiKey = "scene7FlashTemplates.rsi";
	json_object_set_member(pJsonObject, scene7FlashTemplatesrsiKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScene7FlashTemplatesrb();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScene7FlashTemplatesrb());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scene7FlashTemplatesrbKey = "scene7FlashTemplates.rb";
	json_object_set_member(pJsonObject, scene7FlashTemplatesrbKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScene7FlashTemplatesrurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScene7FlashTemplatesrurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scene7FlashTemplatesrurlKey = "scene7FlashTemplates.rurl";
	json_object_set_member(pJsonObject, scene7FlashTemplatesrurlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScene7FlashTemplateurlFormatParameter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScene7FlashTemplateurlFormatParameter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scene7FlashTemplateurlFormatParameterKey = "scene7FlashTemplate.urlFormatParameter";
	json_object_set_member(pJsonObject, scene7FlashTemplateurlFormatParameterKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplatesrti()
{
	return scene7FlashTemplatesrti;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplatesrti(ConfigNodePropertyString  scene7FlashTemplatesrti)
{
	this->scene7FlashTemplatesrti = scene7FlashTemplatesrti;
}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplatesrsi()
{
	return scene7FlashTemplatesrsi;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplatesrsi(ConfigNodePropertyString  scene7FlashTemplatesrsi)
{
	this->scene7FlashTemplatesrsi = scene7FlashTemplatesrsi;
}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplatesrb()
{
	return scene7FlashTemplatesrb;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplatesrb(ConfigNodePropertyString  scene7FlashTemplatesrb)
{
	this->scene7FlashTemplatesrb = scene7FlashTemplatesrb;
}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplatesrurl()
{
	return scene7FlashTemplatesrurl;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplatesrurl(ConfigNodePropertyString  scene7FlashTemplatesrurl)
{
	this->scene7FlashTemplatesrurl = scene7FlashTemplatesrurl;
}

ConfigNodePropertyString
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::getScene7FlashTemplateurlFormatParameter()
{
	return scene7FlashTemplateurlFormatParameter;
}

void
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties::setScene7FlashTemplateurlFormatParameter(ConfigNodePropertyString  scene7FlashTemplateurlFormatParameter)
{
	this->scene7FlashTemplateurlFormatParameter = scene7FlashTemplateurlFormatParameter;
}


