using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplRenditionMakerImplProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplRenditionMakerImplProperties:  IEquatable<ComDayCqDamCoreImplRenditionMakerImplProperties>
    { 
        /// <summary>
        /// XmpPropagate
        /// </summary>
        public ConfigNodePropertyBoolean XmpPropagate { get; private set; }

        /// <summary>
        /// XmpExcludes
        /// </summary>
        public ConfigNodePropertyArray XmpExcludes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplRenditionMakerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplRenditionMakerImplProperties()
        {
        }

        private ComDayCqDamCoreImplRenditionMakerImplProperties(ConfigNodePropertyBoolean XmpPropagate, ConfigNodePropertyArray XmpExcludes)
        {
            
            this.XmpPropagate = XmpPropagate;
            
            this.XmpExcludes = XmpExcludes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplRenditionMakerImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder</returns>
        public ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder With()
        {
            return Builder()
                .XmpPropagate(XmpPropagate)
                .XmpExcludes(XmpExcludes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplRenditionMakerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplRenditionMakerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplRenditionMakerImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplRenditionMakerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplRenditionMakerImplProperties left, ComDayCqDamCoreImplRenditionMakerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplRenditionMakerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplRenditionMakerImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplRenditionMakerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplRenditionMakerImplProperties left, ComDayCqDamCoreImplRenditionMakerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplRenditionMakerImplProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _XmpPropagate;
            private ConfigNodePropertyArray _XmpExcludes;

            internal ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplRenditionMakerImplProperties.XmpPropagate property.
            /// </summary>
            /// <param name="value">XmpPropagate</param>
            public ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder XmpPropagate(ConfigNodePropertyBoolean value)
            {
                _XmpPropagate = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplRenditionMakerImplProperties.XmpExcludes property.
            /// </summary>
            /// <param name="value">XmpExcludes</param>
            public ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder XmpExcludes(ConfigNodePropertyArray value)
            {
                _XmpExcludes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplRenditionMakerImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplRenditionMakerImplProperties</returns>
            public ComDayCqDamCoreImplRenditionMakerImplProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplRenditionMakerImplProperties(
                    XmpPropagate: _XmpPropagate,
                    XmpExcludes: _XmpExcludes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}