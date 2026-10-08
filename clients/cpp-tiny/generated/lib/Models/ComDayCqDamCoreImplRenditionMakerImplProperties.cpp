

#include "ComDayCqDamCoreImplRenditionMakerImplProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplRenditionMakerImplProperties::ComDayCqDamCoreImplRenditionMakerImplProperties()
{
	xmppropagate = ConfigNodePropertyBoolean();
	xmpexcludes = ConfigNodePropertyArray();
}

ComDayCqDamCoreImplRenditionMakerImplProperties::ComDayCqDamCoreImplRenditionMakerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplRenditionMakerImplProperties::~ComDayCqDamCoreImplRenditionMakerImplProperties()
{

}

void
ComDayCqDamCoreImplRenditionMakerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *xmppropagateKey = "xmp.propagate";

    if(object.has_key(xmppropagateKey))
    {
        bourne::json value = object[xmppropagateKey];




        ConfigNodePropertyBoolean* obj = &xmppropagate;
		obj->fromJson(value.dump());

    }

    const char *xmpexcludesKey = "xmp.excludes";

    if(object.has_key(xmpexcludesKey))
    {
        bourne::json value = object[xmpexcludesKey];




        ConfigNodePropertyArray* obj = &xmpexcludes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplRenditionMakerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["xmppropagate"] = getXmppropagate().toJson();






	object["xmpexcludes"] = getXmpexcludes().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplRenditionMakerImplProperties::getXmppropagate()
{
	return xmppropagate;
}

void
ComDayCqDamCoreImplRenditionMakerImplProperties::setXmppropagate(ConfigNodePropertyBoolean xmppropagate)
{
	this->xmppropagate = xmppropagate;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplRenditionMakerImplProperties::getXmpexcludes()
{
	return xmpexcludes;
}

void
ComDayCqDamCoreImplRenditionMakerImplProperties::setXmpexcludes(ConfigNodePropertyArray xmpexcludes)
{
	this->xmpexcludes = xmpexcludes;
}



