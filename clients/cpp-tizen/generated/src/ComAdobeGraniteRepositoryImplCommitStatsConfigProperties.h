/*
 * ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRepositoryImplCommitStatsConfigProperties_H_
#define _ComAdobeGraniteRepositoryImplCommitStatsConfigProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
	ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getIntervalSeconds();

	/*! \brief Set 
	 */
	void setIntervalSeconds(ConfigNodePropertyInteger  intervalSeconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCommitsPerIntervalThreshold();

	/*! \brief Set 
	 */
	void setCommitsPerIntervalThreshold(ConfigNodePropertyInteger  commitsPerIntervalThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxLocationLength();

	/*! \brief Set 
	 */
	void setMaxLocationLength(ConfigNodePropertyInteger  maxLocationLength);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxDetailsShown();

	/*! \brief Set 
	 */
	void setMaxDetailsShown(ConfigNodePropertyInteger  maxDetailsShown);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinDetailsPercentage();

	/*! \brief Set 
	 */
	void setMinDetailsPercentage(ConfigNodePropertyInteger  minDetailsPercentage);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getThreadMatchers();

	/*! \brief Set 
	 */
	void setThreadMatchers(ConfigNodePropertyArray  threadMatchers);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxGreedyDepth();

	/*! \brief Set 
	 */
	void setMaxGreedyDepth(ConfigNodePropertyInteger  maxGreedyDepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGreedyStackMatchers();

	/*! \brief Set 
	 */
	void setGreedyStackMatchers(ConfigNodePropertyString  greedyStackMatchers);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getStackFilters();

	/*! \brief Set 
	 */
	void setStackFilters(ConfigNodePropertyArray  stackFilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getStackMatchers();

	/*! \brief Set 
	 */
	void setStackMatchers(ConfigNodePropertyArray  stackMatchers);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getStackCategorizers();

	/*! \brief Set 
	 */
	void setStackCategorizers(ConfigNodePropertyArray  stackCategorizers);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getStackShorteners();

	/*! \brief Set 
	 */
	void setStackShorteners(ConfigNodePropertyArray  stackShorteners);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRepositoryImplCommitStatsConfigProperties_H_ */
