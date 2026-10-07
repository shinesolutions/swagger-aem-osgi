#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties()
{
	//__init();
}

ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::~ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::__init()
{
	//cqcommercepromotionroot = new ConfigNodePropertyString();
}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::__cleanup()
{
	//if(cqcommercepromotionroot != NULL) {
	//
	//delete cqcommercepromotionroot;
	//cqcommercepromotionroot = NULL;
	//}
	//
}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqcommercepromotionrootKey = "cq.commerce.promotion.root";
	node = json_object_get_member(pJsonObject, cqcommercepromotionrootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqcommercepromotionroot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqcommercepromotionroot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqcommercepromotionroot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqcommercepromotionroot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqcommercepromotionrootKey = "cq.commerce.promotion.root";
	json_object_set_member(pJsonObject, cqcommercepromotionrootKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::getCqcommercepromotionroot()
{
	return cqcommercepromotionroot;
}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::setCqcommercepromotionroot(ConfigNodePropertyString  cqcommercepromotionroot)
{
	this->cqcommercepromotionroot = cqcommercepromotionroot;
}


