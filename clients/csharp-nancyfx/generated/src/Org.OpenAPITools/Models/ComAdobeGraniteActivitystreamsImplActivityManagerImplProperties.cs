using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties:  IEquatable<ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties>
    { 
        /// <summary>
        /// AggregateRelationships
        /// </summary>
        public ConfigNodePropertyArray AggregateRelationships { get; private set; }

        /// <summary>
        /// AggregateDescendVirtual
        /// </summary>
        public ConfigNodePropertyBoolean AggregateDescendVirtual { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties()
        {
        }

        private ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(ConfigNodePropertyArray AggregateRelationships, ConfigNodePropertyBoolean AggregateDescendVirtual)
        {
            
            this.AggregateRelationships = AggregateRelationships;
            
            this.AggregateDescendVirtual = AggregateDescendVirtual;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder</returns>
        public static ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder</returns>
        public ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder With()
        {
            return Builder()
                .AggregateRelationships(AggregateRelationships)
                .AggregateDescendVirtual(AggregateDescendVirtual);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties left, ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties left, ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _AggregateRelationships;
            private ConfigNodePropertyBoolean _AggregateDescendVirtual;

            internal ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.AggregateRelationships property.
            /// </summary>
            /// <param name="value">AggregateRelationships</param>
            public ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder AggregateRelationships(ConfigNodePropertyArray value)
            {
                _AggregateRelationships = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.AggregateDescendVirtual property.
            /// </summary>
            /// <param name="value">AggregateDescendVirtual</param>
            public ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder AggregateDescendVirtual(ConfigNodePropertyBoolean value)
            {
                _AggregateDescendVirtual = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties</returns>
            public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(
                    AggregateRelationships: _AggregateRelationships,
                    AggregateDescendVirtual: _AggregateDescendVirtual
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}