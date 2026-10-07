
/*
 * ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties();
    ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIsMemberCheck();

	/*! \brief Set 
	 */
	void setIsMemberCheck(ConfigNodePropertyBoolean isMemberCheck);


    private:
    ConfigNodePropertyBoolean isMemberCheck;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties_H_ */
