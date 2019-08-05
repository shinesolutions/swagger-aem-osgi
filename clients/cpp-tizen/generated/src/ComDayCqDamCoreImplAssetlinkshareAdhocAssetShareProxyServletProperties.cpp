#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::~ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::__init()
{
	//cqdamadhocassetshareprezipmaxcontentsize = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::__cleanup()
{
	//if(cqdamadhocassetshareprezipmaxcontentsize != NULL) {
	//
	//delete cqdamadhocassetshareprezipmaxcontentsize;
	//cqdamadhocassetshareprezipmaxcontentsize = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamadhocassetshareprezipmaxcontentsizeKey = "cq.dam.adhoc.asset.share.prezip.maxcontentsize";
	node = json_object_get_member(pJsonObject, cqdamadhocassetshareprezipmaxcontentsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamadhocassetshareprezipmaxcontentsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamadhocassetshareprezipmaxcontentsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamadhocassetshareprezipmaxcontentsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamadhocassetshareprezipmaxcontentsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamadhocassetshareprezipmaxcontentsizeKey = "cq.dam.adhoc.asset.share.prezip.maxcontentsize";
	json_object_set_member(pJsonObject, cqdamadhocassetshareprezipmaxcontentsizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::getCqdamadhocassetshareprezipmaxcontentsize()
{
	return cqdamadhocassetshareprezipmaxcontentsize;
}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::setCqdamadhocassetshareprezipmaxcontentsize(ConfigNodePropertyInteger  cqdamadhocassetshareprezipmaxcontentsize)
{
	this->cqdamadhocassetshareprezipmaxcontentsize = cqdamadhocassetshareprezipmaxcontentsize;
}


