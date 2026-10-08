
/*
 * ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties_H_


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

class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties();
    ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPageinfoproviderpropertyregexdefault();

	/*! \brief Set 
	 */
	void setPageinfoproviderpropertyregexdefault(ConfigNodePropertyString pageinfoproviderpropertyregexdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPageinfoproviderpropertyname();

	/*! \brief Set 
	 */
	void setPageinfoproviderpropertyname(ConfigNodePropertyString pageinfoproviderpropertyname);


    private:
    ConfigNodePropertyString pageinfoproviderpropertyregexdefault;
    ConfigNodePropertyString pageinfoproviderpropertyname;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties_H_ */
