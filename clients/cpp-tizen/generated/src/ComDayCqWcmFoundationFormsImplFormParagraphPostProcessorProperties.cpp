#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties()
{
	//__init();
}

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::~ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::__init()
{
	//formsformparagraphpostprocessorenabled = new ConfigNodePropertyBoolean();
	//formsformparagraphpostprocessorformresourcetypes = new ConfigNodePropertyArray();
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::__cleanup()
{
	//if(formsformparagraphpostprocessorenabled != NULL) {
	//
	//delete formsformparagraphpostprocessorenabled;
	//formsformparagraphpostprocessorenabled = NULL;
	//}
	//if(formsformparagraphpostprocessorformresourcetypes != NULL) {
	//
	//delete formsformparagraphpostprocessorformresourcetypes;
	//formsformparagraphpostprocessorformresourcetypes = NULL;
	//}
	//
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *formsformparagraphpostprocessorenabledKey = "forms.formparagraphpostprocessor.enabled";
	node = json_object_get_member(pJsonObject, formsformparagraphpostprocessorenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&formsformparagraphpostprocessorenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&formsformparagraphpostprocessorenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *formsformparagraphpostprocessorformresourcetypesKey = "forms.formparagraphpostprocessor.formresourcetypes";
	node = json_object_get_member(pJsonObject, formsformparagraphpostprocessorformresourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&formsformparagraphpostprocessorformresourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&formsformparagraphpostprocessorformresourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getFormsformparagraphpostprocessorenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getFormsformparagraphpostprocessorenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *formsformparagraphpostprocessorenabledKey = "forms.formparagraphpostprocessor.enabled";
	json_object_set_member(pJsonObject, formsformparagraphpostprocessorenabledKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFormsformparagraphpostprocessorformresourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFormsformparagraphpostprocessorformresourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *formsformparagraphpostprocessorformresourcetypesKey = "forms.formparagraphpostprocessor.formresourcetypes";
	json_object_set_member(pJsonObject, formsformparagraphpostprocessorformresourcetypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::getFormsformparagraphpostprocessorenabled()
{
	return formsformparagraphpostprocessorenabled;
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::setFormsformparagraphpostprocessorenabled(ConfigNodePropertyBoolean  formsformparagraphpostprocessorenabled)
{
	this->formsformparagraphpostprocessorenabled = formsformparagraphpostprocessorenabled;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::getFormsformparagraphpostprocessorformresourcetypes()
{
	return formsformparagraphpostprocessorformresourcetypes;
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::setFormsformparagraphpostprocessorformresourcetypes(ConfigNodePropertyArray  formsformparagraphpostprocessorformresourcetypes)
{
	this->formsformparagraphpostprocessorformresourcetypes = formsformparagraphpostprocessorformresourcetypes;
}


