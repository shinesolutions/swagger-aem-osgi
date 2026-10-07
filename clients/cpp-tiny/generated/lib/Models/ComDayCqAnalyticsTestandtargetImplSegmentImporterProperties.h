
/*
 * ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties();
    ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqanalyticstestandtargetsegmentimporterenabled();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetsegmentimporterenabled(ConfigNodePropertyBoolean cqanalyticstestandtargetsegmentimporterenabled);


    private:
    ConfigNodePropertyBoolean cqanalyticstestandtargetsegmentimporterenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties_H_ */
