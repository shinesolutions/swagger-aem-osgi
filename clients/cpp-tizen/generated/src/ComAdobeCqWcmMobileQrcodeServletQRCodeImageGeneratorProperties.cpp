#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties()
{
	//__init();
}

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::~ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties()
{
	//__cleanup();
}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::__init()
{
	//cqwcmqrcodeservletwhitelist = new ConfigNodePropertyArray();
}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::__cleanup()
{
	//if(cqwcmqrcodeservletwhitelist != NULL) {
	//
	//delete cqwcmqrcodeservletwhitelist;
	//cqwcmqrcodeservletwhitelist = NULL;
	//}
	//
}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqwcmqrcodeservletwhitelistKey = "cq.wcm.qrcode.servlet.whitelist";
	node = json_object_get_member(pJsonObject, cqwcmqrcodeservletwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqwcmqrcodeservletwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqwcmqrcodeservletwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqwcmqrcodeservletwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqwcmqrcodeservletwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmqrcodeservletwhitelistKey = "cq.wcm.qrcode.servlet.whitelist";
	json_object_set_member(pJsonObject, cqwcmqrcodeservletwhitelistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::getCqwcmqrcodeservletwhitelist()
{
	return cqwcmqrcodeservletwhitelist;
}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::setCqwcmqrcodeservletwhitelist(ConfigNodePropertyArray  cqwcmqrcodeservletwhitelist)
{
	this->cqwcmqrcodeservletwhitelist = cqwcmqrcodeservletwhitelist;
}


