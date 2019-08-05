/*
 * ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties_H_
#define _ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties_H_


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

class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties();
	ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties();

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

#endif /* _ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties_H_ */
