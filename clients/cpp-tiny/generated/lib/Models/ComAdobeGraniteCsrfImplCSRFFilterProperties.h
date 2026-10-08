
/*
 * ComAdobeGraniteCsrfImplCSRFFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteCsrfImplCSRFFilterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteCsrfImplCSRFFilterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteCsrfImplCSRFFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteCsrfImplCSRFFilterProperties();
    ComAdobeGraniteCsrfImplCSRFFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteCsrfImplCSRFFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiltermethods();

	/*! \brief Set 
	 */
	void setFiltermethods(ConfigNodePropertyArray filtermethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFilterenablesafeuseragents();

	/*! \brief Set 
	 */
	void setFilterenablesafeuseragents(ConfigNodePropertyBoolean filterenablesafeuseragents);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiltersafeuseragents();

	/*! \brief Set 
	 */
	void setFiltersafeuseragents(ConfigNodePropertyArray filtersafeuseragents);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFilterexcludedpaths();

	/*! \brief Set 
	 */
	void setFilterexcludedpaths(ConfigNodePropertyArray filterexcludedpaths);


    private:
    ConfigNodePropertyArray filtermethods;
    ConfigNodePropertyBoolean filterenablesafeuseragents;
    ConfigNodePropertyArray filtersafeuseragents;
    ConfigNodePropertyArray filterexcludedpaths;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteCsrfImplCSRFFilterProperties_H_ */
