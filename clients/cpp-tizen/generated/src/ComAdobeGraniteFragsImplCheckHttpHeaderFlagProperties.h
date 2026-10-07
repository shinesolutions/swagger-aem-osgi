/*
 * ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties_H_
#define _ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
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

class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties();
	ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFeaturename();

	/*! \brief Set 
	 */
	void setFeaturename(ConfigNodePropertyString  featurename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFeaturedescription();

	/*! \brief Set 
	 */
	void setFeaturedescription(ConfigNodePropertyString  featuredescription);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHttpheadername();

	/*! \brief Set 
	 */
	void setHttpheadername(ConfigNodePropertyString  httpheadername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHttpheadervaluepattern();

	/*! \brief Set 
	 */
	void setHttpheadervaluepattern(ConfigNodePropertyString  httpheadervaluepattern);

private:
	ConfigNodePropertyString featurename;
	ConfigNodePropertyString featuredescription;
	ConfigNodePropertyString httpheadername;
	ConfigNodePropertyString httpheadervaluepattern;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties_H_ */
