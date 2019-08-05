using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties:  IEquatable<OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties>
    { 
        /// <summary>
        /// MimeTypes
        /// </summary>
        public ConfigNodePropertyArray MimeTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties()
        {
        }

        private OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties(ConfigNodePropertyArray MimeTypes)
        {
            
            this.MimeTypes = MimeTypes;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder</returns>
        public OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder With()
        {
            return Builder()
                .MimeTypes(MimeTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties left, OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties left, OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _MimeTypes;

            internal OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.MimeTypes property.
            /// </summary>
            /// <param name="value">MimeTypes</param>
            public OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesBuilder MimeTypes(ConfigNodePropertyArray value)
            {
                _MimeTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties</returns>
            public OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties(
                    MimeTypes: _MimeTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}