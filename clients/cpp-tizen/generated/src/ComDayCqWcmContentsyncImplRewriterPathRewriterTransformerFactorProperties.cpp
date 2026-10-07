#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties()
{
	//__init();
}

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::~ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties()
{
	//__cleanup();
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::__init()
{
	//cqcontentsyncpathrewritertransformermappinglinks = new ConfigNodePropertyArray();
	//cqcontentsyncpathrewritertransformermappingclientlibs = new ConfigNodePropertyArray();
	//cqcontentsyncpathrewritertransformermappingimages = new ConfigNodePropertyArray();
	//cqcontentsyncpathrewritertransformerattributepattern = new ConfigNodePropertyString();
	//cqcontentsyncpathrewritertransformerclientlibrarypattern = new ConfigNodePropertyString();
	//cqcontentsyncpathrewritertransformerclientlibraryreplace = new ConfigNodePropertyString();
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::__cleanup()
{
	//if(cqcontentsyncpathrewritertransformermappinglinks != NULL) {
	//
	//delete cqcontentsyncpathrewritertransformermappinglinks;
	//cqcontentsyncpathrewritertransformermappinglinks = NULL;
	//}
	//if(cqcontentsyncpathrewritertransformermappingclientlibs != NULL) {
	//
	//delete cqcontentsyncpathrewritertransformermappingclientlibs;
	//cqcontentsyncpathrewritertransformermappingclientlibs = NULL;
	//}
	//if(cqcontentsyncpathrewritertransformermappingimages != NULL) {
	//
	//delete cqcontentsyncpathrewritertransformermappingimages;
	//cqcontentsyncpathrewritertransformermappingimages = NULL;
	//}
	//if(cqcontentsyncpathrewritertransformerattributepattern != NULL) {
	//
	//delete cqcontentsyncpathrewritertransformerattributepattern;
	//cqcontentsyncpathrewritertransformerattributepattern = NULL;
	//}
	//if(cqcontentsyncpathrewritertransformerclientlibrarypattern != NULL) {
	//
	//delete cqcontentsyncpathrewritertransformerclientlibrarypattern;
	//cqcontentsyncpathrewritertransformerclientlibrarypattern = NULL;
	//}
	//if(cqcontentsyncpathrewritertransformerclientlibraryreplace != NULL) {
	//
	//delete cqcontentsyncpathrewritertransformerclientlibraryreplace;
	//cqcontentsyncpathrewritertransformerclientlibraryreplace = NULL;
	//}
	//
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqcontentsyncpathrewritertransformermappinglinksKey = "cq.contentsync.pathrewritertransformer.mapping.links";
	node = json_object_get_member(pJsonObject, cqcontentsyncpathrewritertransformermappinglinksKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqcontentsyncpathrewritertransformermappinglinks, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqcontentsyncpathrewritertransformermappinglinks);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqcontentsyncpathrewritertransformermappingclientlibsKey = "cq.contentsync.pathrewritertransformer.mapping.clientlibs";
	node = json_object_get_member(pJsonObject, cqcontentsyncpathrewritertransformermappingclientlibsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqcontentsyncpathrewritertransformermappingclientlibs, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqcontentsyncpathrewritertransformermappingclientlibs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqcontentsyncpathrewritertransformermappingimagesKey = "cq.contentsync.pathrewritertransformer.mapping.images";
	node = json_object_get_member(pJsonObject, cqcontentsyncpathrewritertransformermappingimagesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqcontentsyncpathrewritertransformermappingimages, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqcontentsyncpathrewritertransformermappingimages);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqcontentsyncpathrewritertransformerattributepatternKey = "cq.contentsync.pathrewritertransformer.attribute.pattern";
	node = json_object_get_member(pJsonObject, cqcontentsyncpathrewritertransformerattributepatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqcontentsyncpathrewritertransformerattributepattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqcontentsyncpathrewritertransformerattributepattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqcontentsyncpathrewritertransformerclientlibrarypatternKey = "cq.contentsync.pathrewritertransformer.clientlibrary.pattern";
	node = json_object_get_member(pJsonObject, cqcontentsyncpathrewritertransformerclientlibrarypatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqcontentsyncpathrewritertransformerclientlibrarypattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqcontentsyncpathrewritertransformerclientlibrarypattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqcontentsyncpathrewritertransformerclientlibraryreplaceKey = "cq.contentsync.pathrewritertransformer.clientlibrary.replace";
	node = json_object_get_member(pJsonObject, cqcontentsyncpathrewritertransformerclientlibraryreplaceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqcontentsyncpathrewritertransformerclientlibraryreplace, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqcontentsyncpathrewritertransformerclientlibraryreplace);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqcontentsyncpathrewritertransformermappinglinks();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqcontentsyncpathrewritertransformermappinglinks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcontentsyncpathrewritertransformermappinglinksKey = "cq.contentsync.pathrewritertransformer.mapping.links";
	json_object_set_member(pJsonObject, cqcontentsyncpathrewritertransformermappinglinksKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqcontentsyncpathrewritertransformermappingclientlibs();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqcontentsyncpathrewritertransformermappingclientlibs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcontentsyncpathrewritertransformermappingclientlibsKey = "cq.contentsync.pathrewritertransformer.mapping.clientlibs";
	json_object_set_member(pJsonObject, cqcontentsyncpathrewritertransformermappingclientlibsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqcontentsyncpathrewritertransformermappingimages();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqcontentsyncpathrewritertransformermappingimages());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcontentsyncpathrewritertransformermappingimagesKey = "cq.contentsync.pathrewritertransformer.mapping.images";
	json_object_set_member(pJsonObject, cqcontentsyncpathrewritertransformermappingimagesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqcontentsyncpathrewritertransformerattributepattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqcontentsyncpathrewritertransformerattributepattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcontentsyncpathrewritertransformerattributepatternKey = "cq.contentsync.pathrewritertransformer.attribute.pattern";
	json_object_set_member(pJsonObject, cqcontentsyncpathrewritertransformerattributepatternKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqcontentsyncpathrewritertransformerclientlibrarypattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqcontentsyncpathrewritertransformerclientlibrarypattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcontentsyncpathrewritertransformerclientlibrarypatternKey = "cq.contentsync.pathrewritertransformer.clientlibrary.pattern";
	json_object_set_member(pJsonObject, cqcontentsyncpathrewritertransformerclientlibrarypatternKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqcontentsyncpathrewritertransformerclientlibraryreplace();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqcontentsyncpathrewritertransformerclientlibraryreplace());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcontentsyncpathrewritertransformerclientlibraryreplaceKey = "cq.contentsync.pathrewritertransformer.clientlibrary.replace";
	json_object_set_member(pJsonObject, cqcontentsyncpathrewritertransformerclientlibraryreplaceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformermappinglinks()
{
	return cqcontentsyncpathrewritertransformermappinglinks;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformermappinglinks(ConfigNodePropertyArray  cqcontentsyncpathrewritertransformermappinglinks)
{
	this->cqcontentsyncpathrewritertransformermappinglinks = cqcontentsyncpathrewritertransformermappinglinks;
}

ConfigNodePropertyArray
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformermappingclientlibs()
{
	return cqcontentsyncpathrewritertransformermappingclientlibs;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformermappingclientlibs(ConfigNodePropertyArray  cqcontentsyncpathrewritertransformermappingclientlibs)
{
	this->cqcontentsyncpathrewritertransformermappingclientlibs = cqcontentsyncpathrewritertransformermappingclientlibs;
}

ConfigNodePropertyArray
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformermappingimages()
{
	return cqcontentsyncpathrewritertransformermappingimages;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformermappingimages(ConfigNodePropertyArray  cqcontentsyncpathrewritertransformermappingimages)
{
	this->cqcontentsyncpathrewritertransformermappingimages = cqcontentsyncpathrewritertransformermappingimages;
}

ConfigNodePropertyString
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformerattributepattern()
{
	return cqcontentsyncpathrewritertransformerattributepattern;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformerattributepattern(ConfigNodePropertyString  cqcontentsyncpathrewritertransformerattributepattern)
{
	this->cqcontentsyncpathrewritertransformerattributepattern = cqcontentsyncpathrewritertransformerattributepattern;
}

ConfigNodePropertyString
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformerclientlibrarypattern()
{
	return cqcontentsyncpathrewritertransformerclientlibrarypattern;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformerclientlibrarypattern(ConfigNodePropertyString  cqcontentsyncpathrewritertransformerclientlibrarypattern)
{
	this->cqcontentsyncpathrewritertransformerclientlibrarypattern = cqcontentsyncpathrewritertransformerclientlibrarypattern;
}

ConfigNodePropertyString
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformerclientlibraryreplace()
{
	return cqcontentsyncpathrewritertransformerclientlibraryreplace;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformerclientlibraryreplace(ConfigNodePropertyString  cqcontentsyncpathrewritertransformerclientlibraryreplace)
{
	this->cqcontentsyncpathrewritertransformerclientlibraryreplace = cqcontentsyncpathrewritertransformerclientlibraryreplace;
}


