
/*
 * ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties();
    ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAggregaterelationships();

	/*! \brief Set 
	 */
	void setAggregaterelationships(ConfigNodePropertyArray aggregaterelationships);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAggregatedescendvirtual();

	/*! \brief Set 
	 */
	void setAggregatedescendvirtual(ConfigNodePropertyBoolean aggregatedescendvirtual);


    private:
    ConfigNodePropertyArray aggregaterelationships;
    ConfigNodePropertyBoolean aggregatedescendvirtual;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties_H_ */
