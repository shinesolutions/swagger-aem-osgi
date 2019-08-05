using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties
    /// </summary>
    public sealed class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties:  IEquatable<ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties>
    { 
        /// <summary>
        /// DeleteZipFile
        /// </summary>
        public ConfigNodePropertyBoolean DeleteZipFile { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties()
        {
        }

        private ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties(ConfigNodePropertyBoolean DeleteZipFile)
        {
            
            this.DeleteZipFile = DeleteZipFile;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.
        /// </summary>
        /// <returns>ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder</returns>
        public static ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder Builder()
        {
            return new ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder</returns>
        public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder With()
        {
            return Builder()
                .DeleteZipFile(DeleteZipFile);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties</param>
        /// <param name="right">Compared (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties left, ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties</param>
        /// <param name="right">Compared (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties left, ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.
        /// </summary>
        public sealed class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _DeleteZipFile;

            internal ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.DeleteZipFile property.
            /// </summary>
            /// <param name="value">DeleteZipFile</param>
            public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder DeleteZipFile(ConfigNodePropertyBoolean value)
            {
                _DeleteZipFile = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.
            /// </summary>
            /// <returns>ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties</returns>
            public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties Build()
            {
                Validate();
                return new ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties(
                    DeleteZipFile: _DeleteZipFile
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}