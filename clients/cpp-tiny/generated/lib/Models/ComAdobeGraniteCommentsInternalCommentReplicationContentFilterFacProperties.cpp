

#include "ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.h"

using namespace Tiny;

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties()
{
	replicatecommentresourceTypes = ConfigNodePropertyArray();
}

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::~ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties()
{

}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *replicatecommentresourceTypesKey = "replicate.comment.resourceTypes";

    if(object.has_key(replicatecommentresourceTypesKey))
    {
        bourne::json value = object[replicatecommentresourceTypesKey];




        ConfigNodePropertyArray* obj = &replicatecommentresourceTypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["replicatecommentresourceTypes"] = getReplicatecommentresourceTypes().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::getReplicatecommentresourceTypes()
{
	return replicatecommentresourceTypes;
}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties::setReplicatecommentresourceTypes(ConfigNodePropertyArray replicatecommentresourceTypes)
{
	this->replicatecommentresourceTypes = replicatecommentresourceTypes;
}



