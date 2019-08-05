using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties
    /// </summary>
    public sealed class ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties:  IEquatable<ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties>
    { 
        /// <summary>
        /// HcName
        /// </summary>
        public ConfigNodePropertyString HcName { get; private set; }

        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// HcMbeanName
        /// </summary>
        public ConfigNodePropertyString HcMbeanName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties()
        {
        }

        private ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties(ConfigNodePropertyString HcName, ConfigNodePropertyArray HcTags, ConfigNodePropertyString HcMbeanName)
        {
            
            this.HcName = HcName;
            
            this.HcTags = HcTags;
            
            this.HcMbeanName = HcMbeanName;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder</returns>
        public static ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder Builder()
        {
            return new ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder</returns>
        public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder With()
        {
            return Builder()
                .HcName(HcName)
                .HcTags(HcTags)
                .HcMbeanName(HcMbeanName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties left, ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties left, ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.
        /// </summary>
        public sealed class ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder
        {
            private ConfigNodePropertyString _HcName;
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _HcMbeanName;

            internal ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.HcName property.
            /// </summary>
            /// <param name="value">HcName</param>
            public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder HcName(ConfigNodePropertyString value)
            {
                _HcName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.HcMbeanName property.
            /// </summary>
            /// <param name="value">HcMbeanName</param>
            public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesBuilder HcMbeanName(ConfigNodePropertyString value)
            {
                _HcMbeanName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.
            /// </summary>
            /// <returns>ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties</returns>
            public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties Build()
            {
                Validate();
                return new ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties(
                    HcName: _HcName,
                    HcTags: _HcTags,
                    HcMbeanName: _HcMbeanName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}