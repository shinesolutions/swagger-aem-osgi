#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties()
{
	//__init();
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::~ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties()
{
	//__cleanup();
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::__init()
{
	//linkcheckertransformerdisableRewriting = new ConfigNodePropertyBoolean();
	//linkcheckertransformerdisableChecking = new ConfigNodePropertyBoolean();
	//linkcheckertransformermapCacheSize = new ConfigNodePropertyInteger();
	//linkcheckertransformerstrictExtensionCheck = new ConfigNodePropertyBoolean();
	//linkcheckertransformerstripHtmltExtension = new ConfigNodePropertyBoolean();
	//linkcheckertransformerrewriteElements = new ConfigNodePropertyArray();
	//linkcheckertransformerstripExtensionPathBlacklist = new ConfigNodePropertyArray();
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::__cleanup()
{
	//if(linkcheckertransformerdisableRewriting != NULL) {
	//
	//delete linkcheckertransformerdisableRewriting;
	//linkcheckertransformerdisableRewriting = NULL;
	//}
	//if(linkcheckertransformerdisableChecking != NULL) {
	//
	//delete linkcheckertransformerdisableChecking;
	//linkcheckertransformerdisableChecking = NULL;
	//}
	//if(linkcheckertransformermapCacheSize != NULL) {
	//
	//delete linkcheckertransformermapCacheSize;
	//linkcheckertransformermapCacheSize = NULL;
	//}
	//if(linkcheckertransformerstrictExtensionCheck != NULL) {
	//
	//delete linkcheckertransformerstrictExtensionCheck;
	//linkcheckertransformerstrictExtensionCheck = NULL;
	//}
	//if(linkcheckertransformerstripHtmltExtension != NULL) {
	//
	//delete linkcheckertransformerstripHtmltExtension;
	//linkcheckertransformerstripHtmltExtension = NULL;
	//}
	//if(linkcheckertransformerrewriteElements != NULL) {
	//
	//delete linkcheckertransformerrewriteElements;
	//linkcheckertransformerrewriteElements = NULL;
	//}
	//if(linkcheckertransformerstripExtensionPathBlacklist != NULL) {
	//
	//delete linkcheckertransformerstripExtensionPathBlacklist;
	//linkcheckertransformerstripExtensionPathBlacklist = NULL;
	//}
	//
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *linkcheckertransformerdisableRewritingKey = "linkcheckertransformer.disableRewriting";
	node = json_object_get_member(pJsonObject, linkcheckertransformerdisableRewritingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&linkcheckertransformerdisableRewriting, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&linkcheckertransformerdisableRewriting);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkcheckertransformerdisableCheckingKey = "linkcheckertransformer.disableChecking";
	node = json_object_get_member(pJsonObject, linkcheckertransformerdisableCheckingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&linkcheckertransformerdisableChecking, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&linkcheckertransformerdisableChecking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkcheckertransformermapCacheSizeKey = "linkcheckertransformer.mapCacheSize";
	node = json_object_get_member(pJsonObject, linkcheckertransformermapCacheSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&linkcheckertransformermapCacheSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&linkcheckertransformermapCacheSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkcheckertransformerstrictExtensionCheckKey = "linkcheckertransformer.strictExtensionCheck";
	node = json_object_get_member(pJsonObject, linkcheckertransformerstrictExtensionCheckKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&linkcheckertransformerstrictExtensionCheck, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&linkcheckertransformerstrictExtensionCheck);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkcheckertransformerstripHtmltExtensionKey = "linkcheckertransformer.stripHtmltExtension";
	node = json_object_get_member(pJsonObject, linkcheckertransformerstripHtmltExtensionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&linkcheckertransformerstripHtmltExtension, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&linkcheckertransformerstripHtmltExtension);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkcheckertransformerrewriteElementsKey = "linkcheckertransformer.rewriteElements";
	node = json_object_get_member(pJsonObject, linkcheckertransformerrewriteElementsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&linkcheckertransformerrewriteElements, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&linkcheckertransformerrewriteElements);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkcheckertransformerstripExtensionPathBlacklistKey = "linkcheckertransformer.stripExtensionPathBlacklist";
	node = json_object_get_member(pJsonObject, linkcheckertransformerstripExtensionPathBlacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&linkcheckertransformerstripExtensionPathBlacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&linkcheckertransformerstripExtensionPathBlacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLinkcheckertransformerdisableRewriting();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLinkcheckertransformerdisableRewriting());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkcheckertransformerdisableRewritingKey = "linkcheckertransformer.disableRewriting";
	json_object_set_member(pJsonObject, linkcheckertransformerdisableRewritingKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLinkcheckertransformerdisableChecking();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLinkcheckertransformerdisableChecking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkcheckertransformerdisableCheckingKey = "linkcheckertransformer.disableChecking";
	json_object_set_member(pJsonObject, linkcheckertransformerdisableCheckingKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLinkcheckertransformermapCacheSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLinkcheckertransformermapCacheSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkcheckertransformermapCacheSizeKey = "linkcheckertransformer.mapCacheSize";
	json_object_set_member(pJsonObject, linkcheckertransformermapCacheSizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLinkcheckertransformerstrictExtensionCheck();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLinkcheckertransformerstrictExtensionCheck());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkcheckertransformerstrictExtensionCheckKey = "linkcheckertransformer.strictExtensionCheck";
	json_object_set_member(pJsonObject, linkcheckertransformerstrictExtensionCheckKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLinkcheckertransformerstripHtmltExtension();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLinkcheckertransformerstripHtmltExtension());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkcheckertransformerstripHtmltExtensionKey = "linkcheckertransformer.stripHtmltExtension";
	json_object_set_member(pJsonObject, linkcheckertransformerstripHtmltExtensionKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getLinkcheckertransformerrewriteElements();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getLinkcheckertransformerrewriteElements());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkcheckertransformerrewriteElementsKey = "linkcheckertransformer.rewriteElements";
	json_object_set_member(pJsonObject, linkcheckertransformerrewriteElementsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getLinkcheckertransformerstripExtensionPathBlacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getLinkcheckertransformerstripExtensionPathBlacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkcheckertransformerstripExtensionPathBlacklistKey = "linkcheckertransformer.stripExtensionPathBlacklist";
	json_object_set_member(pJsonObject, linkcheckertransformerstripExtensionPathBlacklistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerdisableRewriting()
{
	return linkcheckertransformerdisableRewriting;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerdisableRewriting(ConfigNodePropertyBoolean  linkcheckertransformerdisableRewriting)
{
	this->linkcheckertransformerdisableRewriting = linkcheckertransformerdisableRewriting;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerdisableChecking()
{
	return linkcheckertransformerdisableChecking;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerdisableChecking(ConfigNodePropertyBoolean  linkcheckertransformerdisableChecking)
{
	this->linkcheckertransformerdisableChecking = linkcheckertransformerdisableChecking;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformermapCacheSize()
{
	return linkcheckertransformermapCacheSize;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformermapCacheSize(ConfigNodePropertyInteger  linkcheckertransformermapCacheSize)
{
	this->linkcheckertransformermapCacheSize = linkcheckertransformermapCacheSize;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerstrictExtensionCheck()
{
	return linkcheckertransformerstrictExtensionCheck;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerstrictExtensionCheck(ConfigNodePropertyBoolean  linkcheckertransformerstrictExtensionCheck)
{
	this->linkcheckertransformerstrictExtensionCheck = linkcheckertransformerstrictExtensionCheck;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerstripHtmltExtension()
{
	return linkcheckertransformerstripHtmltExtension;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerstripHtmltExtension(ConfigNodePropertyBoolean  linkcheckertransformerstripHtmltExtension)
{
	this->linkcheckertransformerstripHtmltExtension = linkcheckertransformerstripHtmltExtension;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerrewriteElements()
{
	return linkcheckertransformerrewriteElements;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerrewriteElements(ConfigNodePropertyArray  linkcheckertransformerrewriteElements)
{
	this->linkcheckertransformerrewriteElements = linkcheckertransformerrewriteElements;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerstripExtensionPathBlacklist()
{
	return linkcheckertransformerstripExtensionPathBlacklist;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerstripExtensionPathBlacklist(ConfigNodePropertyArray  linkcheckertransformerstripExtensionPathBlacklist)
{
	this->linkcheckertransformerstripExtensionPathBlacklist = linkcheckertransformerstripExtensionPathBlacklist;
}


