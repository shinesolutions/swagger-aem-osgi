using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties:  IEquatable<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties>
    { 
        /// <summary>
        /// Granitedata
        /// </summary>
        public ConfigNodePropertyArray Granitedata { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties()
        {
        }

        private ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties(ConfigNodePropertyArray Granitedata)
        {
            
            this.Granitedata = Granitedata;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder</returns>
        public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder With()
        {
            return Builder()
                .Granitedata(Granitedata);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties left, ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties left, ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _Granitedata;

            internal ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.Granitedata property.
            /// </summary>
            /// <param name="value">Granitedata</param>
            public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder Granitedata(ConfigNodePropertyArray value)
            {
                _Granitedata = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties</returns>
            public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties(
                    Granitedata: _Granitedata
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}