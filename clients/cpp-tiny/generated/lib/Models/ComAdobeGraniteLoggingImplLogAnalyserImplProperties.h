
/*
 * ComAdobeGraniteLoggingImplLogAnalyserImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteLoggingImplLogAnalyserImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteLoggingImplLogAnalyserImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteLoggingImplLogAnalyserImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteLoggingImplLogAnalyserImplProperties();
    ComAdobeGraniteLoggingImplLogAnalyserImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteLoggingImplLogAnalyserImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMessagesqueuesize();

	/*! \brief Set 
	 */
	void setMessagesqueuesize(ConfigNodePropertyInteger messagesqueuesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLoggerconfig();

	/*! \brief Set 
	 */
	void setLoggerconfig(ConfigNodePropertyArray loggerconfig);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMessagessize();

	/*! \brief Set 
	 */
	void setMessagessize(ConfigNodePropertyInteger messagessize);


    private:
    ConfigNodePropertyInteger messagesqueuesize;
    ConfigNodePropertyArray loggerconfig;
    ConfigNodePropertyInteger messagessize;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteLoggingImplLogAnalyserImplProperties_H_ */
