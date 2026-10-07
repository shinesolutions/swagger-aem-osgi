/*
 * ComAdobeGraniteCorsImplCORSPolicyImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteCorsImplCORSPolicyImplProperties_H_
#define _ComAdobeGraniteCorsImplCORSPolicyImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeGraniteCorsImplCORSPolicyImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteCorsImplCORSPolicyImplProperties();
	ComAdobeGraniteCorsImplCORSPolicyImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteCorsImplCORSPolicyImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAlloworigin();

	/*! \brief Set 
	 */
	void setAlloworigin(ConfigNodePropertyArray  alloworigin);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAlloworiginregexp();

	/*! \brief Set 
	 */
	void setAlloworiginregexp(ConfigNodePropertyArray  alloworiginregexp);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowedpaths();

	/*! \brief Set 
	 */
	void setAllowedpaths(ConfigNodePropertyArray  allowedpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExposedheaders();

	/*! \brief Set 
	 */
	void setExposedheaders(ConfigNodePropertyArray  exposedheaders);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxage();

	/*! \brief Set 
	 */
	void setMaxage(ConfigNodePropertyInteger  maxage);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSupportedheaders();

	/*! \brief Set 
	 */
	void setSupportedheaders(ConfigNodePropertyArray  supportedheaders);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSupportedmethods();

	/*! \brief Set 
	 */
	void setSupportedmethods(ConfigNodePropertyArray  supportedmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSupportscredentials();

	/*! \brief Set 
	 */
	void setSupportscredentials(ConfigNodePropertyBoolean  supportscredentials);

private:
	ConfigNodePropertyArray alloworigin;
	ConfigNodePropertyArray alloworiginregexp;
	ConfigNodePropertyArray allowedpaths;
	ConfigNodePropertyArray exposedheaders;
	ConfigNodePropertyInteger maxage;
	ConfigNodePropertyArray supportedheaders;
	ConfigNodePropertyArray supportedmethods;
	ConfigNodePropertyBoolean supportscredentials;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteCorsImplCORSPolicyImplProperties_H_ */
