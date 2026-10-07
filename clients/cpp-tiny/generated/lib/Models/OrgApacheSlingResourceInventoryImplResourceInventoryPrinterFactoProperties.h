
/*
 * OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties_H_


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

class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties();
    OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFelixinventoryprintername();

	/*! \brief Set 
	 */
	void setFelixinventoryprintername(ConfigNodePropertyString felixinventoryprintername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFelixinventoryprintertitle();

	/*! \brief Set 
	 */
	void setFelixinventoryprintertitle(ConfigNodePropertyString felixinventoryprintertitle);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);


    private:
    ConfigNodePropertyString felixinventoryprintername;
    ConfigNodePropertyString felixinventoryprintertitle;
    ConfigNodePropertyString path;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties_H_ */
