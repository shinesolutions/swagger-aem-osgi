
/*
 * ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties();
    ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitemaintenancemandatory();

	/*! \brief Set 
	 */
	void setGranitemaintenancemandatory(ConfigNodePropertyBoolean granitemaintenancemandatory);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJobtopics();

	/*! \brief Set 
	 */
	void setJobtopics(ConfigNodePropertyString jobtopics);


    private:
    ConfigNodePropertyBoolean granitemaintenancemandatory;
    ConfigNodePropertyString jobtopics;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties_H_ */
