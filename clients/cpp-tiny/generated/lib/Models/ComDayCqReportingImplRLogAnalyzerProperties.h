
/*
 * ComDayCqReportingImplRLogAnalyzerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReportingImplRLogAnalyzerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReportingImplRLogAnalyzerProperties_H_


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

class ComDayCqReportingImplRLogAnalyzerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReportingImplRLogAnalyzerProperties();
    ComDayCqReportingImplRLogAnalyzerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReportingImplRLogAnalyzerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestlogoutput();

	/*! \brief Set 
	 */
	void setRequestlogoutput(ConfigNodePropertyString requestlogoutput);


    private:
    ConfigNodePropertyString requestlogoutput;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReportingImplRLogAnalyzerProperties_H_ */
