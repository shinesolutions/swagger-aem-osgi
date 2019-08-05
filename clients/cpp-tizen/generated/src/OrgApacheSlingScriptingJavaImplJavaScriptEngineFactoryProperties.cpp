#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties()
{
	//__init();
}

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::~OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::__init()
{
	//javaclassdebuginfo = new ConfigNodePropertyBoolean();
	//javajavaEncoding = new ConfigNodePropertyString();
	//javacompilerSourceVM = new ConfigNodePropertyString();
	//javacompilerTargetVM = new ConfigNodePropertyString();
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::__cleanup()
{
	//if(javaclassdebuginfo != NULL) {
	//
	//delete javaclassdebuginfo;
	//javaclassdebuginfo = NULL;
	//}
	//if(javajavaEncoding != NULL) {
	//
	//delete javajavaEncoding;
	//javajavaEncoding = NULL;
	//}
	//if(javacompilerSourceVM != NULL) {
	//
	//delete javacompilerSourceVM;
	//javacompilerSourceVM = NULL;
	//}
	//if(javacompilerTargetVM != NULL) {
	//
	//delete javacompilerTargetVM;
	//javacompilerTargetVM = NULL;
	//}
	//
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *javaclassdebuginfoKey = "java.classdebuginfo";
	node = json_object_get_member(pJsonObject, javaclassdebuginfoKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&javaclassdebuginfo, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&javaclassdebuginfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *javajavaEncodingKey = "java.javaEncoding";
	node = json_object_get_member(pJsonObject, javajavaEncodingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&javajavaEncoding, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&javajavaEncoding);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *javacompilerSourceVMKey = "java.compilerSourceVM";
	node = json_object_get_member(pJsonObject, javacompilerSourceVMKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&javacompilerSourceVM, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&javacompilerSourceVM);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *javacompilerTargetVMKey = "java.compilerTargetVM";
	node = json_object_get_member(pJsonObject, javacompilerTargetVMKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&javacompilerTargetVM, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&javacompilerTargetVM);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getJavaclassdebuginfo();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getJavaclassdebuginfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *javaclassdebuginfoKey = "java.classdebuginfo";
	json_object_set_member(pJsonObject, javaclassdebuginfoKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJavajavaEncoding();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJavajavaEncoding());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *javajavaEncodingKey = "java.javaEncoding";
	json_object_set_member(pJsonObject, javajavaEncodingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJavacompilerSourceVM();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJavacompilerSourceVM());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *javacompilerSourceVMKey = "java.compilerSourceVM";
	json_object_set_member(pJsonObject, javacompilerSourceVMKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJavacompilerTargetVM();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJavacompilerTargetVM());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *javacompilerTargetVMKey = "java.compilerTargetVM";
	json_object_set_member(pJsonObject, javacompilerTargetVMKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::getJavaclassdebuginfo()
{
	return javaclassdebuginfo;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::setJavaclassdebuginfo(ConfigNodePropertyBoolean  javaclassdebuginfo)
{
	this->javaclassdebuginfo = javaclassdebuginfo;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::getJavajavaEncoding()
{
	return javajavaEncoding;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::setJavajavaEncoding(ConfigNodePropertyString  javajavaEncoding)
{
	this->javajavaEncoding = javajavaEncoding;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::getJavacompilerSourceVM()
{
	return javacompilerSourceVM;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::setJavacompilerSourceVM(ConfigNodePropertyString  javacompilerSourceVM)
{
	this->javacompilerSourceVM = javacompilerSourceVM;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::getJavacompilerTargetVM()
{
	return javacompilerTargetVM;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::setJavacompilerTargetVM(ConfigNodePropertyString  javacompilerTargetVM)
{
	this->javacompilerTargetVM = javacompilerTargetVM;
}


