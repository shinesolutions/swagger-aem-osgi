using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties
    /// </summary>
    public sealed class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties:  IEquatable<ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties>
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
        /// Use ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties()
        {
        }

        private ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties(ConfigNodePropertyString HcName, ConfigNodePropertyArray HcTags, ConfigNodePropertyString HcMbeanName)
        {
            
            this.HcName = HcName;
            
            this.HcTags = HcTags;
            
            this.HcMbeanName = HcMbeanName;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder</returns>
        public static ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder Builder()
        {
            return new ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder</returns>
        public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder With()
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

        public bool Equals(ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties left, ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties left, ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.
        /// </summary>
        public sealed class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder
        {
            private ConfigNodePropertyString _HcName;
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _HcMbeanName;

            internal ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.HcName property.
            /// </summary>
            /// <param name="value">HcName</param>
            public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder HcName(ConfigNodePropertyString value)
            {
                _HcName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.HcMbeanName property.
            /// </summary>
            /// <param name="value">HcMbeanName</param>
            public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesBuilder HcMbeanName(ConfigNodePropertyString value)
            {
                _HcMbeanName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.
            /// </summary>
            /// <returns>ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties</returns>
            public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties Build()
            {
                Validate();
                return new ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties(
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