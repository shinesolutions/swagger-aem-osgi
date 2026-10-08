
/*
 * ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties_H_


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

class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties();
    ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyString slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletextensions();

	/*! \brief Set 
	 */
	void setSlingservletextensions(ConfigNodePropertyString slingservletextensions);


    private:
    ConfigNodePropertyString slingservletselectors;
    ConfigNodePropertyString slingservletextensions;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties_H_ */
