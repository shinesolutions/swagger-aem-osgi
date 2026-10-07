
/*
 * ComAdobeGraniteCsrfImplCSRFServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteCsrfImplCSRFServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteCsrfImplCSRFServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteCsrfImplCSRFServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteCsrfImplCSRFServletProperties();
    ComAdobeGraniteCsrfImplCSRFServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteCsrfImplCSRFServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCsrftokenexpiresin();

	/*! \brief Set 
	 */
	void setCsrftokenexpiresin(ConfigNodePropertyInteger csrftokenexpiresin);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingauthrequirements();

	/*! \brief Set 
	 */
	void setSlingauthrequirements(ConfigNodePropertyString slingauthrequirements);


    private:
    ConfigNodePropertyInteger csrftokenexpiresin;
    ConfigNodePropertyString slingauthrequirements;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteCsrfImplCSRFServletProperties_H_ */
