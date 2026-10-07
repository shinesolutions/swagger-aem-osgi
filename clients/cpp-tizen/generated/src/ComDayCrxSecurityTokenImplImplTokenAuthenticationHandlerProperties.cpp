#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties()
{
	//__init();
}

ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::~ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties()
{
	//__cleanup();
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::__init()
{
	//path = new ConfigNodePropertyString();
	//tokenrequiredattr = new ConfigNodePropertyDropDown();
	//tokenalternateurl = new ConfigNodePropertyString();
	//tokenencapsulated = new ConfigNodePropertyBoolean();
	//skiptokenrefresh = new ConfigNodePropertyArray();
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(tokenrequiredattr != NULL) {
	//
	//delete tokenrequiredattr;
	//tokenrequiredattr = NULL;
	//}
	//if(tokenalternateurl != NULL) {
	//
	//delete tokenalternateurl;
	//tokenalternateurl = NULL;
	//}
	//if(tokenencapsulated != NULL) {
	//
	//delete tokenencapsulated;
	//tokenencapsulated = NULL;
	//}
	//if(skiptokenrefresh != NULL) {
	//
	//delete skiptokenrefresh;
	//skiptokenrefresh = NULL;
	//}
	//
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&path, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tokenrequiredattrKey = "token.required.attr";
	node = json_object_get_member(pJsonObject, tokenrequiredattrKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&tokenrequiredattr, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&tokenrequiredattr);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tokenalternateurlKey = "token.alternate.url";
	node = json_object_get_member(pJsonObject, tokenalternateurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&tokenalternateurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&tokenalternateurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tokenencapsulatedKey = "token.encapsulated";
	node = json_object_get_member(pJsonObject, tokenencapsulatedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&tokenencapsulated, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&tokenencapsulated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *skiptokenrefreshKey = "skip.token.refresh";
	node = json_object_get_member(pJsonObject, skiptokenrefreshKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&skiptokenrefresh, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&skiptokenrefresh);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getTokenrequiredattr();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getTokenrequiredattr());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tokenrequiredattrKey = "token.required.attr";
	json_object_set_member(pJsonObject, tokenrequiredattrKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTokenalternateurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTokenalternateurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tokenalternateurlKey = "token.alternate.url";
	json_object_set_member(pJsonObject, tokenalternateurlKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getTokenencapsulated();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getTokenencapsulated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tokenencapsulatedKey = "token.encapsulated";
	json_object_set_member(pJsonObject, tokenencapsulatedKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSkiptokenrefresh();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSkiptokenrefresh());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *skiptokenrefreshKey = "skip.token.refresh";
	json_object_set_member(pJsonObject, skiptokenrefreshKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyDropDown
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getTokenrequiredattr()
{
	return tokenrequiredattr;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setTokenrequiredattr(ConfigNodePropertyDropDown  tokenrequiredattr)
{
	this->tokenrequiredattr = tokenrequiredattr;
}

ConfigNodePropertyString
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getTokenalternateurl()
{
	return tokenalternateurl;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setTokenalternateurl(ConfigNodePropertyString  tokenalternateurl)
{
	this->tokenalternateurl = tokenalternateurl;
}

ConfigNodePropertyBoolean
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getTokenencapsulated()
{
	return tokenencapsulated;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setTokenencapsulated(ConfigNodePropertyBoolean  tokenencapsulated)
{
	this->tokenencapsulated = tokenencapsulated;
}

ConfigNodePropertyArray
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::getSkiptokenrefresh()
{
	return skiptokenrefresh;
}

void
ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties::setSkiptokenrefresh(ConfigNodePropertyArray  skiptokenrefresh)
{
	this->skiptokenrefresh = skiptokenrefresh;
}


