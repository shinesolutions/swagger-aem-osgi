

#include "ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.h"

using namespace Tiny;

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties()
{
	cqpagesupdatehandlerimageresourcetypes = ConfigNodePropertyArray();
	cqpagesupdatehandlerproductresourcetypes = ConfigNodePropertyArray();
	cqpagesupdatehandlervideoresourcetypes = ConfigNodePropertyArray();
	cqpagesupdatehandlerdynamicsequenceresourcetypes = ConfigNodePropertyArray();
	cqpagesupdatehandlerpreviewmodepaths = ConfigNodePropertyArray();
}

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::~ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties()
{

}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqpagesupdatehandlerimageresourcetypesKey = "cq.pagesupdatehandler.imageresourcetypes";

    if(object.has_key(cqpagesupdatehandlerimageresourcetypesKey))
    {
        bourne::json value = object[cqpagesupdatehandlerimageresourcetypesKey];




        ConfigNodePropertyArray* obj = &cqpagesupdatehandlerimageresourcetypes;
		obj->fromJson(value.dump());

    }

    const char *cqpagesupdatehandlerproductresourcetypesKey = "cq.pagesupdatehandler.productresourcetypes";

    if(object.has_key(cqpagesupdatehandlerproductresourcetypesKey))
    {
        bourne::json value = object[cqpagesupdatehandlerproductresourcetypesKey];




        ConfigNodePropertyArray* obj = &cqpagesupdatehandlerproductresourcetypes;
		obj->fromJson(value.dump());

    }

    const char *cqpagesupdatehandlervideoresourcetypesKey = "cq.pagesupdatehandler.videoresourcetypes";

    if(object.has_key(cqpagesupdatehandlervideoresourcetypesKey))
    {
        bourne::json value = object[cqpagesupdatehandlervideoresourcetypesKey];




        ConfigNodePropertyArray* obj = &cqpagesupdatehandlervideoresourcetypes;
		obj->fromJson(value.dump());

    }

    const char *cqpagesupdatehandlerdynamicsequenceresourcetypesKey = "cq.pagesupdatehandler.dynamicsequenceresourcetypes";

    if(object.has_key(cqpagesupdatehandlerdynamicsequenceresourcetypesKey))
    {
        bourne::json value = object[cqpagesupdatehandlerdynamicsequenceresourcetypesKey];




        ConfigNodePropertyArray* obj = &cqpagesupdatehandlerdynamicsequenceresourcetypes;
		obj->fromJson(value.dump());

    }

    const char *cqpagesupdatehandlerpreviewmodepathsKey = "cq.pagesupdatehandler.previewmodepaths";

    if(object.has_key(cqpagesupdatehandlerpreviewmodepathsKey))
    {
        bourne::json value = object[cqpagesupdatehandlerpreviewmodepathsKey];




        ConfigNodePropertyArray* obj = &cqpagesupdatehandlerpreviewmodepaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqpagesupdatehandlerimageresourcetypes"] = getCqpagesupdatehandlerimageresourcetypes().toJson();






	object["cqpagesupdatehandlerproductresourcetypes"] = getCqpagesupdatehandlerproductresourcetypes().toJson();






	object["cqpagesupdatehandlervideoresourcetypes"] = getCqpagesupdatehandlervideoresourcetypes().toJson();






	object["cqpagesupdatehandlerdynamicsequenceresourcetypes"] = getCqpagesupdatehandlerdynamicsequenceresourcetypes().toJson();






	object["cqpagesupdatehandlerpreviewmodepaths"] = getCqpagesupdatehandlerpreviewmodepaths().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlerimageresourcetypes()
{
	return cqpagesupdatehandlerimageresourcetypes;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlerimageresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlerimageresourcetypes)
{
	this->cqpagesupdatehandlerimageresourcetypes = cqpagesupdatehandlerimageresourcetypes;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlerproductresourcetypes()
{
	return cqpagesupdatehandlerproductresourcetypes;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlerproductresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlerproductresourcetypes)
{
	this->cqpagesupdatehandlerproductresourcetypes = cqpagesupdatehandlerproductresourcetypes;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlervideoresourcetypes()
{
	return cqpagesupdatehandlervideoresourcetypes;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlervideoresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlervideoresourcetypes)
{
	this->cqpagesupdatehandlervideoresourcetypes = cqpagesupdatehandlervideoresourcetypes;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlerdynamicsequenceresourcetypes()
{
	return cqpagesupdatehandlerdynamicsequenceresourcetypes;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlerdynamicsequenceresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlerdynamicsequenceresourcetypes)
{
	this->cqpagesupdatehandlerdynamicsequenceresourcetypes = cqpagesupdatehandlerdynamicsequenceresourcetypes;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlerpreviewmodepaths()
{
	return cqpagesupdatehandlerpreviewmodepaths;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlerpreviewmodepaths(ConfigNodePropertyArray cqpagesupdatehandlerpreviewmodepaths)
{
	this->cqpagesupdatehandlerpreviewmodepaths = cqpagesupdatehandlerpreviewmodepaths;
}



