using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplProcessTextExtractionProcessProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplProcessTextExtractionProcessProperties:  IEquatable<ComDayCqDamCoreImplProcessTextExtractionProcessProperties>
    { 
        /// <summary>
        /// MimeTypes
        /// </summary>
        public ConfigNodePropertyArray MimeTypes { get; private set; }

        /// <summary>
        /// MaxExtract
        /// </summary>
        public ConfigNodePropertyInteger MaxExtract { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplProcessTextExtractionProcessProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplProcessTextExtractionProcessProperties()
        {
        }

        private ComDayCqDamCoreImplProcessTextExtractionProcessProperties(ConfigNodePropertyArray MimeTypes, ConfigNodePropertyInteger MaxExtract)
        {
            
            this.MimeTypes = MimeTypes;
            
            this.MaxExtract = MaxExtract;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplProcessTextExtractionProcessProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder</returns>
        public ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder With()
        {
            return Builder()
                .MimeTypes(MimeTypes)
                .MaxExtract(MaxExtract);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplProcessTextExtractionProcessProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplProcessTextExtractionProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplProcessTextExtractionProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplProcessTextExtractionProcessProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplProcessTextExtractionProcessProperties left, ComDayCqDamCoreImplProcessTextExtractionProcessProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplProcessTextExtractionProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplProcessTextExtractionProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplProcessTextExtractionProcessProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplProcessTextExtractionProcessProperties left, ComDayCqDamCoreImplProcessTextExtractionProcessProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplProcessTextExtractionProcessProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder
        {
            private ConfigNodePropertyArray _MimeTypes;
            private ConfigNodePropertyInteger _MaxExtract;

            internal ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessTextExtractionProcessProperties.MimeTypes property.
            /// </summary>
            /// <param name="value">MimeTypes</param>
            public ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder MimeTypes(ConfigNodePropertyArray value)
            {
                _MimeTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessTextExtractionProcessProperties.MaxExtract property.
            /// </summary>
            /// <param name="value">MaxExtract</param>
            public ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder MaxExtract(ConfigNodePropertyInteger value)
            {
                _MaxExtract = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplProcessTextExtractionProcessProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplProcessTextExtractionProcessProperties</returns>
            public ComDayCqDamCoreImplProcessTextExtractionProcessProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplProcessTextExtractionProcessProperties(
                    MimeTypes: _MimeTypes,
                    MaxExtract: _MaxExtract
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}