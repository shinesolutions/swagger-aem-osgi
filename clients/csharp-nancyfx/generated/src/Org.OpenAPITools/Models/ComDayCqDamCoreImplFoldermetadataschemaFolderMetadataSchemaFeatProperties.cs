using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties:  IEquatable<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties>
    { 
        /// <summary>
        /// IsEnabled
        /// </summary>
        public ConfigNodePropertyBoolean IsEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties()
        {
        }

        private ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties(ConfigNodePropertyBoolean IsEnabled)
        {
            
            this.IsEnabled = IsEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder</returns>
        public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder With()
        {
            return Builder()
                .IsEnabled(IsEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties left, ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties left, ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _IsEnabled;

            internal ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.IsEnabled property.
            /// </summary>
            /// <param name="value">IsEnabled</param>
            public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder IsEnabled(ConfigNodePropertyBoolean value)
            {
                _IsEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties</returns>
            public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties(
                    IsEnabled: _IsEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}