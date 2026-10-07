
/*
 * ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties_H_


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

class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties();
    ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJobtopics();

	/*! \brief Set 
	 */
	void setJobtopics(ConfigNodePropertyString jobtopics);


    private:
    ConfigNodePropertyString jobtopics;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties_H_ */
