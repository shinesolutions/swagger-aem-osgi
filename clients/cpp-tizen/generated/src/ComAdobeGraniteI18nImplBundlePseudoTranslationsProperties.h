/*
 * ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties_H_
#define _ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties();
	ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPseudopatterns();

	/*! \brief Set 
	 */
	void setPseudopatterns(ConfigNodePropertyArray  pseudopatterns);

private:
	ConfigNodePropertyArray pseudopatterns;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties_H_ */
