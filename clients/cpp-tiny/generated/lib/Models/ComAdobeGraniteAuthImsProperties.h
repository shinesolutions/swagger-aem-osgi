
/*
 * ComAdobeGraniteAuthImsProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthImsProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthImsProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthImsProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthImsProperties();
    ComAdobeGraniteAuthImsProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthImsProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getConfigid();

	/*! \brief Set 
	 */
	void setConfigid(ConfigNodePropertyString configid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScope();

	/*! \brief Set 
	 */
	void setScope(ConfigNodePropertyString scope);


    private:
    ConfigNodePropertyString configid;
    ConfigNodePropertyString scope;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthImsProperties_H_ */
