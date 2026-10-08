
/*
 * ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRepositoryImplCommitStatsConfigProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRepositoryImplCommitStatsConfigProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
    ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getIntervalSeconds();

	/*! \brief Set 
	 */
	void setIntervalSeconds(ConfigNodePropertyInteger intervalSeconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCommitsPerIntervalThreshold();

	/*! \brief Set 
	 */
	void setCommitsPerIntervalThreshold(ConfigNodePropertyInteger commitsPerIntervalThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxLocationLength();

	/*! \brief Set 
	 */
	void setMaxLocationLength(ConfigNodePropertyInteger maxLocationLength);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxDetailsShown();

	/*! \brief Set 
	 */
	void setMaxDetailsShown(ConfigNodePropertyInteger maxDetailsShown);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinDetailsPercentage();

	/*! \brief Set 
	 */
	void setMinDetailsPercentage(ConfigNodePropertyInteger minDetailsPercentage);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getThreadMatchers();

	/*! \brief Set 
	 */
	void setThreadMatchers(ConfigNodePropertyArray threadMatchers);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxGreedyDepth();

	/*! \brief Set 
	 */
	void setMaxGreedyDepth(ConfigNodePropertyInteger maxGreedyDepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGreedyStackMatchers();

	/*! \brief Set 
	 */
	void setGreedyStackMatchers(ConfigNodePropertyString greedyStackMatchers);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getStackFilters();

	/*! \brief Set 
	 */
	void setStackFilters(ConfigNodePropertyArray stackFilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getStackMatchers();

	/*! \brief Set 
	 */
	void setStackMatchers(ConfigNodePropertyArray stackMatchers);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getStackCategorizers();

	/*! \brief Set 
	 */
	void setStackCategorizers(ConfigNodePropertyArray stackCategorizers);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getStackShorteners();

	/*! \brief Set 
	 */
	void setStackShorteners(ConfigNodePropertyArray stackShorteners);


    private:
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyInteger intervalSeconds;
    ConfigNodePropertyInteger commitsPerIntervalThreshold;
    ConfigNodePropertyInteger maxLocationLength;
    ConfigNodePropertyInteger maxDetailsShown;
    ConfigNodePropertyInteger minDetailsPercentage;
    ConfigNodePropertyArray threadMatchers;
    ConfigNodePropertyInteger maxGreedyDepth;
    ConfigNodePropertyString greedyStackMatchers;
    ConfigNodePropertyArray stackFilters;
    ConfigNodePropertyArray stackMatchers;
    ConfigNodePropertyArray stackCategorizers;
    ConfigNodePropertyArray stackShorteners;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRepositoryImplCommitStatsConfigProperties_H_ */
