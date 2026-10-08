
/*
 * ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties();
    ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTypes();

	/*! \brief Set 
	 */
	void setTypes(ConfigNodePropertyArray types);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyArray types;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties_H_ */
