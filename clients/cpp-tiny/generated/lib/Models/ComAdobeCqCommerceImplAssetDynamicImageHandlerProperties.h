
/*
 * ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties();
    ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqcommerceassethandleractive();

	/*! \brief Set 
	 */
	void setCqcommerceassethandleractive(ConfigNodePropertyBoolean cqcommerceassethandleractive);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcommerceassethandlername();

	/*! \brief Set 
	 */
	void setCqcommerceassethandlername(ConfigNodePropertyString cqcommerceassethandlername);


    private:
    ConfigNodePropertyBoolean cqcommerceassethandleractive;
    ConfigNodePropertyString cqcommerceassethandlername;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties_H_ */
