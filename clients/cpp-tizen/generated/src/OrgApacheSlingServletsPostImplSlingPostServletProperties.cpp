#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingServletsPostImplSlingPostServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingServletsPostImplSlingPostServletProperties::OrgApacheSlingServletsPostImplSlingPostServletProperties()
{
	//__init();
}

OrgApacheSlingServletsPostImplSlingPostServletProperties::~OrgApacheSlingServletsPostImplSlingPostServletProperties()
{
	//__cleanup();
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::__init()
{
	//servletpostdateFormats = new ConfigNodePropertyArray();
	//servletpostnodeNameHints = new ConfigNodePropertyArray();
	//servletpostnodeNameMaxLength = new ConfigNodePropertyInteger();
	//servletpostcheckinNewVersionableNodes = new ConfigNodePropertyBoolean();
	//servletpostautoCheckout = new ConfigNodePropertyBoolean();
	//servletpostautoCheckin = new ConfigNodePropertyBoolean();
	//servletpostignorePattern = new ConfigNodePropertyString();
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::__cleanup()
{
	//if(servletpostdateFormats != NULL) {
	//
	//delete servletpostdateFormats;
	//servletpostdateFormats = NULL;
	//}
	//if(servletpostnodeNameHints != NULL) {
	//
	//delete servletpostnodeNameHints;
	//servletpostnodeNameHints = NULL;
	//}
	//if(servletpostnodeNameMaxLength != NULL) {
	//
	//delete servletpostnodeNameMaxLength;
	//servletpostnodeNameMaxLength = NULL;
	//}
	//if(servletpostcheckinNewVersionableNodes != NULL) {
	//
	//delete servletpostcheckinNewVersionableNodes;
	//servletpostcheckinNewVersionableNodes = NULL;
	//}
	//if(servletpostautoCheckout != NULL) {
	//
	//delete servletpostautoCheckout;
	//servletpostautoCheckout = NULL;
	//}
	//if(servletpostautoCheckin != NULL) {
	//
	//delete servletpostautoCheckin;
	//servletpostautoCheckin = NULL;
	//}
	//if(servletpostignorePattern != NULL) {
	//
	//delete servletpostignorePattern;
	//servletpostignorePattern = NULL;
	//}
	//
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *servletpostdateFormatsKey = "servlet.post.dateFormats";
	node = json_object_get_member(pJsonObject, servletpostdateFormatsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&servletpostdateFormats, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&servletpostdateFormats);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletpostnodeNameHintsKey = "servlet.post.nodeNameHints";
	node = json_object_get_member(pJsonObject, servletpostnodeNameHintsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&servletpostnodeNameHints, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&servletpostnodeNameHints);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletpostnodeNameMaxLengthKey = "servlet.post.nodeNameMaxLength";
	node = json_object_get_member(pJsonObject, servletpostnodeNameMaxLengthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&servletpostnodeNameMaxLength, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&servletpostnodeNameMaxLength);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletpostcheckinNewVersionableNodesKey = "servlet.post.checkinNewVersionableNodes";
	node = json_object_get_member(pJsonObject, servletpostcheckinNewVersionableNodesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&servletpostcheckinNewVersionableNodes, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&servletpostcheckinNewVersionableNodes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletpostautoCheckoutKey = "servlet.post.autoCheckout";
	node = json_object_get_member(pJsonObject, servletpostautoCheckoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&servletpostautoCheckout, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&servletpostautoCheckout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletpostautoCheckinKey = "servlet.post.autoCheckin";
	node = json_object_get_member(pJsonObject, servletpostautoCheckinKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&servletpostautoCheckin, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&servletpostautoCheckin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletpostignorePatternKey = "servlet.post.ignorePattern";
	node = json_object_get_member(pJsonObject, servletpostignorePatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&servletpostignorePattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&servletpostignorePattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingServletsPostImplSlingPostServletProperties::OrgApacheSlingServletsPostImplSlingPostServletProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingServletsPostImplSlingPostServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getServletpostdateFormats();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getServletpostdateFormats());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletpostdateFormatsKey = "servlet.post.dateFormats";
	json_object_set_member(pJsonObject, servletpostdateFormatsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getServletpostnodeNameHints();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getServletpostnodeNameHints());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletpostnodeNameHintsKey = "servlet.post.nodeNameHints";
	json_object_set_member(pJsonObject, servletpostnodeNameHintsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServletpostnodeNameMaxLength();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServletpostnodeNameMaxLength());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletpostnodeNameMaxLengthKey = "servlet.post.nodeNameMaxLength";
	json_object_set_member(pJsonObject, servletpostnodeNameMaxLengthKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getServletpostcheckinNewVersionableNodes();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getServletpostcheckinNewVersionableNodes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletpostcheckinNewVersionableNodesKey = "servlet.post.checkinNewVersionableNodes";
	json_object_set_member(pJsonObject, servletpostcheckinNewVersionableNodesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getServletpostautoCheckout();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getServletpostautoCheckout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletpostautoCheckoutKey = "servlet.post.autoCheckout";
	json_object_set_member(pJsonObject, servletpostautoCheckoutKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getServletpostautoCheckin();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getServletpostautoCheckin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletpostautoCheckinKey = "servlet.post.autoCheckin";
	json_object_set_member(pJsonObject, servletpostautoCheckinKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServletpostignorePattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServletpostignorePattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletpostignorePatternKey = "servlet.post.ignorePattern";
	json_object_set_member(pJsonObject, servletpostignorePatternKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostdateFormats()
{
	return servletpostdateFormats;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostdateFormats(ConfigNodePropertyArray  servletpostdateFormats)
{
	this->servletpostdateFormats = servletpostdateFormats;
}

ConfigNodePropertyArray
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostnodeNameHints()
{
	return servletpostnodeNameHints;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostnodeNameHints(ConfigNodePropertyArray  servletpostnodeNameHints)
{
	this->servletpostnodeNameHints = servletpostnodeNameHints;
}

ConfigNodePropertyInteger
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostnodeNameMaxLength()
{
	return servletpostnodeNameMaxLength;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostnodeNameMaxLength(ConfigNodePropertyInteger  servletpostnodeNameMaxLength)
{
	this->servletpostnodeNameMaxLength = servletpostnodeNameMaxLength;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostcheckinNewVersionableNodes()
{
	return servletpostcheckinNewVersionableNodes;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostcheckinNewVersionableNodes(ConfigNodePropertyBoolean  servletpostcheckinNewVersionableNodes)
{
	this->servletpostcheckinNewVersionableNodes = servletpostcheckinNewVersionableNodes;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostautoCheckout()
{
	return servletpostautoCheckout;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostautoCheckout(ConfigNodePropertyBoolean  servletpostautoCheckout)
{
	this->servletpostautoCheckout = servletpostautoCheckout;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostautoCheckin()
{
	return servletpostautoCheckin;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostautoCheckin(ConfigNodePropertyBoolean  servletpostautoCheckin)
{
	this->servletpostautoCheckin = servletpostautoCheckin;
}

ConfigNodePropertyString
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostignorePattern()
{
	return servletpostignorePattern;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostignorePattern(ConfigNodePropertyString  servletpostignorePattern)
{
	this->servletpostignorePattern = servletpostignorePattern;
}


