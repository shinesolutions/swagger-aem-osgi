
/*
 * ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties_H_
#define TINY_CPP_CLIENT_ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties_H_


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

class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties();
    ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUpgradeTaskIgnoreList();

	/*! \brief Set 
	 */
	void setUpgradeTaskIgnoreList(ConfigNodePropertyArray upgradeTaskIgnoreList);


    private:
    ConfigNodePropertyArray upgradeTaskIgnoreList;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties_H_ */
