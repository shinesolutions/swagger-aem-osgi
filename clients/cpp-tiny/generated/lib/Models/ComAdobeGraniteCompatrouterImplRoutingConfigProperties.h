
/*
 * ComAdobeGraniteCompatrouterImplRoutingConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteCompatrouterImplRoutingConfigProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteCompatrouterImplRoutingConfigProperties_H_


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

class ComAdobeGraniteCompatrouterImplRoutingConfigProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties();
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteCompatrouterImplRoutingConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getId();

	/*! \brief Set 
	 */
	void setId(ConfigNodePropertyString id);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCompatPath();

	/*! \brief Set 
	 */
	void setCompatPath(ConfigNodePropertyString compatPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getNewPath();

	/*! \brief Set 
	 */
	void setNewPath(ConfigNodePropertyString newPath);


    private:
    ConfigNodePropertyString id;
    ConfigNodePropertyString compatPath;
    ConfigNodePropertyString newPath;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteCompatrouterImplRoutingConfigProperties_H_ */
