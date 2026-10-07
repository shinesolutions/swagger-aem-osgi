#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties()
{
	//__init();
}

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::~ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::__init()
{
	//replicatecommentresourceTypes = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::__cleanup()
{
	//if(replicatecommentresourceTypes != NULL) {
	//
	//delete replicatecommentresourceTypes;
	//replicatecommentresourceTypes = NULL;
	//}
	//
}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *replicatecommentresourceTypesKey = "replicate.comment.resourceTypes";
	node = json_object_get_member(pJsonObject, replicatecommentresourceTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&replicatecommentresourceTypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&replicatecommentresourceTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getReplicatecommentresourceTypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getReplicatecommentresourceTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *replicatecommentresourceTypesKey = "replicate.comment.resourceTypes";
	json_object_set_member(pJsonObject, replicatecommentresourceTypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::getReplicatecommentresourceTypes()
{
	return replicatecommentresourceTypes;
}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::setReplicatecommentresourceTypes(ConfigNodePropertyArray  replicatecommentresourceTypes)
{
	this->replicatecommentresourceTypes = replicatecommentresourceTypes;
}


