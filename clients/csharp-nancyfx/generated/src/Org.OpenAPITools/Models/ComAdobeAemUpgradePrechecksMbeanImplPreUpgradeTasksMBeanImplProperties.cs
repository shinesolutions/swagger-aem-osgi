using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties
    /// </summary>
    public sealed class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties:  IEquatable<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties>
    { 
        /// <summary>
        /// PreUpgradeMaintenanceTasks
        /// </summary>
        public ConfigNodePropertyArray PreUpgradeMaintenanceTasks { get; private set; }

        /// <summary>
        /// PreUpgradeHcTags
        /// </summary>
        public ConfigNodePropertyArray PreUpgradeHcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties()
        {
        }

        private ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(ConfigNodePropertyArray PreUpgradeMaintenanceTasks, ConfigNodePropertyArray PreUpgradeHcTags)
        {
            
            this.PreUpgradeMaintenanceTasks = PreUpgradeMaintenanceTasks;
            
            this.PreUpgradeHcTags = PreUpgradeHcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder</returns>
        public static ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder Builder()
        {
            return new ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder</returns>
        public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder With()
        {
            return Builder()
                .PreUpgradeMaintenanceTasks(PreUpgradeMaintenanceTasks)
                .PreUpgradeHcTags(PreUpgradeHcTags);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties left, ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties left, ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.
        /// </summary>
        public sealed class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _PreUpgradeMaintenanceTasks;
            private ConfigNodePropertyArray _PreUpgradeHcTags;

            internal ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.PreUpgradeMaintenanceTasks property.
            /// </summary>
            /// <param name="value">PreUpgradeMaintenanceTasks</param>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder PreUpgradeMaintenanceTasks(ConfigNodePropertyArray value)
            {
                _PreUpgradeMaintenanceTasks = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.PreUpgradeHcTags property.
            /// </summary>
            /// <param name="value">PreUpgradeHcTags</param>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder PreUpgradeHcTags(ConfigNodePropertyArray value)
            {
                _PreUpgradeHcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.
            /// </summary>
            /// <returns>ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties</returns>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties Build()
            {
                Validate();
                return new ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(
                    PreUpgradeMaintenanceTasks: _PreUpgradeMaintenanceTasks,
                    PreUpgradeHcTags: _PreUpgradeHcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}