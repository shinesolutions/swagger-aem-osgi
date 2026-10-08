

#include "ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.h"

using namespace Tiny;

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties()
{
	linkcheckertransformerdisableRewriting = ConfigNodePropertyBoolean();
	linkcheckertransformerdisableChecking = ConfigNodePropertyBoolean();
	linkcheckertransformermapCacheSize = ConfigNodePropertyInteger();
	linkcheckertransformerstrictExtensionCheck = ConfigNodePropertyBoolean();
	linkcheckertransformerstripHtmltExtension = ConfigNodePropertyBoolean();
	linkcheckertransformerrewriteElements = ConfigNodePropertyArray();
	linkcheckertransformerstripExtensionPathBlacklist = ConfigNodePropertyArray();
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::~ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties()
{

}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *linkcheckertransformerdisableRewritingKey = "linkcheckertransformer.disableRewriting";

    if(object.has_key(linkcheckertransformerdisableRewritingKey))
    {
        bourne::json value = object[linkcheckertransformerdisableRewritingKey];




        ConfigNodePropertyBoolean* obj = &linkcheckertransformerdisableRewriting;
		obj->fromJson(value.dump());

    }

    const char *linkcheckertransformerdisableCheckingKey = "linkcheckertransformer.disableChecking";

    if(object.has_key(linkcheckertransformerdisableCheckingKey))
    {
        bourne::json value = object[linkcheckertransformerdisableCheckingKey];




        ConfigNodePropertyBoolean* obj = &linkcheckertransformerdisableChecking;
		obj->fromJson(value.dump());

    }

    const char *linkcheckertransformermapCacheSizeKey = "linkcheckertransformer.mapCacheSize";

    if(object.has_key(linkcheckertransformermapCacheSizeKey))
    {
        bourne::json value = object[linkcheckertransformermapCacheSizeKey];




        ConfigNodePropertyInteger* obj = &linkcheckertransformermapCacheSize;
		obj->fromJson(value.dump());

    }

    const char *linkcheckertransformerstrictExtensionCheckKey = "linkcheckertransformer.strictExtensionCheck";

    if(object.has_key(linkcheckertransformerstrictExtensionCheckKey))
    {
        bourne::json value = object[linkcheckertransformerstrictExtensionCheckKey];




        ConfigNodePropertyBoolean* obj = &linkcheckertransformerstrictExtensionCheck;
		obj->fromJson(value.dump());

    }

    const char *linkcheckertransformerstripHtmltExtensionKey = "linkcheckertransformer.stripHtmltExtension";

    if(object.has_key(linkcheckertransformerstripHtmltExtensionKey))
    {
        bourne::json value = object[linkcheckertransformerstripHtmltExtensionKey];




        ConfigNodePropertyBoolean* obj = &linkcheckertransformerstripHtmltExtension;
		obj->fromJson(value.dump());

    }

    const char *linkcheckertransformerrewriteElementsKey = "linkcheckertransformer.rewriteElements";

    if(object.has_key(linkcheckertransformerrewriteElementsKey))
    {
        bourne::json value = object[linkcheckertransformerrewriteElementsKey];




        ConfigNodePropertyArray* obj = &linkcheckertransformerrewriteElements;
		obj->fromJson(value.dump());

    }

    const char *linkcheckertransformerstripExtensionPathBlacklistKey = "linkcheckertransformer.stripExtensionPathBlacklist";

    if(object.has_key(linkcheckertransformerstripExtensionPathBlacklistKey))
    {
        bourne::json value = object[linkcheckertransformerstripExtensionPathBlacklistKey];




        ConfigNodePropertyArray* obj = &linkcheckertransformerstripExtensionPathBlacklist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["linkcheckertransformerdisableRewriting"] = getLinkcheckertransformerdisableRewriting().toJson();






	object["linkcheckertransformerdisableChecking"] = getLinkcheckertransformerdisableChecking().toJson();






	object["linkcheckertransformermapCacheSize"] = getLinkcheckertransformermapCacheSize().toJson();






	object["linkcheckertransformerstrictExtensionCheck"] = getLinkcheckertransformerstrictExtensionCheck().toJson();






	object["linkcheckertransformerstripHtmltExtension"] = getLinkcheckertransformerstripHtmltExtension().toJson();






	object["linkcheckertransformerrewriteElements"] = getLinkcheckertransformerrewriteElements().toJson();






	object["linkcheckertransformerstripExtensionPathBlacklist"] = getLinkcheckertransformerstripExtensionPathBlacklist().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerdisableRewriting()
{
	return linkcheckertransformerdisableRewriting;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerdisableRewriting(ConfigNodePropertyBoolean linkcheckertransformerdisableRewriting)
{
	this->linkcheckertransformerdisableRewriting = linkcheckertransformerdisableRewriting;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerdisableChecking()
{
	return linkcheckertransformerdisableChecking;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerdisableChecking(ConfigNodePropertyBoolean linkcheckertransformerdisableChecking)
{
	this->linkcheckertransformerdisableChecking = linkcheckertransformerdisableChecking;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformermapCacheSize()
{
	return linkcheckertransformermapCacheSize;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformermapCacheSize(ConfigNodePropertyInteger linkcheckertransformermapCacheSize)
{
	this->linkcheckertransformermapCacheSize = linkcheckertransformermapCacheSize;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerstrictExtensionCheck()
{
	return linkcheckertransformerstrictExtensionCheck;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerstrictExtensionCheck(ConfigNodePropertyBoolean linkcheckertransformerstrictExtensionCheck)
{
	this->linkcheckertransformerstrictExtensionCheck = linkcheckertransformerstrictExtensionCheck;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerstripHtmltExtension()
{
	return linkcheckertransformerstripHtmltExtension;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerstripHtmltExtension(ConfigNodePropertyBoolean linkcheckertransformerstripHtmltExtension)
{
	this->linkcheckertransformerstripHtmltExtension = linkcheckertransformerstripHtmltExtension;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerrewriteElements()
{
	return linkcheckertransformerrewriteElements;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerrewriteElements(ConfigNodePropertyArray linkcheckertransformerrewriteElements)
{
	this->linkcheckertransformerrewriteElements = linkcheckertransformerrewriteElements;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::getLinkcheckertransformerstripExtensionPathBlacklist()
{
	return linkcheckertransformerstripExtensionPathBlacklist;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties::setLinkcheckertransformerstripExtensionPathBlacklist(ConfigNodePropertyArray linkcheckertransformerstripExtensionPathBlacklist)
{
	this->linkcheckertransformerstripExtensionPathBlacklist = linkcheckertransformerstripExtensionPathBlacklist;
}



