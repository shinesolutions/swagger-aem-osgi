using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqHistoryImplHistoryRequestFilterProperties
    /// </summary>
    public sealed class ComAdobeCqHistoryImplHistoryRequestFilterProperties:  IEquatable<ComAdobeCqHistoryImplHistoryRequestFilterProperties>
    { 
        /// <summary>
        /// HistoryRequestFilterExcludedSelectors
        /// </summary>
        public ConfigNodePropertyArray HistoryRequestFilterExcludedSelectors { get; private set; }

        /// <summary>
        /// HistoryRequestFilterExcludedExtensions
        /// </summary>
        public ConfigNodePropertyArray HistoryRequestFilterExcludedExtensions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqHistoryImplHistoryRequestFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqHistoryImplHistoryRequestFilterProperties()
        {
        }

        private ComAdobeCqHistoryImplHistoryRequestFilterProperties(ConfigNodePropertyArray HistoryRequestFilterExcludedSelectors, ConfigNodePropertyArray HistoryRequestFilterExcludedExtensions)
        {
            
            this.HistoryRequestFilterExcludedSelectors = HistoryRequestFilterExcludedSelectors;
            
            this.HistoryRequestFilterExcludedExtensions = HistoryRequestFilterExcludedExtensions;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqHistoryImplHistoryRequestFilterProperties.
        /// </summary>
        /// <returns>ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder</returns>
        public static ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder Builder()
        {
            return new ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder</returns>
        public ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder With()
        {
            return Builder()
                .HistoryRequestFilterExcludedSelectors(HistoryRequestFilterExcludedSelectors)
                .HistoryRequestFilterExcludedExtensions(HistoryRequestFilterExcludedExtensions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqHistoryImplHistoryRequestFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqHistoryImplHistoryRequestFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHistoryImplHistoryRequestFilterProperties</param>
        /// <param name="right">Compared (ComAdobeCqHistoryImplHistoryRequestFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqHistoryImplHistoryRequestFilterProperties left, ComAdobeCqHistoryImplHistoryRequestFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqHistoryImplHistoryRequestFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHistoryImplHistoryRequestFilterProperties</param>
        /// <param name="right">Compared (ComAdobeCqHistoryImplHistoryRequestFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqHistoryImplHistoryRequestFilterProperties left, ComAdobeCqHistoryImplHistoryRequestFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqHistoryImplHistoryRequestFilterProperties.
        /// </summary>
        public sealed class ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder
        {
            private ConfigNodePropertyArray _HistoryRequestFilterExcludedSelectors;
            private ConfigNodePropertyArray _HistoryRequestFilterExcludedExtensions;

            internal ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryRequestFilterProperties.HistoryRequestFilterExcludedSelectors property.
            /// </summary>
            /// <param name="value">HistoryRequestFilterExcludedSelectors</param>
            public ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder HistoryRequestFilterExcludedSelectors(ConfigNodePropertyArray value)
            {
                _HistoryRequestFilterExcludedSelectors = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryRequestFilterProperties.HistoryRequestFilterExcludedExtensions property.
            /// </summary>
            /// <param name="value">HistoryRequestFilterExcludedExtensions</param>
            public ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder HistoryRequestFilterExcludedExtensions(ConfigNodePropertyArray value)
            {
                _HistoryRequestFilterExcludedExtensions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqHistoryImplHistoryRequestFilterProperties.
            /// </summary>
            /// <returns>ComAdobeCqHistoryImplHistoryRequestFilterProperties</returns>
            public ComAdobeCqHistoryImplHistoryRequestFilterProperties Build()
            {
                Validate();
                return new ComAdobeCqHistoryImplHistoryRequestFilterProperties(
                    HistoryRequestFilterExcludedSelectors: _HistoryRequestFilterExcludedSelectors,
                    HistoryRequestFilterExcludedExtensions: _HistoryRequestFilterExcludedExtensions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}