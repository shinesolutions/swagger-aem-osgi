
/*
 * ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties_H_
#define TINY_CPP_CLIENT_ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties();
    ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTagpattern();

	/*! \brief Set 
	 */
	void setTagpattern(ConfigNodePropertyString tagpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComponentresourceType();

	/*! \brief Set 
	 */
	void setComponentresourceType(ConfigNodePropertyString componentresourceType);


    private:
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyString tagpattern;
    ConfigNodePropertyString componentresourceType;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties_H_ */
