#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties()
{
	//__init();
}

ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::~ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::__init()
{
	//filepattern = new ConfigNodePropertyString();
	//buildpagenodes = new ConfigNodePropertyBoolean();
	//buildclientlibs = new ConfigNodePropertyBoolean();
	//buildcanvascomponent = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::__cleanup()
{
	//if(filepattern != NULL) {
	//
	//delete filepattern;
	//filepattern = NULL;
	//}
	//if(buildpagenodes != NULL) {
	//
	//delete buildpagenodes;
	//buildpagenodes = NULL;
	//}
	//if(buildclientlibs != NULL) {
	//
	//delete buildclientlibs;
	//buildclientlibs = NULL;
	//}
	//if(buildcanvascomponent != NULL) {
	//
	//delete buildcanvascomponent;
	//buildcanvascomponent = NULL;
	//}
	//
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *filepatternKey = "filepattern";
	node = json_object_get_member(pJsonObject, filepatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&filepattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&filepattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *buildpagenodesKey = "build.page.nodes";
	node = json_object_get_member(pJsonObject, buildpagenodesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&buildpagenodes, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&buildpagenodes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *buildclientlibsKey = "build.client.libs";
	node = json_object_get_member(pJsonObject, buildclientlibsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&buildclientlibs, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&buildclientlibs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *buildcanvascomponentKey = "build.canvas.component";
	node = json_object_get_member(pJsonObject, buildcanvascomponentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&buildcanvascomponent, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&buildcanvascomponent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFilepattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFilepattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filepatternKey = "filepattern";
	json_object_set_member(pJsonObject, filepatternKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getBuildpagenodes();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getBuildpagenodes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buildpagenodesKey = "build.page.nodes";
	json_object_set_member(pJsonObject, buildpagenodesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getBuildclientlibs();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getBuildclientlibs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buildclientlibsKey = "build.client.libs";
	json_object_set_member(pJsonObject, buildclientlibsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getBuildcanvascomponent();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getBuildcanvascomponent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *buildcanvascomponentKey = "build.canvas.component";
	json_object_set_member(pJsonObject, buildcanvascomponentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::getFilepattern()
{
	return filepattern;
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::setFilepattern(ConfigNodePropertyString  filepattern)
{
	this->filepattern = filepattern;
}

ConfigNodePropertyBoolean
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::getBuildpagenodes()
{
	return buildpagenodes;
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::setBuildpagenodes(ConfigNodePropertyBoolean  buildpagenodes)
{
	this->buildpagenodes = buildpagenodes;
}

ConfigNodePropertyBoolean
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::getBuildclientlibs()
{
	return buildclientlibs;
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::setBuildclientlibs(ConfigNodePropertyBoolean  buildclientlibs)
{
	this->buildclientlibs = buildclientlibs;
}

ConfigNodePropertyBoolean
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::getBuildcanvascomponent()
{
	return buildcanvascomponent;
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::setBuildcanvascomponent(ConfigNodePropertyBoolean  buildcanvascomponent)
{
	this->buildcanvascomponent = buildcanvascomponent;
}


