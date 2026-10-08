
/*
 * ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties_H_


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

class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties();
    ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDeviceinfotransformerenabled();

	/*! \brief Set 
	 */
	void setDeviceinfotransformerenabled(ConfigNodePropertyBoolean deviceinfotransformerenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDeviceinfotransformercssstyle();

	/*! \brief Set 
	 */
	void setDeviceinfotransformercssstyle(ConfigNodePropertyString deviceinfotransformercssstyle);


    private:
    ConfigNodePropertyBoolean deviceinfotransformerenabled;
    ConfigNodePropertyString deviceinfotransformercssstyle;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties_H_ */
