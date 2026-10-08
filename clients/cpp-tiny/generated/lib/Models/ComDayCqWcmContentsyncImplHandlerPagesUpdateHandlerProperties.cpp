

#include "ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.h"

using namespace Tiny;

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties()
{
	cqpagesupdatehandlerimageresourcetypes = ConfigNodePropertyArray();
}

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::~ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties()
{

}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqpagesupdatehandlerimageresourcetypesKey = "cq.pagesupdatehandler.imageresourcetypes";

    if(object.has_key(cqpagesupdatehandlerimageresourcetypesKey))
    {
        bourne::json value = object[cqpagesupdatehandlerimageresourcetypesKey];




        ConfigNodePropertyArray* obj = &cqpagesupdatehandlerimageresourcetypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqpagesupdatehandlerimageresourcetypes"] = getCqpagesupdatehandlerimageresourcetypes().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::getCqpagesupdatehandlerimageresourcetypes()
{
	return cqpagesupdatehandlerimageresourcetypes;
}

void
ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties::setCqpagesupdatehandlerimageresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlerimageresourcetypes)
{
	this->cqpagesupdatehandlerimageresourcetypes = cqpagesupdatehandlerimageresourcetypes;
}



