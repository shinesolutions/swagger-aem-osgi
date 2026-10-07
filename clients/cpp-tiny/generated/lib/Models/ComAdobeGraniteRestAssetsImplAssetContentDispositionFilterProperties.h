
/*
 * ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties();
    ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getMimeallowEmpty();

	/*! \brief Set 
	 */
	void setMimeallowEmpty(ConfigNodePropertyBoolean mimeallowEmpty);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimeallowed();

	/*! \brief Set 
	 */
	void setMimeallowed(ConfigNodePropertyArray mimeallowed);


    private:
    ConfigNodePropertyBoolean mimeallowEmpty;
    ConfigNodePropertyArray mimeallowed;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties_H_ */
