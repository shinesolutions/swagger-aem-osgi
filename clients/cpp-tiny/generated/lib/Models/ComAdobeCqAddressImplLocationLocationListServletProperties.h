
/*
 * ComAdobeCqAddressImplLocationLocationListServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqAddressImplLocationLocationListServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqAddressImplLocationLocationListServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqAddressImplLocationLocationListServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqAddressImplLocationLocationListServletProperties();
    ComAdobeCqAddressImplLocationLocationListServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqAddressImplLocationLocationListServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqaddresslocationdefaultmaxResults();

	/*! \brief Set 
	 */
	void setCqaddresslocationdefaultmaxResults(ConfigNodePropertyInteger cqaddresslocationdefaultmaxResults);


    private:
    ConfigNodePropertyInteger cqaddresslocationdefaultmaxResults;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqAddressImplLocationLocationListServletProperties_H_ */
