
/*
 * ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties_H_


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

class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties();
    ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPseudopatterns();

	/*! \brief Set 
	 */
	void setPseudopatterns(ConfigNodePropertyArray pseudopatterns);


    private:
    ConfigNodePropertyArray pseudopatterns;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties_H_ */
