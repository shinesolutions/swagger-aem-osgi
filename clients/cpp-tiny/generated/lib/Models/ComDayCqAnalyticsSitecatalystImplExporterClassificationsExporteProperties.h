
/*
 * ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties_H_


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

class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties();
    ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowedpaths();

	/*! \brief Set 
	 */
	void setAllowedpaths(ConfigNodePropertyArray allowedpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqanalyticssaintexporterpagesize();

	/*! \brief Set 
	 */
	void setCqanalyticssaintexporterpagesize(ConfigNodePropertyInteger cqanalyticssaintexporterpagesize);


    private:
    ConfigNodePropertyArray allowedpaths;
    ConfigNodePropertyInteger cqanalyticssaintexporterpagesize;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties_H_ */
