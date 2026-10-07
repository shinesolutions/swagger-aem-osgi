#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties()
{
	//__init();
}

OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::~OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::__init()
{
	//jaspercompilerTargetVM = new ConfigNodePropertyString();
	//jaspercompilerSourceVM = new ConfigNodePropertyString();
	//jasperclassdebuginfo = new ConfigNodePropertyBoolean();
	//jasperenablePooling = new ConfigNodePropertyBoolean();
	//jasperieClassId = new ConfigNodePropertyString();
	//jaspergenStringAsCharArray = new ConfigNodePropertyBoolean();
	//jasperkeepgenerated = new ConfigNodePropertyBoolean();
	//jaspermappedfile = new ConfigNodePropertyBoolean();
	//jaspertrimSpaces = new ConfigNodePropertyBoolean();
	//jasperdisplaySourceFragments = new ConfigNodePropertyBoolean();
	//defaultissession = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::__cleanup()
{
	//if(jaspercompilerTargetVM != NULL) {
	//
	//delete jaspercompilerTargetVM;
	//jaspercompilerTargetVM = NULL;
	//}
	//if(jaspercompilerSourceVM != NULL) {
	//
	//delete jaspercompilerSourceVM;
	//jaspercompilerSourceVM = NULL;
	//}
	//if(jasperclassdebuginfo != NULL) {
	//
	//delete jasperclassdebuginfo;
	//jasperclassdebuginfo = NULL;
	//}
	//if(jasperenablePooling != NULL) {
	//
	//delete jasperenablePooling;
	//jasperenablePooling = NULL;
	//}
	//if(jasperieClassId != NULL) {
	//
	//delete jasperieClassId;
	//jasperieClassId = NULL;
	//}
	//if(jaspergenStringAsCharArray != NULL) {
	//
	//delete jaspergenStringAsCharArray;
	//jaspergenStringAsCharArray = NULL;
	//}
	//if(jasperkeepgenerated != NULL) {
	//
	//delete jasperkeepgenerated;
	//jasperkeepgenerated = NULL;
	//}
	//if(jaspermappedfile != NULL) {
	//
	//delete jaspermappedfile;
	//jaspermappedfile = NULL;
	//}
	//if(jaspertrimSpaces != NULL) {
	//
	//delete jaspertrimSpaces;
	//jaspertrimSpaces = NULL;
	//}
	//if(jasperdisplaySourceFragments != NULL) {
	//
	//delete jasperdisplaySourceFragments;
	//jasperdisplaySourceFragments = NULL;
	//}
	//if(defaultissession != NULL) {
	//
	//delete defaultissession;
	//defaultissession = NULL;
	//}
	//
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jaspercompilerTargetVMKey = "jasper.compilerTargetVM";
	node = json_object_get_member(pJsonObject, jaspercompilerTargetVMKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jaspercompilerTargetVM, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jaspercompilerTargetVM);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaspercompilerSourceVMKey = "jasper.compilerSourceVM";
	node = json_object_get_member(pJsonObject, jaspercompilerSourceVMKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jaspercompilerSourceVM, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jaspercompilerSourceVM);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jasperclassdebuginfoKey = "jasper.classdebuginfo";
	node = json_object_get_member(pJsonObject, jasperclassdebuginfoKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&jasperclassdebuginfo, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&jasperclassdebuginfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jasperenablePoolingKey = "jasper.enablePooling";
	node = json_object_get_member(pJsonObject, jasperenablePoolingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&jasperenablePooling, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&jasperenablePooling);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jasperieClassIdKey = "jasper.ieClassId";
	node = json_object_get_member(pJsonObject, jasperieClassIdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jasperieClassId, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jasperieClassId);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaspergenStringAsCharArrayKey = "jasper.genStringAsCharArray";
	node = json_object_get_member(pJsonObject, jaspergenStringAsCharArrayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&jaspergenStringAsCharArray, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&jaspergenStringAsCharArray);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jasperkeepgeneratedKey = "jasper.keepgenerated";
	node = json_object_get_member(pJsonObject, jasperkeepgeneratedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&jasperkeepgenerated, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&jasperkeepgenerated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaspermappedfileKey = "jasper.mappedfile";
	node = json_object_get_member(pJsonObject, jaspermappedfileKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&jaspermappedfile, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&jaspermappedfile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jaspertrimSpacesKey = "jasper.trimSpaces";
	node = json_object_get_member(pJsonObject, jaspertrimSpacesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&jaspertrimSpaces, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&jaspertrimSpaces);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jasperdisplaySourceFragmentsKey = "jasper.displaySourceFragments";
	node = json_object_get_member(pJsonObject, jasperdisplaySourceFragmentsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&jasperdisplaySourceFragments, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&jasperdisplaySourceFragments);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultissessionKey = "default.is.session";
	node = json_object_get_member(pJsonObject, defaultissessionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&defaultissession, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&defaultissession);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJaspercompilerTargetVM();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJaspercompilerTargetVM());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaspercompilerTargetVMKey = "jasper.compilerTargetVM";
	json_object_set_member(pJsonObject, jaspercompilerTargetVMKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJaspercompilerSourceVM();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJaspercompilerSourceVM());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaspercompilerSourceVMKey = "jasper.compilerSourceVM";
	json_object_set_member(pJsonObject, jaspercompilerSourceVMKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getJasperclassdebuginfo();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getJasperclassdebuginfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jasperclassdebuginfoKey = "jasper.classdebuginfo";
	json_object_set_member(pJsonObject, jasperclassdebuginfoKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getJasperenablePooling();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getJasperenablePooling());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jasperenablePoolingKey = "jasper.enablePooling";
	json_object_set_member(pJsonObject, jasperenablePoolingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJasperieClassId();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJasperieClassId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jasperieClassIdKey = "jasper.ieClassId";
	json_object_set_member(pJsonObject, jasperieClassIdKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getJaspergenStringAsCharArray();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getJaspergenStringAsCharArray());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaspergenStringAsCharArrayKey = "jasper.genStringAsCharArray";
	json_object_set_member(pJsonObject, jaspergenStringAsCharArrayKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getJasperkeepgenerated();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getJasperkeepgenerated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jasperkeepgeneratedKey = "jasper.keepgenerated";
	json_object_set_member(pJsonObject, jasperkeepgeneratedKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getJaspermappedfile();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getJaspermappedfile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaspermappedfileKey = "jasper.mappedfile";
	json_object_set_member(pJsonObject, jaspermappedfileKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getJaspertrimSpaces();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getJaspertrimSpaces());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jaspertrimSpacesKey = "jasper.trimSpaces";
	json_object_set_member(pJsonObject, jaspertrimSpacesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getJasperdisplaySourceFragments();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getJasperdisplaySourceFragments());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jasperdisplaySourceFragmentsKey = "jasper.displaySourceFragments";
	json_object_set_member(pJsonObject, jasperdisplaySourceFragmentsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDefaultissession();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDefaultissession());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultissessionKey = "default.is.session";
	json_object_set_member(pJsonObject, defaultissessionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspercompilerTargetVM()
{
	return jaspercompilerTargetVM;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspercompilerTargetVM(ConfigNodePropertyString  jaspercompilerTargetVM)
{
	this->jaspercompilerTargetVM = jaspercompilerTargetVM;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspercompilerSourceVM()
{
	return jaspercompilerSourceVM;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspercompilerSourceVM(ConfigNodePropertyString  jaspercompilerSourceVM)
{
	this->jaspercompilerSourceVM = jaspercompilerSourceVM;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperclassdebuginfo()
{
	return jasperclassdebuginfo;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperclassdebuginfo(ConfigNodePropertyBoolean  jasperclassdebuginfo)
{
	this->jasperclassdebuginfo = jasperclassdebuginfo;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperenablePooling()
{
	return jasperenablePooling;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperenablePooling(ConfigNodePropertyBoolean  jasperenablePooling)
{
	this->jasperenablePooling = jasperenablePooling;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperieClassId()
{
	return jasperieClassId;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperieClassId(ConfigNodePropertyString  jasperieClassId)
{
	this->jasperieClassId = jasperieClassId;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspergenStringAsCharArray()
{
	return jaspergenStringAsCharArray;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspergenStringAsCharArray(ConfigNodePropertyBoolean  jaspergenStringAsCharArray)
{
	this->jaspergenStringAsCharArray = jaspergenStringAsCharArray;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperkeepgenerated()
{
	return jasperkeepgenerated;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperkeepgenerated(ConfigNodePropertyBoolean  jasperkeepgenerated)
{
	this->jasperkeepgenerated = jasperkeepgenerated;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspermappedfile()
{
	return jaspermappedfile;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspermappedfile(ConfigNodePropertyBoolean  jaspermappedfile)
{
	this->jaspermappedfile = jaspermappedfile;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspertrimSpaces()
{
	return jaspertrimSpaces;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspertrimSpaces(ConfigNodePropertyBoolean  jaspertrimSpaces)
{
	this->jaspertrimSpaces = jaspertrimSpaces;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperdisplaySourceFragments()
{
	return jasperdisplaySourceFragments;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperdisplaySourceFragments(ConfigNodePropertyBoolean  jasperdisplaySourceFragments)
{
	this->jasperdisplaySourceFragments = jasperdisplaySourceFragments;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getDefaultissession()
{
	return defaultissession;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setDefaultissession(ConfigNodePropertyBoolean  defaultissession)
{
	this->defaultissession = defaultissession;
}


