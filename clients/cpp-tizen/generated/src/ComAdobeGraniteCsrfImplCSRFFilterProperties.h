/*
 * ComAdobeGraniteCsrfImplCSRFFilterProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteCsrfImplCSRFFilterProperties_H_
#define _ComAdobeGraniteCsrfImplCSRFFilterProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteCsrfImplCSRFFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteCsrfImplCSRFFilterProperties();
	ComAdobeGraniteCsrfImplCSRFFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteCsrfImplCSRFFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiltermethods();

	/*! \brief Set 
	 */
	void setFiltermethods(ConfigNodePropertyArray  filtermethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFilterenablesafeuseragents();

	/*! \brief Set 
	 */
	void setFilterenablesafeuseragents(ConfigNodePropertyBoolean  filterenablesafeuseragents);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiltersafeuseragents();

	/*! \brief Set 
	 */
	void setFiltersafeuseragents(ConfigNodePropertyArray  filtersafeuseragents);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFilterexcludedpaths();

	/*! \brief Set 
	 */
	void setFilterexcludedpaths(ConfigNodePropertyArray  filterexcludedpaths);

private:
	ConfigNodePropertyArray filtermethods;
	ConfigNodePropertyBoolean filterenablesafeuseragents;
	ConfigNodePropertyArray filtersafeuseragents;
	ConfigNodePropertyArray filterexcludedpaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteCsrfImplCSRFFilterProperties_H_ */
