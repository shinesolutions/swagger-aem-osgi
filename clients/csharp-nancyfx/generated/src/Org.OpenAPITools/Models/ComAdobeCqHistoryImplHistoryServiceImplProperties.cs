using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqHistoryImplHistoryServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqHistoryImplHistoryServiceImplProperties:  IEquatable<ComAdobeCqHistoryImplHistoryServiceImplProperties>
    { 
        /// <summary>
        /// HistoryServiceResourceTypes
        /// </summary>
        public ConfigNodePropertyArray HistoryServiceResourceTypes { get; private set; }

        /// <summary>
        /// HistoryServicePathFilter
        /// </summary>
        public ConfigNodePropertyArray HistoryServicePathFilter { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqHistoryImplHistoryServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqHistoryImplHistoryServiceImplProperties()
        {
        }

        private ComAdobeCqHistoryImplHistoryServiceImplProperties(ConfigNodePropertyArray HistoryServiceResourceTypes, ConfigNodePropertyArray HistoryServicePathFilter)
        {
            
            this.HistoryServiceResourceTypes = HistoryServiceResourceTypes;
            
            this.HistoryServicePathFilter = HistoryServicePathFilter;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqHistoryImplHistoryServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder</returns>
        public ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder With()
        {
            return Builder()
                .HistoryServiceResourceTypes(HistoryServiceResourceTypes)
                .HistoryServicePathFilter(HistoryServicePathFilter);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqHistoryImplHistoryServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqHistoryImplHistoryServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHistoryImplHistoryServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqHistoryImplHistoryServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqHistoryImplHistoryServiceImplProperties left, ComAdobeCqHistoryImplHistoryServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqHistoryImplHistoryServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHistoryImplHistoryServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqHistoryImplHistoryServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqHistoryImplHistoryServiceImplProperties left, ComAdobeCqHistoryImplHistoryServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqHistoryImplHistoryServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _HistoryServiceResourceTypes;
            private ConfigNodePropertyArray _HistoryServicePathFilter;

            internal ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryServiceImplProperties.HistoryServiceResourceTypes property.
            /// </summary>
            /// <param name="value">HistoryServiceResourceTypes</param>
            public ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder HistoryServiceResourceTypes(ConfigNodePropertyArray value)
            {
                _HistoryServiceResourceTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryServiceImplProperties.HistoryServicePathFilter property.
            /// </summary>
            /// <param name="value">HistoryServicePathFilter</param>
            public ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder HistoryServicePathFilter(ConfigNodePropertyArray value)
            {
                _HistoryServicePathFilter = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqHistoryImplHistoryServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqHistoryImplHistoryServiceImplProperties</returns>
            public ComAdobeCqHistoryImplHistoryServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqHistoryImplHistoryServiceImplProperties(
                    HistoryServiceResourceTypes: _HistoryServiceResourceTypes,
                    HistoryServicePathFilter: _HistoryServicePathFilter
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}