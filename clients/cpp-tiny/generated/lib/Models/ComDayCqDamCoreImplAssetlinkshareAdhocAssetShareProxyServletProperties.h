
/*
 * ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties();
    ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamadhocassetshareprezipmaxcontentsize();

	/*! \brief Set 
	 */
	void setCqdamadhocassetshareprezipmaxcontentsize(ConfigNodePropertyInteger cqdamadhocassetshareprezipmaxcontentsize);


    private:
    ConfigNodePropertyInteger cqdamadhocassetshareprezipmaxcontentsize;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties_H_ */
