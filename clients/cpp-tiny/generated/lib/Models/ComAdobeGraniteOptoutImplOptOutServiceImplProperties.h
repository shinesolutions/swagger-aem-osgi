
/*
 * ComAdobeGraniteOptoutImplOptOutServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOptoutImplOptOutServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOptoutImplOptOutServiceImplProperties_H_


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

class ComAdobeGraniteOptoutImplOptOutServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOptoutImplOptOutServiceImplProperties();
    ComAdobeGraniteOptoutImplOptOutServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOptoutImplOptOutServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOptoutcookies();

	/*! \brief Set 
	 */
	void setOptoutcookies(ConfigNodePropertyArray optoutcookies);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOptoutheaders();

	/*! \brief Set 
	 */
	void setOptoutheaders(ConfigNodePropertyArray optoutheaders);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOptoutwhitelistcookies();

	/*! \brief Set 
	 */
	void setOptoutwhitelistcookies(ConfigNodePropertyArray optoutwhitelistcookies);


    private:
    ConfigNodePropertyArray optoutcookies;
    ConfigNodePropertyArray optoutheaders;
    ConfigNodePropertyArray optoutwhitelistcookies;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOptoutImplOptOutServiceImplProperties_H_ */
