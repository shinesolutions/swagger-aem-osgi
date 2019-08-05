using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties:  IEquatable<ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties>
    { 
        /// <summary>
        /// ImporterName
        /// </summary>
        public ConfigNodePropertyArray ImporterName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties()
        {
        }

        private ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties(ConfigNodePropertyArray ImporterName)
        {
            
            this.ImporterName = ImporterName;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder With()
        {
            return Builder()
                .ImporterName(ImporterName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties left, ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties left, ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder
        {
            private ConfigNodePropertyArray _ImporterName;

            internal ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.ImporterName property.
            /// </summary>
            /// <param name="value">ImporterName</param>
            public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesBuilder ImporterName(ConfigNodePropertyArray value)
            {
                _ImporterName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties</returns>
            public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties(
                    ImporterName: _ImporterName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}