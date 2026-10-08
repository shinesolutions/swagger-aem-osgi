
/*
 * ComAdobeGraniteCorsImplCORSPolicyImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteCorsImplCORSPolicyImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteCorsImplCORSPolicyImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteCorsImplCORSPolicyImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteCorsImplCORSPolicyImplProperties();
    ComAdobeGraniteCorsImplCORSPolicyImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteCorsImplCORSPolicyImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAlloworigin();

	/*! \brief Set 
	 */
	void setAlloworigin(ConfigNodePropertyArray alloworigin);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAlloworiginregexp();

	/*! \brief Set 
	 */
	void setAlloworiginregexp(ConfigNodePropertyArray alloworiginregexp);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowedpaths();

	/*! \brief Set 
	 */
	void setAllowedpaths(ConfigNodePropertyArray allowedpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExposedheaders();

	/*! \brief Set 
	 */
	void setExposedheaders(ConfigNodePropertyArray exposedheaders);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxage();

	/*! \brief Set 
	 */
	void setMaxage(ConfigNodePropertyInteger maxage);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSupportedheaders();

	/*! \brief Set 
	 */
	void setSupportedheaders(ConfigNodePropertyArray supportedheaders);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSupportedmethods();

	/*! \brief Set 
	 */
	void setSupportedmethods(ConfigNodePropertyArray supportedmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSupportscredentials();

	/*! \brief Set 
	 */
	void setSupportscredentials(ConfigNodePropertyBoolean supportscredentials);


    private:
    ConfigNodePropertyArray alloworigin;
    ConfigNodePropertyArray alloworiginregexp;
    ConfigNodePropertyArray allowedpaths;
    ConfigNodePropertyArray exposedheaders;
    ConfigNodePropertyInteger maxage;
    ConfigNodePropertyArray supportedheaders;
    ConfigNodePropertyArray supportedmethods;
    ConfigNodePropertyBoolean supportscredentials;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteCorsImplCORSPolicyImplProperties_H_ */
