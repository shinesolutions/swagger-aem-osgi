
/*
 * ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties_H_


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

class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties();
    ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNumberofretriesallowed();

	/*! \brief Set 
	 */
	void setNumberofretriesallowed(ConfigNodePropertyInteger numberofretriesallowed);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);


    private:
    ConfigNodePropertyInteger numberofretriesallowed;
    ConfigNodePropertyArray hctags;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties_H_ */
