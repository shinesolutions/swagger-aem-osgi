/*
 * ComAdobeGraniteLoggingImplLogAnalyserImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteLoggingImplLogAnalyserImplProperties_H_
#define _ComAdobeGraniteLoggingImplLogAnalyserImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeGraniteLoggingImplLogAnalyserImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteLoggingImplLogAnalyserImplProperties();
	ComAdobeGraniteLoggingImplLogAnalyserImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteLoggingImplLogAnalyserImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMessagesqueuesize();

	/*! \brief Set 
	 */
	void setMessagesqueuesize(ConfigNodePropertyInteger  messagesqueuesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLoggerconfig();

	/*! \brief Set 
	 */
	void setLoggerconfig(ConfigNodePropertyArray  loggerconfig);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMessagessize();

	/*! \brief Set 
	 */
	void setMessagessize(ConfigNodePropertyInteger  messagessize);

private:
	ConfigNodePropertyInteger messagesqueuesize;
	ConfigNodePropertyArray loggerconfig;
	ConfigNodePropertyInteger messagessize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteLoggingImplLogAnalyserImplProperties_H_ */
