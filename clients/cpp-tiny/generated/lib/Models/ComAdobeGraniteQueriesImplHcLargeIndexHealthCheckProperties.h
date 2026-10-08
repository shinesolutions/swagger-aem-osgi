
/*
 * ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties();
    ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeindexcriticalthreshold();

	/*! \brief Set 
	 */
	void setLargeindexcriticalthreshold(ConfigNodePropertyInteger largeindexcriticalthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeindexwarnthreshold();

	/*! \brief Set 
	 */
	void setLargeindexwarnthreshold(ConfigNodePropertyInteger largeindexwarnthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);


    private:
    ConfigNodePropertyInteger largeindexcriticalthreshold;
    ConfigNodePropertyInteger largeindexwarnthreshold;
    ConfigNodePropertyArray hctags;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties_H_ */
