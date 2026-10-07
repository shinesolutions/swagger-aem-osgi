
/*
 * ComDayCqPollingImporterImplManagedPollingImporterImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqPollingImporterImplManagedPollingImporterImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqPollingImporterImplManagedPollingImporterImplProperties_H_


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

class ComDayCqPollingImporterImplManagedPollingImporterImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqPollingImporterImplManagedPollingImporterImplProperties();
    ComDayCqPollingImporterImplManagedPollingImporterImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqPollingImporterImplManagedPollingImporterImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getImporteruser();

	/*! \brief Set 
	 */
	void setImporteruser(ConfigNodePropertyString importeruser);


    private:
    ConfigNodePropertyString importeruser;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqPollingImporterImplManagedPollingImporterImplProperties_H_ */
