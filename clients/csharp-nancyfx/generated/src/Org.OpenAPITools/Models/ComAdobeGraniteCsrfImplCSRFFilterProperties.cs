using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCsrfImplCSRFFilterProperties
    /// </summary>
    public sealed class ComAdobeGraniteCsrfImplCSRFFilterProperties:  IEquatable<ComAdobeGraniteCsrfImplCSRFFilterProperties>
    { 
        /// <summary>
        /// FilterMethods
        /// </summary>
        public ConfigNodePropertyArray FilterMethods { get; private set; }

        /// <summary>
        /// FilterEnableSafeUserAgents
        /// </summary>
        public ConfigNodePropertyBoolean FilterEnableSafeUserAgents { get; private set; }

        /// <summary>
        /// FilterSafeUserAgents
        /// </summary>
        public ConfigNodePropertyArray FilterSafeUserAgents { get; private set; }

        /// <summary>
        /// FilterExcludedPaths
        /// </summary>
        public ConfigNodePropertyArray FilterExcludedPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCsrfImplCSRFFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCsrfImplCSRFFilterProperties()
        {
        }

        private ComAdobeGraniteCsrfImplCSRFFilterProperties(ConfigNodePropertyArray FilterMethods, ConfigNodePropertyBoolean FilterEnableSafeUserAgents, ConfigNodePropertyArray FilterSafeUserAgents, ConfigNodePropertyArray FilterExcludedPaths)
        {
            
            this.FilterMethods = FilterMethods;
            
            this.FilterEnableSafeUserAgents = FilterEnableSafeUserAgents;
            
            this.FilterSafeUserAgents = FilterSafeUserAgents;
            
            this.FilterExcludedPaths = FilterExcludedPaths;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCsrfImplCSRFFilterProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder</returns>
        public static ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder</returns>
        public ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder With()
        {
            return Builder()
                .FilterMethods(FilterMethods)
                .FilterEnableSafeUserAgents(FilterEnableSafeUserAgents)
                .FilterSafeUserAgents(FilterSafeUserAgents)
                .FilterExcludedPaths(FilterExcludedPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteCsrfImplCSRFFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCsrfImplCSRFFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCsrfImplCSRFFilterProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCsrfImplCSRFFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCsrfImplCSRFFilterProperties left, ComAdobeGraniteCsrfImplCSRFFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCsrfImplCSRFFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCsrfImplCSRFFilterProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCsrfImplCSRFFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCsrfImplCSRFFilterProperties left, ComAdobeGraniteCsrfImplCSRFFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCsrfImplCSRFFilterProperties.
        /// </summary>
        public sealed class ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder
        {
            private ConfigNodePropertyArray _FilterMethods;
            private ConfigNodePropertyBoolean _FilterEnableSafeUserAgents;
            private ConfigNodePropertyArray _FilterSafeUserAgents;
            private ConfigNodePropertyArray _FilterExcludedPaths;

            internal ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterProperties.FilterMethods property.
            /// </summary>
            /// <param name="value">FilterMethods</param>
            public ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder FilterMethods(ConfigNodePropertyArray value)
            {
                _FilterMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterProperties.FilterEnableSafeUserAgents property.
            /// </summary>
            /// <param name="value">FilterEnableSafeUserAgents</param>
            public ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder FilterEnableSafeUserAgents(ConfigNodePropertyBoolean value)
            {
                _FilterEnableSafeUserAgents = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterProperties.FilterSafeUserAgents property.
            /// </summary>
            /// <param name="value">FilterSafeUserAgents</param>
            public ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder FilterSafeUserAgents(ConfigNodePropertyArray value)
            {
                _FilterSafeUserAgents = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterProperties.FilterExcludedPaths property.
            /// </summary>
            /// <param name="value">FilterExcludedPaths</param>
            public ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder FilterExcludedPaths(ConfigNodePropertyArray value)
            {
                _FilterExcludedPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCsrfImplCSRFFilterProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteCsrfImplCSRFFilterProperties</returns>
            public ComAdobeGraniteCsrfImplCSRFFilterProperties Build()
            {
                Validate();
                return new ComAdobeGraniteCsrfImplCSRFFilterProperties(
                    FilterMethods: _FilterMethods,
                    FilterEnableSafeUserAgents: _FilterEnableSafeUserAgents,
                    FilterSafeUserAgents: _FilterSafeUserAgents,
                    FilterExcludedPaths: _FilterExcludedPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}