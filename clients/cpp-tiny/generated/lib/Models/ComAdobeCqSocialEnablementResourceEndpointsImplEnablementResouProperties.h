
/*
 * ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties_H_


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

class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties();
    ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFieldWhitelist();

	/*! \brief Set 
	 */
	void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist);


    private:
    ConfigNodePropertyArray fieldWhitelist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties_H_ */
