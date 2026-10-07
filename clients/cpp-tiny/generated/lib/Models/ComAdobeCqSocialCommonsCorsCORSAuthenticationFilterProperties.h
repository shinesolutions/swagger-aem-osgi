
/*
 * ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties_H_


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

class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties();
    ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCorsenabling();

	/*! \brief Set 
	 */
	void setCorsenabling(ConfigNodePropertyBoolean corsenabling);


    private:
    ConfigNodePropertyBoolean corsenabling;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties_H_ */
