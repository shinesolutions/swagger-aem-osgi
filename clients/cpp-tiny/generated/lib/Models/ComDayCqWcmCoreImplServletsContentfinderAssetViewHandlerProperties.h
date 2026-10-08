
/*
 * ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties_H_


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

class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties();
    ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDamshowexpired();

	/*! \brief Set 
	 */
	void setDamshowexpired(ConfigNodePropertyBoolean damshowexpired);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDamshowhidden();

	/*! \brief Set 
	 */
	void setDamshowhidden(ConfigNodePropertyBoolean damshowhidden);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTagTitleSearch();

	/*! \brief Set 
	 */
	void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGuessTotal();

	/*! \brief Set 
	 */
	void setGuessTotal(ConfigNodePropertyString guessTotal);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamexpiryProperty();

	/*! \brief Set 
	 */
	void setDamexpiryProperty(ConfigNodePropertyString damexpiryProperty);


    private:
    ConfigNodePropertyBoolean damshowexpired;
    ConfigNodePropertyBoolean damshowhidden;
    ConfigNodePropertyBoolean tagTitleSearch;
    ConfigNodePropertyString guessTotal;
    ConfigNodePropertyString damexpiryProperty;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties_H_ */
