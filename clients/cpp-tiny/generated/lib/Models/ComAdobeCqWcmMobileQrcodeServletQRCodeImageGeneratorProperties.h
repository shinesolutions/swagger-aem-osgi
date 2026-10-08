
/*
 * ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties();
    ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmqrcodeservletwhitelist();

	/*! \brief Set 
	 */
	void setCqwcmqrcodeservletwhitelist(ConfigNodePropertyArray cqwcmqrcodeservletwhitelist);


    private:
    ConfigNodePropertyArray cqwcmqrcodeservletwhitelist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties_H_ */
