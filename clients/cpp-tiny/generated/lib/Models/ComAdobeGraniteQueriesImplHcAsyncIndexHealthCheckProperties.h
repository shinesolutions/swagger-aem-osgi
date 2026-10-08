
/*
 * ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties_H_


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

class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties();
    ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getIndexingcriticalthreshold();

	/*! \brief Set 
	 */
	void setIndexingcriticalthreshold(ConfigNodePropertyInteger indexingcriticalthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getIndexingwarnthreshold();

	/*! \brief Set 
	 */
	void setIndexingwarnthreshold(ConfigNodePropertyInteger indexingwarnthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);


    private:
    ConfigNodePropertyInteger indexingcriticalthreshold;
    ConfigNodePropertyInteger indexingwarnthreshold;
    ConfigNodePropertyArray hctags;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties_H_ */
