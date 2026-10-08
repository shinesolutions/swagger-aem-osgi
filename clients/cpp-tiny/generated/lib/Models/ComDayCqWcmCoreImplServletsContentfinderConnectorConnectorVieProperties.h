
/*
 * ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties();
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getItemresourcetypes();

	/*! \brief Set 
	 */
	void setItemresourcetypes(ConfigNodePropertyArray itemresourcetypes);


    private:
    ConfigNodePropertyArray itemresourcetypes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties_H_ */
