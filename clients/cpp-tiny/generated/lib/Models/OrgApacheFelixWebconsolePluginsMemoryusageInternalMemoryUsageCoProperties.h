
/*
 * OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties();
    OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFelixmemoryusagedumpthreshold();

	/*! \brief Set 
	 */
	void setFelixmemoryusagedumpthreshold(ConfigNodePropertyInteger felixmemoryusagedumpthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFelixmemoryusagedumpinterval();

	/*! \brief Set 
	 */
	void setFelixmemoryusagedumpinterval(ConfigNodePropertyInteger felixmemoryusagedumpinterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFelixmemoryusagedumplocation();

	/*! \brief Set 
	 */
	void setFelixmemoryusagedumplocation(ConfigNodePropertyString felixmemoryusagedumplocation);


    private:
    ConfigNodePropertyInteger felixmemoryusagedumpthreshold;
    ConfigNodePropertyInteger felixmemoryusagedumpinterval;
    ConfigNodePropertyString felixmemoryusagedumplocation;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties_H_ */
