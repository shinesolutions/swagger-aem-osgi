
/*
 * ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetStaticImageHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetStaticImageHandlerProperties_H_


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

class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCommerceImplAssetStaticImageHandlerProperties();
    ComAdobeCqCommerceImplAssetStaticImageHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCommerceImplAssetStaticImageHandlerProperties();


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

#endif /* TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetStaticImageHandlerProperties_H_ */
