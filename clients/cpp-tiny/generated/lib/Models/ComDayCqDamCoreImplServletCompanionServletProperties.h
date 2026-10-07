
/*
 * ComDayCqDamCoreImplServletCompanionServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCompanionServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCompanionServletProperties_H_


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

class ComDayCqDamCoreImplServletCompanionServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletCompanionServletProperties();
    ComDayCqDamCoreImplServletCompanionServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletCompanionServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMoreInfo();

	/*! \brief Set 
	 */
	void setMoreInfo(ConfigNodePropertyString moreInfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMntoverlaydamguicontentassetsmoreinfohtmlpath();

	/*! \brief Set 
	 */
	void setMntoverlaydamguicontentassetsmoreinfohtmlpath(ConfigNodePropertyString mntoverlaydamguicontentassetsmoreinfohtmlpath);


    private:
    ConfigNodePropertyString moreInfo;
    ConfigNodePropertyString mntoverlaydamguicontentassetsmoreinfohtmlpath;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCompanionServletProperties_H_ */
