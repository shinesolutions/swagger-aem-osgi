using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
    /// </summary>
    public sealed class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties:  IEquatable<ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties>
    { 
        /// <summary>
        /// RootPath
        /// </summary>
        public ConfigNodePropertyString RootPath { get; private set; }

        /// <summary>
        /// FixInconsistencies
        /// </summary>
        public ConfigNodePropertyBoolean FixInconsistencies { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties()
        {
        }

        private ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(ConfigNodePropertyString RootPath, ConfigNodePropertyBoolean FixInconsistencies)
        {
            
            this.RootPath = RootPath;
            
            this.FixInconsistencies = FixInconsistencies;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder</returns>
        public static ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder Builder()
        {
            return new ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder</returns>
        public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder With()
        {
            return Builder()
                .RootPath(RootPath)
                .FixInconsistencies(FixInconsistencies);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties left, ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties left, ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
        /// </summary>
        public sealed class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder
        {
            private ConfigNodePropertyString _RootPath;
            private ConfigNodePropertyBoolean _FixInconsistencies;

            internal ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.RootPath property.
            /// </summary>
            /// <param name="value">RootPath</param>
            public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder RootPath(ConfigNodePropertyString value)
            {
                _RootPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.FixInconsistencies property.
            /// </summary>
            /// <param name="value">FixInconsistencies</param>
            public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder FixInconsistencies(ConfigNodePropertyBoolean value)
            {
                _FixInconsistencies = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
            /// </summary>
            /// <returns>ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties</returns>
            public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties Build()
            {
                Validate();
                return new ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(
                    RootPath: _RootPath,
                    FixInconsistencies: _FixInconsistencies
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}