
/*
 * ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties_H_


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

class ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties();
    ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);


    private:
    ConfigNodePropertyArray hctags;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties_H_ */
