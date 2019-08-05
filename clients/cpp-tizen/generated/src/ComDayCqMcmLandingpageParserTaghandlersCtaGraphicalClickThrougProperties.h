/*
 * ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.h
 *
 * 
 */

#ifndef _ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties_H_
#define _ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties();
	ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTagpattern();

	/*! \brief Set 
	 */
	void setTagpattern(ConfigNodePropertyString  tagpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComponentresourceType();

	/*! \brief Set 
	 */
	void setComponentresourceType(ConfigNodePropertyString  componentresourceType);

private:
	ConfigNodePropertyInteger serviceranking;
	ConfigNodePropertyString tagpattern;
	ConfigNodePropertyString componentresourceType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties_H_ */
