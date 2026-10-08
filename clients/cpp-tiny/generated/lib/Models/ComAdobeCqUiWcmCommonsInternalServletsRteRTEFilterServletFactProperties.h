
/*
 * ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties_H_


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

class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties();
    ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourcetypes();

	/*! \brief Set 
	 */
	void setResourcetypes(ConfigNodePropertyArray resourcetypes);


    private:
    ConfigNodePropertyArray resourcetypes;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties_H_ */
