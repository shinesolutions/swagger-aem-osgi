
/*
 * ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties();
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcommerceassethandlerfallback();

	/*! \brief Set 
	 */
	void setCqcommerceassethandlerfallback(ConfigNodePropertyString cqcommerceassethandlerfallback);


    private:
    ConfigNodePropertyString cqcommerceassethandlerfallback;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties_H_ */
