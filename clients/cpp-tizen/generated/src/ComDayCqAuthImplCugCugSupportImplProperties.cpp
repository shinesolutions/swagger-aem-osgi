#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAuthImplCugCugSupportImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAuthImplCugCugSupportImplProperties::ComDayCqAuthImplCugCugSupportImplProperties()
{
	//__init();
}

ComDayCqAuthImplCugCugSupportImplProperties::~ComDayCqAuthImplCugCugSupportImplProperties()
{
	//__cleanup();
}

void
ComDayCqAuthImplCugCugSupportImplProperties::__init()
{
	//cugexemptedprincipals = new ConfigNodePropertyArray();
	//cugenabled = new ConfigNodePropertyBoolean();
	//cugprincipalsregex = new ConfigNodePropertyString();
	//cugprincipalsreplacement = new ConfigNodePropertyString();
}

void
ComDayCqAuthImplCugCugSupportImplProperties::__cleanup()
{
	//if(cugexemptedprincipals != NULL) {
	//
	//delete cugexemptedprincipals;
	//cugexemptedprincipals = NULL;
	//}
	//if(cugenabled != NULL) {
	//
	//delete cugenabled;
	//cugenabled = NULL;
	//}
	//if(cugprincipalsregex != NULL) {
	//
	//delete cugprincipalsregex;
	//cugprincipalsregex = NULL;
	//}
	//if(cugprincipalsreplacement != NULL) {
	//
	//delete cugprincipalsreplacement;
	//cugprincipalsreplacement = NULL;
	//}
	//
}

void
ComDayCqAuthImplCugCugSupportImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cugexemptedprincipalsKey = "cug.exempted.principals";
	node = json_object_get_member(pJsonObject, cugexemptedprincipalsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cugexemptedprincipals, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cugexemptedprincipals);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cugenabledKey = "cug.enabled";
	node = json_object_get_member(pJsonObject, cugenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cugenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cugenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cugprincipalsregexKey = "cug.principals.regex";
	node = json_object_get_member(pJsonObject, cugprincipalsregexKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cugprincipalsregex, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cugprincipalsregex);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cugprincipalsreplacementKey = "cug.principals.replacement";
	node = json_object_get_member(pJsonObject, cugprincipalsreplacementKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cugprincipalsreplacement, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cugprincipalsreplacement);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAuthImplCugCugSupportImplProperties::ComDayCqAuthImplCugCugSupportImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAuthImplCugCugSupportImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCugexemptedprincipals();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCugexemptedprincipals());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cugexemptedprincipalsKey = "cug.exempted.principals";
	json_object_set_member(pJsonObject, cugexemptedprincipalsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCugenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCugenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cugenabledKey = "cug.enabled";
	json_object_set_member(pJsonObject, cugenabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCugprincipalsregex();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCugprincipalsregex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cugprincipalsregexKey = "cug.principals.regex";
	json_object_set_member(pJsonObject, cugprincipalsregexKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCugprincipalsreplacement();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCugprincipalsreplacement());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cugprincipalsreplacementKey = "cug.principals.replacement";
	json_object_set_member(pJsonObject, cugprincipalsreplacementKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqAuthImplCugCugSupportImplProperties::getCugexemptedprincipals()
{
	return cugexemptedprincipals;
}

void
ComDayCqAuthImplCugCugSupportImplProperties::setCugexemptedprincipals(ConfigNodePropertyArray  cugexemptedprincipals)
{
	this->cugexemptedprincipals = cugexemptedprincipals;
}

ConfigNodePropertyBoolean
ComDayCqAuthImplCugCugSupportImplProperties::getCugenabled()
{
	return cugenabled;
}

void
ComDayCqAuthImplCugCugSupportImplProperties::setCugenabled(ConfigNodePropertyBoolean  cugenabled)
{
	this->cugenabled = cugenabled;
}

ConfigNodePropertyString
ComDayCqAuthImplCugCugSupportImplProperties::getCugprincipalsregex()
{
	return cugprincipalsregex;
}

void
ComDayCqAuthImplCugCugSupportImplProperties::setCugprincipalsregex(ConfigNodePropertyString  cugprincipalsregex)
{
	this->cugprincipalsregex = cugprincipalsregex;
}

ConfigNodePropertyString
ComDayCqAuthImplCugCugSupportImplProperties::getCugprincipalsreplacement()
{
	return cugprincipalsreplacement;
}

void
ComDayCqAuthImplCugCugSupportImplProperties::setCugprincipalsreplacement(ConfigNodePropertyString  cugprincipalsreplacement)
{
	this->cugprincipalsreplacement = cugprincipalsreplacement;
}


