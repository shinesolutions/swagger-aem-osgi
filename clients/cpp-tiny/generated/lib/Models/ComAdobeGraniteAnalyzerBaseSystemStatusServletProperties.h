
/*
 * ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties();
    ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDisabled();

	/*! \brief Set 
	 */
	void setDisabled(ConfigNodePropertyBoolean disabled);


    private:
    ConfigNodePropertyBoolean disabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties_H_ */
