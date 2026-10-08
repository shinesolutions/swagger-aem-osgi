

#include "ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::ComDayCqWcmCoreImplServletsReferenceSearchServletProperties()
{
	referencesearchservletmaxReferencesPerPage = ConfigNodePropertyInteger();
	referencesearchservletmaxPages = ConfigNodePropertyInteger();
}

ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::~ComDayCqWcmCoreImplServletsReferenceSearchServletProperties()
{

}

void
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *referencesearchservletmaxReferencesPerPageKey = "referencesearchservlet.maxReferencesPerPage";

    if(object.has_key(referencesearchservletmaxReferencesPerPageKey))
    {
        bourne::json value = object[referencesearchservletmaxReferencesPerPageKey];




        ConfigNodePropertyInteger* obj = &referencesearchservletmaxReferencesPerPage;
		obj->fromJson(value.dump());

    }

    const char *referencesearchservletmaxPagesKey = "referencesearchservlet.maxPages";

    if(object.has_key(referencesearchservletmaxPagesKey))
    {
        bourne::json value = object[referencesearchservletmaxPagesKey];




        ConfigNodePropertyInteger* obj = &referencesearchservletmaxPages;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["referencesearchservletmaxReferencesPerPage"] = getReferencesearchservletmaxReferencesPerPage().toJson();






	object["referencesearchservletmaxPages"] = getReferencesearchservletmaxPages().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::getReferencesearchservletmaxReferencesPerPage()
{
	return referencesearchservletmaxReferencesPerPage;
}

void
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::setReferencesearchservletmaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletmaxReferencesPerPage)
{
	this->referencesearchservletmaxReferencesPerPage = referencesearchservletmaxReferencesPerPage;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::getReferencesearchservletmaxPages()
{
	return referencesearchservletmaxPages;
}

void
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::setReferencesearchservletmaxPages(ConfigNodePropertyInteger referencesearchservletmaxPages)
{
	this->referencesearchservletmaxPages = referencesearchservletmaxPages;
}



