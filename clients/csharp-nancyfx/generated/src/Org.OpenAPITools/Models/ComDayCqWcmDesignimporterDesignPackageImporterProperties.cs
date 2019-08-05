using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterDesignPackageImporterProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterDesignPackageImporterProperties:  IEquatable<ComDayCqWcmDesignimporterDesignPackageImporterProperties>
    { 
        /// <summary>
        /// ExtractFilter
        /// </summary>
        public ConfigNodePropertyArray ExtractFilter { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterDesignPackageImporterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterDesignPackageImporterProperties()
        {
        }

        private ComDayCqWcmDesignimporterDesignPackageImporterProperties(ConfigNodePropertyArray ExtractFilter)
        {
            
            this.ExtractFilter = ExtractFilter;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterDesignPackageImporterProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder With()
        {
            return Builder()
                .ExtractFilter(ExtractFilter);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmDesignimporterDesignPackageImporterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterDesignPackageImporterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterDesignPackageImporterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterDesignPackageImporterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterDesignPackageImporterProperties left, ComDayCqWcmDesignimporterDesignPackageImporterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterDesignPackageImporterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterDesignPackageImporterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterDesignPackageImporterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterDesignPackageImporterProperties left, ComDayCqWcmDesignimporterDesignPackageImporterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterDesignPackageImporterProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder
        {
            private ConfigNodePropertyArray _ExtractFilter;

            internal ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterDesignPackageImporterProperties.ExtractFilter property.
            /// </summary>
            /// <param name="value">ExtractFilter</param>
            public ComDayCqWcmDesignimporterDesignPackageImporterPropertiesBuilder ExtractFilter(ConfigNodePropertyArray value)
            {
                _ExtractFilter = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterDesignPackageImporterProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterDesignPackageImporterProperties</returns>
            public ComDayCqWcmDesignimporterDesignPackageImporterProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterDesignPackageImporterProperties(
                    ExtractFilter: _ExtractFilter
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}