/*
 * ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties_H_
#define _ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties();
	ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcommerceassethandlerfallback();

	/*! \brief Set 
	 */
	void setCqcommerceassethandlerfallback(ConfigNodePropertyString  cqcommerceassethandlerfallback);

private:
	ConfigNodePropertyString cqcommerceassethandlerfallback;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties_H_ */
