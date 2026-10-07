
/*
 * ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties();
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnable();

	/*! \brief Set 
	 */
	void setEnable(ConfigNodePropertyBoolean enable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTtl1();

	/*! \brief Set 
	 */
	void setTtl1(ConfigNodePropertyInteger ttl1);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTtl2();

	/*! \brief Set 
	 */
	void setTtl2(ConfigNodePropertyInteger ttl2);


    private:
    ConfigNodePropertyBoolean enable;
    ConfigNodePropertyInteger ttl1;
    ConfigNodePropertyInteger ttl2;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties_H_ */
