
/*
 * ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyFloat.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties();
    ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJmxobjectname();

	/*! \brief Set 
	 */
	void setJmxobjectname(ConfigNodePropertyString jmxobjectname);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPropertymeasureenabled();

	/*! \brief Set 
	 */
	void setPropertymeasureenabled(ConfigNodePropertyBoolean propertymeasureenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPropertyname();

	/*! \brief Set 
	 */
	void setPropertyname(ConfigNodePropertyString propertyname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPropertymaxwaitms();

	/*! \brief Set 
	 */
	void setPropertymaxwaitms(ConfigNodePropertyInteger propertymaxwaitms);
	/*! \brief Get 
	 */
	ConfigNodePropertyFloat getPropertymaxrate();

	/*! \brief Set 
	 */
	void setPropertymaxrate(ConfigNodePropertyFloat propertymaxrate);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFulltextmeasureenabled();

	/*! \brief Set 
	 */
	void setFulltextmeasureenabled(ConfigNodePropertyBoolean fulltextmeasureenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFulltextname();

	/*! \brief Set 
	 */
	void setFulltextname(ConfigNodePropertyString fulltextname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFulltextmaxwaitms();

	/*! \brief Set 
	 */
	void setFulltextmaxwaitms(ConfigNodePropertyInteger fulltextmaxwaitms);
	/*! \brief Get 
	 */
	ConfigNodePropertyFloat getFulltextmaxrate();

	/*! \brief Set 
	 */
	void setFulltextmaxrate(ConfigNodePropertyFloat fulltextmaxrate);


    private:
    ConfigNodePropertyString jmxobjectname;
    ConfigNodePropertyBoolean propertymeasureenabled;
    ConfigNodePropertyString propertyname;
    ConfigNodePropertyInteger propertymaxwaitms;
    ConfigNodePropertyFloat propertymaxrate;
    ConfigNodePropertyBoolean fulltextmeasureenabled;
    ConfigNodePropertyString fulltextname;
    ConfigNodePropertyInteger fulltextmaxwaitms;
    ConfigNodePropertyFloat fulltextmaxrate;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties_H_ */
